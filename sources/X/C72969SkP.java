package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;

/* renamed from: X.SkP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72969SkP<T> implements InterfaceC64592gB {
    public static final C72969SkP<T> LJLIL = new C72969SkP<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String LIZ;
        Throwable th = (Throwable) obj;
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_LinkMicReservationSettingHelper_", LJ, LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_LinkMicReservationSettingHelper_", 85, LIZ3);
        }
        C32014ChO.LIZJ(LIZ, "isShowGuestLinkHint request failed:", th.getMessage());
        C73411SrX c73411SrX = C74726TUk.LIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }
}
