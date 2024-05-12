package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.LivePodcastResponse;

/* loaded from: classes17.dex */
public final class _LivePodcastResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<LivePodcastResponse.ResponseData> {
    public static LivePodcastResponse.ResponseData LIZIZ(Q9H q9h) {
        LivePodcastResponse.ResponseData responseData = new LivePodcastResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.canBeLivePodcast = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        responseData.canBeSocialLive = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        responseData.liveScenario = _LiveScenario_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        responseData.livePermissionApply = _LivePermissionApply_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        responseData.showLiveStudio = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        responseData.anchorLevelPermission = _AnchorLevelPermission_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        responseData.canBePicoLivePodcast = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        responseData.tryMode = _TryMode_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LivePodcastResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
