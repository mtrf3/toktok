package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;

/* renamed from: X.EXq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36590EXq {
    public static Class LIZ;
    public static Object LIZIZ;

    public static Object LIZ() {
        if (LIZIZ == null) {
            try {
                synchronized (C36590EXq.class) {
                    if (LIZIZ == null) {
                        if (LIZ == null) {
                            LIZ = Class.forName("android.app.ActivityThread");
                        }
                        LIZIZ = EWC.LIZIZ(LIZ, "currentActivityThread", new Object[0]);
                    }
                    if (LIZIZ == null && Looper.myLooper() != C16880lQ.LLJJJJ()) {
                        Object obj = new Object();
                        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS42S0100000_6(obj, UserLevelGeckoUpdateSetting.DEFAULT));
                        if (LIZIZ == null) {
                            synchronized (obj) {
                                try {
                                    obj.wait(5000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return LIZIZ;
    }
}
