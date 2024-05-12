package X;

/* renamed from: X.SmL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73089SmL {
    public static volatile C73089SmL LIZIZ;
    public final OJM<InterfaceC73092SmO> LIZ = new OJM<>();

    public static C73089SmL LIZ() {
        if (LIZIZ == null) {
            synchronized (C73089SmL.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C73089SmL();
                }
            }
        }
        return LIZIZ;
    }
}
