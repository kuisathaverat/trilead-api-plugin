/*
 * The MIT License
 *
 * Copyright (c) 2017, Michael Clarke
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins;

import com.trilead.ssh2.Connection;
import hudson.Plugin;
import hudson.init.InitMilestone;
import hudson.init.Initializer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Michael Clarke
 */
public class TrileadApiPlugin extends Plugin {

    private static final Logger LOGGER = Logger.getLogger(TrileadApiPlugin.class.getName());

    @Override
    public void start() {
        try {
            LOGGER.log(Level.INFO, "Trilead being provided from " + Connection.class.getProtectionDomain().getCodeSource().getLocation());
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Could not load Trilead classes", ex);
        }
    }

}
