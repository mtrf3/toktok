package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.K0i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51012K0i {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, String str, String str2, String str3, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_group_id", aweme.getAid());
        c188727au.LJIIIZ("board_type", "android");
        c188727au.LJIIIZ("click_detail", str);
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJIIIZ("words_content", str2);
        if (z) {
            c188727au.LJI("is_from_photo", "1");
        }
        FMX.LJIIL("comment_related_search_board_click", c188727au.LIZ);
    }
}
