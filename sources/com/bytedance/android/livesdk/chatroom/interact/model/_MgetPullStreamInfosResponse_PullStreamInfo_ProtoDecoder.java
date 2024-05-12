package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.MgetPullStreamInfosResponse;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_Quality_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrlExtra_SrConfig_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _MgetPullStreamInfosResponse_PullStreamInfo_ProtoDecoder implements InterfaceC31105CIr<MgetPullStreamInfosResponse.PullStreamInfo> {
    public static MgetPullStreamInfosResponse.PullStreamInfo LIZIZ(Q9H q9h) {
        MgetPullStreamInfosResponse.PullStreamInfo pullStreamInfo = new MgetPullStreamInfosResponse.PullStreamInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        pullStreamInfo.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        pullStreamInfo.pullStreamUrlData = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        pullStreamInfo.pullDataOptionDefaultQuality = _LiveCoreSDKData_Quality_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        pullStreamInfo.streamUrlExtraSuperResolution = _StreamUrlExtra_SrConfig_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        pullStreamInfo.liveTypeScreenshot = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 6:
                        pullStreamInfo.liveTypeThirdParty = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 7:
                        pullStreamInfo.liveTypeAudio = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return pullStreamInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MgetPullStreamInfosResponse.PullStreamInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
