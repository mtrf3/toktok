package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TopFrameSummary implements Serializable {

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("show_list")
    public List<ShowInfo> showList;

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("scheme")
    public String scheme = "";

    public final long getId() {
        return this.id;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final List<ShowInfo> getShowList() {
        return this.showList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setScheme(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.scheme = str;
    }

    public final void setShowList(List<ShowInfo> list) {
        this.showList = list;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }
}
