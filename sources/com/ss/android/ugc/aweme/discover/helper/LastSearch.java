package com.ss.android.ugc.aweme.discover.helper;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LastSearch {

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("query")
    public final String query;

    @InterfaceC65349Pkn("search_id")
    public final String search_id;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("time")
    public final Long time;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSearch() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastSearch)) {
            return false;
        }
        LastSearch lastSearch = (LastSearch) obj;
        return o.LJ(this.query, lastSearch.query) && o.LJ(this.search_id, lastSearch.search_id) && o.LJ(this.channel, lastSearch.channel) && o.LJ(this.source, lastSearch.source) && o.LJ(this.time, lastSearch.time);
    }

    public final int hashCode() {
        String str = this.query;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.search_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channel;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.time;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LastSearch(query=");
        LIZ.append(this.query);
        LIZ.append(", search_id=");
        LIZ.append(this.search_id);
        LIZ.append(", channel=");
        LIZ.append(this.channel);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", time=");
        return JBR.LJ(LIZ, this.time, ')', LIZ);
    }

    public LastSearch(String str, String str2, String str3, String str4, Long l) {
        this.query = str;
        this.search_id = str2;
        this.channel = str3;
        this.source = str4;
        this.time = l;
    }

    public /* synthetic */ LastSearch(String str, String str2, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? 0L : l);
    }
}
