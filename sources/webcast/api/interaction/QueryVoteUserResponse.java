package webcast.api.interaction;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.VoteUser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class QueryVoteUserResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("total")
        public long total;

        @InterfaceC65349Pkn("vote_user_list")
        public List<VoteUser> voteUserList = new ArrayList();
    }
}
