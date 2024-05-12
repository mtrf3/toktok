package X;

/* renamed from: X.3MA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MA extends AbstractC82423Li {
    public final C81983Jq LJLJLLL = new C81983Jq(EnumC82443Lk.PRIMARY, EnumC82403Lg.ALL, new C3MI(this), new C3MN(this));

    @Override // X.AbstractC82423Li
    public final void LJIIIZ() {
        try {
            EF7.LIZIZ();
        } catch (Exception e) {
            C34B.LJ("SessionRefactor-PrimaryTab", e);
        }
        try {
            if (!C2NU.LIZ.LIZIZ()) {
                return;
            }
            C2U8.LIZ(new C82773Mr());
            super.LJIIIZ();
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC82423Li, X.C3JJ
    public final void LJIIL() {
        super.LJIIL();
        C3M4 c3m4 = new C3M4(new C3MR(this), this.LJLJLLL);
        this.LJLJLJ.add(c3m4);
        LJII(c3m4);
        LJII(new C3KS(new C3MQ(this)));
    }

    @Override // X.AbstractC82423Li
    public final C81983Jq LIZJ() {
        return this.LJLJLLL;
    }
}
