package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FeedItem_ProtoDecoder implements InterfaceC31105CIr<FeedItem> {
    @Override // X.InterfaceC31105CIr
    public final FeedItem LIZ(Q9H q9h) {
        FeedItem feedItem = new FeedItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 6) {
                                if (LJI != 9) {
                                    if (LJI != 13) {
                                        switch (LJI) {
                                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                                feedItem.debugInfo = Q9J.LIZIZ(q9h);
                                                break;
                                            case 17:
                                                feedItem.flareInfo = _FlareInfo_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            case 18:
                                                feedItem.anchorRelationType = q9h.LJIIJ();
                                                break;
                                            case 19:
                                                feedItem.isFresh = Q9J.LIZ(q9h);
                                                break;
                                            case 20:
                                                feedItem.drawerGameTag = Q9J.LIZIZ(q9h);
                                                break;
                                            default:
                                                Q9J.LIZJ(q9h);
                                                break;
                                        }
                                    } else {
                                        feedItem.liveReason = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    feedItem.isRecommendCard = Q9J.LIZ(q9h);
                                }
                            } else {
                                feedItem.bannerContainer = _FeedBannerContainer_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            feedItem.room = _Room_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        feedItem.resId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    feedItem.type = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                feedItem.init();
                return feedItem;
            }
        }
    }
}
