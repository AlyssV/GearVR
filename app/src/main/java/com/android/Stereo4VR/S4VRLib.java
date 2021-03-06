/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.Stereo4VR;

// Wrapper for native library

import android.content.res.AssetManager;

public class S4VRLib {

     static {
         System.loadLibrary("SDL2");
         System.loadLibrary("SDL2_image");
         System.loadLibrary("Stereo4VR");
     }

    public static native void init(String vshader, String fshader);
    /**
     * @param width the current view width
     * @param height the current view height
     */
     public static native void reshape(int width, int height);
    public static native void draw();
    public static native void click();
    public static native void event(int x, int z);
    public static native void gyro(float x,float y,float z);
    static public native void convolute(int pixels[], int w, int h);
    public static native void initAssets(AssetManager assetManager);
}
