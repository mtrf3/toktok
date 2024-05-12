package com.ss.android.ugc.aweme.feed.model.search;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SearchLiveStruct implements Serializable {

    @InterfaceC65349Pkn("live_cover_type")
    public final String liveCoverType;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchLiveStruct() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchLiveStruct copy$default(SearchLiveStruct searchLiveStruct, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchLiveStruct.liveCoverType;
        }
        return searchLiveStruct.copy(str);
    }

    public final SearchLiveStruct copy(String str) {
        return new SearchLiveStruct(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchLiveStruct) && o.LJ(this.liveCoverType, ((SearchLiveStruct) obj).liveCoverType);
    }

    public int hashCode() {
        String str = this.liveCoverType;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchLiveStruct(liveCoverType=");
        return q.LIZIZ(LIZ, this.liveCoverType, ')', LIZ);
    }

    public final String getLiveCoverType() {
        return this.liveCoverType;
    }

    public SearchLiveStruct(String str) {
        this.liveCoverType = str;
    }

    public /* synthetic */ SearchLiveStruct(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
