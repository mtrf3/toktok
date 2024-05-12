package X;

/* renamed from: X.Vd1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80155Vd1 implements VTX {
    public final /* synthetic */ InterfaceC80156Vd2 LIZ;

    public C80155Vd1(InterfaceC80156Vd2 interfaceC80156Vd2) {
        this.LIZ = interfaceC80156Vd2;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        boolean z;
        InterfaceC80156Vd2 interfaceC80156Vd2 = this.LIZ;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (c80217Ve1.getTotalScrollRange() + i > 0) {
            z2 = false;
        }
        C80157Vd3 c80157Vd3 = (C80157Vd3) interfaceC80156Vd2;
        c80157Vd3.LJLJL = z;
        c80157Vd3.LJLJLJ = z2;
    }
}
