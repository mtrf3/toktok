package com.bytedance.bmf_mods.common;

import X.C16880lQ;
import X.X1D;
import android.content.Context;

/* loaded from: classes34.dex */
public class SoLoader {
    public static final SoLoader INSTANCE = new SoLoader();
    public static boolean sIsSoInitialized;
    public Context appContext;

    static {
        try {
            C16880lQ.LLJJJIL("hmp");
            C16880lQ.LLJJJIL("bmf_module_sdk");
            C16880lQ.LLJJJIL("bmf_hydra");
            sIsSoInitialized = true;
            Logging.d("Bmf so libraries are initialized. version = 2.35.2-tt");
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Bmf so libraries are NOT initialized. version = 2.35.2-tt error msg = ");
            LIZ.append(th.getMessage());
            Logging.e(X1D.LIZIZ(LIZ));
            sIsSoInitialized = false;
        }
    }

    public static SoLoader getInstance() {
        return INSTANCE;
    }

    public Context getAppContext() {
        return this.appContext;
    }

    public boolean isSoInitialized() {
        return sIsSoInitialized;
    }

    public void setContext(Context context) {
        this.appContext = C16880lQ.LLLLL(context);
    }
}
