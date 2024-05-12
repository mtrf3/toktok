package X;

/* loaded from: classes9.dex */
public final class JWE {
    public static final /* synthetic */ JWE LIZ = new JWE();

    public static String LIZ(int i) {
        if (i == 0) {
            return "user";
        }
        if (i == 1) {
            return "music";
        }
        if (i == 2) {
            return "challenge";
        }
        if (i != 3) {
            if (i == 4) {
                return "video";
            }
            if (i == 7) {
                return "live";
            }
        }
        return "general";
    }
}
