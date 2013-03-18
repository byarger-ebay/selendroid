0.3
----
- Moved from google gson library to org.json

0.2 
----
- fixed to major bugs #1 and #2
- Created an inspector that allows to inspect the application under test and makes it easier to write test cases: http://localhost:8080/inspector
- Added support for pressing keys like the Android menu button.
- Fixed a bug in taking screenshots. Now pop up dialogs are included as well.  
- Added /sessionId/keys support and a client library that contains already selenium as dependency and the interface SelendroidKeys.
- The gem contains an interactive shell that starts automatically selendroid-server and a Ruby webdriver client that allows to interactively try commands out.
- Added locator strategy by class for native and web view context
- added support for all available locators findElement, findElements and corresponding find child element and din child elements.

0.1
-----
- initial Selendroid version including support for android native and hybrid apps.
  - Driver support:
      - takeScreenshot
      - getPageSource
      - get current url/ activity and open activity
  - Driver supports following find element locators:
      - for web views: by id, by xpath, by text, by name
      - for Android native: by id, by l10n key, by text
  - Found elements features:
      - click, clear, enter text, getValue, is selected and submit
      