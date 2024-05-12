package com.ss.android.ugc.aweme.search.performance.preload.core.viewmodel;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PresetQueries extends F9E {

    @InterfaceC65349Pkn("queries")
    public final List<String> queries;

    @InterfaceC65349Pkn("version")
    public final String version;

    public PresetQueries() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.version, this.queries};
    }

    public PresetQueries(String version, List<String> queries) {
        o.LJIIIZ(version, "version");
        o.LJIIIZ(queries, "queries");
        this.version = version;
        this.queries = queries;
    }

    public PresetQueries(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
