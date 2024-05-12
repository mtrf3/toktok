package X;

/* renamed from: X.IeQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47118IeQ implements InterfaceC47122IeU {
    public final /* synthetic */ C26206AQg LIZ;

    public C47118IeQ(C26206AQg c26206AQg) {
        this.LIZ = c26206AQg;
    }

    @Override // X.InterfaceC47122IeU
    public final void LIZ(C47121IeT c47121IeT) {
        InterfaceC47119IeR interfaceC47119IeR;
        C26206AQg c26206AQg = this.LIZ;
        if (c26206AQg != null && (interfaceC47119IeR = c26206AQg.LIZLLL) != null) {
            C47106IeE c47106IeE = c47121IeT.LIZIZ;
            if (c47106IeE == null) {
                interfaceC47119IeR.LIZ(c47121IeT.LIZ, 0L, 0L, c47121IeT.LIZLLL);
                this.LIZ.LIZLLL.LIZIZ();
            } else {
                interfaceC47119IeR.LIZ(c47121IeT.LIZ, c47106IeE.LIZLLL, c47106IeE.LJ, c47121IeT.LIZLLL);
                this.LIZ.LIZLLL.LIZIZ();
            }
        }
    }
}
