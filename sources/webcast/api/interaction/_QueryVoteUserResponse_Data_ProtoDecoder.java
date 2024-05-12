package webcast.api.interaction;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._VoteUser_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.interaction.QueryVoteUserResponse;

/* loaded from: classes6.dex */
public final class _QueryVoteUserResponse_Data_ProtoDecoder implements InterfaceC31105CIr<QueryVoteUserResponse.Data> {
    public static QueryVoteUserResponse.Data LIZIZ(Q9H q9h) {
        QueryVoteUserResponse.Data data = new QueryVoteUserResponse.Data();
        data.voteUserList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.total = q9h.LJIIJJI();
                    }
                } else {
                    data.voteUserList.add(_VoteUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryVoteUserResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
