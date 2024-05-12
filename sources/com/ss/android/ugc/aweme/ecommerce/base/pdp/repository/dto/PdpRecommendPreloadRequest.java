package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpRecommendPreloadRequest {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("enter_from_info")
    public final String enterFromInfo;

    @InterfaceC65349Pkn("first_source_page")
    public final String firstSourcePage;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("product_source_info")
    public final Integer productSourceInfo;

    @InterfaceC65349Pkn("recommend_parameter")
    public final Map<String, Object> recommendParams;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("size")
    public final int size;

    @InterfaceC65349Pkn("traffic_source_list")
    public final List<Integer> trafficSourceList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpRecommendPreloadRequest)) {
            return false;
        }
        PdpRecommendPreloadRequest pdpRecommendPreloadRequest = (PdpRecommendPreloadRequest) obj;
        return o.LJ(this.productId, pdpRecommendPreloadRequest.productId) && o.LJ(this.scene, pdpRecommendPreloadRequest.scene) && this.size == pdpRecommendPreloadRequest.size && this.cursor == pdpRecommendPreloadRequest.cursor && o.LJ(this.firstSourcePage, pdpRecommendPreloadRequest.firstSourcePage) && o.LJ(this.enterFromInfo, pdpRecommendPreloadRequest.enterFromInfo) && o.LJ(this.authorId, pdpRecommendPreloadRequest.authorId) && o.LJ(this.sellerId, pdpRecommendPreloadRequest.sellerId) && o.LJ(this.productSourceInfo, pdpRecommendPreloadRequest.productSourceInfo) && o.LJ(this.trafficSourceList, pdpRecommendPreloadRequest.trafficSourceList) && o.LJ(this.recommendParams, pdpRecommendPreloadRequest.recommendParams);
    }

    public final String toString() {
        return "PdpRecommendPreloadRequest(productId=" + this.productId + ", scene=" + this.scene + ", size=" + this.size + ", cursor=" + this.cursor + ", firstSourcePage=" + this.firstSourcePage + ", enterFromInfo=" + this.enterFromInfo + ", authorId=" + this.authorId + ", sellerId=" + this.sellerId + ", productSourceInfo=" + this.productSourceInfo + ", trafficSourceList=" + this.trafficSourceList + ", recommendParams=" + this.recommendParams + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int LJ = (((C79062V1e.LJ(this.scene, this.productId.hashCode() * 31, 31) + this.size) * 31) + this.cursor) * 31;
        String str = this.firstSourcePage;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.enterFromInfo;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.authorId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.sellerId;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.productSourceInfo;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<Integer> list = this.trafficSourceList;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Map<String, Object> map = this.recommendParams;
        if (map != null) {
            i = map.hashCode();
        }
        return i7 + i;
    }

    public PdpRecommendPreloadRequest(String productId, String scene, int i, int i2, String str, String str2, String str3, String str4, Integer num, List<Integer> list, Map<String, ? extends Object> map) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(scene, "scene");
        this.productId = productId;
        this.scene = scene;
        this.size = i;
        this.cursor = i2;
        this.firstSourcePage = str;
        this.enterFromInfo = str2;
        this.authorId = str3;
        this.sellerId = str4;
        this.productSourceInfo = num;
        this.trafficSourceList = list;
        this.recommendParams = map;
    }

    public /* synthetic */ PdpRecommendPreloadRequest(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, Integer num, List list, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "pdp_homepage" : str2, (i3 & 4) != 0 ? 10 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : list, (i3 & 1024) == 0 ? map : null);
    }
}
