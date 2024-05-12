package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CreatorPlusFeaturesResponse extends BaseResponse {

    @InterfaceC65349Pkn("creator_plus_status")
    public final Integer creatorPlusStatus;

    @InterfaceC65349Pkn("features")
    public final List<CreatorPlusFeature> features;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorPlusFeaturesResponse)) {
            return false;
        }
        CreatorPlusFeaturesResponse creatorPlusFeaturesResponse = (CreatorPlusFeaturesResponse) obj;
        return o.LJ(this.creatorPlusStatus, creatorPlusFeaturesResponse.creatorPlusStatus) && o.LJ(this.features, creatorPlusFeaturesResponse.features);
    }

    public final int hashCode() {
        Integer num = this.creatorPlusStatus;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<CreatorPlusFeature> list = this.features;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorPlusFeaturesResponse(creatorPlusStatus=");
        LIZ.append(this.creatorPlusStatus);
        LIZ.append(", features=");
        return C1NE.LIZIZ(LIZ, this.features, ')', LIZ);
    }

    public CreatorPlusFeaturesResponse(Integer num, List<CreatorPlusFeature> list) {
        this.creatorPlusStatus = num;
        this.features = list;
    }
}
