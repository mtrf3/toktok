package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CPlusSettings;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AD7 {
    public static boolean LJIIIIZZ() {
        String tcmEntranceSchemaUrl;
        try {
            TcmConfig LJIIZILJ = TcmServiceImpl.LJIJI().LJIIZILJ();
            if (LJIIZILJ == null || (tcmEntranceSchemaUrl = LJIIZILJ.getTcmEntranceSchemaUrl()) == null) {
                return false;
            }
            return tcmEntranceSchemaUrl.length() > 0;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean LIZJ() {
        Keva repo = Keva.getRepo("keva_repo_qa");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_key_red_dot");
        return C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true);
    }

    public static boolean LJIIJ() {
        Keva repo = Keva.getRepo("keva_repo_qa");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_key_public_qna_setting");
        boolean LIZIZ = C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, false);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (!QnaService.LIZ().enablePublicQna() || LIZIZ || curUser.getDisplayQnaOnProfile() != null) {
            return false;
        }
        return true;
    }

    public static boolean LIZ() {
        CPlusSettings LIZIZ = A80.LIZIZ();
        if (LIZIZ != null && LIZIZ.allowCreatorPlus) {
            return false;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "get().curUser");
        SharedPreferences LIZIZ2 = F9J.LIZIZ(C1791471i.LIZ, 0, "tcm_pro_account");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tcm_first_dot");
        LIZ.append(curUser.getUid());
        return LIZIZ2.getBoolean(X1D.LIZIZ(LIZ), true);
    }

    public static boolean LIZIZ() {
        if (C234869Jq.LIZ()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_add_yours");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_key_red_dot");
        boolean LIZIZ = C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (LIZIZ || curUser.getDisplayAddYoursOnProfile() != 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL() {
        C86393XvR LJJIJIL;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL == null || (LJJIJIL = LJJJLL.LJJIJIL()) == null || !o.LJ(LJJIJIL.LJLJL(), Boolean.TRUE)) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_live_creator_hub");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_key_red_dot");
        if (!C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true)) {
            return false;
        }
        return true;
    }

    public static boolean LJ() {
        if (LJIIL()) {
            Keva repo = Keva.getRepo("keva_repo_subscription_setting_entrance");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("keva_key_red_dot");
            if (C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF() {
        if (C240259bp.LIZ()) {
            Keva repo = Keva.getRepo("keva_repo_sound_on");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("keva_key_red_dot");
            if (C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJI() {
        if (((RBX) HG3.LJIILL()).getCurUser().isEnableSubscription()) {
            Keva repo = Keva.getRepo("keva_repo_subs");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("keva_key_red_dot");
            if (C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ, LIZ, repo, true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJII() {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "get().curUser");
        return curUser.isProAccount();
    }

    public static boolean LJIIIZ() {
        Integer valueOf;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "get().curUser");
        CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
        if (commerceUserInfo == null || (valueOf = Integer.valueOf(commerceUserInfo.getStarAtlas())) == null || valueOf.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static void LJIIJJI() {
        if (LJ()) {
            Keva repo = Keva.getRepo("keva_repo_subscription_setting_entrance");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("keva_key_red_dot");
            LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
            repo.storeBoolean(X1D.LIZIZ(LIZ), false);
        }
    }

    public static boolean LJIIL() {
        boolean z;
        if (!((Boolean) C0F0.LIZIZ().LIZJ(Boolean.TRUE, "ttlive_show_subscribe")).booleanValue()) {
            return false;
        }
        String str = (String) LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL().LIZJ("", "subscription_settings");
        if (!TextUtils.isEmpty(str)) {
            z = new JSONObject(str).optBoolean("has_subscription_history");
        } else {
            z = false;
        }
        if (!((RBX) HG3.LJIILL()).isLogin() || !z) {
            return false;
        }
        return true;
    }
}
