package com.byted.cast.common;

import X.C16880lQ;
import android.content.Context;

/* loaded from: classes29.dex */
public class Constants {
    public static final int[] BDLINK_DEFAULT_PORT_ARRAY = {3530, 4530, 15550};
    public static boolean isDebugMode;
    public static Context sAppContext;

    public static void attachAppContext(Context context) {
        if (context == null) {
            return;
        }
        sAppContext = C16880lQ.LLLLL(context);
    }
}
