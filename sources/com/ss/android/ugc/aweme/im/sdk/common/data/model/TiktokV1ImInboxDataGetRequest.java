package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokV1ImInboxDataGetRequest {

    @InterfaceC65349Pkn("property_type")
    public final List<Integer> propertyTypes;

    @InterfaceC65349Pkn("previous_recommendations")
    public final RecommendationRequestBody recommendations;

    /* JADX WARN: Multi-variable type inference failed */
    public TiktokV1ImInboxDataGetRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ImInboxDataGetRequest)) {
            return false;
        }
        TiktokV1ImInboxDataGetRequest tiktokV1ImInboxDataGetRequest = (TiktokV1ImInboxDataGetRequest) obj;
        return o.LJ(this.propertyTypes, tiktokV1ImInboxDataGetRequest.propertyTypes) && o.LJ(this.recommendations, tiktokV1ImInboxDataGetRequest.recommendations);
    }

    public final int hashCode() {
        List<Integer> list = this.propertyTypes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        RecommendationRequestBody recommendationRequestBody = this.recommendations;
        return hashCode + (recommendationRequestBody != null ? recommendationRequestBody.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokV1ImInboxDataGetRequest(propertyTypes=");
        LIZ.append(this.propertyTypes);
        LIZ.append(", recommendations=");
        LIZ.append(this.recommendations);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public TiktokV1ImInboxDataGetRequest(List<Integer> list, RecommendationRequestBody recommendationRequestBody) {
        this.propertyTypes = list;
        this.recommendations = recommendationRequestBody;
    }

    public /* synthetic */ TiktokV1ImInboxDataGetRequest(List list, RecommendationRequestBody recommendationRequestBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : recommendationRequestBody);
    }
}
