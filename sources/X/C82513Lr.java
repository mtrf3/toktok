package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82513Lr extends AbstractC82423Li {
    public final C81983Jq LJLJLLL = new C81983Jq(EnumC82443Lk.ALL, EnumC82403Lg.ALL, new C3MH(this), new C3MM(this));

    @Override // X.AbstractC82423Li
    public final void LJIIIZ() {
        try {
            EF7.LIZIZ();
        } catch (Exception e) {
            C34B.LJ("SessionRefactor-AllTab", e);
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
        LJII(new C82523Ls(new C3MP(this), this.LJLJLLL));
        LJII(new C3KS(new C3MO(this)));
    }

    @Override // X.AbstractC82423Li
    public final C81983Jq LIZJ() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC82423Li
    public final boolean LJFF(C3L4 baseSession) {
        o.LJIIIZ(baseSession, "baseSession");
        if (!baseSession.LLI || !C3U8.LIZ()) {
            C81983Jq c81983Jq = this.LJLJLLL;
            if (C82463Lm.LIZJ(baseSession, c81983Jq.LIZIZ, c81983Jq.LIZJ)) {
                return true;
            }
        }
        return false;
    }
}
