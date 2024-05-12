package com.ss.ttlivestreamer.core.utils;

import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;

/* loaded from: classes12.dex */
public class UnitTest {
    public static void init() {
        MediaEngineFactory.nativeGetVersion();
    }

    public static native int nativeUnitTest(String str, TEBundle tEBundle);

    public static void run(String str, TEBundle tEBundle) {
    }
}
