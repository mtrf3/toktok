package webcast.api.profit;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.wallet._Diamond_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ListResult_ProtoDecoder implements InterfaceC31105CIr<ListResult> {
    @Override // X.InterfaceC31105CIr
    public final ListResult LIZ(Q9H q9h) {
        ListResult listResult = new ListResult();
        listResult.data = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        listResult.extra = _ListResult_ListResultExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    listResult.data.add(_Diamond_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return listResult;
            }
        }
    }
}
