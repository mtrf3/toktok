package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class CommerceRerankInfo implements Serializable {

    @InterfaceC65349Pkn("item_param_for_pitaya")
    public String itemParamForPitaya;

    @InterfaceC65349Pkn("original_item_gap")
    public Long originalItemGap = -1L;

    public final String getItemParamForPitaya() {
        return this.itemParamForPitaya;
    }

    public final Long getOriginalItemGap() {
        return this.originalItemGap;
    }

    public final void setItemParamForPitaya(String str) {
        this.itemParamForPitaya = str;
    }

    public final void setOriginalItemGap(Long l) {
        this.originalItemGap = l;
    }
}
