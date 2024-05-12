package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _FeedV2RequestParams_ProtoDecoder implements InterfaceC31105CIr<FeedV2RequestParams> {
    @Override // X.InterfaceC31105CIr
    public final FeedV2RequestParams LIZ(Q9H q9h) {
        FeedV2RequestParams feedV2RequestParams = new FeedV2RequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 130) {
                    if (LJI != 131) {
                        if (LJI != 133) {
                            switch (LJI) {
                                case 1:
                                    feedV2RequestParams.maxTime = q9h.LJIIJJI();
                                    break;
                                case 2:
                                    feedV2RequestParams.reqFrom = Q9J.LIZIZ(q9h);
                                    break;
                                case 3:
                                    feedV2RequestParams.contentType = q9h.LJIIJJI();
                                    break;
                                case 4:
                                    feedV2RequestParams.style = q9h.LJIIJJI();
                                    break;
                                case 5:
                                    feedV2RequestParams.isDraw = q9h.LJIIJJI();
                                    break;
                                case 6:
                                    feedV2RequestParams.drawRoomId = q9h.LJIIJJI();
                                    break;
                                case 7:
                                    feedV2RequestParams.drawRoomOwnerId = q9h.LJIIJJI();
                                    break;
                                case 8:
                                    feedV2RequestParams.deprecate5 = q9h.LJIIJJI();
                                    break;
                                case 9:
                                    feedV2RequestParams.deprecate6 = q9h.LJIIJJI();
                                    break;
                                case 10:
                                    feedV2RequestParams.deprecated7 = q9h.LJIIJJI();
                                    break;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    feedV2RequestParams.hiddenBanner = Q9J.LIZ(q9h);
                                    break;
                                default:
                                    switch (LJI) {
                                        case 101:
                                            feedV2RequestParams.channelId = q9h.LJIIJJI();
                                            break;
                                        case 102:
                                            feedV2RequestParams.subChannelId = q9h.LJIIJJI();
                                            break;
                                        case 103:
                                            feedV2RequestParams.deprecated8 = Q9J.LIZIZ(q9h);
                                            break;
                                        case 104:
                                            feedV2RequestParams.deprecated9 = q9h.LJIIJJI();
                                            break;
                                        case 105:
                                            feedV2RequestParams.insertRoomIdStr = Q9J.LIZIZ(q9h);
                                            break;
                                        case 106:
                                            feedV2RequestParams.deprecated1 = Q9J.LIZ(q9h);
                                            break;
                                        case 107:
                                            feedV2RequestParams.enterSource = Q9J.LIZIZ(q9h);
                                            break;
                                        case 108:
                                            feedV2RequestParams.deprecated2 = q9h.LJIIJJI();
                                            break;
                                        case 109:
                                            feedV2RequestParams.deprecated3 = Q9J.LIZ(q9h);
                                            break;
                                        case 110:
                                            feedV2RequestParams.deprecate4 = Q9J.LIZ(q9h);
                                            break;
                                        default:
                                            switch (LJI) {
                                                case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                                                    feedV2RequestParams.hashtagCurrentRoomid = Q9J.LIZIZ(q9h);
                                                    break;
                                                case 121:
                                                    feedV2RequestParams.hashtagId = q9h.LJIIJJI();
                                                    break;
                                                case 122:
                                                    feedV2RequestParams.debug = Q9J.LIZ(q9h);
                                                    break;
                                                default:
                                                    switch (LJI) {
                                                        case 124:
                                                            feedV2RequestParams.ecTemplateId = Q9J.LIZIZ(q9h);
                                                            break;
                                                        case 125:
                                                            feedV2RequestParams.ecTopAuthor = q9h.LJIIJJI();
                                                            break;
                                                        case 126:
                                                            feedV2RequestParams.sessionRefreshIndex = q9h.LJIIJ();
                                                            break;
                                                        case 127:
                                                            feedV2RequestParams.sessionId = q9h.LJIIJJI();
                                                            break;
                                                        default:
                                                            switch (LJI) {
                                                                case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                                                                    feedV2RequestParams.lastShowLives = Q9J.LIZIZ(q9h);
                                                                    break;
                                                                case 141:
                                                                    feedV2RequestParams.lastPlayLives = Q9J.LIZIZ(q9h);
                                                                    break;
                                                                case 142:
                                                                    feedV2RequestParams.relatedLive = Q9J.LIZIZ(q9h);
                                                                    break;
                                                                case 143:
                                                                    feedV2RequestParams.isNonPersonalized = q9h.LJIIJJI();
                                                                    break;
                                                                case 144:
                                                                    feedV2RequestParams.exposureItems = Q9J.LIZIZ(q9h);
                                                                    break;
                                                                case 145:
                                                                    feedV2RequestParams.drawVideoId = q9h.LJIIJJI();
                                                                    break;
                                                                case 146:
                                                                    feedV2RequestParams.drawAuthorId = q9h.LJIIJJI();
                                                                    break;
                                                                case 147:
                                                                    feedV2RequestParams.relatedLiveTag = Q9J.LIZIZ(q9h);
                                                                    break;
                                                                default:
                                                                    Q9J.LIZJ(q9h);
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else {
                            feedV2RequestParams.hasShownFollowingPopup = Q9J.LIZ(q9h);
                        }
                    } else {
                        feedV2RequestParams.bubbleRoomOwnerId = q9h.LJIIJJI();
                    }
                } else {
                    feedV2RequestParams.bubbleRoomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return feedV2RequestParams;
            }
        }
    }
}
