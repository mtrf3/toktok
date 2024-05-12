package com.ss.android.ugc.aweme.commercialize.preview.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdsPreviewResponse implements Serializable {

    @InterfaceC65349Pkn("ad_ids")
    public final List<String> adIds;

    @InterfaceC65349Pkn("creative_ids")
    public final List<String> creativeIds;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsPreviewResponse copy$default(AdsPreviewResponse adsPreviewResponse, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adsPreviewResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            list = adsPreviewResponse.adIds;
        }
        if ((i2 & 4) != 0) {
            list2 = adsPreviewResponse.creativeIds;
        }
        return adsPreviewResponse.copy(i, list, list2);
    }

    public final AdsPreviewResponse copy(int i, List<String> list, List<String> list2) {
        return new AdsPreviewResponse(i, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPreviewResponse)) {
            return false;
        }
        AdsPreviewResponse adsPreviewResponse = (AdsPreviewResponse) obj;
        return this.statusCode == adsPreviewResponse.statusCode && o.LJ(this.adIds, adsPreviewResponse.adIds) && o.LJ(this.creativeIds, adsPreviewResponse.creativeIds);
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        List<String> list = this.adIds;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.creativeIds;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdsPreviewResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", adIds=");
        LIZ.append(this.adIds);
        LIZ.append(", creativeIds=");
        return C1NE.LIZIZ(LIZ, this.creativeIds, ')', LIZ);
    }

    public final List<String> getAdIds() {
        return this.adIds;
    }

    public final List<String> getCreativeIds() {
        return this.creativeIds;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public AdsPreviewResponse(int i, List<String> list, List<String> list2) {
        this.statusCode = i;
        this.adIds = list;
        this.creativeIds = list2;
    }
}
