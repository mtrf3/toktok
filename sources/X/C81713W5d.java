package X;

/* renamed from: X.W5d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81713W5d {
    public static final Class<?> LIZ = C81713W5d.class;
    public static InterfaceC81733W5x LIZIZ;
    public static volatile boolean LIZJ;

    public static void LIZ(String str) {
        if (LIZJ) {
            try {
                InterfaceC81733W5x interfaceC81733W5x = LIZIZ;
                if (interfaceC81733W5x != null) {
                    interfaceC81733W5x.loadLibrary(str);
                    return;
                } else {
                    C39633Fgz.LJII(str);
                    return;
                }
            } catch (Throwable th) {
                W58.LJIJ(LIZ, th, "loadLibrary fail", new Object[0]);
            }
        }
        C16880lQ.LLJJJIL(str);
    }
}
