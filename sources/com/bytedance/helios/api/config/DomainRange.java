package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class DomainRange extends F9E {

    @InterfaceC65349Pkn("allow_list")
    public final Set<String> allowList;

    @InterfaceC65349Pkn("block_list")
    public final Set<String> blockList;

    @InterfaceC65349Pkn("encrypt_block_list")
    public final Set<String> encryptBlockList;

    @InterfaceC65349Pkn("end_with_allow_list")
    public final Set<String> endWithAllowList;

    @InterfaceC65349Pkn("end_with_block_list")
    public final Set<String> endWithBlockList;

    public DomainRange() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.allowList, this.blockList, this.encryptBlockList, this.endWithAllowList, this.endWithBlockList};
    }

    public DomainRange(Set<String> allowList, Set<String> blockList, Set<String> encryptBlockList, Set<String> endWithAllowList, Set<String> endWithBlockList) {
        o.LJIIIZ(allowList, "allowList");
        o.LJIIIZ(blockList, "blockList");
        o.LJIIIZ(encryptBlockList, "encryptBlockList");
        o.LJIIIZ(endWithAllowList, "endWithAllowList");
        o.LJIIIZ(endWithBlockList, "endWithBlockList");
        this.allowList = allowList;
        this.blockList = blockList;
        this.encryptBlockList = encryptBlockList;
        this.endWithAllowList = endWithAllowList;
        this.endWithBlockList = endWithBlockList;
    }

    public DomainRange(Set set, Set set2, Set set3, Set set4, Set set5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashSet() : set, (i & 2) != 0 ? OQY.INSTANCE : set2, (i & 4) != 0 ? OQY.INSTANCE : set3, (i & 8) != 0 ? OQY.INSTANCE : set4, (i & 16) != 0 ? OQY.INSTANCE : set5);
    }
}
