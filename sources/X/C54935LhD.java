package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.service.SocialFriendsService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean.NewUserPopupGroupSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LhD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54935LhD {
    public static final List<String> LIZ = new ArrayList();
    public static final List<C65432Pm8<String>> LIZIZ = C47261Igj.LJJIJIL(C65432Pm8.of((Object[]) new String[]{SocialFriendsService.LJII().LIZJ(), SocialFriendsService.LJII().LJFF(), IRecommendUsersServiceImpl.LJIIIZ().LJ(), SocialFriendsService.LJII().LIZIZ()}), C65432Pm8.of((Object[]) new String[]{"cla_popup_task"}));
    public static final Keva LIZJ = Keva.getRepo("new_user_dialog_clean_repo");

    public static String LIZ(String str) {
        String str2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        HG3.LJIIL();
        if (HG3.LJLJL.LJFF().isLogin()) {
            str2 = ((RBX) HG3.LJIILL()).getCurSecUserId();
        } else {
            str2 = "";
        }
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }

    public static int LIZIZ(String id) {
        o.LJIIIZ(id, "id");
        Iterator<C65432Pm8<String>> it = LIZIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (it.next().contains(id)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static boolean LJ(String id) {
        o.LJIIIZ(id, "id");
        int LIZIZ2 = LIZIZ(id);
        if (LIZIZ2 == -1 || LIZIZ2 == 0 || LIZIZ2 < LIZJ.getInt(LIZ("new_user_dialog_clean_cold_start_count"), 0)) {
            return false;
        }
        return true;
    }

    public static void LIZJ(String str, String str2) {
        if (str.equals("lynx_dynamic_popup")) {
            return;
        }
        List<String> list = LIZ;
        if (ORZ.LJLJJI(str, list)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("popup_id", str);
        c188727au.LJIIIZ("scene_id", str2);
        FMX.LJIIL("new_user_popup_intercept", c188727au.LIZ);
        if (!o.LJ(str, "dm_everyone_popup")) {
            return;
        }
        ((ArrayList) list).add("dm_everyone_popup");
    }

    public static void LIZLLL(String str, boolean z) {
        if (str.equals("lynx_dynamic_popup")) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("popup_id", str);
        c188727au.LJFF(Boolean.valueOf(z), "is_fcp");
        if (z) {
            C2ZT.LIZ.getClass();
            c188727au.LJFF(Boolean.valueOf(C2ZT.LIZJ), "use_local_data");
        } else {
            NewUserPopupGroupSetting.LIZ.getClass();
            c188727au.LJFF(Boolean.valueOf(NewUserPopupGroupSetting.LIZIZ), "use_local_data");
        }
        FMX.LJIIL("new_user_popup_miss_group", c188727au.LIZ);
    }
}
