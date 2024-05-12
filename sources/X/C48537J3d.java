package X;

/* renamed from: X.J3d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48537J3d {
    public static C48599J5n LIZ() {
        C48599J5n c48599J5n = C48543J3j.LIZ;
        InterfaceC48540J3g.LJJJJ.getClass();
        if (!C48536J3c.LIZJ) {
            C48536J3c.LIZJ = true;
            synchronized (Boolean.valueOf(C48536J3c.LIZIZ)) {
                InterfaceC48540J3g interfaceC48540J3g = C48536J3c.LIZ;
                if (interfaceC48540J3g != null) {
                    C48536J3c.LIZIZ = true;
                    interfaceC48540J3g.tryInit();
                }
            }
        }
        return c48599J5n;
    }
}
