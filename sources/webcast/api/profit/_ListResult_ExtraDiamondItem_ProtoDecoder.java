package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class _ListResult_ExtraDiamondItem_ProtoDecoder implements InterfaceC31105CIr<ListResult.ExtraDiamondItem> {
    public static ListResult.ExtraDiamondItem LIZIZ(Q9H q9h) {
        ListResult.ExtraDiamondItem extraDiamondItem = new ListResult.ExtraDiamondItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        extraDiamondItem.channel = Q9J.LIZIZ(q9h);
                    }
                } else {
                    extraDiamondItem.channelId = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return extraDiamondItem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ListResult.ExtraDiamondItem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
