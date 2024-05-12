package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ebj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36759Ebj implements InterfaceC36606EYg {
    public final /* synthetic */ C36756Ebg LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C36760Ebk LIZJ;
    public final /* synthetic */ C36758Ebi LIZLLL;

    @Override // X.InterfaceC36606EYg
    public final void LIZ(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request failed, url: ");
        LIZ.append(this.LIZIZ);
        C36762Ebm.LIZJ(X1D.LIZIZ(LIZ));
        this.LIZJ.LIZ(throwable);
    }

    @Override // X.InterfaceC36606EYg
    public final void LIZIZ(C36754Ebe c36754Ebe) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Received response, url: ");
        LIZ.append(this.LIZIZ);
        C36762Ebm.LIZJ(X1D.LIZIZ(LIZ));
        this.LIZJ.LIZIZ(c36754Ebe);
        if (this.LIZJ.LJIIIZ > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Putting to cache, key: ");
            LIZ2.append(this.LIZLLL);
            LIZ2.append(", expires: ");
            LIZ2.append(this.LIZJ.LJIIIZ);
            C36762Ebm.LIZJ(X1D.LIZIZ(LIZ2));
            this.LIZ.LJIIIZ(this.LIZLLL, this.LIZJ);
        }
    }

    public C36759Ebj(C36756Ebg c36756Ebg, String str, C36760Ebk c36760Ebk, C36758Ebi c36758Ebi) {
        this.LIZ = c36756Ebg;
        this.LIZIZ = str;
        this.LIZJ = c36760Ebk;
        this.LIZLLL = c36758Ebi;
    }
}
