package com.bytedance.android.livesdk.rank.api.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _RankItem_ProtoDecoder implements InterfaceC31105CIr<RankItem> {
    @Override // X.InterfaceC31105CIr
    public final RankItem LIZ(Q9H q9h) {
        RankItem rankItem = new RankItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankItem.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        rankItem.score = q9h.LJIIJJI();
                        break;
                    case 3:
                        rankItem.rank = q9h.LJIIJJI();
                        break;
                    case 4:
                        rankItem.gapDescription = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        rankItem.delta = q9h.LJIIJJI();
                        break;
                    case 6:
                        rankItem.richDescription = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        rankItem.cityCode = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        rankItem.gapRichDescription = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankItem;
            }
        }
    }
}
