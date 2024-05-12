package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FuseConfig extends F9E {

    @InterfaceC65349Pkn("fuse_conf")
    public final FuseConf fuseConf;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("range_conf")
    public final RangeConf rangeConf;

    /* JADX WARN: Multi-variable type inference failed */
    public FuseConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.rangeConf, this.fuseConf};
    }

    public FuseConfig(String name, RangeConf rangeConf, FuseConf fuseConf) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(rangeConf, "rangeConf");
        o.LJIIIZ(fuseConf, "fuseConf");
        this.name = name;
        this.rangeConf = rangeConf;
        this.fuseConf = fuseConf;
    }

    public /* synthetic */ FuseConfig(String str, RangeConf rangeConf, FuseConf fuseConf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new RangeConf(null, null, null, null, 15, null) : rangeConf, (i & 4) != 0 ? new FuseConf(0, null, 3, null) : fuseConf);
    }
}
