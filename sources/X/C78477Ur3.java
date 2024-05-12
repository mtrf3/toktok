package X;

/* renamed from: X.Ur3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78477Ur3 {
    public static final C78477Ur3 LIZ = new C78477Ur3();
    public static InterfaceC78481Ur7 LIZIZ = new C78478Ur4();
    public static int LIZJ;

    public final synchronized void LIZ() {
        int i = LIZJ;
        if (i > 0) {
            return;
        }
        try {
            LIZJ = i + 1;
            LIZIZ.LIZ();
        } catch (Exception unused) {
        } catch (Throwable th) {
            LIZJ = 0;
            throw th;
        }
        LIZJ = 0;
    }
}
