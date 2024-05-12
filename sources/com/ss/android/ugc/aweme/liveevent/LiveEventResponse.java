package com.ss.android.ugc.aweme.liveevent;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class LiveEventResponse {

    @InterfaceC65349Pkn("status_code")
    public long code;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("status_msg")
    public String msg = "";

    @InterfaceC65349Pkn("has_permission")
    public Boolean hasPermission = Boolean.FALSE;

    @InterfaceC65349Pkn("events")
    public List<LiveEventModule> eventList = new ArrayList();
}
