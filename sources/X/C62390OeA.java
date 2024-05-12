package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OeA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62390OeA {
    public static boolean LIZLLL(User user) {
        ProfileBadgeStruct profileBadge;
        o.LJIIIZ(user, "user");
        if ((user.getProfileBadge() == null || (profileBadge = user.getProfileBadge()) == null || !profileBadge.getShouldShow()) && (user.getProfileBadge() == null || !o.LJ(user.getUid(), ((RBX) HG3.LJIILL()).getCurUser().getUid()))) {
            return false;
        }
        return true;
    }

    public static void LIZ(String str, User user, SharePackage sharePackage) {
        String str2;
        String str3;
        String str4;
        Bundle bundle;
        if (user != null) {
            C235399Lr c235399Lr = new C235399Lr("share_person");
            C1799074g c1799074g = InterfaceC1798974f.LIZ;
            c235399Lr.LJ("platform", str, c1799074g);
            c235399Lr.LJ("target_id", user.getUid(), c1799074g);
            if (AV1.LJIJ(user)) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            c235399Lr.LJ("enter_from", str2, c1799074g);
            if (user.isSecret()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c235399Lr.LJ("is_private_profile", str3, c1799074g);
            if (sharePackage == null || (bundle = sharePackage.extras) == null || (str4 = bundle.getString("related_gid")) == null) {
                str4 = "";
            }
            c235399Lr.LJ("from_gid", str4, c1799074g);
            c235399Lr.LJIILIIL();
        }
    }

    public static void LIZIZ(String channelKey, boolean z, Context context, User user) {
        o.LJIIIZ(channelKey, "channelKey");
        o.LJIIIZ(context, "context");
        if (!z || user == null) {
            return;
        }
        C8BR c8br = new C8BR();
        c8br.LJJ(new C43169Gwv());
        C62683Oit c62683Oit = new C62683Oit();
        c62683Oit.LIZ = user.getUid();
        c62683Oit.LIZIZ = 1;
        c62683Oit.LJI = 4;
        c62683Oit.LJII = channelKey;
        c8br.LJIILL(c62683Oit.LIZ());
    }

    public static UserSharePackage LIZJ(User user, Context context, List list, String enterFrom, String panelSource) {
        String str;
        String str2;
        String str3;
        String shareUrl;
        String LJIJJ;
        String LJJ;
        String LJJI;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(panelSource, "panelSource");
        C62374Odu c62374Odu = new C62374Odu();
        String uid = user.getUid();
        String str4 = "";
        if (uid == null) {
            uid = "";
        }
        c62374Odu.LIZIZ = uid;
        String string = context.getString(R.string.bri);
        o.LJIIIIZZ(string, "context.getString(R.string.app_name)");
        c62374Odu.LIZIZ("app_name", string);
        ShareInfo shareInfo = user.getShareInfo();
        if (shareInfo == null || (str = shareInfo.getShareTitle()) == null) {
            str = "";
        }
        c62374Odu.LIZLLL = str;
        ShareInfo shareInfo2 = user.getShareInfo();
        if (shareInfo2 == null || (str2 = shareInfo2.getShareDesc()) == null) {
            str2 = "";
        }
        c62374Odu.LJ = str2;
        ShareInfo shareInfo3 = user.getShareInfo();
        if (shareInfo3 == null || (shareUrl = shareInfo3.getShareUrl()) == null || (LJIJJ = C78609UtB.LJIJJ(shareUrl)) == null || (LJJ = C78609UtB.LJJ(LJIJJ)) == null || (LJJI = C78609UtB.LJJI(LJJ)) == null || (str3 = C78609UtB.LJIJJLI(LJJI, panelSource)) == null) {
            str3 = "";
        }
        c62374Odu.LJFF = str3;
        c62374Odu.LIZ = "user";
        String uid2 = user.getUid();
        if (uid2 == null) {
            uid2 = "";
        }
        c62374Odu.LIZIZ("uid", uid2);
        String secUid = user.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        c62374Odu.LIZIZ("sec_user_id", secUid);
        String nickname = user.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        c62374Odu.LIZIZ("name", nickname);
        String uniqueId = user.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            String shortId = user.getShortId();
            if (shortId != null) {
                str4 = shortId;
            }
        } else {
            str4 = user.getUniqueId();
        }
        o.LJIIIIZZ(str4, "if (user.uniqueId.isNull…mpty() else user.uniqueId");
        c62374Odu.LIZIZ("desc", str4);
        if (!C53293Kvp.LIZIZ() && TextUtils.equals("screenshot_popup", panelSource)) {
            if (C53293Kvp.LIZ() == 2 || C53293Kvp.LIZ() == 4) {
                c62374Odu.LIZJ = new ShareContentType[]{ShareContentType.LINK_PLUS_PHOTO, ShareContentType.PHOTO};
            } else {
                c62374Odu.LIZJ = new ShareContentType[]{ShareContentType.LINK_PLUS_PHOTO, ShareContentType.LINK};
            }
        } else {
            c62374Odu.LIZJ = new ShareContentType[]{ShareContentType.LINK};
        }
        if (!AV1.LJIIZILJ(user, AV1.LJIJ(user)) && list != null && list.size() >= 3) {
            C17N.LJJJJ(c62374Odu.LJII, "aweme_cover_list", list);
        }
        c62374Odu.LJII.putSerializable("video_cover", user.getAvatarMedium());
        c62374Odu.LJII.putString("enter_from", enterFrom);
        c62374Odu.LJII.putString("panel_source", panelSource);
        UserSharePackage userSharePackage = new UserSharePackage(c62374Odu);
        userSharePackage.user = user;
        return userSharePackage;
    }
}
