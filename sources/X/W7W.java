package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes15.dex */
public final class W7W implements C10I<W8X, Void> {
    public final /* synthetic */ InterfaceC81754W6s LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ W7F LIZJ;
    public final /* synthetic */ InterfaceC81770W7i LIZLLL;
    public final /* synthetic */ W6U LJ;
    public final /* synthetic */ W7R LJFF;

    @Override // X.C10I
    public final Void then(C10K<W8X> c10k) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c10k.LJIIL() || (c10k.LJIILJJIL() && (c10k.LJIIJ() instanceof CancellationException))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LIZ.LIZJ(this.LIZIZ, "PartialDiskCacheProducer", null);
            this.LIZJ.LIZJ();
        } else if (c10k.LJIILJJIL()) {
            this.LIZ.LJI(this.LIZIZ, "PartialDiskCacheProducer", c10k.LJIIJ(), null);
            this.LJFF.LIZLLL(this.LIZJ, this.LIZLLL, this.LJ, null);
        } else {
            W8X LJIIJJI = c10k.LJIIJJI();
            if (LJIIJJI != null) {
                InterfaceC81754W6s interfaceC81754W6s = this.LIZ;
                String str = this.LIZIZ;
                interfaceC81754W6s.LIZIZ(str, "PartialDiskCacheProducer", W7R.LIZJ(interfaceC81754W6s, str, true, LJIIJJI.LJI()));
                int LJI = LJIIJJI.LJI() - 1;
                if (LJI > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C32151Nz.LJI(z2);
                LJIIJJI.LJLL = new C81787W7z(0, LJI);
                int LJI2 = LJIIJJI.LJI();
                W5O LJ = this.LIZLLL.LJ();
                C81787W7z c81787W7z = LJ.LJIIJ;
                if (c81787W7z == null || c81787W7z.LIZ < 0 || LJI < c81787W7z.LIZIZ) {
                    this.LIZJ.LIZIZ(8, LJIIJJI);
                    W5P LIZIZ = W5P.LIZIZ(LJ);
                    int i = LJI2 - 1;
                    if (i >= 0) {
                        z3 = true;
                    }
                    C32151Nz.LJI(z3);
                    LIZIZ.LJIILL = new C81787W7z(i, Integer.MAX_VALUE);
                    this.LJFF.LIZLLL(this.LIZJ, new C81767W7f(LIZIZ.LIZ(), this.LIZLLL), this.LJ, LJIIJJI);
                } else {
                    this.LIZ.LIZLLL(this.LIZIZ, "PartialDiskCacheProducer", true);
                    this.LIZJ.LIZIZ(9, LJIIJJI);
                }
            } else {
                InterfaceC81754W6s interfaceC81754W6s2 = this.LIZ;
                String str2 = this.LIZIZ;
                interfaceC81754W6s2.LIZIZ(str2, "PartialDiskCacheProducer", W7R.LIZJ(interfaceC81754W6s2, str2, false, 0));
                this.LJFF.LIZLLL(this.LIZJ, this.LIZLLL, this.LJ, LJIIJJI);
            }
        }
        return null;
    }

    public W7W(W7R w7r, InterfaceC81754W6s interfaceC81754W6s, String str, W7F w7f, InterfaceC81770W7i interfaceC81770W7i, W6U w6u) {
        this.LJFF = w7r;
        this.LIZ = interfaceC81754W6s;
        this.LIZIZ = str;
        this.LIZJ = w7f;
        this.LIZLLL = interfaceC81770W7i;
        this.LJ = w6u;
    }
}
