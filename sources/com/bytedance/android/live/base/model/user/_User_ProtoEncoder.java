package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ProtoEncoder;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.Author;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.android.livesdk.model._AnchorLevel_ProtoEncoder;
import com.bytedance.android.livesdk.model._AuthenticationInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model._Author_ProtoEncoder;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model._FansClubMember_ProtoEncoder;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model._UserAttr_ProtoEncoder;
import com.bytedance.android.livesdk.model._UserHonor_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public final class _User_ProtoEncoder implements InterfaceC64604PXc<User> {
    public static int LIZJ(User user) {
        int LIZ;
        int LIZ2;
        int LIZ3;
        int LIZ4;
        int LIZ5;
        int LIZ6;
        int LIZ7;
        int LIZ8;
        int LIZ9;
        int LIZ10;
        int LIZ11;
        int LIZ12;
        int LIZ13;
        int LIZ14;
        int LIZ15;
        int LIZ16;
        int LIZ17;
        int LIZ18;
        int i = 0;
        if (user == null) {
            return 0;
        }
        int LJIIL = C30957CCz.LJIIL(19, user.shareQrcodeUri) + C30957CCz.LJI(18, user.secret) + C30957CCz.LJIIIZ(17, user.modifyTime) + C30957CCz.LJIIIZ(16, user.createTime) + C30957CCz.LJI(15, user.status) + C30957CCz.LJ(12) + _ImageModel_ProtoEncoder.LJ(11, user.avatarLarge) + _ImageModel_ProtoEncoder.LJ(10, user.avatarMedium) + _ImageModel_ProtoEncoder.LJ(9, user.avatarThumb) + C30957CCz.LJIIL(5, user.signature) + C30957CCz.LJIIL(3, user.nickName) + C30957CCz.LJIIIZ(1, user.id);
        FollowInfo followInfo = user.followInfo;
        if (followInfo == null) {
            LIZ = 0;
        } else {
            int LIZJ = _FollowInfo_ProtoEncoder.LIZJ(followInfo);
            LIZ = CD6.LIZ(22) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int i2 = LJIIL + LIZ;
        UserHonor userHonor = user.userHonor;
        if (userHonor == null) {
            LIZ2 = 0;
        } else {
            int LIZJ2 = _UserHonor_ProtoEncoder.LIZJ(userHonor);
            LIZ2 = CD6.LIZ(23) + CD6.LIZIZ(LIZJ2) + LIZJ2;
        }
        int i3 = i2 + LIZ2;
        FansClubMember fansClubMember = user.fansClub;
        if (fansClubMember == null) {
            LIZ3 = 0;
        } else {
            int LIZJ3 = _FansClubMember_ProtoEncoder.LIZJ(fansClubMember);
            LIZ3 = CD6.LIZ(24) + CD6.LIZIZ(LIZJ3) + LIZJ3;
        }
        int i4 = i3 + LIZ3;
        BorderInfo borderInfo = user.border;
        if (borderInfo == null) {
            LIZ4 = 0;
        } else {
            int LIZJ4 = _BorderInfo_ProtoEncoder.LIZJ(borderInfo);
            LIZ4 = CD6.LIZ(25) + CD6.LIZIZ(LIZJ4) + LIZJ4;
        }
        int LJ = _ImageModel_ProtoEncoder.LJ(28, user.medal) + _ImageModel_ProtoEncoder.LJ(27, user.avatarBorder) + C30957CCz.LJIIL(26, user.specialId) + LIZ4 + i4;
        List<ImageModel> list = user.userBadges;
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < user.userBadges.size(); i5++) {
                LJ += _ImageModel_ProtoEncoder.LJ(29, (ImageModel) ListProtector.get(user.userBadges, i5));
            }
        }
        List<ImageModel> list2 = user.newUserBadges;
        if (list2 != null && !list2.isEmpty()) {
            for (int i6 = 0; i6 < user.newUserBadges.size(); i6++) {
                LJ += _ImageModel_ProtoEncoder.LJ(30, (ImageModel) ListProtector.get(user.newUserBadges, i6));
            }
        }
        int LJIIIZ = C30957CCz.LJIIIZ(31, user.topVipNo) + LJ;
        UserAttr userAttr = user.userAttr;
        if (userAttr == null) {
            LIZ5 = 0;
        } else {
            int LIZJ5 = _UserAttr_ProtoEncoder.LIZJ(userAttr);
            LIZ5 = CD6.LIZ(32) + CD6.LIZIZ(LIZJ5) + LIZJ5;
        }
        int i7 = LJIIIZ + LIZ5;
        User.OwnRoom ownRoom = user.ownRoom;
        if (ownRoom == null) {
            LIZ6 = 0;
        } else {
            int LIZJ6 = _User_OwnRoom_ProtoEncoder.LIZJ(ownRoom);
            LIZ6 = CD6.LIZ(33) + CD6.LIZIZ(LIZJ6) + LIZJ6;
        }
        int LJIIIZ2 = C30957CCz.LJIIIZ(35, user.fanTicketCount) + C30957CCz.LJIIIZ(34, user.payScore) + i7 + LIZ6;
        AnchorInfo anchorInfo = user.anchorInfo;
        if (anchorInfo == null) {
            LIZ7 = 0;
        } else {
            int LJIIIZ3 = C30957CCz.LJIIIZ(1, anchorInfo.level);
            LIZ7 = CD6.LIZ(36) + CD6.LIZIZ(LJIIIZ3) + LJIIIZ3;
        }
        int LJIIIZ4 = C30957CCz.LJIIIZ(41, user.payScores) + C30957CCz.LJ(40) + C30957CCz.LJ(39) + C30957CCz.LJIIL(38, user.username) + C30957CCz.LJI(37, user.linkMicStats) + LJIIIZ2 + LIZ7;
        AnchorLevel anchorLevel = user.anchorLevel;
        if (anchorLevel == null) {
            LIZ8 = 0;
        } else {
            int LIZJ7 = _AnchorLevel_ProtoEncoder.LIZJ(anchorLevel);
            LIZ8 = CD6.LIZ(42) + CD6.LIZIZ(LIZJ7) + LIZJ7;
        }
        int LJIIL2 = C30957CCz.LJIIL(43, user.verifiedContent) + LJIIIZ4 + LIZ8;
        Author author = user.authorInfo;
        if (author == null) {
            LIZ9 = 0;
        } else {
            int LIZJ8 = _Author_ProtoEncoder.LIZJ(author);
            LIZ9 = CD6.LIZ(44) + CD6.LIZIZ(LIZJ8) + LIZJ8;
        }
        int i8 = LJIIL2 + LIZ9;
        List<User> list3 = user.topFans;
        if (list3 != null && !list3.isEmpty()) {
            for (int i9 = 0; i9 < user.topFans.size(); i9++) {
                User user2 = (User) ListProtector.get(user.topFans, i9);
                if (user2 == null) {
                    LIZ18 = 0;
                } else {
                    int LIZJ9 = LIZJ(user2);
                    LIZ18 = CD6.LIZ(45) + CD6.LIZIZ(LIZJ9) + LIZJ9;
                }
                i8 += LIZ18;
            }
        }
        int LJI = C30957CCz.LJI(47, user.userRole) + C30957CCz.LJIIL(46, user.secUid) + i8;
        ActivityRewardInfo activityRewardInfo = user.rewardInfo;
        if (activityRewardInfo == null) {
            LIZ10 = 0;
        } else {
            int LJ2 = _ImageModel_ProtoEncoder.LJ(2, activityRewardInfo.mStoryTag) + _ImageModel_ProtoEncoder.LJ(1, activityRewardInfo.mBage);
            LIZ10 = CD6.LIZ(49) + CD6.LIZIZ(LJ2) + LJ2;
        }
        int LJ3 = _ImageModel_ProtoEncoder.LJ(52, user.personalCard) + LJI + LIZ10;
        AuthenticationInfo authenticationInfo = user.authenticationInfo;
        if (authenticationInfo == null) {
            LIZ11 = 0;
        } else {
            int LIZIZ = _AuthenticationInfo_ProtoEncoder.LIZIZ(authenticationInfo);
            LIZ11 = CD6.LIZ(53) + CD6.LIZIZ(LIZIZ) + LIZIZ;
        }
        int i10 = LJ3 + LIZ11;
        List<ImageModel> list4 = user.mediaBadgeImageList;
        if (list4 != null && !list4.isEmpty()) {
            for (int i11 = 0; i11 < user.mediaBadgeImageList.size(); i11++) {
                i10 += _ImageModel_ProtoEncoder.LJ(57, (ImageModel) ListProtector.get(user.mediaBadgeImageList, i11));
            }
        }
        List<Long> list5 = user.commerceWebcastConfigIds;
        if (list5 != null && !list5.isEmpty()) {
            for (int i12 = 0; i12 < user.commerceWebcastConfigIds.size(); i12++) {
                i10 += C30957CCz.LJIIJ(60, (Long) ListProtector.get(user.commerceWebcastConfigIds, i12));
            }
        }
        List<BorderInfo> list6 = user.borders;
        if (list6 != null && !list6.isEmpty()) {
            for (int i13 = 0; i13 < user.borders.size(); i13++) {
                BorderInfo borderInfo2 = (BorderInfo) ListProtector.get(user.borders, i13);
                if (borderInfo2 == null) {
                    LIZ17 = 0;
                } else {
                    int LIZJ10 = _BorderInfo_ProtoEncoder.LIZJ(borderInfo2);
                    LIZ17 = CD6.LIZ(61) + CD6.LIZIZ(LIZJ10) + LIZJ10;
                }
                i10 += LIZ17;
            }
        }
        User.ComboBadgeInfo comboBadgeInfo = user.comboBadgeInfo;
        if (comboBadgeInfo == null) {
            LIZ12 = 0;
        } else {
            int LJIIIZ5 = C30957CCz.LJIIIZ(2, comboBadgeInfo.comboCount) + _ImageModel_ProtoEncoder.LJ(1, comboBadgeInfo.icon);
            LIZ12 = CD6.LIZ(62) + CD6.LIZIZ(LJIIIZ5) + LJIIIZ5;
        }
        int i14 = i10 + LIZ12;
        SubscribeInfo subscribeInfo = user.subscribeInfo;
        if (subscribeInfo == null) {
            LIZ13 = 0;
        } else {
            int LIZJ11 = _SubscribeInfo_ProtoEncoder.LIZJ(subscribeInfo);
            LIZ13 = CD6.LIZ(63) + CD6.LIZIZ(LIZJ11) + LIZJ11;
        }
        int i15 = i14 + LIZ13;
        List<BadgeStruct> list7 = user.badgeList;
        if (list7 != null && !list7.isEmpty()) {
            for (int i16 = 0; i16 < user.badgeList.size(); i16++) {
                BadgeStruct badgeStruct = (BadgeStruct) ListProtector.get(user.badgeList, i16);
                if (badgeStruct == null) {
                    LIZ16 = 0;
                } else {
                    int LIZJ12 = _BadgeStruct_ProtoEncoder.LIZJ(badgeStruct);
                    LIZ16 = CD6.LIZ(64) + CD6.LIZIZ(LIZJ12) + LIZJ12;
                }
                i15 += LIZ16;
            }
        }
        List<Long> list8 = user.mintTypeLabel;
        if (list8 != null && !list8.isEmpty()) {
            for (int i17 = 0; i17 < user.mintTypeLabel.size(); i17++) {
                i15 += C30957CCz.LJIIJ(65, (Long) ListProtector.get(user.mintTypeLabel, i17));
            }
        }
        User.FansClubInfo fansClubInfo = user.fansClubInfo;
        if (fansClubInfo == null) {
            LIZ14 = 0;
        } else {
            int LIZJ13 = _User_FansClubInfo_ProtoEncoder.LIZJ(fansClubInfo);
            LIZ14 = CD6.LIZ(66) + CD6.LIZIZ(LIZJ13) + LIZJ13;
        }
        int LJ4 = C30957CCz.LJ(1044) + C30957CCz.LJIIL(1043, user.verifiedReason) + C30957CCz.LJ(1040) + C30957CCz.LJ(1039) + C30957CCz.LJ(1038) + C30957CCz.LJ(1037) + C30957CCz.LJ(1036) + C30957CCz.LJ(1035) + C30957CCz.LJ(1034) + C30957CCz.LJ(1033) + C30957CCz.LJ(1031) + C30957CCz.LJ(1030) + C30957CCz.LJ(1029) + C30957CCz.LJIIL(1028, user.idStr) + C30957CCz.LJI(1027, user.ichatRestrictType) + C30957CCz.LJIIJ(1024, user.followStatus) + C30957CCz.LJ(1023) + C30957CCz.LJI(1021, user.exp) + C30957CCz.LJIIIZ(1020, user.enableIchatImg) + C30957CCz.LJI(1019, user.disableIchat) + C30957CCz.LJIIL(1018, user.constellation) + C30957CCz.LJI(1017, user.commentRestrict) + C30957CCz.LJI(1016, user.blockStatus) + C30957CCz.LJIIL(1013, user.backgroundImgUrl) + _ImageModel_ProtoEncoder.LJ(1012, user.avatarJpg) + C30957CCz.LJ(1010) + C30957CCz.LJ(1009) + C30957CCz.LJ(1008) + C30957CCz.LJ(1007) + C30957CCz.LJ(1006) + C30957CCz.LJ(1005) + C30957CCz.LJ(1004) + C30957CCz.LJ(1003) + C30957CCz.LJ(1002) + i15 + LIZ14;
        List<LiveEventInfo> list9 = user.upcomingEventList;
        if (list9 != null && !list9.isEmpty()) {
            for (int i18 = 0; i18 < user.upcomingEventList.size(); i18++) {
                LiveEventInfo liveEventInfo = (LiveEventInfo) ListProtector.get(user.upcomingEventList, i18);
                if (liveEventInfo == null) {
                    LIZ15 = 0;
                } else {
                    int LIZJ14 = _LiveEventInfo_ProtoEncoder.LIZJ(liveEventInfo);
                    LIZ15 = CD6.LIZ(1045) + CD6.LIZIZ(LIZJ14) + LIZJ14;
                }
                LJ4 += LIZ15;
            }
        }
        int LJIIL3 = C30957CCz.LJIIL(1046, user.scmLabel) + LJ4;
        EcommerceEntrance ecommerceEntrance = user.ecommerceEntrance;
        if (ecommerceEntrance != null) {
            int LIZJ15 = _EcommerceEntrance_ProtoEncoder.LIZJ(ecommerceEntrance);
            i = CD6.LIZIZ(LIZJ15) + LIZJ15 + CD6.LIZ(1047);
        }
        return C30957CCz.LJ(1048) + LJIIL3 + i;
    }

    public static void LIZIZ(CD6 cd6, User user) {
        long j = user.id;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        C30957CCz.LIZLLL(cd6, 3, user.nickName);
        C30957CCz.LIZLLL(cd6, 5, user.signature);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 9, user.avatarThumb);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 10, user.avatarMedium);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 11, user.avatarLarge);
        boolean z = user.isVerified;
        cd6.LIZLLL(12, 0);
        cd6.LJ(z ? 1 : 0);
        int i = user.status;
        cd6.LIZLLL(15, 0);
        cd6.LIZJ(i);
        long j2 = user.createTime;
        cd6.LIZLLL(16, 0);
        cd6.LJFF(j2);
        long j3 = user.modifyTime;
        cd6.LIZLLL(17, 0);
        cd6.LJFF(j3);
        int i2 = user.secret;
        cd6.LIZLLL(18, 0);
        cd6.LIZJ(i2);
        C30957CCz.LIZLLL(cd6, 19, user.shareQrcodeUri);
        FollowInfo followInfo = user.followInfo;
        if (followInfo != null) {
            cd6.LIZLLL(22, 2);
            cd6.LJ(_FollowInfo_ProtoEncoder.LIZJ(followInfo));
            _FollowInfo_ProtoEncoder.LIZIZ(cd6, followInfo);
        }
        UserHonor userHonor = user.userHonor;
        if (userHonor != null) {
            cd6.LIZLLL(23, 2);
            cd6.LJ(_UserHonor_ProtoEncoder.LIZJ(userHonor));
            _UserHonor_ProtoEncoder.LIZIZ(cd6, userHonor);
        }
        FansClubMember fansClubMember = user.fansClub;
        if (fansClubMember != null) {
            cd6.LIZLLL(24, 2);
            cd6.LJ(_FansClubMember_ProtoEncoder.LIZJ(fansClubMember));
            _FansClubMember_ProtoEncoder.LIZIZ(cd6, fansClubMember);
        }
        BorderInfo borderInfo = user.border;
        if (borderInfo != null) {
            cd6.LIZLLL(25, 2);
            cd6.LJ(_BorderInfo_ProtoEncoder.LIZJ(borderInfo));
            _BorderInfo_ProtoEncoder.LIZIZ(cd6, borderInfo);
        }
        C30957CCz.LIZLLL(cd6, 26, user.specialId);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 27, user.avatarBorder);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 28, user.medal);
        List<ImageModel> list = user.userBadges;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < user.userBadges.size(); i3++) {
                _ImageModel_ProtoEncoder.LIZJ(cd6, 29, (ImageModel) ListProtector.get(user.userBadges, i3));
            }
        }
        List<ImageModel> list2 = user.newUserBadges;
        if (list2 != null && !list2.isEmpty()) {
            for (int i4 = 0; i4 < user.newUserBadges.size(); i4++) {
                _ImageModel_ProtoEncoder.LIZJ(cd6, 30, (ImageModel) ListProtector.get(user.newUserBadges, i4));
            }
        }
        long j4 = user.topVipNo;
        cd6.LIZLLL(31, 0);
        cd6.LJFF(j4);
        UserAttr userAttr = user.userAttr;
        if (userAttr != null) {
            cd6.LIZLLL(32, 2);
            cd6.LJ(_UserAttr_ProtoEncoder.LIZJ(userAttr));
            _UserAttr_ProtoEncoder.LIZIZ(cd6, userAttr);
        }
        User.OwnRoom ownRoom = user.ownRoom;
        if (ownRoom != null) {
            cd6.LIZLLL(33, 2);
            cd6.LJ(_User_OwnRoom_ProtoEncoder.LIZJ(ownRoom));
            _User_OwnRoom_ProtoEncoder.LIZIZ(cd6, ownRoom);
        }
        long j5 = user.payScore;
        cd6.LIZLLL(34, 0);
        cd6.LJFF(j5);
        long j6 = user.fanTicketCount;
        cd6.LIZLLL(35, 0);
        cd6.LJFF(j6);
        AnchorInfo anchorInfo = user.anchorInfo;
        if (anchorInfo != null) {
            cd6.LIZLLL(36, 2);
            cd6.LJ(C30957CCz.LJIIIZ(1, anchorInfo.level));
            long j7 = anchorInfo.level;
            cd6.LIZLLL(1, 0);
            cd6.LJFF(j7);
        }
        int i5 = user.linkMicStats;
        cd6.LIZLLL(37, 0);
        cd6.LIZJ(i5);
        C30957CCz.LIZLLL(cd6, 38, user.username);
        boolean z2 = user.enableShowCommerceSale;
        cd6.LIZLLL(39, 0);
        cd6.LJ(z2 ? 1 : 0);
        boolean z3 = user.withFusionShopEntry;
        cd6.LIZLLL(40, 0);
        cd6.LJ(z3 ? 1 : 0);
        long j8 = user.payScores;
        cd6.LIZLLL(41, 0);
        cd6.LJFF(j8);
        AnchorLevel anchorLevel = user.anchorLevel;
        if (anchorLevel != null) {
            cd6.LIZLLL(42, 2);
            cd6.LJ(_AnchorLevel_ProtoEncoder.LIZJ(anchorLevel));
            _AnchorLevel_ProtoEncoder.LIZIZ(cd6, anchorLevel);
        }
        C30957CCz.LIZLLL(cd6, 43, user.verifiedContent);
        Author author = user.authorInfo;
        if (author != null) {
            cd6.LIZLLL(44, 2);
            cd6.LJ(_Author_ProtoEncoder.LIZJ(author));
            _Author_ProtoEncoder.LIZIZ(cd6, author);
        }
        List<User> list3 = user.topFans;
        if (list3 != null && !list3.isEmpty()) {
            for (int i6 = 0; i6 < user.topFans.size(); i6++) {
                User user2 = (User) ListProtector.get(user.topFans, i6);
                if (user2 != null) {
                    cd6.LIZLLL(45, 2);
                    cd6.LJ(LIZJ(user2));
                    LIZIZ(cd6, user2);
                }
            }
        }
        C30957CCz.LIZLLL(cd6, 46, user.secUid);
        int i7 = user.userRole;
        cd6.LIZLLL(47, 0);
        cd6.LIZJ(i7);
        ActivityRewardInfo activityRewardInfo = user.rewardInfo;
        if (activityRewardInfo != null) {
            cd6.LIZLLL(49, 2);
            cd6.LJ(_ImageModel_ProtoEncoder.LJ(2, activityRewardInfo.mStoryTag) + _ImageModel_ProtoEncoder.LJ(1, activityRewardInfo.mBage));
            _ImageModel_ProtoEncoder.LIZJ(cd6, 1, activityRewardInfo.mBage);
            _ImageModel_ProtoEncoder.LIZJ(cd6, 2, activityRewardInfo.mStoryTag);
        }
        _ImageModel_ProtoEncoder.LIZJ(cd6, 52, user.personalCard);
        AuthenticationInfo authenticationInfo = user.authenticationInfo;
        if (authenticationInfo != null) {
            cd6.LIZLLL(53, 2);
            cd6.LJ(_AuthenticationInfo_ProtoEncoder.LIZIZ(authenticationInfo));
            C30957CCz.LIZLLL(cd6, 1, authenticationInfo.customVerify);
            C30957CCz.LIZLLL(cd6, 2, authenticationInfo.enterpriseVerifyReason);
            _ImageModel_ProtoEncoder.LIZJ(cd6, 3, authenticationInfo.authenticationBadge);
        }
        List<ImageModel> list4 = user.mediaBadgeImageList;
        if (list4 != null && !list4.isEmpty()) {
            for (int i8 = 0; i8 < user.mediaBadgeImageList.size(); i8++) {
                _ImageModel_ProtoEncoder.LIZJ(cd6, 57, (ImageModel) ListProtector.get(user.mediaBadgeImageList, i8));
            }
        }
        List<Long> list5 = user.commerceWebcastConfigIds;
        if (list5 != null && !list5.isEmpty()) {
            for (int i9 = 0; i9 < user.commerceWebcastConfigIds.size(); i9++) {
                C30957CCz.LIZJ(cd6, 60, (Long) ListProtector.get(user.commerceWebcastConfigIds, i9));
            }
        }
        List<BorderInfo> list6 = user.borders;
        if (list6 != null && !list6.isEmpty()) {
            for (int i10 = 0; i10 < user.borders.size(); i10++) {
                BorderInfo borderInfo2 = (BorderInfo) ListProtector.get(user.borders, i10);
                if (borderInfo2 != null) {
                    cd6.LIZLLL(61, 2);
                    cd6.LJ(_BorderInfo_ProtoEncoder.LIZJ(borderInfo2));
                    _BorderInfo_ProtoEncoder.LIZIZ(cd6, borderInfo2);
                }
            }
        }
        User.ComboBadgeInfo comboBadgeInfo = user.comboBadgeInfo;
        if (comboBadgeInfo != null) {
            cd6.LIZLLL(62, 2);
            cd6.LJ(C30957CCz.LJIIIZ(2, comboBadgeInfo.comboCount) + _ImageModel_ProtoEncoder.LJ(1, comboBadgeInfo.icon));
            _ImageModel_ProtoEncoder.LIZJ(cd6, 1, comboBadgeInfo.icon);
            long j9 = comboBadgeInfo.comboCount;
            cd6.LIZLLL(2, 0);
            cd6.LJFF(j9);
        }
        SubscribeInfo subscribeInfo = user.subscribeInfo;
        if (subscribeInfo != null) {
            cd6.LIZLLL(63, 2);
            cd6.LJ(_SubscribeInfo_ProtoEncoder.LIZJ(subscribeInfo));
            _SubscribeInfo_ProtoEncoder.LIZIZ(cd6, subscribeInfo);
        }
        List<BadgeStruct> list7 = user.badgeList;
        if (list7 != null && !list7.isEmpty()) {
            for (int i11 = 0; i11 < user.badgeList.size(); i11++) {
                BadgeStruct badgeStruct = (BadgeStruct) ListProtector.get(user.badgeList, i11);
                if (badgeStruct != null) {
                    cd6.LIZLLL(64, 2);
                    cd6.LJ(_BadgeStruct_ProtoEncoder.LIZJ(badgeStruct));
                    _BadgeStruct_ProtoEncoder.LIZIZ(cd6, badgeStruct);
                }
            }
        }
        List<Long> list8 = user.mintTypeLabel;
        if (list8 != null && !list8.isEmpty()) {
            for (int i12 = 0; i12 < user.mintTypeLabel.size(); i12++) {
                C30957CCz.LIZJ(cd6, 65, (Long) ListProtector.get(user.mintTypeLabel, i12));
            }
        }
        User.FansClubInfo fansClubInfo = user.fansClubInfo;
        if (fansClubInfo != null) {
            cd6.LIZLLL(66, 2);
            cd6.LJ(_User_FansClubInfo_ProtoEncoder.LIZJ(fansClubInfo));
            _User_FansClubInfo_ProtoEncoder.LIZIZ(cd6, fansClubInfo);
        }
        boolean z4 = user.allowFindByContacts;
        cd6.LIZLLL(1002, 0);
        cd6.LJ(z4 ? 1 : 0);
        boolean z5 = user.allowOthersDownloadVideo;
        cd6.LIZLLL(1003, 0);
        cd6.LJ(z5 ? 1 : 0);
        boolean z6 = user.allowOthersDownloadWhenSharingVideo;
        cd6.LIZLLL(1004, 0);
        cd6.LJ(z6 ? 1 : 0);
        boolean z7 = user.allowShareShowProfile;
        cd6.LIZLLL(1005, 0);
        cd6.LJ(z7 ? 1 : 0);
        boolean z8 = user.allowShowInGossip;
        cd6.LIZLLL(1006, 0);
        cd6.LJ(z8 ? 1 : 0);
        boolean z9 = user.allowShowMyAction;
        cd6.LIZLLL(1007, 0);
        cd6.LJ(z9 ? 1 : 0);
        boolean z10 = user.allowStrangeComment;
        cd6.LIZLLL(1008, 0);
        cd6.LJ(z10 ? 1 : 0);
        boolean z11 = user.allowUnfollowerComment;
        cd6.LIZLLL(1009, 0);
        cd6.LJ(z11 ? 1 : 0);
        boolean z12 = user.allowUseLinkmic;
        cd6.LIZLLL(1010, 0);
        cd6.LJ(z12 ? 1 : 0);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1012, user.avatarJpg);
        C30957CCz.LIZLLL(cd6, 1013, user.backgroundImgUrl);
        int i13 = user.blockStatus;
        cd6.LIZLLL(1016, 0);
        cd6.LIZJ(i13);
        int i14 = user.commentRestrict;
        cd6.LIZLLL(1017, 0);
        cd6.LIZJ(i14);
        C30957CCz.LIZLLL(cd6, 1018, user.constellation);
        int i15 = user.disableIchat;
        cd6.LIZLLL(1019, 0);
        cd6.LIZJ(i15);
        long j10 = user.enableIchatImg;
        cd6.LIZLLL(1020, 0);
        cd6.LJFF(j10);
        int i16 = user.exp;
        cd6.LIZLLL(1021, 0);
        cd6.LIZJ(i16);
        boolean z13 = user.foldStrangerChat;
        cd6.LIZLLL(1023, 0);
        cd6.LJ(z13 ? 1 : 0);
        C30957CCz.LIZJ(cd6, 1024, user.followStatus);
        int i17 = user.ichatRestrictType;
        cd6.LIZLLL(1027, 0);
        cd6.LIZJ(i17);
        C30957CCz.LIZLLL(cd6, 1028, user.idStr);
        boolean z14 = user.isFollower;
        cd6.LIZLLL(1029, 0);
        cd6.LJ(z14 ? 1 : 0);
        boolean z15 = user.isFollowing;
        cd6.LIZLLL(1030, 0);
        cd6.LJ(z15 ? 1 : 0);
        boolean z16 = user.needProfileGuide;
        cd6.LIZLLL(1031, 0);
        cd6.LJ(z16 ? 1 : 0);
        boolean z17 = user.pushCommentStatus;
        cd6.LIZLLL(1033, 0);
        cd6.LJ(z17 ? 1 : 0);
        boolean z18 = user.pushDigg;
        cd6.LIZLLL(1034, 0);
        cd6.LJ(z18 ? 1 : 0);
        boolean z19 = user.pushFollow;
        cd6.LIZLLL(1035, 0);
        cd6.LJ(z19 ? 1 : 0);
        boolean z20 = user.pushFriendAction;
        cd6.LIZLLL(1036, 0);
        cd6.LJ(z20 ? 1 : 0);
        boolean z21 = user.pushIchat;
        cd6.LIZLLL(1037, 0);
        cd6.LJ(z21 ? 1 : 0);
        boolean z22 = user.pushStatus;
        cd6.LIZLLL(1038, 0);
        cd6.LJ(z22 ? 1 : 0);
        boolean z23 = user.pushVideoPost;
        cd6.LIZLLL(1039, 0);
        cd6.LJ(z23 ? 1 : 0);
        boolean z24 = user.pushVideoRecommend;
        cd6.LIZLLL(1040, 0);
        cd6.LJ(z24 ? 1 : 0);
        C30957CCz.LIZLLL(cd6, 1043, user.verifiedReason);
        boolean z25 = user.enableCarManagementPermission;
        cd6.LIZLLL(1044, 0);
        cd6.LJ(z25 ? 1 : 0);
        List<LiveEventInfo> list9 = user.upcomingEventList;
        if (list9 != null && !list9.isEmpty()) {
            for (int i18 = 0; i18 < user.upcomingEventList.size(); i18++) {
                LiveEventInfo liveEventInfo = (LiveEventInfo) ListProtector.get(user.upcomingEventList, i18);
                if (liveEventInfo != null) {
                    cd6.LIZLLL(1045, 2);
                    cd6.LJ(_LiveEventInfo_ProtoEncoder.LIZJ(liveEventInfo));
                    _LiveEventInfo_ProtoEncoder.LIZIZ(cd6, liveEventInfo);
                }
            }
        }
        C30957CCz.LIZLLL(cd6, 1046, user.scmLabel);
        EcommerceEntrance ecommerceEntrance = user.ecommerceEntrance;
        if (ecommerceEntrance != null) {
            cd6.LIZLLL(1047, 2);
            cd6.LJ(_EcommerceEntrance_ProtoEncoder.LIZJ(ecommerceEntrance));
            _EcommerceEntrance_ProtoEncoder.LIZIZ(cd6, ecommerceEntrance);
        }
        boolean z26 = user.isBlock;
        cd6.LIZLLL(1048, 0);
        cd6.LJ(z26 ? 1 : 0);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, User user) {
        LIZIZ(cd6, user);
    }
}
