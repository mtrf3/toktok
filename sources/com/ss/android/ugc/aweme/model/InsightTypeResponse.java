package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InsightTypeResponse extends BaseResponse {

    @InterfaceC65349Pkn("video_like_distrubution_7d")
    public final DataInsightsMetric videoLikeRateHistory;

    @InterfaceC65349Pkn("video_retention_rate_history_7d")
    public final DataInsightsMetric videoRetentionRateHistory;

    /* JADX WARN: Multi-variable type inference failed */
    public InsightTypeResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsightTypeResponse)) {
            return false;
        }
        InsightTypeResponse insightTypeResponse = (InsightTypeResponse) obj;
        return o.LJ(this.videoRetentionRateHistory, insightTypeResponse.videoRetentionRateHistory) && o.LJ(this.videoLikeRateHistory, insightTypeResponse.videoLikeRateHistory);
    }

    public final int hashCode() {
        DataInsightsMetric dataInsightsMetric = this.videoRetentionRateHistory;
        int hashCode = (dataInsightsMetric == null ? 0 : dataInsightsMetric.hashCode()) * 31;
        DataInsightsMetric dataInsightsMetric2 = this.videoLikeRateHistory;
        return hashCode + (dataInsightsMetric2 != null ? dataInsightsMetric2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InsightTypeResponse(videoRetentionRateHistory=");
        LIZ.append(this.videoRetentionRateHistory);
        LIZ.append(", videoLikeRateHistory=");
        LIZ.append(this.videoLikeRateHistory);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public InsightTypeResponse(DataInsightsMetric dataInsightsMetric, DataInsightsMetric dataInsightsMetric2) {
        this.videoRetentionRateHistory = dataInsightsMetric;
        this.videoLikeRateHistory = dataInsightsMetric2;
    }

    public /* synthetic */ InsightTypeResponse(DataInsightsMetric dataInsightsMetric, DataInsightsMetric dataInsightsMetric2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dataInsightsMetric, (i & 2) != 0 ? null : dataInsightsMetric2);
    }
}
