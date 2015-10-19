/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2001-2015 Aspose Pty Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.aspose.wizards.maven;

import com.aspose.utils.AsposeMavenProjectManager;
import com.aspose.utils.execution.CallBackHandler;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;

import java.util.ResourceBundle;

/**
 * Created by Adeel Ilyas on 09/9/2015.
 */
public class CreateMavenProjectCallback implements CallBackHandler {

    @Override
    public boolean executeTask(@NotNull ProgressIndicator progressIndicator) {

        progressIndicator.setIndeterminate(true);
        progressIndicator.setText(ResourceBundle.getBundle("Bundle").getString("AsposeManager.projectMessage"));
        AsposeMavenProjectManager comManager = AsposeMavenProjectManager.getInstance();

        return comManager.retrieveAsposeMavenDependencies(progressIndicator);
    }
}
