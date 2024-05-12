package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YW4 {
    public static final /* synthetic */ int LIZ = 0;

    public static IMUser LIZ(YW6 imUserEntity) {
        boolean z;
        boolean z2;
        o.LJIIIZ(imUserEntity, "imUserEntity");
        IMUser iMUser = new IMUser();
        iMUser.setUid(imUserEntity.LIZ);
        iMUser.setSecUid(imUserEntity.LIZIZ);
        iMUser.setNickName(imUserEntity.LIZJ);
        iMUser.setSignature(imUserEntity.LIZLLL);
        iMUser.setAvatarStr(imUserEntity.LJ);
        iMUser.setAvatarMediumStr(imUserEntity.LJJIL);
        iMUser.setFollowStatus(imUserEntity.LJFF);
        iMUser.setUniqueId(imUserEntity.LJI);
        iMUser.setWeiboVerify(imUserEntity.LJII);
        iMUser.setCustomVerify(imUserEntity.LJIIIIZZ);
        iMUser.setEnterpriseVerifyReason(imUserEntity.LJIIIZ);
        String str = imUserEntity.LJIIJ;
        if (str != null) {
            iMUser.setVerificationType(CastIntegerProtector.parseInt(str));
        }
        iMUser.setRemarkName(imUserEntity.LJIIJJI);
        iMUser.setSortWeight(imUserEntity.LJIIL);
        iMUser.setInitialLetter(imUserEntity.LJIILIIL);
        iMUser.setShortId(imUserEntity.LJIILJJIL);
        iMUser.setRemarkPinyin(imUserEntity.LJIILL);
        iMUser.setRemarkInitial(imUserEntity.LJIILLIIL);
        iMUser.setNickNamePinyin(imUserEntity.LJIIZILJ);
        iMUser.setNickNameInitial(imUserEntity.LJIJ);
        Integer num = imUserEntity.LJIJI;
        if (num != null) {
            iMUser.setCommerceUserLevel(num.intValue());
        }
        iMUser.setContactName(imUserEntity.LJIJJ);
        iMUser.setContactNamePinyin(imUserEntity.LJIJJLI);
        iMUser.setContactNameInitial(imUserEntity.LJIL);
        Integer num2 = imUserEntity.LJJ;
        if (num2 != null) {
            iMUser.setShareStatus(num2.intValue());
        }
        Integer num3 = imUserEntity.LJJI;
        if (num3 != null) {
            iMUser.setFriendRecType(num3.intValue());
        }
        Long l = imUserEntity.LJJIFFI;
        if (l != null) {
            iMUser.setFriendRecTime(l.longValue());
        }
        Long l2 = imUserEntity.LJJII;
        if (l2 != null) {
            iMUser.setFollowTime(l2.longValue());
        }
        Integer num4 = imUserEntity.LJJIII;
        boolean z3 = false;
        if (num4 != null) {
            int intValue = num4.intValue();
            if (intValue == 1 || intValue == 4) {
                z = true;
            } else {
                z = false;
            }
            iMUser.setBlock(z);
            if (intValue == 2 || intValue == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            iMUser.setBlocked(z2);
        }
        if (imUserEntity.LJJIIJ == 0) {
            z3 = true;
        }
        iMUser.setMentionEnabled(z3);
        iMUser.setQaInviteBlockStatus(imUserEntity.LJJIJ);
        iMUser.setVideoMentionBlockStatus(imUserEntity.LJJIIZ);
        iMUser.setVideoTagBlockStatus(imUserEntity.LJJIIZI);
        iMUser.setCommentMentionBlockStatus(imUserEntity.LJJIIJZLJL);
        iMUser.setFollowerStatus(imUserEntity.LJJIJIIJI);
        Integer num5 = imUserEntity.LJJIJIIJIL;
        if (num5 != null) {
            iMUser.setAccountType(num5.intValue());
        }
        iMUser.setFollowerCount(imUserEntity.LJJIJIL);
        iMUser.setFollowingCount(imUserEntity.LJJIJL);
        iMUser.setInternalShareHoldoutVersion(imUserEntity.LJJIJLIJ);
        iMUser.setWelcomeMsgEnabled(imUserEntity.LJJIZ);
        return iMUser;
    }
}
