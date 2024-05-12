package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.7E7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7E7 {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static boolean LIZLLL;

    public static void LIZ() {
        String str;
        String str2 = LIZ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("story_type", LIZJ);
        c188727au.LJIIIZ("enter_method", "bottom_bar");
        c188727au.LJIIIZ("enter_from", LIZIZ);
        if (LIZLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_allow_pugc_template", str);
        FMX.LJIIL(str2, c188727au.LIZ);
    }
}
