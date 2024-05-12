package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ztc, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91376Ztc implements InterfaceC91159Zq7, InterfaceC91158Zq6 {
    public final LPU LJLIL;

    @Override // X.InterfaceC91159Zq7
    public final int getCurrentItemCompat() {
        return this.LJLIL.getCurrentItemCompat();
    }

    @Override // X.InterfaceC91159Zq7
    public final void LJJJJZ(boolean z) {
        this.LJLIL.LLJJJJ = z;
    }

    public C91376Ztc(InterfaceC91158Zq6 mainFragment, LPU lpu) {
        o.LJIIIZ(mainFragment, "mainFragment");
        this.LJLIL = lpu;
    }

    @Override // X.InterfaceC91159Zq7
    public final void setCurrentItem(int i, boolean z) {
        this.LJLIL.setCurrentItem(i, z);
    }
}
