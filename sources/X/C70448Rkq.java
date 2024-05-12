package X;

/* renamed from: X.Rkq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70448Rkq extends C0A4 {
    public final /* synthetic */ C70459Rl1 LIZ;

    public C70448Rkq(C70459Rl1 c70459Rl1) {
        this.LIZ = c70459Rl1;
    }

    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        boolean z;
        InterfaceC70458Rl0 interfaceC70458Rl0 = this.LIZ.LIZJ;
        if (interfaceC70458Rl0 != null) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC70458Rl0.LIZ(z);
        }
        return false;
    }
}
