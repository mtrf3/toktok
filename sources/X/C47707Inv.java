package X;

/* renamed from: X.Inv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47707Inv {
    public static String LIZ(C47160If6 c47160If6) {
        StringBuilder sb = new StringBuilder("fileId=");
        String LIZIZ = c47160If6.LIZIZ(28);
        String str = "";
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        String LIZIZ2 = c47160If6.LIZIZ(29);
        if (LIZIZ2 != null) {
            str = LIZIZ2;
        }
        sb.append(LIZIZ);
        sb.append("&bitrate=");
        sb.append(c47160If6.LIZLLL(44));
        sb.append("&pcrc=");
        sb.append(C47756Ioi.LJ(str));
        return sb.toString();
    }
}
