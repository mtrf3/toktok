package webcast.api.bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.bag.BagItemListResponse;
import webcast.data._BagItem_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BagItemListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<BagItemListResponse.Data> {
    public static BagItemListResponse.Data LIZIZ(Q9H q9h) {
        BagItemListResponse.Data data = new BagItemListResponse.Data();
        data.items = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            data.pageInstruction = _GiftPanelBanner_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        data.items.add(_BagItem_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    data.showEntrance = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BagItemListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
