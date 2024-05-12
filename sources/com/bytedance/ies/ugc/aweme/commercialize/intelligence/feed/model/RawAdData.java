package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class RawAdData implements Serializable {

    @InterfaceC65349Pkn("ad_id")
    public final long adId;

    @InterfaceC65349Pkn("ad_source_type")
    public final int adSourceType;

    @InterfaceC65349Pkn("charge_type")
    public final int chargeType;

    @InterfaceC65349Pkn("component_type")
    public final int componentType;

    @InterfaceC65349Pkn("system_origin")
    public final int systemOrigin;

    public final long getAdId() {
        return this.adId;
    }

    public final int getAdSourceType() {
        return this.adSourceType;
    }

    public final int getChargeType() {
        return this.chargeType;
    }

    public final int getComponentType() {
        return this.componentType;
    }

    public final int getSystemOrigin() {
        return this.systemOrigin;
    }

    public RawAdData(long j, int i, int i2, int i3, int i4) {
        this.adId = j;
        this.componentType = i;
        this.adSourceType = i2;
        this.chargeType = i3;
        this.systemOrigin = i4;
    }
}
