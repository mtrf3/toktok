package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PathRange extends F9E {

    @InterfaceC65349Pkn("allow_list")
    public final Set<String> allowList;

    @InterfaceC65349Pkn("block_list")
    public final Set<String> blockList;

    @InterfaceC65349Pkn("start_with_allow_list")
    public final Set<String> startWithAllowList;

    @InterfaceC65349Pkn("start_with_block_list")
    public final Set<String> startWithBlockList;

    public PathRange() {
        this(null, null, null, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.allowList, this.blockList, this.startWithAllowList, this.startWithBlockList};
    }

    public PathRange(Set<String> allowList, Set<String> blockList, Set<String> startWithAllowList, Set<String> startWithBlockList) {
        o.LJIIIZ(allowList, "allowList");
        o.LJIIIZ(blockList, "blockList");
        o.LJIIIZ(startWithAllowList, "startWithAllowList");
        o.LJIIIZ(startWithBlockList, "startWithBlockList");
        this.allowList = allowList;
        this.blockList = blockList;
        this.startWithAllowList = startWithAllowList;
        this.startWithBlockList = startWithBlockList;
    }

    public PathRange(Set set, Set set2, Set set3, Set set4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? OQY.INSTANCE : set2, (i & 4) != 0 ? OQY.INSTANCE : set3, (i & 8) != 0 ? OQY.INSTANCE : set4);
    }
}
