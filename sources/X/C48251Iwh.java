package X;

/* renamed from: X.Iwh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48251Iwh implements X5J {
    public final /* synthetic */ C64598PWw LIZ;
    public final /* synthetic */ InterfaceC48133Iun LIZIZ;

    @Override // X.X5J
    public final int LIZ() {
        return this.LIZ.LJLJI;
    }

    @Override // X.X5J
    public final void cancel() {
        InterfaceC48133Iun interfaceC48133Iun = this.LIZIZ;
        if (interfaceC48133Iun != null && !interfaceC48133Iun.isCanceled()) {
            this.LIZIZ.cancel();
        }
    }

    @Override // X.X5J
    public final String LIZIZ(String str) {
        return this.LIZ.LIZ(str, null);
    }

    public C48251Iwh(C64598PWw c64598PWw, C64587PWl c64587PWl) {
        this.LIZ = c64598PWw;
        this.LIZIZ = c64587PWl;
    }
}
