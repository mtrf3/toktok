package X;

/* renamed from: X.NqY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60610NqY implements InterfaceC60405NnF {
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
    public C60610NqY(C60611NqZ c60611NqZ) {
        C60404NnE c60404NnE;
        C60413NnN c60413NnN;
        C60607NqV c60607NqV = (C60607NqV) c60611NqZ.LIZ.element;
        this.LIZ = (c60607NqV == null || (c60413NnN = c60607NqV.LIZIZ) == null) ? new C60413NnN() : c60413NnN;
        C60607NqV c60607NqV2 = (C60607NqV) c60611NqZ.LIZ.element;
        this.LIZIZ = (c60607NqV2 == null || (c60404NnE = c60607NqV2.LIZJ) == null) ? new C60404NnE() : c60404NnE;
    }
}
