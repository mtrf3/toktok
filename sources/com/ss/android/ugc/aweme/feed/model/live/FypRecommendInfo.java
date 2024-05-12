package com.ss.android.ugc.aweme.feed.model.live;

import X.C65402Ple;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes16.dex */
public final class FypRecommendInfo extends C65402Ple implements Serializable {

    @InterfaceC65349Pkn("ecom_display_card_pid")
    public long displayProductId = -1;

    @InterfaceC65349Pkn("ecom_display_prod_card_style")
    public int displayStyle = -1;

    @InterfaceC65349Pkn("ecom_display_prod_card_delay_show_time")
    public long delayShowTime = 2000;

    public final long getDelayShowTime() {
        return this.delayShowTime;
    }

    public final long getDisplayProductId() {
        return this.displayProductId;
    }

    public final int getDisplayStyle() {
        return this.displayStyle;
    }

    public final void setDelayShowTime(long j) {
        this.delayShowTime = j;
    }

    public final void setDisplayProductId(long j) {
        this.displayProductId = j;
    }

    public final void setDisplayStyle(int i) {
        this.displayStyle = i;
    }
}
