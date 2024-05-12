package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y9H {
    public static Y9G LIZ(IMUser imUser) {
        o.LJIIIZ(imUser, "imUser");
        String uid = imUser.getUid();
        o.LJIIIIZZ(uid, "imUser.uid");
        int followStatus = imUser.getFollowStatus();
        String initialLetter = imUser.getInitialLetter();
        String str = "";
        if (initialLetter == null) {
            initialLetter = "";
        }
        String nickName = imUser.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        String signature = imUser.getSignature();
        if (signature == null) {
            signature = "";
        }
        UrlModel avatarThumb = imUser.getAvatarThumb();
        String uniqueId = imUser.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        String shortId = imUser.getShortId();
        if (shortId == null) {
            shortId = "";
        }
        String customVerify = imUser.getCustomVerify();
        String enterpriseVerifyReason = imUser.getEnterpriseVerifyReason();
        int verificationType = imUser.getVerificationType();
        String remarkName = imUser.getRemarkName();
        if (remarkName == null) {
            remarkName = "";
        }
        String contactName = imUser.getContactName();
        if (contactName == null) {
            contactName = "";
        }
        int commerceUserLevel = imUser.getCommerceUserLevel();
        String nickNamePinyin = imUser.getNickNamePinyin();
        String contactNamePinyin = imUser.getContactNamePinyin();
        String nickNameInitial = imUser.getNickNameInitial();
        String contactNameInitial = imUser.getContactNameInitial();
        String secUid = imUser.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        return new Y9G(uid, followStatus, initialLetter, nickName, signature, avatarThumb, uniqueId, shortId, customVerify, enterpriseVerifyReason, verificationType, remarkName, contactName, commerceUserLevel, nickNamePinyin, contactNamePinyin, nickNameInitial, contactNameInitial, str, new C217878gp(imUser.isMentionEnabled(), null, false, null, null, null, imUser.getSearchType(), null, null, 446));
    }

    public static Y9G LIZIZ(User user) {
        o.LJIIIZ(user, "user");
        String uid = user.getUid();
        String str = "";
        if (uid == null) {
            uid = "";
        }
        int followStatus = user.getFollowStatus();
        String signature = user.getSignature();
        if (signature == null) {
            signature = "";
        }
        String nickname = user.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        UrlModel avatarThumb = user.getAvatarThumb();
        String uniqueId = user.getUniqueId();
        if (uniqueId == null) {
            uniqueId = "";
        }
        String shortId = user.getShortId();
        if (shortId == null) {
            shortId = "";
        }
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        int verificationType = user.getVerificationType();
        String remarkName = user.getRemarkName();
        if (remarkName == null) {
            remarkName = "";
        }
        String contactName = user.getContactName();
        if (contactName == null) {
            contactName = "";
        }
        int commerceUserLevel = user.getCommerceUserLevel();
        String secUid = user.getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        return new Y9G(uid, followStatus, nickname, signature, avatarThumb, uniqueId, shortId, customVerify, enterpriseVerifyReason, verificationType, remarkName, contactName, commerceUserLevel, str, null, 770052);
    }

    public static User LIZJ(Y9G mentionUser) {
        o.LJIIIZ(mentionUser, "mentionUser");
        User user = new User();
        user.setUid(mentionUser.LIZ);
        user.setFollowStatus(mentionUser.LIZIZ);
        user.setSignature(mentionUser.LJ);
        user.setNickname(mentionUser.LIZLLL);
        user.setAvatarThumb(mentionUser.LJFF);
        user.setUniqueId(mentionUser.LJI);
        user.setShortId(mentionUser.LJII);
        user.setCustomVerify(mentionUser.LJIIIIZZ);
        user.setEnterpriseVerifyReason(mentionUser.LJIIIZ);
        user.setVerificationType(mentionUser.LJIIJ);
        user.setRemarkName(mentionUser.LJIIJJI);
        user.setContactName(mentionUser.LJIIL);
        user.setCommerceUserLevel(mentionUser.LJIILIIL);
        user.setRegion("");
        user.setSecUid(mentionUser.LJIJ);
        return user;
    }
}
