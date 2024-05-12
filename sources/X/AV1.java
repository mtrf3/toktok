package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import defpackage.i0;
import yq4.a;

/* loaded from: classes5.dex */
public class AV1 {
    public static User LIZ;
    public static User LIZIZ;
    public static boolean LIZJ;

    public static boolean LJIILIIL(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    public static User LIZIZ() {
        User user = LIZIZ;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            LIZIZ = HG3.LJIILL().getCurUser();
        }
        return LIZIZ;
    }

    public static boolean LJIIJJI() {
        return HG3.LJIILL().isChildrenMode();
    }

    public static boolean LJIIL() {
        return HG3.LJIILL().isDeleteByAgeGate();
    }

    public static boolean LJIILLIIL() {
        if (a.LJI().LJI()) {
            return C36583EXj.LIZJ();
        }
        return LJIIJJI();
    }

    public static String LIZLLL(User user) {
        if (user == null) {
            return "";
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            if (user.getShortId() == null) {
                return "";
            }
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    public static UrlModel LJ(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger == null) {
            UrlModel avatarMedium = user.getAvatarMedium();
            if (avatarMedium == null) {
                return user.getAvatarThumb();
            }
            return avatarMedium;
        }
        return avatarLarger;
    }

    public static String LJFF(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null) {
            return aweme.getAuthor().getNickname();
        }
        return "";
    }

    public static String LJI(User user) {
        if (user == null) {
            return "";
        }
        if (!C85990Xow.LJIIIZ()) {
            return LIZLLL(user);
        }
        return user.getNickname();
    }

    public static int LJII(User user) {
        if (LJIIZILJ(user, TextUtils.equals(user.getUid(), HG3.LJIILL().getCurUserId()))) {
            return 0;
        }
        return user.getTabType();
    }

    public static String LJIIIIZZ(User user) {
        if (user == null) {
            return "";
        }
        return user.getUid();
    }

    public static String[] LJIIIZ(UrlModel urlModel) {
        if (urlModel == null || C38891fp.LJJI(urlModel.getUrlList())) {
            return null;
        }
        return (String[]) urlModel.getUrlList().toArray(new String[urlModel.getUrlList().size()]);
    }

    public static UrlModel LJIIJ(User user) {
        UrlModel avatarVideoUri;
        if (user == null || (avatarVideoUri = user.getAvatarVideoUri()) == null || !C38891fp.LJJIFFI(avatarVideoUri.getUrlList()) || TextUtils.isEmpty((CharSequence) ListProtector.get(avatarVideoUri.getUrlList(), 0))) {
            return null;
        }
        return avatarVideoUri;
    }

    public static boolean LJIILJJIL(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        return LJIILIIL(aweme.getAuthor().getFollowStatus());
    }

    public static boolean LJIILL(User user) {
        if (user == null) {
            return false;
        }
        return LJIILIIL(user.getFollowStatus());
    }

    public static boolean LJIJ(User user) {
        if (user == null) {
            return false;
        }
        if (user == LIZ) {
            return LIZJ;
        }
        boolean equals = TextUtils.equals(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID(), user.getUid());
        LIZJ = equals;
        LIZ = user;
        return equals;
    }

    public static boolean LJIJI(String str) {
        return TextUtils.equals(HG3.LJIILL().getCurUserId(), str);
    }

    public static boolean LJIJJ(User user) {
        if (user != null && user.getAccountType() == 3 && user.getBizAccountInfo() != null && user.getBizAccountInfo().getSuggestedAccountsEntranceTipType() != 0 && !TextUtils.isEmpty(user.getBizAccountInfo().getSuggestedAccountsLynxSchema())) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJLI(User user) {
        if (TextUtils.equals("unique_id", user.getNameField())) {
            return true;
        }
        return false;
    }

    public static String LIZ(User user, boolean z) {
        String nickname;
        String str;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            nickname = user.getRemarkName();
        } else if (!C85990Xow.LJIIIZ()) {
            if (TextUtils.isEmpty(user.getUniqueId())) {
                nickname = user.getShortId();
            } else {
                nickname = user.getUniqueId();
            }
        } else {
            nickname = user.getNickname();
        }
        if (!z) {
            str = "";
        } else {
            str = "@";
        }
        if (TextUtils.isEmpty(nickname)) {
            return "";
        }
        return i0.LJFF(str, nickname);
    }

    public static String LIZJ(User user, boolean z) {
        String nickname;
        String str;
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            nickname = user.getRemarkName();
        } else {
            nickname = user.getNickname();
        }
        if (!z) {
            str = "";
        } else {
            str = "@";
        }
        if (TextUtils.isEmpty(nickname)) {
            return "";
        }
        return i0.LJFF(str, nickname);
    }

    public static boolean LJIIZILJ(User user, boolean z) {
        if (user != null && !z && user.getFollowStatus() != 1 && user.getFollowStatus() != 2 && user.isSecret()) {
            return true;
        }
        return false;
    }
}
