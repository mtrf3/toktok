package X;

/* renamed from: X.Ehd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37125Ehd implements InterfaceC37135Ehn {
    public final /* synthetic */ C37131Ehj LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC37135Ehn
    public final void LIZIZ(String str) {
        InterfaceC37126Ehe interfaceC37126Ehe = this.LIZ.LIZLLL;
        if (interfaceC37126Ehe != null) {
            interfaceC37126Ehe.onSuccess(str, this.LIZIZ);
        }
    }

    public C37125Ehd(C37131Ehj c37131Ehj, boolean z) {
        this.LIZ = c37131Ehj;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC37135Ehn
    public final void LIZ(int i, String str) {
        InterfaceC37126Ehe interfaceC37126Ehe = this.LIZ.LIZLLL;
        if (interfaceC37126Ehe != null) {
            interfaceC37126Ehe.onFailed(str, this.LIZIZ, i);
        }
    }
}
