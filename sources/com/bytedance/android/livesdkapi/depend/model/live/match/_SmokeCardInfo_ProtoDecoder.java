package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _SmokeCardInfo_ProtoDecoder implements InterfaceC31105CIr<SmokeCardInfo> {
    public static SmokeCardInfo LIZIZ(Q9H q9h) {
        SmokeCardInfo smokeCardInfo = new SmokeCardInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 12) {
                    switch (LJI) {
                        case 1:
                            smokeCardInfo.cardNameKey = Q9J.LIZIZ(q9h);
                            break;
                        case 2:
                            smokeCardInfo.cardImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 3:
                            smokeCardInfo.sendTimeSec = q9h.LJIIJJI();
                            break;
                        case 4:
                            smokeCardInfo.sendUser = _BattleUserInfo_ProtoDecoder.LIZIZ(q9h);
                            break;
                        case 5:
                            smokeCardInfo.effectLastDuration = q9h.LJIIJJI();
                            break;
                        case 6:
                            smokeCardInfo.ruleUrl = Q9J.LIZIZ(q9h);
                            break;
                        case 7:
                            smokeCardInfo.effectTimeSec = q9h.LJIIJJI();
                            break;
                        default:
                            Q9J.LIZJ(q9h);
                            break;
                    }
                } else {
                    smokeCardInfo.toAnchorId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return smokeCardInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SmokeCardInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
