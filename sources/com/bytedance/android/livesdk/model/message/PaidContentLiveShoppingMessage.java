package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class PaidContentLiveShoppingMessage extends CR6 {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("live_series_number")
    public int liveSeriesNumber;

    @InterfaceC65349Pkn("pop_series")
    public PopSeries popSeries;

    @InterfaceC65349Pkn("time_tag")
    public TimeTag timeTag;

    public PaidContentLiveShoppingMessage() {
        this.type = EnumC31509CYf.PAID_CONTENT_LIVE_SHOPPING_MESSAGE;
    }
}
