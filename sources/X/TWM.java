package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;

/* loaded from: classes14.dex */
public final class TWM implements TW7 {
    public final InterfaceC88472Yns<C28272B7s, C76800UCe> LIZ;
    public final int LIZIZ;
    public long LIZJ;

    @Override // X.TW7
    public final void onSei(C28272B7s c28272B7s) {
        String LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LIZJ > this.LIZIZ) {
            this.LIZJ = currentTimeMillis;
            this.LIZ.invoke(c28272B7s);
            return;
        }
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C77800Ug8.LIZLLL(U44.LAYOUT, LIZ2, "_LinkMicSDK_LayoutManager_", LJ, LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ = C17M.LIZ(U44.LAYOUT, LIZ3, "_LinkMicSDK_LayoutManager_", 84, LIZ3);
        }
        C32014ChO.LJIIJ(LIZ, "drop sei when duration is unavailable.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TWM(InterfaceC88472Yns<? super C28272B7s, C76800UCe> interfaceC88472Yns, int i) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = i;
    }
}
