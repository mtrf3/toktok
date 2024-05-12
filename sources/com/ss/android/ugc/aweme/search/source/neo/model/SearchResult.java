package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C50454Jr8;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.search.source.utils.RecommendInfoConfig;
import defpackage.s;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchResult extends F9E {
    public final transient String LJLIL;
    public final transient String LJLILLLLZI;

    @InterfaceC65349Pkn("gid_list")
    public final List<String> gidList;

    @InterfaceC65349Pkn("query")
    public final String query;

    @InterfaceC65349Pkn("source")
    public final String source;

    public SearchResult() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.query, this.source, this.LJLIL, this.LJLILLLLZI, this.gidList};
    }

    public SearchResult(String query, String source, String channel, String searchId, List<String> gidList) {
        o.LJIIIZ(query, "query");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(gidList, "gidList");
        this.query = query;
        this.source = source;
        this.LJLIL = channel;
        this.LJLILLLLZI = searchId;
        this.gidList = gidList;
    }

    public SearchResult(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? new s(((RecommendInfoConfig) C50454Jr8.LIZIZ.getValue()).maxGidCount) : list);
    }
}
