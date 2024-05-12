package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _StreamUrlExtra_ProtoDecoder implements InterfaceC31105CIr<StreamUrlExtra> {
    public static StreamUrlExtra LIZIZ(Q9H q9h) {
        StreamUrlExtra streamUrlExtra = new StreamUrlExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        streamUrlExtra.height = (int) q9h.LJIIJJI();
                        break;
                    case 2:
                        streamUrlExtra.width = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        streamUrlExtra.fps = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        streamUrlExtra.maxBitrate = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        streamUrlExtra.minBitrate = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        streamUrlExtra.defaultBitrate = (int) q9h.LJIIJJI();
                        break;
                    case 7:
                        streamUrlExtra.bitrateAdaptStrategy = (int) q9h.LJIIJJI();
                        break;
                    case 8:
                        streamUrlExtra.anchorInteractProfile = (int) q9h.LJIIJJI();
                        break;
                    case 9:
                        streamUrlExtra.audienceInteractProfile = (int) q9h.LJIIJJI();
                        break;
                    case 10:
                        streamUrlExtra.hardwareEncode = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    case 15:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 12:
                        streamUrlExtra.profile = (int) q9h.LJIIJJI();
                        break;
                    case 14:
                        streamUrlExtra.srConfig = _StreamUrlExtra_SrConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        streamUrlExtra.gopSec = (float) q9h.LJIIJJI();
                        break;
                    case 17:
                        streamUrlExtra.enableBFrame = Q9J.LIZ(q9h);
                        break;
                    case 18:
                        streamUrlExtra.isRoi = Q9J.LIZ(q9h);
                        break;
                    case 19:
                        streamUrlExtra.isSwRoi = Q9J.LIZ(q9h);
                        break;
                    case 20:
                        streamUrlExtra.enableByteVC1 = Q9J.LIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return streamUrlExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StreamUrlExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
