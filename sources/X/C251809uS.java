package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;

/* renamed from: X.9uS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251809uS {
    public static final String LIZ;
    public static boolean LIZIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ = JBR.LJFF(LIZ2, EFJ.LIZJ, "/aweme/v1/user/", LIZ2);
        LIZIZ = true;
    }

    public static User LIZ(String str, boolean z, String str2) {
        String str3;
        C38281F0r c38281F0r = new C38281F0r(str);
        if (LIZIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c38281F0r.LIZLLL("is_cold_start", str3);
        LIZIZ = false;
        return (User) C87030YDq.LIZIZ.apiExecuteGetJSONObject(c38281F0r.toString(), User.class, "user", z, str2, null);
    }

    public static UserResponse LIZIZ(C252699vt c252699vt, String str, String str2, boolean z) {
        return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(str, UserResponse.class, "", z, str2, c252699vt);
    }

    public static String LIZJ(int i, Boolean bool, String str, String str2, String str3) {
        int i2;
        Uri.Builder buildUpon = UriProtector.parse(EFJ.LIZJ).buildUpon();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        String uniqueId = ((RBX) HG3.LJIILL()).getCurUser().getUniqueId();
        if ((!TextUtils.isEmpty(str2) && TextUtils.equals(curUserId, str2)) || ((!TextUtils.isEmpty(str) && TextUtils.equals(curSecUserId, str)) || (!TextUtils.isEmpty(str3) && TextUtils.equals(uniqueId, str3)))) {
            buildUpon.path("/aweme/v1/user/profile/self/");
            if (((RBX) HG3.LJIILL()).isLogin()) {
                Keva repo = Keva.getRepo("keva_repo_profile_component");
                if (Z8A.LIZIZ.needShowCompleteProfileGuideBar() && !repo.getBoolean(C226788vC.LIZ("profile_page_complete_profile_guide_bar_has_click_close"), false) && repo.getInt(C226788vC.LIZ("profile_page_complete_profile_guide_bar_show_times"), 0) < 3 && System.currentTimeMillis() - repo.getLong(C226788vC.LIZ("profile_page_complete_profile_guide_bar_last_show_time"), 0L) > 2592000000L) {
                    buildUpon.appendQueryParameter("need_pv", String.valueOf(true));
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            buildUpon.path("/aweme/v1/user/profile/other/").appendQueryParameter("sec_user_id", str);
        } else if (!TextUtils.isEmpty(str2)) {
            buildUpon.path("/aweme/v1/user/profile/other/").appendQueryParameter("user_id", str2);
        } else if (!TextUtils.isEmpty(str3)) {
            buildUpon.path("/aweme/v1/user/profile/other/").appendQueryParameter("unique_id", str3);
        } else {
            buildUpon.path("/aweme/v1/user/profile/other/");
        }
        if (bool.booleanValue()) {
            buildUpon.appendQueryParameter("with_mutual", String.valueOf(true));
        }
        if (((RBY) HG3.LJIILL()).isUidContactPermisioned()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        buildUpon.appendQueryParameter("address_book_access", String.valueOf(i2));
        buildUpon.appendQueryParameter("from", String.valueOf(i));
        if (buildUpon.toString().contains("/aweme/v1/user/profile/other/")) {
            int[] LIZ2 = J7H.LIZ(102);
            String str4 = LIZ2[0] + "_" + LIZ2[1];
            int[] LIZ3 = J7H.LIZ(700);
            String str5 = LIZ3[0] + "_" + LIZ3[1];
            buildUpon.appendQueryParameter("user_avatar_shrink", str4);
            buildUpon.appendQueryParameter("user_cover_shrink", str5);
        }
        return buildUpon.toString();
    }
}
