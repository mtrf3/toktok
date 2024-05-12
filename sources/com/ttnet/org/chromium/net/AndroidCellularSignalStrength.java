package com.ttnet.org.chromium.net;

import J.N;
import X.C06M;
import X.C48469J0n;
import Y.ARunnableS44S0100000_8;
import android.os.Build;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* loaded from: classes9.dex */
public class AndroidCellularSignalStrength {
    public static final AndroidCellularSignalStrength LIZIZ = new AndroidCellularSignalStrength();
    public volatile int LIZ = LiveLayoutPreloadThreadPriority.DEFAULT;

    public static int getSignalStrengthLevel() {
        return LIZIZ.LIZ;
    }

    public AndroidCellularSignalStrength() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        C48469J0n.LIZ().getClass();
        if (N.MaSRwBiO()) {
            return;
        }
        new Handler(C06M.LIZ("AndroidCellularSignalStrength").getLooper()).post(new ARunnableS44S0100000_8(this, 72));
    }
}
