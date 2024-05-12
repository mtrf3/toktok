package X;

/* renamed from: X.9gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243439gx {
    public static String LIZ = "click_bar";

    public static final void LIZ(String str, String str2, String str3, String str4) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "id", str2, "authorId");
        LIZ2.LJIIIZ("enter_from", "prop_page");
        LIZ2.LJIIIZ("prop_id", str);
        LIZ2.LJIIIZ("prop_author_id", str2);
        LIZ2.LJIIIZ("enter_method", LIZ);
        LIZ2.LIZLLL(1, "is_prop_author_video");
        LIZ2.LIZLLL(1, "order");
        LIZ2.LJIIIZ("group_id", str4);
        LIZ2.LJIIIZ("status", str3);
        FMX.LJIIL("save_featured_video_status", LIZ2.LIZ);
    }
}
