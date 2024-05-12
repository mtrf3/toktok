package X;

/* renamed from: X.QDr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66647QDr {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "more_control" : "less_control" : "automatic";
    }

    public static void LIZIZ(int i, int i2, Integer num) {
        String str;
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            str = "comment_filter_offensive_level_click";
        } else if (num.intValue() == 2) {
            str = "comment_filter_profanity_level_click";
        } else if (num.intValue() != 3) {
            return;
        } else {
            str = "comment_filter_advertisements_level_click";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("original_level", LIZ(i));
        c188727au.LJIIIZ("level_selected", LIZ(i2));
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
