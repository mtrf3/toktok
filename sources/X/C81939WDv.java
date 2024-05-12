package X;

/* renamed from: X.WDv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81939WDv {
    public static volatile C81940WDw LIZ = null;

    public static InterfaceC81941WDx LIZ() {
        if (LIZ == null) {
            synchronized (C81939WDv.class) {
                if (LIZ == null) {
                    LIZ = new C81940WDw();
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ() {
        if (((Number) C35236DsG.LIZ.getValue()).intValue() > 0) {
            return;
        }
        LIZ().getClass();
    }
}
