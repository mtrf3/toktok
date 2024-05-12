package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PictionaryInfo_ProtoDecoder implements InterfaceC31105CIr<PictionaryInfo> {
    public static PictionaryInfo LIZIZ(Q9H q9h) {
        PictionaryInfo pictionaryInfo = new PictionaryInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        pictionaryInfo.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        pictionaryInfo.word = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        pictionaryInfo.status = q9h.LJIIJ();
                        break;
                    case 4:
                        pictionaryInfo.startTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        pictionaryInfo.endTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        pictionaryInfo.sessionId = q9h.LJIIJJI();
                        break;
                    case 7:
                        pictionaryInfo.drawUrl = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        pictionaryInfo.pictionaryType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return pictionaryInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PictionaryInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
