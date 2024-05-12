package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _VideoCutsInfo_ProtoDecoder implements InterfaceC31105CIr<VideoCutsInfo> {
    public static VideoCutsInfo LIZIZ(Q9H q9h) {
        VideoCutsInfo videoCutsInfo = new VideoCutsInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        videoCutsInfo.startTime = q9h.LJIIJJI();
                        break;
                    case 2:
                        videoCutsInfo.endTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        videoCutsInfo.vid = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        videoCutsInfo.url = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        videoCutsInfo.cropParam = _VideoCutsInfoCropParam_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        videoCutsInfo.urlType = q9h.LJIIJ();
                        break;
                    case 7:
                        videoCutsInfo.videoStartTime = Float.intBitsToFloat(q9h.LJIIIIZZ());
                        break;
                    case 8:
                        videoCutsInfo.videoEndTime = Float.intBitsToFloat(q9h.LJIIIIZZ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return videoCutsInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final VideoCutsInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
