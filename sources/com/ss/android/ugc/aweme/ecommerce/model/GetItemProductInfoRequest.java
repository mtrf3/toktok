package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class GetItemProductInfoRequest implements Serializable {

    @InterfaceC65349Pkn("anchor_req_type")
    public final Integer anchorReqType;

    @InterfaceC65349Pkn("anchor_scene")
    public final Integer anchorScene;

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("from_multi_panel")
    public final Boolean fromMultiPanel;

    @InterfaceC65349Pkn("is_anchor_dynamic_view")
    public final Boolean isAnchorDynamicView;

    @InterfaceC65349Pkn("is_from_ad")
    public final Boolean isFromAd;

    @InterfaceC65349Pkn("kol_id")
    public final String kolId;

    @InterfaceC65349Pkn("product_enter_context")
    public final Map<String, EnterContext> productEnterContext;

    @InterfaceC65349Pkn("product_id")
    public final List<String> productIds;

    @InterfaceC65349Pkn("support_single_stream")
    public final Boolean supportSingleStream;

    @InterfaceC65349Pkn("traffic_source_list")
    public final int[] trafficSourceList;

    /* JADX WARN: Multi-variable type inference failed */
    public GetItemProductInfoRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public final Integer getAnchorReqType() {
        return this.anchorReqType;
    }

    public final Integer getAnchorScene() {
        return this.anchorScene;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Boolean getFromMultiPanel() {
        return this.fromMultiPanel;
    }

    public final String getKolId() {
        return this.kolId;
    }

    public final Map<String, EnterContext> getProductEnterContext() {
        return this.productEnterContext;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final Boolean getSupportSingleStream() {
        return this.supportSingleStream;
    }

    public final int[] getTrafficSourceList() {
        return this.trafficSourceList;
    }

    public final Boolean isAnchorDynamicView() {
        return this.isAnchorDynamicView;
    }

    public final Boolean isFromAd() {
        return this.isFromAd;
    }

    public GetItemProductInfoRequest(List<String> list, String str, Map<String, EnterContext> map, Boolean bool, int[] iArr, Integer num, Boolean bool2, Integer num2, Boolean bool3, String str2, Boolean bool4) {
        this.productIds = list;
        this.kolId = str;
        this.productEnterContext = map;
        this.fromMultiPanel = bool;
        this.trafficSourceList = iArr;
        this.anchorReqType = num;
        this.isAnchorDynamicView = bool2;
        this.anchorScene = num2;
        this.isFromAd = bool3;
        this.awemeId = str2;
        this.supportSingleStream = bool4;
    }

    public /* synthetic */ GetItemProductInfoRequest(List list, String str, Map map, Boolean bool, int[] iArr, Integer num, Boolean bool2, Integer num2, Boolean bool3, String str2, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : iArr, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : str2, (i & 1024) == 0 ? bool4 : null);
    }
}
