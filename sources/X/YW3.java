package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YW3 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.YW5 LIZ(com.ss.android.ugc.aweme.profile.model.User r53) {
        /*
            java.lang.String r0 = "user"
            r1 = r53
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            com.ss.android.ugc.aweme.friends.model.MutualStruct r0 = r1.getMutualStruct()
            java.lang.String r48 = ""
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.friends.model.MutualStruct r0 = r1.getMutualStruct()     // Catch: java.lang.Exception -> L1d
            java.lang.String r0 = X.C75792yF.LIZJ(r0)     // Catch: java.lang.Exception -> L1d
            java.lang.String r2 = "toJson(user.mutualStruct)"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)     // Catch: java.lang.Exception -> L1d
            goto L1f
        L1d:
            r0 = r48
        L1f:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.getAvatarThumb()
            if (r2 == 0) goto L33
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.getAvatarThumb()     // Catch: java.lang.Exception -> L33
            java.lang.String r8 = X.C75792yF.LIZJ(r2)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "toJson(user.avatarThumb)"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r2)     // Catch: java.lang.Exception -> L33
            goto L35
        L33:
            r8 = r48
        L35:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.getAvatarMedium()
            if (r2 == 0) goto L4a
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.getAvatarMedium()     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = X.C75792yF.LIZJ(r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r2 = "toJson(user.avatarMedium)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r2)     // Catch: java.lang.Exception -> L4a
            r48 = r3
        L4a:
            java.lang.String r31 = r1.getRecommendReason()
            boolean r2 = android.text.TextUtils.isEmpty(r31)
            if (r2 == 0) goto L5e
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r2 = r1.getMatchedFriendStruct()
            if (r2 == 0) goto Lf6
            java.lang.String r31 = r2.getRecommendReason()
        L5e:
            X.YW5 r3 = new X.YW5
            java.lang.String r4 = r1.getUid()
            java.lang.String r2 = "uid"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r2)
            java.lang.String r5 = r1.getSecUid()
            java.lang.String r6 = r1.getNickname()
            java.lang.String r7 = r1.getSignature()
            int r9 = r1.getFollowStatus()
            java.lang.String r10 = r1.getUniqueId()
            r11 = 0
            java.lang.String r12 = r1.getCustomVerify()
            java.lang.String r13 = r1.getEnterpriseVerifyReason()
            int r2 = r1.getVerificationType()
            java.lang.String r14 = java.lang.String.valueOf(r2)
            java.lang.String r15 = r1.getRemarkName()
            java.lang.String r18 = r1.getShortId()
            int r2 = r1.getCommerceUserLevel()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r2)
            java.lang.String r24 = r1.getContactName()
            java.lang.String r30 = r1.getAccurateRecType()
            r34 = 0
            r35 = 0
            int r43 = r1.getFollowerStatus()
            int r2 = r1.getAccountType()
            java.lang.Integer r44 = java.lang.Integer.valueOf(r2)
            int r45 = r1.getFollowerCount()
            int r46 = r1.getFollowingCount()
            java.lang.String r50 = r1.getFriendTypeStr()
            java.lang.String r51 = r1.getRequestId()
            java.lang.String r52 = r1.getSocialInfo()
            boolean r53 = r1.isPrivateAccount()
            r16 = r11
            r17 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r25 = r11
            r26 = r11
            r27 = r11
            r28 = r11
            r29 = r11
            r32 = r11
            r33 = r11
            r37 = r35
            r39 = r35
            r41 = r35
            r47 = r34
            r49 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return r3
        Lf6:
            r31 = 0
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YW3.LIZ(com.ss.android.ugc.aweme.profile.model.User):X.YW5");
    }

    public static MAFIMUser LIZIZ(YW5 userEntity) {
        boolean z;
        boolean z2;
        o.LJIIIZ(userEntity, "userEntity");
        MAFIMUser mAFIMUser = new MAFIMUser();
        mAFIMUser.setUid(userEntity.LIZ);
        mAFIMUser.setSecUid(userEntity.LIZIZ);
        mAFIMUser.setNickName(userEntity.LIZJ);
        mAFIMUser.setSignature(userEntity.LIZLLL);
        mAFIMUser.setAvatarStr(userEntity.LJ);
        mAFIMUser.setAvatarMediumStr(userEntity.LJJJ);
        mAFIMUser.setFollowStatus(userEntity.LJFF);
        mAFIMUser.setUniqueId(userEntity.LJI);
        mAFIMUser.setWeiboVerify(userEntity.LJII);
        mAFIMUser.setCustomVerify(userEntity.LJIIIIZZ);
        mAFIMUser.setEnterpriseVerifyReason(userEntity.LJIIIZ);
        String str = userEntity.LJIIJ;
        if (str != null) {
            mAFIMUser.setVerificationType(CastIntegerProtector.parseInt(str));
        }
        mAFIMUser.setRemarkName(userEntity.LJIIJJI);
        mAFIMUser.setRecType(userEntity.LJJII);
        mAFIMUser.setRecommendReason(userEntity.LJJIII);
        mAFIMUser.setSortWeight(userEntity.LJIIL);
        mAFIMUser.setInitialLetter(userEntity.LJIILIIL);
        mAFIMUser.setShortId(userEntity.LJIILJJIL);
        mAFIMUser.setRemarkPinyin(userEntity.LJIILL);
        mAFIMUser.setRemarkInitial(userEntity.LJIILLIIL);
        mAFIMUser.setNickNamePinyin(userEntity.LJIIZILJ);
        mAFIMUser.setNickNameInitial(userEntity.LJIJ);
        Integer num = userEntity.LJIJI;
        if (num != null) {
            mAFIMUser.setCommerceUserLevel(num.intValue());
        }
        mAFIMUser.setContactName(userEntity.LJIJJ);
        mAFIMUser.setContactNamePinyin(userEntity.LJIJJLI);
        mAFIMUser.setContactNameInitial(userEntity.LJIL);
        Integer num2 = userEntity.LJJ;
        if (num2 != null) {
            mAFIMUser.setShareStatus(num2.intValue());
        }
        Integer num3 = userEntity.LJJI;
        if (num3 != null) {
            mAFIMUser.setFriendRecType(num3.intValue());
        }
        Long l = userEntity.LJJIFFI;
        if (l != null) {
            mAFIMUser.setFriendRecTime(l.longValue());
        }
        Long l2 = userEntity.LJJIIJ;
        if (l2 != null) {
            mAFIMUser.setFollowTime(l2.longValue());
        }
        Integer num4 = userEntity.LJJIIJZLJL;
        boolean z3 = false;
        if (num4 != null) {
            if (num4.intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mAFIMUser.setBlock(z2);
        }
        if (userEntity.LJJIIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        mAFIMUser.setMentionEnabled(z);
        mAFIMUser.setQaInviteBlockStatus(userEntity.LJJIJIIJIL);
        mAFIMUser.setVideoMentionBlockStatus(userEntity.LJJIJ);
        mAFIMUser.setVideoTagBlockStatus(userEntity.LJJIJIIJI);
        mAFIMUser.setCommentMentionBlockStatus(userEntity.LJJIIZI);
        mAFIMUser.setFollowerStatus(userEntity.LJJIJIL);
        Integer num5 = userEntity.LJJIJL;
        if (num5 != null) {
            mAFIMUser.setAccountType(num5.intValue());
        }
        mAFIMUser.setFollowerCount(userEntity.LJJIJLIJ);
        mAFIMUser.setFollowingCount(userEntity.LJJIL);
        mAFIMUser.setInternalShareHoldoutVersion(userEntity.LJJIZ);
        if (!TextUtils.isEmpty(userEntity.LJJJI)) {
            try {
                mAFIMUser.setMMutualStruct((MutualStruct) C75792yF.LIZ(userEntity.LJJJI, MutualStruct.class));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        mAFIMUser.setFriendTypeStr(userEntity.LJJJIL);
        mAFIMUser.setRequestId(userEntity.LJJJJ);
        mAFIMUser.setSocialInfo(userEntity.LJJJJI);
        if (userEntity.LJJJJIZL != 0) {
            z3 = true;
        }
        mAFIMUser.setPrivateAccount(z3);
        return mAFIMUser;
    }

    public static User LIZJ(YW5 userEntity) {
        boolean z;
        boolean z2;
        o.LJIIIZ(userEntity, "userEntity");
        User user = new User();
        user.setUid(userEntity.LIZ);
        user.setSecUid(userEntity.LIZIZ);
        user.setNickname(userEntity.LIZJ);
        user.setSignature(userEntity.LIZLLL);
        try {
            user.setAvatarThumb((UrlModel) C75792yF.LIZ(userEntity.LJ, UrlModel.class));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        user.setFollowStatus(userEntity.LJFF);
        user.setFollowerStatus(userEntity.LJJIJIL);
        user.setUniqueId(userEntity.LJI);
        user.setCustomVerify(userEntity.LJIIIIZZ);
        user.setEnterpriseVerifyReason(userEntity.LJIIIZ);
        String str = userEntity.LJIIJ;
        if (str != null) {
            user.setVerificationType(CastIntegerProtector.parseInt(str));
        }
        user.setRemarkName(userEntity.LJIIJJI);
        user.setShortId(userEntity.LJIILJJIL);
        Integer num = userEntity.LJIJI;
        if (num != null) {
            user.setCommerceUserLevel(num.intValue());
        }
        user.setContactName(userEntity.LJIJJ);
        Integer num2 = userEntity.LJJIIJZLJL;
        boolean z3 = false;
        if (num2 != null) {
            if (num2.intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            user.isBlock = z2;
        }
        if (userEntity.LJJIIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        user.setMentionEnabled(z);
        user.setFollowerStatus(userEntity.LJJIJIL);
        Integer num3 = userEntity.LJJIJL;
        if (num3 != null) {
            user.setAccountType(num3.intValue());
        }
        user.setFollowerCount(userEntity.LJJIJLIJ);
        user.setFollowingCount(userEntity.LJJIL);
        user.setRecType(userEntity.LJJII);
        user.setRecommendReason(userEntity.LJJIII);
        if (!TextUtils.isEmpty(userEntity.LJJJI)) {
            try {
                user.setMutualStruct((MutualStruct) C75792yF.LIZ(userEntity.LJJJI, MutualStruct.class));
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        user.setFriendTypeStr(userEntity.LJJJIL);
        user.setRequestId(userEntity.LJJJJ);
        user.setSocialInfo(userEntity.LJJJJI);
        if (userEntity.LJJJJIZL != 0) {
            z3 = true;
        }
        user.setPrivateAccount(z3);
        return user;
    }
}
