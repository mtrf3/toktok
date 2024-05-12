package X;

/* renamed from: X.RmP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70545RmP extends C0A4 {
    public final /* synthetic */ C70565Rmj LIZ;

    public C70545RmP(C70565Rmj c70565Rmj) {
        this.LIZ = c70565Rmj;
    }

    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        boolean z;
        InterfaceC70564Rmi interfaceC70564Rmi = this.LIZ.LIZJ;
        if (interfaceC70564Rmi != null) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC70564Rmi.LIZ(z);
        }
        return false;
    }
}
