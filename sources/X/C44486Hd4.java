package X;

/* renamed from: X.Hd4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44486Hd4 implements InterfaceC134045Nw {
    public final /* synthetic */ InterfaceC44493HdB LIZ;
    public final /* synthetic */ C44483Hd1 LIZIZ;
    public final /* synthetic */ C8NR LIZJ;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        InterfaceC44493HdB interfaceC44493HdB = this.LIZ;
        if (interfaceC44493HdB != null) {
            interfaceC44493HdB.onSuccess();
        }
        this.LIZIZ.LIZ((C44485Hd3) this.LIZJ);
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        InterfaceC44493HdB interfaceC44493HdB;
        if (this.LIZIZ.LIZIZ && (interfaceC44493HdB = this.LIZ) != null) {
            interfaceC44493HdB.LIZ(f);
        }
    }

    public C44486Hd4(InterfaceC44493HdB interfaceC44493HdB, C44483Hd1 c44483Hd1, C44485Hd3 c44485Hd3) {
        this.LIZ = interfaceC44493HdB;
        this.LIZIZ = c44483Hd1;
        this.LIZJ = c44485Hd3;
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        InterfaceC44493HdB interfaceC44493HdB = this.LIZ;
        if (interfaceC44493HdB != null) {
            if (str == null) {
                str = "";
            }
            interfaceC44493HdB.LIZIZ(i, i2, str);
        }
        this.LIZIZ.LIZ((C44485Hd3) this.LIZJ);
    }
}
