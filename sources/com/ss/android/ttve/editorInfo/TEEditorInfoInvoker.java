package com.ss.android.ttve.editorInfo;

import X.C63856P4i;
import X.FWO;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class TEEditorInfoInvoker {
    public static native void nativeInit();

    static {
        FWO.LIZJ();
    }

    public static void onNativeCallback_onEditorInfoFloat(String str, float f) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C63856P4i.LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Float.valueOf(f));
        }
    }

    public static void onNativeCallback_onEditorInfoInt(String str, long j) {
        C63856P4i.LIZ(j, str);
    }

    public static void onNativeCallback_onEditorInfoJson(String str, String str2) {
        C63856P4i.LIZIZ(str, str2);
    }

    public static void onNativeCallback_onEditorInfoMap(String str, HashMap hashMap) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C63856P4i.LIZIZ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, hashMap);
        }
    }
}
