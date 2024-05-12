package webcast.api.feed;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class FeedV2Response {

    @InterfaceC65349Pkn("aweme_list")
    public List<AwemeStructV2> awemeList = new ArrayList();

    @InterfaceC65349Pkn("extra")
    public ExtraStructV2 extra;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("log_pb")
    public LogPbStructV2 logPb;
}
