package webcast.api.game;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class SearchTagResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("is_end")
        public boolean isEnd;

        @InterfaceC65349Pkn("result_list")
        public List<GameTagSearchResult> resultList;

        @InterfaceC65349Pkn("search_id")
        public String searchId = "";
    }
}
