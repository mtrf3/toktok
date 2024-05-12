package com.lynx.canvas;

import X.J0S;
import X.O5Y;
import X.X1D;

/* loaded from: classes9.dex */
public class PluginLoaderWrapper {
    public static native void nativeOnFinishCallback(long j, String str, boolean z, String str2, String str3);

    public static void preloadPlugin(KryptonApp kryptonApp, long j, String str) {
        J0S j0s = (J0S) kryptonApp.LIZLLL.get(J0S.class);
        if (j0s == null) {
            O5Y.LJIILIIL("PluginLoaderWrapper", "plugin loader service not exits, default return success");
            nativeOnFinishCallback(j, str, true, "plugin loader service not exits, default return success", "");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loading plugin ");
        LIZ.append(str);
        LIZ.append(" async ...");
        O5Y.LJJJ("PluginLoaderWrapper", X1D.LIZIZ(LIZ));
        j0s.LIZ();
    }
}
