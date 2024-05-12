package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;

/* renamed from: X.TRb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74639TRb {
    public static String LIZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_RtcMessageReader_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_RtcMessageReader_", i, LIZ2);
    }

    public static Object LIZIZ(Class cls, String str) {
        try {
            return C09650Zl.LIZIZ.LJI(str, cls);
        } catch (Exception e) {
            C32014ChO.LIZJ(LIZ(29), "unpackMsgContent failed", e.getMessage());
            return null;
        }
    }
}
