package X;

/* renamed from: X.Ez6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38208Ez6 extends C38211Ez9 {
    public final /* synthetic */ C60238NkY LIZIZ;

    @Override // X.C38211Ez9, X.InterfaceC38140Ey0
    public final void LIZ(String str, String str2, C17230lz c17230lz) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38208Ez6(C60238NkY c60238NkY, C59614NaU c59614NaU) {
        super(c59614NaU);
        this.LIZIZ = c60238NkY;
    }

    @Override // X.C38211Ez9, X.InterfaceC38140Ey0
    public final void LIZIZ(String str, String str2, int i, String str3, C17230lz c17230lz) {
        C60238NkY c60238NkY = this.LIZIZ;
        StringBuilder LIZIZ = C25620zW.LIZIZ("complete web bridge named ", str2, " failure with status [");
        this.LIZIZ.getClass();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
            }
        }
        LIZIZ.append(i2);
        LIZIZ.append(", ");
        LIZIZ.append(str3);
        LIZIZ.append(']');
        c60238NkY.printLog(X1D.LIZIZ(LIZIZ), EnumC39958FmE.D, "BridgeRegistry");
        super.LIZIZ(str, str2, i, str3, c17230lz);
    }
}
