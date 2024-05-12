package X;

/* renamed from: X.Nrb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60675Nrb implements InterfaceC60405NnF {
    public final C60413NnN LIZ;
    public final C60404NnE LIZIZ;

    @Override // X.InterfaceC60405NnF
    public final C60404NnE LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC60405NnF
    public final C60413NnN LIZIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C60675Nrb(C60676Nrc c60676Nrc) {
        C15T c15t;
        C60404NnE c60404NnE;
        C15T c15t2;
        C60413NnN c60413NnN;
        C60607NqV c60607NqV = (C60607NqV) c60676Nrc.LIZ.element;
        this.LIZ = (c60607NqV == null || (c15t2 = c60607NqV.LJ) == null || (c60413NnN = (C60413NnN) c15t2.LIZ) == null) ? new C60413NnN() : c60413NnN;
        C60607NqV c60607NqV2 = (C60607NqV) c60676Nrc.LIZ.element;
        this.LIZIZ = (c60607NqV2 == null || (c15t = c60607NqV2.LJ) == null || (c60404NnE = (C60404NnE) c15t.LIZIZ) == null) ? new C60404NnE() : c60404NnE;
    }
}
