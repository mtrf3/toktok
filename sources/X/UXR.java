package X;

/* loaded from: classes14.dex */
public final class UXR {
    public static final C77349UXh LIZ;

    static {
        C77349UXh c77349UXh;
        if (C30922CBq.LIZIZ) {
            c77349UXh = C77349UXh.LIZ;
        } else {
            c77349UXh = null;
        }
        LIZ = c77349UXh;
    }

    public static long LIZ() {
        Long LIZJ;
        if (LIZ != null && (LIZJ = InterfaceC30442Bx8.LIZ.LIZJ()) != null && LIZJ.longValue() > 0) {
            return LIZJ.longValue();
        }
        return System.currentTimeMillis();
    }
}
