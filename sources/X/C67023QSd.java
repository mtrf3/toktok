package X;

/* renamed from: X.QSd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67023QSd implements InterfaceC67026QSg {
    public C67023QSd(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[UGCloud ");
        LIZ.append(str);
        LIZ.append("]");
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC67026QSg
    public final void LIZ(C67022QSc c67022QSc) {
        if (c67022QSc.LJFF == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c67022QSc.LIZLLL);
            LIZ.append(": success  ");
            LIZ.append(c67022QSc.LJ);
            X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(c67022QSc.LIZLLL);
        LIZ2.append(": ");
        LIZ2.append(c67022QSc.LJ);
        LIZ2.append("  action = ");
        LIZ2.append(c67022QSc);
        X1D.LIZIZ(LIZ2);
    }
}
