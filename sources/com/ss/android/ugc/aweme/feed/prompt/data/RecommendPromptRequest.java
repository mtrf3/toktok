package com.ss.android.ugc.aweme.feed.prompt.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RecommendPromptRequest implements Serializable {

    @InterfaceC65349Pkn("enter_from_gid")
    public final String enterFromGid;

    @InterfaceC65349Pkn("impressions")
    public final List<InteractionImpression> impressions;

    @InterfaceC65349Pkn("limit")
    public final Integer limit;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendPromptRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendPromptRequest copy$default(RecommendPromptRequest recommendPromptRequest, List list, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendPromptRequest.impressions;
        }
        if ((i & 2) != 0) {
            str = recommendPromptRequest.enterFromGid;
        }
        if ((i & 4) != 0) {
            num = recommendPromptRequest.limit;
        }
        return recommendPromptRequest.copy(list, str, num);
    }

    public final RecommendPromptRequest copy(List<InteractionImpression> list, String str, Integer num) {
        return new RecommendPromptRequest(list, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendPromptRequest)) {
            return false;
        }
        RecommendPromptRequest recommendPromptRequest = (RecommendPromptRequest) obj;
        return o.LJ(this.impressions, recommendPromptRequest.impressions) && o.LJ(this.enterFromGid, recommendPromptRequest.enterFromGid) && o.LJ(this.limit, recommendPromptRequest.limit);
    }

    public int hashCode() {
        List<InteractionImpression> list = this.impressions;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.enterFromGid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.limit;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendPromptRequest(impressions=");
        LIZ.append(this.impressions);
        LIZ.append(", enterFromGid=");
        LIZ.append(this.enterFromGid);
        LIZ.append(", limit=");
        return s0.LIZJ(LIZ, this.limit, ')', LIZ);
    }

    public final String getEnterFromGid() {
        return this.enterFromGid;
    }

    public final List<InteractionImpression> getImpressions() {
        return this.impressions;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public RecommendPromptRequest(List<InteractionImpression> list, String str, Integer num) {
        this.impressions = list;
        this.enterFromGid = str;
        this.limit = num;
    }

    public /* synthetic */ RecommendPromptRequest(List list, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
