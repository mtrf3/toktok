package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.replay.proto._SpriteImageItem_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _LiveFragmentDetail_ProtoDecoder implements InterfaceC31105CIr<LiveFragmentDetail> {
    public static LiveFragmentDetail LIZIZ(Q9H q9h) {
        LiveFragmentDetail liveFragmentDetail = new LiveFragmentDetail();
        liveFragmentDetail.spriteList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveFragmentDetail.fragmentId = q9h.LJIIJJI();
                        break;
                    case 2:
                        liveFragmentDetail.fragmentIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        liveFragmentDetail.roomId = q9h.LJIIJJI();
                        break;
                    case 4:
                        liveFragmentDetail.vid = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        liveFragmentDetail.downloadUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        liveFragmentDetail.coverUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        liveFragmentDetail.ownerUserId = q9h.LJIIJJI();
                        break;
                    case 8:
                        liveFragmentDetail.startTime = q9h.LJIIJJI();
                        break;
                    case 9:
                        liveFragmentDetail.endTime = q9h.LJIIJJI();
                        break;
                    case 10:
                        liveFragmentDetail.extra = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        liveFragmentDetail.createTime = q9h.LJIIJJI();
                        break;
                    case 12:
                        liveFragmentDetail.updateTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        liveFragmentDetail.title = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        liveFragmentDetail.markTime = q9h.LJIIJJI();
                        break;
                    case 15:
                        liveFragmentDetail.opTime = q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        liveFragmentDetail.streamUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 17:
                        liveFragmentDetail.previewPicUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 18:
                        liveFragmentDetail.roomIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        liveFragmentDetail.ownerUserIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 20:
                        liveFragmentDetail.replayCreateTime = q9h.LJIIJJI();
                        break;
                    case 21:
                        liveFragmentDetail.isEdit = q9h.LJIIJ();
                        break;
                    case 22:
                        liveFragmentDetail.isPosted = Q9J.LIZ(q9h);
                        break;
                    case 23:
                        liveFragmentDetail.fragmentType = q9h.LJIIJ();
                        break;
                    case 24:
                        liveFragmentDetail.height = q9h.LJIIJJI();
                        break;
                    case 25:
                        liveFragmentDetail.witdh = q9h.LJIIJJI();
                        break;
                    case 26:
                        liveFragmentDetail.isMuted = Q9J.LIZ(q9h);
                        break;
                    case 27:
                        liveFragmentDetail.businessExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 28:
                        liveFragmentDetail.businessScore = q9h.LJIIJJI();
                        break;
                    case 29:
                        liveFragmentDetail.videoSize = q9h.LJIIJJI();
                        break;
                    case 30:
                        liveFragmentDetail.videoDuration = Float.intBitsToFloat(q9h.LJIIIIZZ());
                        break;
                    case 31:
                        liveFragmentDetail.forecastGenNeedTime = q9h.LJIIJJI();
                        break;
                    case 32:
                        liveFragmentDetail.replayRelativeTime = q9h.LJIIJJI();
                        break;
                    case 33:
                        liveFragmentDetail.showInfo = _LiveFragmentShowInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 34:
                        liveFragmentDetail.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 35:
                        liveFragmentDetail.fragmentTypeNew = q9h.LJIIJ();
                        break;
                    case 36:
                        liveFragmentDetail.spriteList.add(_SpriteImageItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveFragmentDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveFragmentDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
