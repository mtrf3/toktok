package X;

/* renamed from: X.W8i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81796W8i {
    public static final C81828W9o LIZ = new C81828W9o("JPEG");
    public static final C81828W9o LIZIZ = new C81828W9o("PNG");
    public static final C81828W9o LIZJ = new C81828W9o("GIF");
    public static final C81828W9o LIZLLL = new C81828W9o("BMP");
    public static final C81828W9o LJ = new C81828W9o("ICO");
    public static final C81828W9o LJFF = new C81828W9o("WEBP_SIMPLE");
    public static final C81828W9o LJI = new C81828W9o("WEBP_LOSSLESS");
    public static final C81828W9o LJII = new C81828W9o("WEBP_EXTENDED");
    public static final C81828W9o LJIIIIZZ = new C81828W9o("WEBP_EXTENDED_WITH_ALPHA");
    public static final C81828W9o LJIIIZ = new C81828W9o("WEBP_ANIMATED");
    public static final C81828W9o LJIIJ = new C81828W9o("HEIF");
    public static final C81828W9o LJIIJJI = new C81828W9o("DNG");

    public static boolean LIZ(C81828W9o c81828W9o) {
        try {
            C81828W9o c81828W9o2 = C81794W8g.LIZJ;
            if (c81828W9o2 == null) {
                Class cls = C81794W8g.LIZIZ;
                c81828W9o2 = null;
                if (cls != null) {
                    try {
                        try {
                            C81794W8g.LIZJ = (C81828W9o) cls.getDeclaredField("HEIF_FORMAT").get(null);
                        } catch (IllegalAccessException e) {
                            W58.LJII("HeifFormatUtil", "HeifFormat init ", e);
                        }
                    } catch (NoSuchFieldException e2) {
                        W58.LJII("HeifFormatUtil", "HeifFormat init ", e2);
                    } catch (Exception e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                    c81828W9o2 = C81794W8g.LIZJ;
                }
            }
            if (c81828W9o != c81828W9o2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            W58.LJII("DefaultImageFormats", "isHeifFormat error", th);
            return false;
        }
    }

    public static boolean LIZIZ(C81828W9o c81828W9o) {
        C81828W9o LIZIZ2 = C81794W8g.LIZIZ();
        if (LIZIZ2 == null || c81828W9o != LIZIZ2) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(C81828W9o c81828W9o) {
        if (c81828W9o == LJFF || c81828W9o == LJI || c81828W9o == LJII || c81828W9o == LJIIIIZZ) {
            return true;
        }
        return false;
    }
}
