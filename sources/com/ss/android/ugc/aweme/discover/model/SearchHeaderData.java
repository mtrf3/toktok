package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchHeaderData implements Serializable {

    @InterfaceC65349Pkn("hashtag_header")
    public final SearchHashtagHeaderData hashtagHeader;

    @InterfaceC65349Pkn("header_type")
    public final int headerType;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchHeaderData() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchHeaderData copy$default(SearchHeaderData searchHeaderData, int i, SearchHashtagHeaderData searchHashtagHeaderData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = searchHeaderData.headerType;
        }
        if ((i2 & 2) != 0) {
            searchHashtagHeaderData = searchHeaderData.hashtagHeader;
        }
        return searchHeaderData.copy(i, searchHashtagHeaderData);
    }

    public final SearchHeaderData copy(int i, SearchHashtagHeaderData searchHashtagHeaderData) {
        return new SearchHeaderData(i, searchHashtagHeaderData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHeaderData)) {
            return false;
        }
        SearchHeaderData searchHeaderData = (SearchHeaderData) obj;
        return this.headerType == searchHeaderData.headerType && o.LJ(this.hashtagHeader, searchHeaderData.hashtagHeader);
    }

    public int hashCode() {
        int i = this.headerType * 31;
        SearchHashtagHeaderData searchHashtagHeaderData = this.hashtagHeader;
        return i + (searchHashtagHeaderData == null ? 0 : searchHashtagHeaderData.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchHeaderData(headerType=");
        LIZ.append(this.headerType);
        LIZ.append(", hashtagHeader=");
        LIZ.append(this.hashtagHeader);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final SearchHashtagHeaderData getHashtagHeader() {
        return this.hashtagHeader;
    }

    public final int getHeaderType() {
        return this.headerType;
    }

    public SearchHeaderData(int i, SearchHashtagHeaderData searchHashtagHeaderData) {
        this.headerType = i;
        this.hashtagHeader = searchHashtagHeaderData;
    }

    public /* synthetic */ SearchHeaderData(int i, SearchHashtagHeaderData searchHashtagHeaderData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : searchHashtagHeaderData);
    }
}
