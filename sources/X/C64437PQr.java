package X;

/* renamed from: X.PQr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64437PQr implements InterfaceC64435PQp {
    public static final C64437PQr LIZ = new C64437PQr();

    @Override // X.InterfaceC64435PQp
    public final void LIZ(int i) {
        if (C40010Fn4.LIZJ().LJ()) {
            C64441PQv.LIZ.LIZ();
            return;
        }
        synchronized (C64441PQv.LIZ) {
            if (C64441PQv.LIZJ && C64441PQv.LIZLLL) {
                C64441PQv.LIZLLL = false;
            }
        }
    }
}
