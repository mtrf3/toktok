package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import java.util.ArrayList;
import tikcast.api.privilege.QueryBadgeStyleResponse;

/* loaded from: classes17.dex */
public final class _QueryBadgeStyleResponse_Data_ProtoDecoder implements InterfaceC31105CIr<QueryBadgeStyleResponse.Data> {
    public static QueryBadgeStyleResponse.Data LIZIZ(Q9H q9h) {
        QueryBadgeStyleResponse.Data data = new QueryBadgeStyleResponse.Data();
        data.badge = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 3) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.badge.add(_BadgeStruct_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryBadgeStyleResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
