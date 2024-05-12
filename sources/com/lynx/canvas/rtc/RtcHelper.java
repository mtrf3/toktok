package com.lynx.canvas.rtc;

import X.C58556MyW;
import X.O5Y;
import android.content.Context;

/* loaded from: classes11.dex */
public class RtcHelper {
    public static void tryToLoadRtcEngine() {
        try {
            Class.forName("com.ss.bytertc.engine.RTCEngine").getMethod("getSdkVersion", new Class[0]).invoke(null, new Object[0]);
            C58556MyW.LIZ().LIZIZ("kryptonrtc", true);
        } catch (Throwable th) {
            O5Y.LJJLIIIJJI("RtcHelper", th.getMessage());
        }
    }

    public static Context getAppContext() {
        Context context = C58556MyW.LIZ().LIZJ;
        if (context != null) {
            O5Y.LJJJ("RtcHelper", "get app context");
        } else {
            O5Y.LJIILIIL("RtcHelper", "get app context null");
        }
        return context;
    }
}
