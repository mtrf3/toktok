package webcast.api.game;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class ListSugPollResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes16.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("sug_poll_titles")
        public List<String> sugPollTitles = new ArrayList();
    }
}
