package com.ss.android.ugc.aweme.api.resp;

import X.AbstractC42781Gqf;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import java.util.List;

/* loaded from: classes8.dex */
public final class AnchorSelectionResponse extends AbstractC42781Gqf<AnchorModule> {

    @InterfaceC65349Pkn("enable_load_more")
    public boolean enableLoadMore;

    @InterfaceC65349Pkn("enable_search")
    public boolean enableSearch;

    @InterfaceC65349Pkn("modules")
    public List<AnchorModule> modules;

    @InterfaceC65349Pkn("tabs")
    public List<Object> tabs;

    @InterfaceC65349Pkn("page_title")
    public String title = "";
}
