package com.bytedance.android.livesdk.livesetting.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveSlotSettings implements Serializable {

    @InterfaceC65349Pkn("biz_type_disallow")
    public Map<String, SlotBizTypeDisallow> bizTypeDisallow;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSlotSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, SlotBizTypeDisallow> getBizTypeDisallow() {
        return this.bizTypeDisallow;
    }

    public LiveSlotSettings(Map<String, SlotBizTypeDisallow> map) {
        this.bizTypeDisallow = map;
    }

    public final void setBizTypeDisallow(Map<String, SlotBizTypeDisallow> map) {
        this.bizTypeDisallow = map;
    }

    public /* synthetic */ LiveSlotSettings(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
