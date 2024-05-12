package X;

/* renamed from: X.FJs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38776FJs extends AbstractC38828FLs {
    public static C38776FJs LIZIZ;

    public static C38776FJs LJIIL() {
        if (LIZIZ == null) {
            synchronized (C38776FJs.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C38776FJs();
                }
            }
        }
        return LIZIZ;
    }

    @Override // X.AbstractC38828FLs
    public final void LJII() {
        this.LIZ = "default_config";
    }
}
