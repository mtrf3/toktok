package X;

/* renamed from: X.4ZF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZF {
    public static C4ZF LIZIZ;
    public boolean LIZ;

    public static C4ZF LIZ() {
        if (LIZIZ == null) {
            synchronized (C4ZF.class) {
                LIZIZ = new C4ZF();
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ() {
        C63308Osy.LJI().LIZLLL().getClass();
        C63291Osh.LIZ().getClass();
        boolean z = C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIZ("msg_flag_bits_updated"));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifySyncDone: ");
        C76965UIn.LIZJ(LIZ, this.LIZ, ", ", false, ", ");
        LIZ.append(z);
        C63322OtC.LJI("MultiTableQueryOptManager", X1D.LIZIZ(LIZ), null);
    }
}
