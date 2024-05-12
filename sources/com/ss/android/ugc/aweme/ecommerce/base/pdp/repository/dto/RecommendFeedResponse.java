package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecommendFeedResponse {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("recommend_responses")
    public final Map<String, CommonFeedResponse> feedMap;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendFeedResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendFeedResponse)) {
            return false;
        }
        RecommendFeedResponse recommendFeedResponse = (RecommendFeedResponse) obj;
        return o.LJ(this.code, recommendFeedResponse.code) && o.LJ(this.message, recommendFeedResponse.message) && o.LJ(this.feedMap, recommendFeedResponse.feedMap);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, CommonFeedResponse> map = this.feedMap;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final boolean LIZ() {
        Map<String, CommonFeedResponse> map;
        CommonFeedResponse commonFeedResponse;
        CommonFeedData commonFeedData;
        List<Feed> list;
        Integer num = this.code;
        if (num == null || num.intValue() != 0 || (map = this.feedMap) == null || map.get("pdp_buy_together_recommend") == null || (commonFeedResponse = this.feedMap.get("pdp_buy_together_recommend")) == null || (commonFeedData = commonFeedResponse.data) == null || (list = commonFeedData.feedList) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendFeedResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", feedMap=");
        return C15890jp.LIZ(LIZ, this.feedMap, ')', LIZ);
    }

    public RecommendFeedResponse(Integer num, String str, Map<String, CommonFeedResponse> map) {
        this.code = num;
        this.message = str;
        this.feedMap = map;
    }

    public /* synthetic */ RecommendFeedResponse(Integer num, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map);
    }
}
