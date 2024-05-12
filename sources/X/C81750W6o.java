package X;

/* renamed from: X.W6o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81750W6o implements IHD<C81392Vwy<W5A>> {
    public final /* synthetic */ InterfaceC35436DvU LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.IHD
    public final void LIZ(W4W<C81392Vwy<W5A>> w4w) {
    }

    @Override // X.IHD
    public final void LIZIZ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public final void LIZJ(AbstractC48384Iyq abstractC48384Iyq) {
    }

    @Override // X.IHD
    public final void LIZLLL(W4W<C81392Vwy<W5A>> w4w) {
        C81392Vwy<W5A> result;
        W5A LJI;
        int duration;
        if (w4w != null && (result = w4w.getResult()) != null && (LJI = result.LJI()) != null) {
            InterfaceC35436DvU interfaceC35436DvU = this.LIZ;
            String str = this.LIZIZ;
            if (LJI instanceof C81831W9r) {
                C81831W9r c81831W9r = (C81831W9r) LJI;
                if (c81831W9r.LIZ().LIZ.getDuration() <= 0) {
                    duration = 1;
                } else {
                    duration = c81831W9r.LIZ().LIZ.getDuration();
                }
                interfaceC35436DvU.LIZ(duration, str);
            }
        }
    }

    public C81750W6o(C35435DvT c35435DvT, String str) {
        this.LIZ = c35435DvT;
        this.LIZIZ = str;
    }
}
