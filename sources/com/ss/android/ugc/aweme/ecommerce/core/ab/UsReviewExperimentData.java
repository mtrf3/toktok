package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UsReviewExperimentData {

    @InterfaceC65349Pkn("review_count_threshold")
    public final Integer reviewThreshold;

    @InterfaceC65349Pkn("sold_count_threshold")
    public final Integer soldThreshold;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsReviewExperimentData)) {
            return false;
        }
        UsReviewExperimentData usReviewExperimentData = (UsReviewExperimentData) obj;
        return o.LJ(this.type, usReviewExperimentData.type) && o.LJ(this.soldThreshold, usReviewExperimentData.soldThreshold) && o.LJ(this.reviewThreshold, usReviewExperimentData.reviewThreshold);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.soldThreshold;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reviewThreshold;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UsReviewExperimentData(type=");
        LIZ.append(this.type);
        LIZ.append(", soldThreshold=");
        LIZ.append(this.soldThreshold);
        LIZ.append(", reviewThreshold=");
        return s0.LIZJ(LIZ, this.reviewThreshold, ')', LIZ);
    }

    public UsReviewExperimentData(Integer num, Integer num2, Integer num3) {
        this.type = num;
        this.soldThreshold = num2;
        this.reviewThreshold = num3;
    }
}
