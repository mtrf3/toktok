package X;

/* renamed from: X.WLa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82126WLa implements InterfaceC83737Wth {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C82127WLb LIZIZ;

    @Override // X.InterfaceC83737Wth
    public final void LIZIZ(int i) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Antishake ");
        if (this.LIZ) {
            str = "on ";
        } else {
            str = "off";
        }
        LIZ.append(str);
        LIZ.append(", camera open success: Camera id:");
        LIZ.append(this.LIZIZ.LIZJ.getCameraPosition());
        LIZ.append(", camera type");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C82127WLb.LJ = this.LIZ;
    }

    public C82126WLa(C82127WLb c82127WLb, boolean z) {
        this.LIZIZ = c82127WLb;
        this.LIZ = z;
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZ(int i, int i2, String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Antishake ");
        if (this.LIZ) {
            str2 = "on ";
        } else {
            str2 = "off";
        }
        LIZ.append(str2);
        LIZ.append(", camera open fail: Camera id:");
        LIZ.append(this.LIZIZ.LIZJ.getCameraPosition());
        LIZ.append(", camera type");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
    }
}
