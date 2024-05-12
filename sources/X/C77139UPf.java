package X;

/* renamed from: X.UPf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77139UPf implements InterfaceC58710N2k {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C77140UPg.LJLIL);

    @Override // X.InterfaceC58710N2k
    public final int LIZ() {
        return 3;
    }

    @Override // X.InterfaceC58710N2k
    public final OSZ<Boolean, Boolean> LIZJ() {
        boolean z;
        if (UQB.LJFF() || UQB.LJ()) {
            z = true;
        } else {
            z = false;
        }
        return new OSZ<>(Boolean.valueOf(z), Boolean.FALSE);
    }

    @Override // X.InterfaceC58710N2k
    public final boolean LIZIZ(ActivityC45651qj activityC45651qj) {
        if (UQB.LIZLLL() || ((Number) this.LIZ.getValue()).intValue() != 3 || !((RBX) HG3.LJIILL()).isLogin() || AV1.LJIIL() || UQB.LJI()) {
            return false;
        }
        return true;
    }
}
