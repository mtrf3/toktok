package X;

/* renamed from: X.Uvy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78782Uvy extends AbstractC32664Crs<C81392Vwy<InterfaceC81378Vwk>> {
    public final /* synthetic */ XJL<C76800UCe> LIZ;
    public final /* synthetic */ C78773Uvp LIZIZ;
    public final /* synthetic */ W5O LIZJ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
        if (w4w != null) {
            w4w.close();
        }
        XJL<C76800UCe> xjl = this.LIZ;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
        if (w4w != null) {
            C81392Vwy<InterfaceC81378Vwk> result = w4w.getResult();
            if (result != null) {
                C78773Uvp c78773Uvp = this.LIZIZ;
                W5O w5o = this.LIZJ;
                try {
                    InterfaceC81378Vwk LJI = result.LJI();
                    byte[] bArr = new byte[LJI.size()];
                    LJI.read(0, bArr, 0, LJI.size());
                    InterfaceC81714W5e interfaceC81714W5e = c78773Uvp.LIZ;
                    W5N LJI2 = W5N.LJI();
                    LJI2.getClass();
                    interfaceC81714W5e.LJI(LJI2.LJ(w5o.LIZIZ), new C78784Uw0(bArr));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Image has been downloaded successfully ");
                    LIZ.append(w5o.LIZIZ);
                    LIZ.append(" and cached? ");
                    LIZ.append(C78685UuP.LJJJZ(c78773Uvp.LIZIZ(w5o)));
                    LIZ.append(" and cached path is ");
                    LIZ.append(c78773Uvp.LIZIZ(w5o));
                    X1D.LIZIZ(LIZ);
                    AnonymousClass636.LJFF(result, null);
                } finally {
                }
            }
            w4w.close();
        }
        XJL<C76800UCe> xjl = this.LIZ;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }

    public C78782Uvy(XKS xks, C78773Uvp c78773Uvp, W5O w5o) {
        this.LIZ = xks;
        this.LIZIZ = c78773Uvp;
        this.LIZJ = w5o;
    }
}
