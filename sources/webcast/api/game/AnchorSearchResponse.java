package webcast.api.game;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class AnchorSearchResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("is_end")
        public boolean isEnd;

        @InterfaceC65349Pkn("search_result")
        public List<AnchorTagListResult> searchResult = new ArrayList();
    }
}
