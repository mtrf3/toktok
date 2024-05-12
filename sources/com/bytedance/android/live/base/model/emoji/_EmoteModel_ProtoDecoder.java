package com.bytedance.android.live.base.model.emoji;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _EmoteModel_ProtoDecoder implements InterfaceC31105CIr<EmoteModel> {
    public static EmoteModel LIZIZ(Q9H q9h) {
        EmoteModel emoteModel = new EmoteModel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        emoteModel.emoteId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        emoteModel.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        emoteModel.auditStatus = q9h.LJIIJ();
                        break;
                    case 4:
                        emoteModel.uuid = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        emoteModel.emoteType = q9h.LJIIJ();
                        break;
                    case 6:
                        emoteModel.contentSource = q9h.LJIIJ();
                        break;
                    case 7:
                        emoteModel.emotePrivateType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return emoteModel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EmoteModel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
