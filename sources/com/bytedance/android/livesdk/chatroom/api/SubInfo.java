package com.bytedance.android.livesdk.chatroom.api;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class SubInfo extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public String anchorId;

    @InterfaceC65349Pkn("grace_info")
    public GraceInfo graceInfo;

    @InterfaceC65349Pkn("is_subscribing")
    public Boolean isSubscribing;

    @InterfaceC65349Pkn("next_renew_time")
    public Long nextRenewTime;

    @InterfaceC65349Pkn("pay_channel")
    public int payChannel;

    @InterfaceC65349Pkn("price_change_info")
    public PriceChangeInfo priceChangeInfo;

    @InterfaceC65349Pkn("sku_name")
    public String skuName;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("sub_end_time")
    public Long subEndTime;

    @InterfaceC65349Pkn("sub_info_not_found")
    public Boolean subInfoNotFound;

    @InterfaceC65349Pkn("sub_level")
    public SubLevel subLevel;

    @InterfaceC65349Pkn("sub_start_time")
    public Long subStartTime;

    @InterfaceC65349Pkn("subscribed_month")
    public Integer subscribedMonth;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.userId;
        String str2 = this.anchorId;
        Long l = this.subStartTime;
        Long l2 = this.subEndTime;
        Long l3 = this.nextRenewTime;
        Integer num = this.subscribedMonth;
        Boolean bool = this.isSubscribing;
        SubLevel subLevel = this.subLevel;
        Boolean bool2 = this.subInfoNotFound;
        String str3 = this.skuName;
        GraceInfo graceInfo = this.graceInfo;
        return new Object[]{str, str, str2, str2, l, l, l2, l2, l3, l3, num, num, bool, bool, subLevel, subLevel, Integer.valueOf(this.status), bool2, bool2, str3, str3, Integer.valueOf(this.payChannel), graceInfo, graceInfo};
    }
}
