package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokV1ImInboxDataGetResponse extends BaseResponse {

    @InterfaceC65349Pkn("camera_icon")
    public final CameraIconResponseBody cameraIcon;

    @InterfaceC65349Pkn("property_type")
    public final List<Integer> propertyTypes;

    @InterfaceC65349Pkn("recommendations")
    public final RecommendationResponseBody recommendations;

    @InterfaceC65349Pkn("suggested_stickers")
    public final SuggestedStickersResponseBody suggestedStickers;

    /* JADX WARN: Multi-variable type inference failed */
    public TiktokV1ImInboxDataGetResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ImInboxDataGetResponse)) {
            return false;
        }
        TiktokV1ImInboxDataGetResponse tiktokV1ImInboxDataGetResponse = (TiktokV1ImInboxDataGetResponse) obj;
        return o.LJ(this.propertyTypes, tiktokV1ImInboxDataGetResponse.propertyTypes) && o.LJ(this.recommendations, tiktokV1ImInboxDataGetResponse.recommendations) && o.LJ(this.cameraIcon, tiktokV1ImInboxDataGetResponse.cameraIcon) && o.LJ(this.suggestedStickers, tiktokV1ImInboxDataGetResponse.suggestedStickers);
    }

    public final int hashCode() {
        List<Integer> list = this.propertyTypes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        RecommendationResponseBody recommendationResponseBody = this.recommendations;
        int hashCode2 = (hashCode + (recommendationResponseBody == null ? 0 : recommendationResponseBody.hashCode())) * 31;
        CameraIconResponseBody cameraIconResponseBody = this.cameraIcon;
        int hashCode3 = (hashCode2 + (cameraIconResponseBody == null ? 0 : cameraIconResponseBody.hashCode())) * 31;
        SuggestedStickersResponseBody suggestedStickersResponseBody = this.suggestedStickers;
        return hashCode3 + (suggestedStickersResponseBody != null ? suggestedStickersResponseBody.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokV1ImInboxDataGetResponse(propertyTypes=");
        LIZ.append(this.propertyTypes);
        LIZ.append(", recommendations=");
        LIZ.append(this.recommendations);
        LIZ.append(", cameraIcon=");
        LIZ.append(this.cameraIcon);
        LIZ.append(", suggestedStickers=");
        LIZ.append(this.suggestedStickers);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public TiktokV1ImInboxDataGetResponse(List<Integer> list, RecommendationResponseBody recommendationResponseBody, CameraIconResponseBody cameraIconResponseBody, SuggestedStickersResponseBody suggestedStickersResponseBody) {
        this.propertyTypes = list;
        this.recommendations = recommendationResponseBody;
        this.cameraIcon = cameraIconResponseBody;
        this.suggestedStickers = suggestedStickersResponseBody;
    }

    public /* synthetic */ TiktokV1ImInboxDataGetResponse(List list, RecommendationResponseBody recommendationResponseBody, CameraIconResponseBody cameraIconResponseBody, SuggestedStickersResponseBody suggestedStickersResponseBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : recommendationResponseBody, (i & 4) != 0 ? null : cameraIconResponseBody, (i & 8) != 0 ? null : suggestedStickersResponseBody);
    }
}
