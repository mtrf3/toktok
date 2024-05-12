package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KED implements InterfaceC74055T4p {
    public final KOV LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    public KED(KOV viewPager) {
        o.LJIIIZ(viewPager, "viewPager");
        this.LIZ = viewPager;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        o.LJIIIZ(tab, "tab");
        this.LIZ.setCurrentItem(tab.LIZLLL);
    }
}
