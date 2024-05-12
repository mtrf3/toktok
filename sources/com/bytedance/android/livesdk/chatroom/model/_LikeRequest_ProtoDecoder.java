package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._AdEventTracking_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _LikeRequest_ProtoDecoder implements InterfaceC31105CIr<LikeRequest> {
    @Override // X.InterfaceC31105CIr
    public final LikeRequest LIZ(Q9H q9h) {
        LikeRequest likeRequest = new LikeRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        likeRequest.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        likeRequest.count = q9h.LJIIJJI();
                        break;
                    case 3:
                        likeRequest.enterFrom = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        likeRequest.toUid = q9h.LJIIJJI();
                        break;
                    case 5:
                        likeRequest.deprecated1 = _AdEventTracking_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        likeRequest.advId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        likeRequest.enterFromMerge = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        likeRequest.enterMethod = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        likeRequest.feedId = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        likeRequest.isAd = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        likeRequest.adId = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        likeRequest.label = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        likeRequest.logExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        likeRequest.tag = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        likeRequest.creativeId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return likeRequest;
            }
        }
    }
}
