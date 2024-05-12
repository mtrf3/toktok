package X;

/* loaded from: classes5.dex */
public final class A0Z {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(String str, String str2, String str3) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "entryPoint");
        if (str == null) {
            str = "";
        }
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("shoot_way", "series_video_upload");
        LIZLLL.LJIIIZ("entry_point", str2);
        LIZLLL.LJIIIZ("creation_id", str3);
        FMX.LJIIL("shoot", LIZLLL.LIZ);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("button_name", str2);
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("collection_id", str3);
        c188727au.LIZLLL(i, "item_cnt");
        if (str4 == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("entry_point", str4);
        FMX.LJIIL("click_series_video_upload_button", c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5) {
        C188727au LIZLLL = KNV.LIZLLL(str3, "videoId");
        if (str == null) {
            str = "";
        }
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("button_name", str2);
        LIZLLL.LJIIIZ("item_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        LIZLLL.LJIIIZ("collection_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        LIZLLL.LJIIIZ("entry_point", str5);
        FMX.LJIIL("click_series_video_edit", LIZLLL.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("title", str);
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("button_name", str2);
        if (str4 == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("collection_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        c188727au.LJIIIZ("entry_point", str5);
        FMX.LJIIL("click_series_video_upload_modal", c188727au.LIZ);
    }
}
