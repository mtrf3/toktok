package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _TnsPiracyDetail_ProtoDecoder implements InterfaceC31105CIr<TnsPiracyDetail> {
    public static TnsPiracyDetail LIZIZ(Q9H q9h) {
        TnsPiracyDetail tnsPiracyDetail = new TnsPiracyDetail();
        tnsPiracyDetail.acceleration = new ArrayList();
        tnsPiracyDetail.gameProgram = new ArrayList();
        tnsPiracyDetail.angle = new ArrayList();
        tnsPiracyDetail.browserUrl = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                switch (LJI) {
                                    case 101:
                                        tnsPiracyDetail.microSound = q9h.LJIIJJI();
                                        break;
                                    case 102:
                                        tnsPiracyDetail.recordTime = q9h.LJIIJJI();
                                        break;
                                    case 103:
                                        tnsPiracyDetail.userMute = q9h.LJIIJJI();
                                        break;
                                    default:
                                        switch (LJI) {
                                            case 201:
                                                tnsPiracyDetail.videoInput = Q9J.LIZ(q9h);
                                                break;
                                            case 202:
                                                tnsPiracyDetail.browserUrl.add(Q9J.LIZIZ(q9h));
                                                break;
                                            case 203:
                                                tnsPiracyDetail.gameProgram.add(Q9J.LIZIZ(q9h));
                                                break;
                                            case 204:
                                                tnsPiracyDetail.hasMicrophones = Q9J.LIZ(q9h);
                                                break;
                                            case 205:
                                                tnsPiracyDetail.browserInfo = _BrowserInfo_ProtoDecoder.LIZIZ(q9h);
                                                break;
                                            default:
                                                Q9J.LIZJ(q9h);
                                                break;
                                        }
                                }
                            } else {
                                tnsPiracyDetail.backScreenClicks = q9h.LJIIJJI();
                            }
                        } else {
                            tnsPiracyDetail.frontScreenClicks = q9h.LJIIJJI();
                        }
                    } else {
                        tnsPiracyDetail.acceleration.add(Double.valueOf(Double.longBitsToDouble(q9h.LJIIIZ())));
                    }
                } else {
                    tnsPiracyDetail.angle.add(Double.valueOf(Double.longBitsToDouble(q9h.LJIIIZ())));
                }
            } else {
                q9h.LJ(LIZJ);
                return tnsPiracyDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TnsPiracyDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
