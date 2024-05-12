package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.anchor.SearchUserResponse;
import webcast.data._AnchorUser_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _SearchUserResponse_Data_ProtoDecoder implements InterfaceC31105CIr<SearchUserResponse.Data> {
    public static SearchUserResponse.Data LIZIZ(Q9H q9h) {
        SearchUserResponse.Data data = new SearchUserResponse.Data();
        data.matchedUserList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.hasMore = Q9J.LIZ(q9h);
                    }
                } else {
                    data.matchedUserList.add(_AnchorUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SearchUserResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
