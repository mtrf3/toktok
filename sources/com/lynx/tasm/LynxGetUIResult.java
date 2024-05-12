package com.lynx.tasm;

import com.lynx.react.bridge.JavaOnlyArray;

/* loaded from: classes15.dex */
public class LynxGetUIResult {
    public final JavaOnlyArray LIZ;

    public LynxGetUIResult(JavaOnlyArray javaOnlyArray) {
        this.LIZ = javaOnlyArray;
    }

    public static LynxGetUIResult create(JavaOnlyArray javaOnlyArray, int i, String str) {
        return new LynxGetUIResult(javaOnlyArray);
    }
}
