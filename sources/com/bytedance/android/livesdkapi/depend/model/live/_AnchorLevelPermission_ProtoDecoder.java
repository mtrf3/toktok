package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _AnchorLevelPermission_ProtoDecoder implements InterfaceC31105CIr<AnchorLevelPermission> {
    public static AnchorLevelPermission LIZIZ(Q9H q9h) {
        AnchorLevelPermission anchorLevelPermission = new AnchorLevelPermission();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorLevelPermission.beauty = q9h.LJIIJ();
                        break;
                    case 2:
                        anchorLevelPermission.effects = q9h.LJIIJ();
                        break;
                    case 3:
                        anchorLevelPermission.share = q9h.LJIIJ();
                        break;
                    case 4:
                        anchorLevelPermission.moderatorSetting = q9h.LJIIJ();
                        break;
                    case 5:
                        anchorLevelPermission.commentSetting = q9h.LJIIJ();
                        break;
                    case 6:
                        anchorLevelPermission.commentFilter = q9h.LJIIJ();
                        break;
                    case 7:
                        anchorLevelPermission.pauseLive = q9h.LJIIJ();
                        break;
                    case 8:
                        anchorLevelPermission.flip = q9h.LJIIJ();
                        break;
                    case 9:
                        anchorLevelPermission.mirror = q9h.LJIIJ();
                        break;
                    case 10:
                        anchorLevelPermission.hearYourOwnVoice = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        anchorLevelPermission.donationSticker = q9h.LJIIJ();
                        break;
                    case 12:
                        anchorLevelPermission.fullScreenMode = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        anchorLevelPermission.liveCenter = q9h.LJIIJ();
                        break;
                    case 14:
                        anchorLevelPermission.topic = q9h.LJIIJ();
                        break;
                    case 15:
                        anchorLevelPermission.sticker = q9h.LJIIJ();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        anchorLevelPermission.voiceEffect = q9h.LJIIJ();
                        break;
                    case 17:
                        anchorLevelPermission.liveIntro = q9h.LJIIJ();
                        break;
                    case 18:
                        anchorLevelPermission.webcastDataInteractionquestion = q9h.LJIIJ();
                        break;
                    case 19:
                        anchorLevelPermission.poll = q9h.LJIIJ();
                        break;
                    case 20:
                        anchorLevelPermission.pin = q9h.LJIIJ();
                        break;
                    case 21:
                        anchorLevelPermission.pictionary = q9h.LJIIJ();
                        break;
                    case 22:
                        anchorLevelPermission.viewerRankList = q9h.LJIIJ();
                        break;
                    case 23:
                        anchorLevelPermission.promote = q9h.LJIIJ();
                        break;
                    case 24:
                        anchorLevelPermission.customizablePoll = q9h.LJIIJ();
                        break;
                    case 25:
                        anchorLevelPermission.goodyBag = q9h.LJIIJ();
                        break;
                    case 26:
                        anchorLevelPermission.karaoke = q9h.LJIIJ();
                        break;
                    case 27:
                        anchorLevelPermission.treasureBox = q9h.LJIIJ();
                        break;
                    case 28:
                        anchorLevelPermission.portal = q9h.LJIIJ();
                        break;
                    case 29:
                        anchorLevelPermission.liveBackground = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLevelPermission;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLevelPermission LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
