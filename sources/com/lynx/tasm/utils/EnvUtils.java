package com.lynx.tasm.utils;

import X.C16880lQ;
import android.app.Application;
import com.lynx.tasm.LynxEnv;

/* loaded from: classes7.dex */
public class EnvUtils {
    public static String getCacheDir() {
        Application application = LynxEnv.LJIIIZ().LIZ;
        if (application != null) {
            return C16880lQ.LLIIIL(application).getAbsolutePath();
        }
        return "";
    }
}
