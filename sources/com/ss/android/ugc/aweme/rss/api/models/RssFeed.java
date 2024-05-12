package com.ss.android.ugc.aweme.rss.api.models;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RssFeed extends F9E {

    @InterfaceC65349Pkn("entries")
    public final List<RssEntry> entries;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.entries};
    }

    public RssFeed(List<RssEntry> entries) {
        o.LJIIIZ(entries, "entries");
        this.entries = entries;
    }
}
