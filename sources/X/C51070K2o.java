package X;

import kotlin.jvm.internal.o;

/* renamed from: X.K2o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51070K2o implements InterfaceC74055T4p {
    public final C0CM LIZ;
    public final boolean LIZIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        boolean z;
        o.LJIIIZ(tab, "tab");
        C0CM c0cm = this.LIZ;
        int i = tab.LIZLLL;
        if (c0cm.getCurrentItem() == tab.LIZLLL || this.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        c0cm.LIZLLL(i, z);
    }

    public C51070K2o(C0CM viewPager, boolean z) {
        o.LJIIIZ(viewPager, "viewPager");
        this.LIZ = viewPager;
        this.LIZIZ = z;
    }
}
