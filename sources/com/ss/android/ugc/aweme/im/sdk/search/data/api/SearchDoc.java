package com.ss.android.ugc.aweme.im.sdk.search.data.api;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchDoc {

    @InterfaceC65349Pkn("doc_type")
    public final int docType;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("raw_data")
    public final String rawData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDoc)) {
            return false;
        }
        SearchDoc searchDoc = (SearchDoc) obj;
        return o.LJ(this.id, searchDoc.id) && o.LJ(this.rawData, searchDoc.rawData) && this.docType == searchDoc.docType;
    }

    public final int hashCode() {
        return C79062V1e.LJ(this.rawData, this.id.hashCode() * 31, 31) + this.docType;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.docType);
        LIZ.append('#');
        LIZ.append(this.id);
        return X1D.LIZIZ(LIZ);
    }

    public SearchDoc(String id, String rawData, int i) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(rawData, "rawData");
        this.id = id;
        this.rawData = rawData;
        this.docType = i;
    }
}
