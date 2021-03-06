/*
 * Copyright 2013 selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.selendroid.server.handler;

import io.selendroid.server.RequestHandler;
import io.selendroid.server.Response;

import org.json.JSONException;
import org.json.JSONObject;
import io.selendroid.server.SelendroidResponse;
import io.selendroid.server.model.TouchScreen;
import io.selendroid.util.SelendroidLogger;
import org.webbitserver.HttpRequest;

public class Down extends RequestHandler {

  public Down(HttpRequest request, String mappedUri) {
    super(request, mappedUri);
  }

  @Override
  public Response handle() throws JSONException {
    SelendroidLogger.log("Down gesture");
    JSONObject payload=getPayload();
    int x = payload.getInt("x");
    int y = payload.getInt("y");
    TouchScreen touchScreen = getSelendroidDriver().getTouch();

    touchScreen.down(x, y);
    return new SelendroidResponse(getSessionId(), "");
  }

}
