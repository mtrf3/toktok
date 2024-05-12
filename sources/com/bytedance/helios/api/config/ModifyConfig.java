package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ModifyConfig extends F9E {

    @InterfaceC65349Pkn("modify_conf")
    public final ModifyConf modifyConf;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("range_conf")
    public final RangeConf rangeConf;

    /* JADX WARN: Multi-variable type inference failed */
    public ModifyConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.rangeConf, this.modifyConf};
    }

    public ModifyConfig(String name, RangeConf rangeConf, ModifyConf modifyConf) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(rangeConf, "rangeConf");
        o.LJIIIZ(modifyConf, "modifyConf");
        this.name = name;
        this.rangeConf = rangeConf;
        this.modifyConf = modifyConf;
    }

    public /* synthetic */ ModifyConfig(String str, RangeConf rangeConf, ModifyConf modifyConf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new RangeConf(null, null, null, null, 15, null) : rangeConf, (i & 4) != 0 ? new ModifyConf(null, null, null, 7, null) : modifyConf);
    }
}
