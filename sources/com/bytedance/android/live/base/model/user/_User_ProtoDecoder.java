package com.bytedance.android.live.base.model.user;

import X.C29991Fr;
import X.C61447O9r;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.model._ActivityRewardInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorLevel_ProtoDecoder;
import com.bytedance.android.livesdk.model._AuthenticationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Author_ProtoDecoder;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserAttr_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserHonor_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class _User_ProtoDecoder implements InterfaceC31105CIr<User> {
    public static User LIZIZ(Q9H q9h) {
        User user = new User();
        user.topFans = new ArrayList();
        user.userBadges = new ArrayList();
        user.commerceWebcastConfigIds = new ArrayList();
        user.borders = new ArrayList();
        user.badgeList = new ArrayList();
        user.mediaBadgeImageList = new ArrayList();
        user.newUserBadges = new ArrayList();
        user.mintTypeLabel = new ArrayList();
        user.upcomingEventList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 5) {
                            if (LJI != 52) {
                                if (LJI != 53) {
                                    if (LJI != 1012) {
                                        if (LJI != 1013) {
                                            if (LJI != 1023) {
                                                if (LJI != 1024) {
                                                    switch (LJI) {
                                                        case 5:
                                                            break;
                                                        case 22:
                                                            user.followInfo = _FollowInfo_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 23:
                                                            user.userHonor = _UserHonor_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 24:
                                                            user.fansClub = _FansClubMember_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 25:
                                                            user.border = _BorderInfo_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 26:
                                                            user.specialId = Q9J.LIZIZ(q9h);
                                                            continue;
                                                        case 27:
                                                            user.avatarBorder = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 28:
                                                            user.medal = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 29:
                                                            user.userBadges.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                                                            continue;
                                                        case 30:
                                                            user.newUserBadges.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                                                            continue;
                                                        case 31:
                                                            user.topVipNo = (int) q9h.LJIIJJI();
                                                            continue;
                                                        case 32:
                                                            user.userAttr = _UserAttr_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 33:
                                                            user.ownRoom = _User_OwnRoom_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 34:
                                                            user.payScore = q9h.LJIIJJI();
                                                            continue;
                                                        case 35:
                                                            user.fanTicketCount = q9h.LJIIJJI();
                                                            continue;
                                                        case 36:
                                                            user.anchorInfo = _AnchorInfo_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 37:
                                                            user.linkMicStats = q9h.LJIIJ();
                                                            continue;
                                                        case 38:
                                                            user.username = Q9J.LIZIZ(q9h);
                                                            continue;
                                                        case 39:
                                                            user.enableShowCommerceSale = Q9J.LIZ(q9h);
                                                            continue;
                                                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                                            user.withFusionShopEntry = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 41:
                                                            user.payScores = q9h.LJIIJJI();
                                                            continue;
                                                        case 42:
                                                            user.anchorLevel = _AnchorLevel_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                                                            user.verifiedContent = Q9J.LIZIZ(q9h);
                                                            continue;
                                                        case 44:
                                                            user.authorInfo = _Author_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 45:
                                                            user.topFans.add(LIZIZ(q9h));
                                                            continue;
                                                        case 46:
                                                            user.secUid = Q9J.LIZIZ(q9h);
                                                            continue;
                                                        case 47:
                                                            user.userRole = q9h.LJIIJ();
                                                            continue;
                                                        case C61447O9r.LJIIJ:
                                                            user.rewardInfo = _ActivityRewardInfo_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 57:
                                                            user.mediaBadgeImageList.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                                                            continue;
                                                        case 1033:
                                                            user.pushCommentStatus = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1034:
                                                            user.pushDigg = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1035:
                                                            user.pushFollow = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1036:
                                                            user.pushFriendAction = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1037:
                                                            user.pushIchat = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1038:
                                                            user.pushStatus = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1039:
                                                            user.pushVideoPost = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1040:
                                                            user.pushVideoRecommend = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1043:
                                                            user.verifiedReason = Q9J.LIZIZ(q9h);
                                                            continue;
                                                        case 1044:
                                                            user.enableCarManagementPermission = Q9J.LIZ(q9h);
                                                            continue;
                                                        case 1045:
                                                            user.upcomingEventList.add(_LiveEventInfo_ProtoDecoder.LIZIZ(q9h));
                                                            continue;
                                                        case 1046:
                                                            user.scmLabel = Q9J.LIZIZ(q9h);
                                                            continue;
                                                        case 1047:
                                                            user.ecommerceEntrance = _EcommerceEntrance_ProtoDecoder.LIZIZ(q9h);
                                                            continue;
                                                        case 1048:
                                                            user.isBlock = Q9J.LIZ(q9h);
                                                            continue;
                                                        default:
                                                            switch (LJI) {
                                                                case 9:
                                                                    user.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                                    break;
                                                                case 10:
                                                                    user.avatarMedium = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                                    break;
                                                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                                    user.avatarLarge = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                                                    break;
                                                                case 12:
                                                                    user.isVerified = Q9J.LIZ(q9h);
                                                                    continue;
                                                                default:
                                                                    switch (LJI) {
                                                                        case 15:
                                                                            user.status = q9h.LJIIJ();
                                                                            break;
                                                                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                                                            user.createTime = q9h.LJIIJJI();
                                                                            break;
                                                                        case 17:
                                                                            user.modifyTime = q9h.LJIIJJI();
                                                                            break;
                                                                        case 18:
                                                                            user.secret = q9h.LJIIJ();
                                                                            break;
                                                                        case 19:
                                                                            user.shareQrcodeUri = Q9J.LIZIZ(q9h);
                                                                            break;
                                                                        default:
                                                                            switch (LJI) {
                                                                                case 60:
                                                                                    C29991Fr.LIZ(q9h, user.commerceWebcastConfigIds);
                                                                                    break;
                                                                                case 61:
                                                                                    user.borders.add(_BorderInfo_ProtoDecoder.LIZIZ(q9h));
                                                                                    break;
                                                                                case BaseNotice.CREATOR /* 62 */:
                                                                                    user.comboBadgeInfo = _User_ComboBadgeInfo_ProtoDecoder.LIZIZ(q9h);
                                                                                    break;
                                                                                case 63:
                                                                                    user.subscribeInfo = _SubscribeInfo_ProtoDecoder.LIZIZ(q9h);
                                                                                    break;
                                                                                case 64:
                                                                                    user.badgeList.add(_BadgeStruct_ProtoDecoder.LIZIZ(q9h));
                                                                                    break;
                                                                                case 65:
                                                                                    C29991Fr.LIZ(q9h, user.mintTypeLabel);
                                                                                    break;
                                                                                case 66:
                                                                                    user.fansClubInfo = _User_FansClubInfo_ProtoDecoder.LIZIZ(q9h);
                                                                                    break;
                                                                                default:
                                                                                    switch (LJI) {
                                                                                        case 1002:
                                                                                            user.allowFindByContacts = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1003:
                                                                                            user.allowOthersDownloadVideo = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1004:
                                                                                            user.allowOthersDownloadWhenSharingVideo = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1005:
                                                                                            user.allowShareShowProfile = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1006:
                                                                                            user.allowShowInGossip = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1007:
                                                                                            user.allowShowMyAction = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1008:
                                                                                            user.allowStrangeComment = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1009:
                                                                                            user.allowUnfollowerComment = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        case 1010:
                                                                                            user.allowUseLinkmic = Q9J.LIZ(q9h);
                                                                                            break;
                                                                                        default:
                                                                                            switch (LJI) {
                                                                                                case 1016:
                                                                                                    user.blockStatus = q9h.LJIIJ();
                                                                                                    break;
                                                                                                case 1017:
                                                                                                    user.commentRestrict = q9h.LJIIJ();
                                                                                                    break;
                                                                                                case 1018:
                                                                                                    user.constellation = Q9J.LIZIZ(q9h);
                                                                                                    break;
                                                                                                case 1019:
                                                                                                    user.disableIchat = q9h.LJIIJ();
                                                                                                    break;
                                                                                                case 1020:
                                                                                                    user.enableIchatImg = q9h.LJIIJJI();
                                                                                                    break;
                                                                                                case 1021:
                                                                                                    user.exp = q9h.LJIIJ();
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (LJI) {
                                                                                                        case 1027:
                                                                                                            user.ichatRestrictType = q9h.LJIIJ();
                                                                                                            break;
                                                                                                        case 1028:
                                                                                                            user.idStr = Q9J.LIZIZ(q9h);
                                                                                                            break;
                                                                                                        case 1029:
                                                                                                            user.isFollower = Q9J.LIZ(q9h);
                                                                                                            break;
                                                                                                        case 1030:
                                                                                                            user.isFollowing = Q9J.LIZ(q9h);
                                                                                                            break;
                                                                                                        case 1031:
                                                                                                            user.needProfileGuide = Q9J.LIZ(q9h);
                                                                                                            break;
                                                                                                        default:
                                                                                                            Q9J.LIZJ(q9h);
                                                                                                            break;
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    user.followStatus = Long.valueOf(q9h.LJIIJJI());
                                                }
                                            } else {
                                                user.foldStrangerChat = Q9J.LIZ(q9h);
                                            }
                                        } else {
                                            user.backgroundImgUrl = Q9J.LIZIZ(q9h);
                                        }
                                    } else {
                                        user.avatarJpg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    user.authenticationInfo = _AuthenticationInfo_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                user.personalCard = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        }
                        user.signature = Q9J.LIZIZ(q9h);
                    } else {
                        user.nickName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    user.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return user;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final User LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
