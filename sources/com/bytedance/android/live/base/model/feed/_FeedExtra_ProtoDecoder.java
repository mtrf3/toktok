package com.bytedance.android.live.base.model.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._FeedBannerContainer_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes.dex */
public final class _FeedExtra_ProtoDecoder implements InterfaceC31105CIr<FeedExtra> {
    @Override // X.InterfaceC31105CIr
    public final FeedExtra LIZ(Q9H q9h) {
        FeedExtra feedExtra = new FeedExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        feedExtra.LJLIL = _FeedExtra_LogPb_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                    case 4:
                    case 10:
                    case 14:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 3:
                        feedExtra.hasMore = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        feedExtra.cost = q9h.LJIIJJI();
                        break;
                    case 6:
                        feedExtra.maxTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        feedExtra.minTime = q9h.LJIIJJI();
                        break;
                    case 8:
                        feedExtra.total = (int) q9h.LJIIJJI();
                        break;
                    case 9:
                        feedExtra.bannerContainer = _FeedBannerContainer_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        feedExtra.unreadExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        feedExtra.style = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        feedExtra.hashtag_text = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        feedExtra.now = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return feedExtra;
            }
        }
    }
}
