package com.bytedance.pumbaa.hybrid.base;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BridgeConfig extends F9E {

    @InterfaceC65349Pkn("allow_param_bridge_list")
    public final List<String> allowParamBridgeList;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("ignore_bridge_method_list")
    public final List<BridgeMethod> ignoreBridgeMethodList;

    /* JADX WARN: Multi-variable type inference failed */
    public BridgeConfig() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.ignoreBridgeMethodList, this.allowParamBridgeList};
    }

    public BridgeConfig(boolean z, List<BridgeMethod> ignoreBridgeMethodList, List<String> allowParamBridgeList) {
        o.LJIIIZ(ignoreBridgeMethodList, "ignoreBridgeMethodList");
        o.LJIIIZ(allowParamBridgeList, "allowParamBridgeList");
        this.enable = z;
        this.ignoreBridgeMethodList = ignoreBridgeMethodList;
        this.allowParamBridgeList = allowParamBridgeList;
    }

    public /* synthetic */ BridgeConfig(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
