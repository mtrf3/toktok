package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _BannerInRoom_ProtoDecoder implements InterfaceC31105CIr<BannerInRoom> {
    public static BannerInRoom LIZIZ(Q9H q9h) {
        BannerInRoom bannerInRoom = new BannerInRoom();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bannerInRoom.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        bannerInRoom.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        bannerInRoom.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        bannerInRoom.height = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        bannerInRoom.width = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        bannerInRoom.schemaUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        bannerInRoom.actionType = (int) q9h.LJIIJJI();
                        break;
                    case 8:
                        bannerInRoom.bannerType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        bannerInRoom.priority = (int) q9h.LJIIJJI();
                        break;
                    case 10:
                        bannerInRoom.text = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        bannerInRoom.frameType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 12:
                        bannerInRoom.extra = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        bannerInRoom.status = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 14:
                        bannerInRoom.uid = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 15:
                        bannerInRoom.roomid = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        bannerInRoom.appointmentStartTimestamp = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 17:
                        bannerInRoom.appointmentEndTimestamp = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 18:
                        bannerInRoom.appointmentId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 19:
                        bannerInRoom.businessType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 20:
                        bannerInRoom.dynamicBanner = _BannerInRoom_BannerContentDynamic_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 21:
                        bannerInRoom.bannerLocation = q9h.LJIIJ();
                        break;
                    case 22:
                        bannerInRoom.openWithNavigationTag = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bannerInRoom;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BannerInRoom LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
