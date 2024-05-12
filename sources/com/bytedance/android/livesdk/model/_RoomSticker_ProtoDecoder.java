package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _RoomSticker_ProtoDecoder implements InterfaceC31105CIr<RoomSticker> {
    public static RoomSticker LIZIZ(Q9H q9h) {
        RoomSticker roomSticker = new RoomSticker();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomSticker.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        roomSticker.name = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        roomSticker.type = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        roomSticker.content = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        roomSticker.textSize = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        roomSticker.textColor = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        roomSticker.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        roomSticker.ninePatchImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        roomSticker.x = (int) q9h.LJIIJJI();
                        break;
                    case 10:
                        roomSticker.y = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        roomSticker.screenWidth = (int) q9h.LJIIJJI();
                        break;
                    case 12:
                        roomSticker.screenHeight = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        roomSticker.topLeftHeight = (int) q9h.LJIIJJI();
                        break;
                    case 14:
                        roomSticker.topLeftWidth = (int) q9h.LJIIJJI();
                        break;
                    case 15:
                        roomSticker.bottomRightHeight = (int) q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        roomSticker.bottomRightWidth = (int) q9h.LJIIJJI();
                        break;
                    case 17:
                        roomSticker.reviewStatus = q9h.LJIIJ();
                        break;
                    case 18:
                        roomSticker.edited = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomSticker;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomSticker LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
