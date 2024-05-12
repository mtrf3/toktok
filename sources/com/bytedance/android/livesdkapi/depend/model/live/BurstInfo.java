package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes16.dex */
public final class BurstInfo extends F9E {

    @InterfaceC65349Pkn("burst_time_remain_seconds")
    public Long burstTimeRemainSeconds;

    @InterfaceC65349Pkn("multiple")
    public Long multiple;

    @InterfaceC65349Pkn("property_definition_id")
    public Long propertyDefinitionId;

    @InterfaceC65349Pkn("property_icon")
    public ImageModel propertyIcon;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.burstTimeRemainSeconds;
        Long l2 = this.multiple;
        Long l3 = this.propertyDefinitionId;
        ImageModel imageModel = this.propertyIcon;
        return new Object[]{l, l, l2, l2, l3, l3, imageModel, imageModel};
    }
}
