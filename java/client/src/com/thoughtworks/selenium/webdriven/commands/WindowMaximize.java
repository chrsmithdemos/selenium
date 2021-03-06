/*
Copyright 2007-2009 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.thoughtworks.selenium.webdriven.commands;

import com.thoughtworks.selenium.webdriven.JavascriptLibrary;
import com.thoughtworks.selenium.webdriven.SeleneseCommand;

import org.openqa.selenium.WebDriver;

public class WindowMaximize extends SeleneseCommand<Void> {
  private final JavascriptLibrary js;

  public WindowMaximize(JavascriptLibrary js) {
    this.js = js;
  }

  @Override
  protected Void handleSeleneseCommand(WebDriver driver, String ignored, String alsoIgnored) {
    js.executeScript(
        driver,
        "if (window.screen) { window.moveTo(0, 0); window.resizeTo(window.screen.availWidth, window.screen.availHeight);};");

    return null;
  }
}
