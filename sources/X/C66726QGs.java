package X;

/* renamed from: X.QGs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66726QGs implements InterfaceC66732QGy {
    public final C67649Qgn<String> LIZ;

    @Override // X.InterfaceC66732QGy
    public final boolean LIZ(Exception exc) {
        return false;
    }

    public C66726QGs(C67649Qgn<String> c67649Qgn) {
        this.LIZ = c67649Qgn;
    }

    @Override // X.InterfaceC66732QGy
    public final boolean LIZIZ(C66720QGm c66720QGm) {
        if (c66720QGm.LJFF() != EnumC66725QGr.UNREGISTERED && c66720QGm.LJFF() != EnumC66725QGr.REGISTERED && c66720QGm.LJFF() != EnumC66725QGr.REGISTER_ERROR) {
            return false;
        }
        this.LIZ.LIZLLL(c66720QGm.LIZIZ);
        return true;
    }
}
