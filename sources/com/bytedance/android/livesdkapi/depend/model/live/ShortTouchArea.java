package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class ShortTouchArea extends F9E {

    @InterfaceC65349Pkn("min_webcast_sdk_version")
    public Long minWebcastSdkVersion;

    @InterfaceC65349Pkn("priority")
    public Integer priority;

    @InterfaceC65349Pkn("short_touch_info")
    public ShortTouchInfo shortTouchInfo;

    @InterfaceC65349Pkn("short_touch_type")
    public int shortTouchType;

    @InterfaceC65349Pkn("type")
    public Integer type;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.type;
        Integer num2 = this.priority;
        Long l = this.minWebcastSdkVersion;
        ShortTouchInfo shortTouchInfo = this.shortTouchInfo;
        return new Object[]{num, num, num2, num2, l, l, Integer.valueOf(this.shortTouchType), shortTouchInfo, shortTouchInfo};
    }
}
