package X;

import java.util.Iterator;

/* renamed from: X.S4u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71512S4u implements InterfaceC71509S4r {
    public final /* synthetic */ SH8 LJLIL;

    public C71512S4u(SH8 sh8) {
        this.LJLIL = sh8;
    }

    @Override // X.InterfaceC71509S4r
    public final void LIZ(int i) {
        Iterator<InterfaceC71509S4r> it = this.LJLIL.LJLL.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i);
        }
    }

    @Override // X.InterfaceC71509S4r
    public final void LIZJ(int i) {
        Iterator<InterfaceC71509S4r> it = this.LJLIL.LJLL.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(i);
        }
    }

    @Override // X.InterfaceC71509S4r
    public final void LIZIZ(float f, int i) {
        Iterator<InterfaceC71509S4r> it = this.LJLIL.LJLL.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(f, i);
        }
        if (i == 3) {
            this.LJLIL.LJLJLLL = f;
            return;
        }
        if (i != 2) {
            return;
        }
        SH8 sh8 = this.LJLIL;
        float f2 = sh8.LJLJLLL;
        if (f2 <= 0.0f) {
            return;
        }
        sh8.setAlpha((1 / f2) * f);
    }
}
