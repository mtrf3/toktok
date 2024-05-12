package X;

/* renamed from: X.Wzb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84103Wzb implements X0P {
    public final /* synthetic */ C84092WzQ LIZ;

    public C84103Wzb(C84092WzQ c84092WzQ) {
        this.LIZ = c84092WzQ;
    }

    @Override // X.X0P
    public final void LIZ(int i, int i2, float f, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error:: type: 0x");
        LIZ.append(Integer.toHexString(i));
        LIZ.append("; msg: ");
        LIZ.append(str);
        P4Q.LIZJ("TERecorder", X1D.LIZIZ(LIZ));
        InterfaceC133905Ni interfaceC133905Ni = this.LIZ.LJIILL;
        if (interfaceC133905Ni != null) {
            interfaceC133905Ni.LIZ(i, i2, f, str);
        }
    }
}
