package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorUser;

/* loaded from: classes17.dex */
public final class SearchUserResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("matched_user_list")
        public List<AnchorUser> matchedUserList = new ArrayList();
    }
}
