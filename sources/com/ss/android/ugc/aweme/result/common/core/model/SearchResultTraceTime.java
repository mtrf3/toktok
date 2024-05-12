package com.ss.android.ugc.aweme.result.common.core.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SearchResultTraceTime implements Serializable {

    @InterfaceC65349Pkn("request_end_timestamp")
    public Long netReceive;

    @InterfaceC65349Pkn("request_start_timestamp")
    public Long netRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchResultTraceTime() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchResultTraceTime copy$default(SearchResultTraceTime searchResultTraceTime, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = searchResultTraceTime.netRequest;
        }
        if ((i & 2) != 0) {
            l2 = searchResultTraceTime.netReceive;
        }
        return searchResultTraceTime.copy(l, l2);
    }

    public final SearchResultTraceTime copy(Long l, Long l2) {
        return new SearchResultTraceTime(l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultTraceTime)) {
            return false;
        }
        SearchResultTraceTime searchResultTraceTime = (SearchResultTraceTime) obj;
        return o.LJ(this.netRequest, searchResultTraceTime.netRequest) && o.LJ(this.netReceive, searchResultTraceTime.netReceive);
    }

    public int hashCode() {
        Long l = this.netRequest;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.netReceive;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchResultTraceTime(netRequest=");
        LIZ.append(this.netRequest);
        LIZ.append(", netReceive=");
        return JBR.LJ(LIZ, this.netReceive, ')', LIZ);
    }

    public final Long getNetReceive() {
        return this.netReceive;
    }

    public final Long getNetRequest() {
        return this.netRequest;
    }

    public final void setNetReceive(Long l) {
        this.netReceive = l;
    }

    public final void setNetRequest(Long l) {
        this.netRequest = l;
    }

    public SearchResultTraceTime(Long l, Long l2) {
        this.netRequest = l;
        this.netReceive = l2;
    }

    public /* synthetic */ SearchResultTraceTime(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
