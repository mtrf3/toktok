package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class KaraokeTabsListResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("all_tabs")
        public List<KaraokeTab> allTabs = new ArrayList();

        @InterfaceC65349Pkn("favorite_tab")
        public KaraokeTab favoriteTab;
    }
}
