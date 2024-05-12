package com.ss.android.ugc.aweme.paidcontent.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SeriesListingResponse extends BaseResponse {

    @InterfaceC65349Pkn("collections")
    public final List<SeriesItem> seriesList;

    /* JADX WARN: Multi-variable type inference failed */
    public SeriesListingResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeriesListingResponse) && o.LJ(this.seriesList, ((SeriesListingResponse) obj).seriesList);
    }

    public final int hashCode() {
        List<SeriesItem> list = this.seriesList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeriesListingResponse(seriesList=");
        return C1NE.LIZIZ(LIZ, this.seriesList, ')', LIZ);
    }

    public SeriesListingResponse(List<SeriesItem> list) {
        this.seriesList = list;
    }

    public /* synthetic */ SeriesListingResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
