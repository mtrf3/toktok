package X;

/* loaded from: classes8.dex */
public final class I7I implements InterfaceC126004x2 {
    public final /* synthetic */ InterfaceC126004x2 LIZ;
    public final /* synthetic */ C5U8 LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.InterfaceC126004x2
    public final void onFailed() {
        InterfaceC126004x2 interfaceC126004x2 = this.LIZ;
        if (interfaceC126004x2 != null) {
            interfaceC126004x2.onFailed();
        }
    }

    @Override // X.InterfaceC126004x2
    public final void LIZ(int i) {
        C5U8 c5u8 = this.LIZIZ;
        c5u8.LIZJ(c5u8.LIZJ, this.LIZJ, this.LIZLLL, this.LIZ);
    }

    public I7I(I7H i7h, C5U8 c5u8, int i, int i2) {
        this.LIZ = i7h;
        this.LIZIZ = c5u8;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
