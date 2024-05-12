package X;

/* renamed from: X.XAu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84408XAu extends XCZ {
    public final /* synthetic */ XCT LJI;

    @Override // X.XCZ
    public final void LIZJ() {
    }

    @Override // X.XCZ
    public final void LIZ() {
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJFF.LJJIFFI);
        if (interfaceC84458XCs != null) {
            interfaceC84458XCs.clear();
        }
        C30941Ji c30941Ji = C84390XAc.LIZ;
        c30941Ji.LIZIZ();
        try {
            C84390XAc.LIZIZ.clear();
            C84390XAc.LIZJ.LIZLLL(false);
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84408XAu(XCT xct, String str) {
        super(str, null);
        this.LJI = xct;
    }
}
