package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LiveScenario_ProtoDecoder implements InterfaceC31105CIr<LiveScenario> {
    public static LiveScenario LIZIZ(Q9H q9h) {
        LiveScenario liveScenario = new LiveScenario();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveScenario.enableLiveVideo = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        liveScenario.enableLiveThirdParty = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        liveScenario.enableLiveScreenshot = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        liveScenario.enableSocialLive = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        liveScenario.enableLiveStudio = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        liveScenario.enablePicoShow = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        liveScenario.enablePicoGame = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        liveScenario.enablePicoVirtual = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        liveScenario.enableLiveVoice = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveScenario;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveScenario LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
