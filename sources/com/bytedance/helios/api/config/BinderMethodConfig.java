package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BinderMethodConfig extends F9E {

    @InterfaceC65349Pkn("api_ids")
    public final List<Integer> apiIds;

    @InterfaceC65349Pkn("data_types")
    public final List<String> dataTypes;

    @InterfaceC65349Pkn("monitor_error")
    public double monitorError;

    @InterfaceC65349Pkn("monitor_normal")
    public double monitorNormal;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("skip_sys_calls")
    public final List<String> skipSysCalls;

    public BinderMethodConfig() {
        this(null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, Double.valueOf(this.monitorNormal), Double.valueOf(this.monitorError), this.dataTypes, this.apiIds, this.skipSysCalls};
    }

    public BinderMethodConfig(String name, double d, double d2, List<String> dataTypes, List<Integer> apiIds, List<String> skipSysCalls) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(dataTypes, "dataTypes");
        o.LJIIIZ(apiIds, "apiIds");
        o.LJIIIZ(skipSysCalls, "skipSysCalls");
        this.name = name;
        this.monitorNormal = d;
        this.monitorError = d2;
        this.dataTypes = dataTypes;
        this.apiIds = apiIds;
        this.skipSysCalls = skipSysCalls;
    }

    public BinderMethodConfig(String str, double d, double d2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1.0d : d, (i & 4) == 0 ? d2 : -1.0d, (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? C61878OQg.INSTANCE : list2, (i & 32) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
