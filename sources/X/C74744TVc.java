package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;

/* renamed from: X.TVc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74744TVc {
    public static String LIZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_LinkMicAppBundleHelper_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_LinkMicAppBundleHelper_", i, LIZ2);
    }
}
