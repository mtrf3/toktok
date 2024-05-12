package X;

import com.bytedance.vcloud.strategy.StrategyCenter;

/* renamed from: X.Il6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47532Il6 implements InterfaceC47584Ilw {
    public final /* synthetic */ C47529Il3 LIZ;

    public C47532Il6(C47529Il3 c47529Il3) {
        this.LIZ = c47529Il3;
    }

    @Override // X.InterfaceC47584Ilw
    public final void LIZ(int i, int i2, int i3) {
        if (i != 0) {
            return;
        }
        StrategyCenter LJ = this.LIZ.LJ();
        int i4 = -1;
        if (i3 == -1) {
            i4 = 0;
        } else if (i3 == 0) {
            i4 = 20;
        } else if (i3 == 2 || i3 == 3 || i3 == 1 || i3 == 4) {
            i4 = 10;
        }
        LJ.businessEvent(1202, i4);
    }
}
