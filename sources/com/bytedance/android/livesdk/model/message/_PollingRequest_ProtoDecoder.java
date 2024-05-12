package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _PollingRequest_ProtoDecoder implements InterfaceC31105CIr<PollingRequest> {
    @Override // X.InterfaceC31105CIr
    public final PollingRequest LIZ(Q9H q9h) {
        PollingRequest pollingRequest = new PollingRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        pollingRequest.liveId = q9h.LJIIJJI();
                        break;
                    case 2:
                        pollingRequest.aid = q9h.LJIIJJI();
                        break;
                    case 3:
                        pollingRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        pollingRequest.identity = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        pollingRequest.lastRtt = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        pollingRequest.internalExt = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        pollingRequest.cursor = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        pollingRequest.deviceId = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        pollingRequest.uniqueId = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        pollingRequest.devicePlatform = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        pollingRequest.appLanguage = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        pollingRequest.versionCode = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        pollingRequest.updateVersionCode = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        pollingRequest.respContentType = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        pollingRequest.getHistory = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        pollingRequest.ac = Q9J.LIZIZ(q9h);
                        break;
                    case 17:
                        pollingRequest.keepMethod = Q9J.LIZIZ(q9h);
                        break;
                    case 18:
                        pollingRequest.stress = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        pollingRequest.recvCnt = q9h.LJIIJJI();
                        break;
                    case 20:
                        pollingRequest.parseCnt = q9h.LJIIJJI();
                        break;
                    case 21:
                        pollingRequest.fetchRule = Q9J.LIZIZ(q9h);
                        break;
                    case 22:
                        pollingRequest.abGroup = Q9J.LIZIZ(q9h);
                        break;
                    case 23:
                        pollingRequest.didRule = q9h.LJIIJJI();
                        break;
                    case 24:
                        pollingRequest.debug = Q9J.LIZ(q9h);
                        break;
                    case 25:
                        pollingRequest.liveRegion = Q9J.LIZIZ(q9h);
                        break;
                    case 26:
                        pollingRequest.roomTag = Q9J.LIZIZ(q9h);
                        break;
                    case 27:
                        pollingRequest.userId = Q9J.LIZIZ(q9h);
                        break;
                    case 28:
                        pollingRequest.forceHttps = Q9J.LIZIZ(q9h);
                        break;
                    case 29:
                        pollingRequest.accountType = Q9J.LIZIZ(q9h);
                        break;
                    case 30:
                        pollingRequest.simOper = Q9J.LIZIZ(q9h);
                        break;
                    case 31:
                        pollingRequest.simRegion = Q9J.LIZIZ(q9h);
                        break;
                    case 32:
                        pollingRequest.uiLanguage = Q9J.LIZIZ(q9h);
                        break;
                    case 33:
                        pollingRequest.youtube = Q9J.LIZIZ(q9h);
                        break;
                    case 34:
                        pollingRequest.gender = Q9J.LIZIZ(q9h);
                        break;
                    case 35:
                        pollingRequest.hevcSupported = Q9J.LIZIZ(q9h);
                        break;
                    case 36:
                        pollingRequest.appVersionMinor = Q9J.LIZIZ(q9h);
                        break;
                    case 37:
                        pollingRequest.brand = Q9J.LIZIZ(q9h);
                        break;
                    case 38:
                        pollingRequest.appId = Q9J.LIZIZ(q9h);
                        break;
                    case 39:
                        pollingRequest.gaid = Q9J.LIZIZ(q9h);
                        break;
                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                        pollingRequest.originalChannel = Q9J.LIZIZ(q9h);
                        break;
                    case 41:
                        pollingRequest.logo = Q9J.LIZIZ(q9h);
                        break;
                    case 42:
                        pollingRequest.releaseBuild = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return pollingRequest;
            }
        }
    }
}
