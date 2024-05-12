package com.bytedance.android.livesdk.livesetting.gift;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NativeTriggerConfig {

    @InterfaceC65349Pkn("enable_pitaya_filter_list")
    public List<String> enablePitayaFilterList;

    @InterfaceC65349Pkn("trigger_type_disable_list")
    public List<String> triggerTypeDisableList;

    public NativeTriggerConfig() {
        this(null, null, 3, null);
    }

    public NativeTriggerConfig(List<String> triggerTypeDisableList, List<String> enablePitayaFilterList) {
        o.LJIIIZ(triggerTypeDisableList, "triggerTypeDisableList");
        o.LJIIIZ(enablePitayaFilterList, "enablePitayaFilterList");
        this.triggerTypeDisableList = triggerTypeDisableList;
        this.enablePitayaFilterList = enablePitayaFilterList;
    }

    public NativeTriggerConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
