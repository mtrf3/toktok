package com.bytedance.speech.speechengine;

import X.PDP;
import android.content.Context;

/* loaded from: classes12.dex */
public class SpeechEngineGenerator {
    public static synchronized SpeechEngine getInstance() {
        SpeechEngineImpl speechEngineImpl;
        synchronized (SpeechEngineGenerator.class) {
            speechEngineImpl = new SpeechEngineImpl();
        }
        return speechEngineImpl;
    }

    public static synchronized boolean isEngineSupported(String str) {
        boolean isEngineSupportedToNative;
        synchronized (SpeechEngineGenerator.class) {
            isEngineSupportedToNative = SpeechEngineImpl.isEngineSupportedToNative(str);
        }
        return isEngineSupportedToNative;
    }

    public static synchronized void initMonitor(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (SpeechEngineGenerator.class) {
            initMonitor(context, str, str2, str3, str4, str5, str6, "");
        }
    }

    public static synchronized void initMonitor(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        synchronized (SpeechEngineGenerator.class) {
            if (SpeechEngineImpl.c() == null) {
                PDP pdp = new PDP();
                pdp.LIZIZ(context, str, str2, SpeechEngineImpl.getVersionToNative(), str3, str4, str5, str6, str7);
                SpeechEngineImpl.a(pdp);
            }
        }
    }
}
