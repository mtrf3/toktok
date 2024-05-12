package webcast.api.interaction;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._PollInfo_ProtoDecoder;
import webcast.api.interaction.QueryPollResponse;

/* loaded from: classes6.dex */
public final class _QueryPollResponse_Data_ProtoDecoder implements InterfaceC31105CIr<QueryPollResponse.Data> {
    public static QueryPollResponse.Data LIZIZ(Q9H q9h) {
        QueryPollResponse.Data data = new QueryPollResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.pollInfo = _PollInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryPollResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
