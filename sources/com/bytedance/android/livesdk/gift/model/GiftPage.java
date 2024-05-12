package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class GiftPage {

    @InterfaceC65349Pkn("display")
    public boolean display;

    @InterfaceC65349Pkn("event_name")
    public String eventName;

    @InterfaceC65349Pkn("force_insert_metrics")
    public Map<Long, ForceInsertMetricsItem> forceInsertMetrics;

    @InterfaceC65349Pkn("force_insert_priority_map")
    public Map<Long, Long> forceInsertPriorityMap;

    @InterfaceC65349Pkn("frequently_used_gifts")
    public List<Gift> frequentlyUsedGifts;

    @InterfaceC65349Pkn("gifts")
    public List<Gift> gifts;

    @InterfaceC65349Pkn("page_operation")
    public GiftOperation operation;

    @InterfaceC65349Pkn("page_name")
    public String pageName;

    @InterfaceC65349Pkn("page_instruction")
    public GiftPanelBanner pagePanelBanner;

    @InterfaceC65349Pkn("page_type")
    public int pageType;

    @InterfaceC65349Pkn("region")
    public String region;
}
