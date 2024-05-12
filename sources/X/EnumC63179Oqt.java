package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: X.Oqt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC63179Oqt implements WireEnum {
    LEGACY_MESSAGE_TYPE_SYSTEM(1),
    LEGACY_MESSAGE_TYPE_EMOJI(5),
    LEGACY_MESSAGE_TYPE_TEXT(7),
    LEGACY_MESSAGE_TYPE_USER_CARD(8),
    MsgTypeShareSubOnlyVideo(11),
    MsgTypeHelloSticker(15),
    MsgTypeForwardComment(16),
    MsgTypeShareChallenge(19),
    MsgTypeShareLiveMsg(21),
    MsgTypeShareVideoBGM(22),
    MsgTypeShareProfile(25),
    MsgTypeH5Card(26),
    MsgTypeShareQnA(33),
    MsgTypeShareComment(40),
    MsgTypeShareProduct(43),
    MsgTypeShareMixVideo(71),
    MsgTypeShareEffect(72),
    MsgTypeSystemNotice(1006),
    MsgTypeStrongSystemNotice(1007),
    MsgTypeShareLive(1021),
    MsgTypeShareStory(1025),
    MsgTypeGroupWelcomeAvatar(1030),
    MsgTypeGroupNotice(1031),
    MsgTypeSystemCardMsg(1032),
    MsgTypeShareGroupInvite(1033),
    MsgTypeShareLiveEvent(1034),
    MsgTypeSharedSearch(1036),
    MsgTypeSmallSystemCardMsg(1037),
    MsgTypeShareSubscribeInvite(1038),
    MsgTypeTemplateImageCard(1801),
    MsgTypeTemplatePictureCard(1802),
    MsgTypeTemplateVideoCard(1803),
    MsgTypeTemplateInfoCard(1804),
    MsgTypeTemplateStickerCard(1805),
    MsgTypeTemplatePortraitCard(1806),
    MsgTypeTemplateBotAnswerCard(1807),
    MsgTypeTemplateInteractiveNoticeCard(1808),
    MsgTypeTemplateShareVideo(1809),
    MsgTypeTemplateDynamicCard(LiveNetAdaptiveHurryTimeSetting.DEFAULT),
    MsgTypeTemplatePlaylistImageCard(3001),
    MESSAGE_TYPE_NOT_USED(0),
    LEGACY_MESSAGE_TYPE_IMAGE(2),
    LEGACY_MESSAGE_TYPE_AUDIO(3),
    LEGACY_MESSAGE_TYPE_VIDEO(4),
    LEGACY_MESSAGE_TYPE_FILE(6),
    LEGACY_MESSAGE_TYPE_TOAST(9),
    LEGACY_MESSAGE_TYPE_GROUP_CARD(10),
    LEGACY_MESSAGE_TYPE_SHARE_PLAYLIST(81),
    MESSAGE_TYPE_TEXT(10001),
    MESSAGE_TYPE_STICKER(10002),
    MESSAGE_TYPE_IMAGE(10003),
    MESSAGE_TYPE_VIDEO(10004),
    MESSAGE_TYPE_FILE(10005),
    MESSAGE_TYPE_AUDIO(10006),
    MESSAGE_TYPE_LOCATION(10007),
    MESSAGE_TYPE_SYSTEM(10008),
    MESSAGE_TYPE_LINK(10009),
    MESSAGE_TYPE_GSDK_AUDIO(10011),
    MESSAGE_TYPE_COMMAND(50001),
    MESSAGE_TYPE_UPDATE_MESSAGE_EXT(50002),
    MESSAGE_TYPE_MODE_CHANGE(50010),
    MESSAGE_TYPE_READ_COMMAND(50013),
    MESSAGE_TYPE_REFRESH_MESSAGE(50020),
    MESSAGE_TYPE_RECALL_MESSAGE(50021),
    MESSAGE_TYPE_HIDE_VIOLATIVE_MESSAGE(50022),
    MESSAGE_TYPE_MESSAGE_PROPERTY(70001),
    MESSAGE_TYPE_UPDATE_MIN_INDEX(50003),
    MESSAGE_TYPE_USER_ACTION(50004),
    MESSAGE_TYPE_CONVERSATION_DESTROY(50005),
    MESSAGE_TYPE_BLOCK_COMMAND(50011),
    MESSAGE_TYPE_MARK_COMMAND(50012),
    MESSAGE_TYPE_SEND_FAILED_RESP(50014),
    MESSAGE_TYPE_NOTIFY_STRANGER(50015),
    MESSAGE_TYPE_BATCH_UNMARK_COMMAND(50016),
    MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND(50017),
    MESSAGE_TYPE_NOTIFY_COMMAND(60001),
    MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY(70002),
    MESSAGE_TYPE_VOIP_COMMAND(80001),
    MESSAGE_TYPE_VOIP_CARD_COMMAND(80002),
    MESSAGE_TYPE_VOIP_SINGLE_CHAT_STATUS_COMMAND(80003),
    MESSAGE_TYPE_VOIP_CALLEE_LIST_UPDATE_NOTIFY(80004),
    MESSAGE_TYPE_VOIP_ROOM_DISMISS_NOTIFY(80005),
    MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY(90001),
    MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY(90002);

    public static final ProtoAdapter<EnumC63179Oqt> ADAPTER = new EnumAdapter<EnumC63179Oqt>() { // from class: X.Oqv
        @Override // com.squareup.wire.EnumAdapter
        public final EnumC63179Oqt LIZ(int i) {
            return EnumC63179Oqt.fromValue(i);
        }
    };
    public final int LJLIL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC63179Oqt fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    if (i != 7) {
                                        if (i != 15) {
                                            if (i != 16) {
                                                if (i != 21) {
                                                    if (i != 22) {
                                                        if (i != 25) {
                                                            if (i != 26) {
                                                                if (i != 71) {
                                                                    if (i != 72) {
                                                                        if (i != 1006) {
                                                                            if (i != 1007) {
                                                                                switch (i) {
                                                                                    case 7:
                                                                                        break;
                                                                                    case 8:
                                                                                        return LEGACY_MESSAGE_TYPE_USER_CARD;
                                                                                    case 9:
                                                                                        return LEGACY_MESSAGE_TYPE_TOAST;
                                                                                    case 10:
                                                                                        return LEGACY_MESSAGE_TYPE_GROUP_CARD;
                                                                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                                                        return MsgTypeShareSubOnlyVideo;
                                                                                    case 19:
                                                                                        return MsgTypeShareChallenge;
                                                                                    case 33:
                                                                                        return MsgTypeShareQnA;
                                                                                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                                                                        return MsgTypeShareComment;
                                                                                    case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                                                                                        return MsgTypeShareProduct;
                                                                                    case 81:
                                                                                        return LEGACY_MESSAGE_TYPE_SHARE_PLAYLIST;
                                                                                    case 1021:
                                                                                        return MsgTypeShareLive;
                                                                                    case 1025:
                                                                                        return MsgTypeShareStory;
                                                                                    case LiveNetAdaptiveHurryTimeSetting.DEFAULT /* 2000 */:
                                                                                        return MsgTypeTemplateDynamicCard;
                                                                                    case 3001:
                                                                                        return MsgTypeTemplatePlaylistImageCard;
                                                                                    case 10011:
                                                                                        return MESSAGE_TYPE_GSDK_AUDIO;
                                                                                    case 50001:
                                                                                        return MESSAGE_TYPE_COMMAND;
                                                                                    case 50002:
                                                                                        return MESSAGE_TYPE_UPDATE_MESSAGE_EXT;
                                                                                    case 50003:
                                                                                        return MESSAGE_TYPE_UPDATE_MIN_INDEX;
                                                                                    case 50004:
                                                                                        return MESSAGE_TYPE_USER_ACTION;
                                                                                    case 50005:
                                                                                        return MESSAGE_TYPE_CONVERSATION_DESTROY;
                                                                                    case 50010:
                                                                                        return MESSAGE_TYPE_MODE_CHANGE;
                                                                                    case 50011:
                                                                                        return MESSAGE_TYPE_BLOCK_COMMAND;
                                                                                    case 50012:
                                                                                        return MESSAGE_TYPE_MARK_COMMAND;
                                                                                    case 50013:
                                                                                        return MESSAGE_TYPE_READ_COMMAND;
                                                                                    case 50014:
                                                                                        return MESSAGE_TYPE_SEND_FAILED_RESP;
                                                                                    case 50015:
                                                                                        return MESSAGE_TYPE_NOTIFY_STRANGER;
                                                                                    case 50016:
                                                                                        return MESSAGE_TYPE_BATCH_UNMARK_COMMAND;
                                                                                    case 50017:
                                                                                        return MESSAGE_TYPE_VISIBLE_MESSAGE_COMMAND;
                                                                                    case 50020:
                                                                                        return MESSAGE_TYPE_REFRESH_MESSAGE;
                                                                                    case 50021:
                                                                                        return MESSAGE_TYPE_RECALL_MESSAGE;
                                                                                    case 50022:
                                                                                        return MESSAGE_TYPE_HIDE_VIOLATIVE_MESSAGE;
                                                                                    case 60001:
                                                                                        return MESSAGE_TYPE_NOTIFY_COMMAND;
                                                                                    case 70001:
                                                                                        return MESSAGE_TYPE_MESSAGE_PROPERTY;
                                                                                    case 70002:
                                                                                        return MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY;
                                                                                    case 80001:
                                                                                        return MESSAGE_TYPE_VOIP_COMMAND;
                                                                                    case 80002:
                                                                                        return MESSAGE_TYPE_VOIP_CARD_COMMAND;
                                                                                    case 80003:
                                                                                        return MESSAGE_TYPE_VOIP_SINGLE_CHAT_STATUS_COMMAND;
                                                                                    case 80004:
                                                                                        return MESSAGE_TYPE_VOIP_CALLEE_LIST_UPDATE_NOTIFY;
                                                                                    case 80005:
                                                                                        return MESSAGE_TYPE_VOIP_ROOM_DISMISS_NOTIFY;
                                                                                    case 90001:
                                                                                        return MESSAGE_TYPE_CONVERSATION_APPLY_NOTIFY;
                                                                                    case 90002:
                                                                                        return MESSAGE_TYPE_CONVERSATION_AUDIT_ACK_NOTIFY;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 1030:
                                                                                                return MsgTypeGroupWelcomeAvatar;
                                                                                            case 1031:
                                                                                                return MsgTypeGroupNotice;
                                                                                            case 1032:
                                                                                                return MsgTypeSystemCardMsg;
                                                                                            case 1033:
                                                                                                return MsgTypeShareGroupInvite;
                                                                                            case 1034:
                                                                                                return MsgTypeShareLiveEvent;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 1036:
                                                                                                        return MsgTypeSharedSearch;
                                                                                                    case 1037:
                                                                                                        return MsgTypeSmallSystemCardMsg;
                                                                                                    case 1038:
                                                                                                        return MsgTypeShareSubscribeInvite;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 1801:
                                                                                                                return MsgTypeTemplateImageCard;
                                                                                                            case 1802:
                                                                                                                return MsgTypeTemplatePictureCard;
                                                                                                            case 1803:
                                                                                                                return MsgTypeTemplateVideoCard;
                                                                                                            case 1804:
                                                                                                                return MsgTypeTemplateInfoCard;
                                                                                                            case 1805:
                                                                                                                return MsgTypeTemplateStickerCard;
                                                                                                            case 1806:
                                                                                                                return MsgTypeTemplatePortraitCard;
                                                                                                            case 1807:
                                                                                                                return MsgTypeTemplateBotAnswerCard;
                                                                                                            case 1808:
                                                                                                                return MsgTypeTemplateInteractiveNoticeCard;
                                                                                                            case 1809:
                                                                                                                return MsgTypeTemplateShareVideo;
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 10001:
                                                                                                                        return MESSAGE_TYPE_TEXT;
                                                                                                                    case 10002:
                                                                                                                        return MESSAGE_TYPE_STICKER;
                                                                                                                    case 10003:
                                                                                                                        return MESSAGE_TYPE_IMAGE;
                                                                                                                    case 10004:
                                                                                                                        return MESSAGE_TYPE_VIDEO;
                                                                                                                    case 10005:
                                                                                                                        return MESSAGE_TYPE_FILE;
                                                                                                                    case 10006:
                                                                                                                        return MESSAGE_TYPE_AUDIO;
                                                                                                                    case 10007:
                                                                                                                        return MESSAGE_TYPE_LOCATION;
                                                                                                                    case 10008:
                                                                                                                        return MESSAGE_TYPE_SYSTEM;
                                                                                                                    case 10009:
                                                                                                                        return MESSAGE_TYPE_LINK;
                                                                                                                    default:
                                                                                                                        return null;
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                            } else {
                                                                                return MsgTypeStrongSystemNotice;
                                                                            }
                                                                        } else {
                                                                            return MsgTypeSystemNotice;
                                                                        }
                                                                    } else {
                                                                        return MsgTypeShareEffect;
                                                                    }
                                                                } else {
                                                                    return MsgTypeShareMixVideo;
                                                                }
                                                            } else {
                                                                return MsgTypeH5Card;
                                                            }
                                                        } else {
                                                            return MsgTypeShareProfile;
                                                        }
                                                    } else {
                                                        return MsgTypeShareVideoBGM;
                                                    }
                                                } else {
                                                    return MsgTypeShareLiveMsg;
                                                }
                                            } else {
                                                return MsgTypeForwardComment;
                                            }
                                        } else {
                                            return MsgTypeHelloSticker;
                                        }
                                    }
                                    return LEGACY_MESSAGE_TYPE_TEXT;
                                }
                                return LEGACY_MESSAGE_TYPE_FILE;
                            }
                            return LEGACY_MESSAGE_TYPE_EMOJI;
                        }
                        return LEGACY_MESSAGE_TYPE_VIDEO;
                    }
                    return LEGACY_MESSAGE_TYPE_AUDIO;
                }
                return LEGACY_MESSAGE_TYPE_IMAGE;
            }
            return LEGACY_MESSAGE_TYPE_SYSTEM;
        }
        return MESSAGE_TYPE_NOT_USED;
    }

    public static EnumC63179Oqt valueOf(String str) {
        return (EnumC63179Oqt) V0N.LJJJ(EnumC63179Oqt.class, str);
    }

    EnumC63179Oqt(int i) {
        this.LJLIL = i;
    }
}
