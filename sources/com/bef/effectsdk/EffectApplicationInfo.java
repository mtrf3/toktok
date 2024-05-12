package com.bef.effectsdk;

import X.C16880lQ;
import android.content.Context;

/* loaded from: classes.dex */
public class EffectApplicationInfo {
    public static Context appContext;

    public static native int nativeSetHomeDir(String str);

    public static void onSetAppContext() {
        Context context = appContext;
        if (context != null) {
            nativeSetHomeDir(C16880lQ.LLIIJLIL(context).getAbsolutePath());
        }
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static void setAppContext(Context context) {
        appContext = context;
        onSetAppContext();
    }
}
