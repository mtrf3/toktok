package X;

/* renamed from: X.Fn4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40010Fn4 implements InterfaceC64435PQp {
    public static volatile C40010Fn4 LIZIZ;
    public int LIZ;

    public static C40010Fn4 LIZJ() {
        if (LIZIZ == null) {
            synchronized (C40010Fn4.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C40010Fn4();
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZLLL() {
        if (this.LIZ != 0 || C64432PQm.LIZIZ().LIZJ == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJ() {
        if (this.LIZ != 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (!LJ() || C00F.LIZ(31744, 0, "power_mode_alog_downgrade_typev2", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC64435PQp
    public final void LIZ(int i) {
        this.LIZ = i;
    }
}
