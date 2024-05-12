package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.OQY;
import X.X1D;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class HeaderParamConfig {

    @InterfaceC65349Pkn("allowApis")
    public final List<AllowApiConfig> allowApis;

    @InterfaceC65349Pkn("denyKeys")
    public final Set<String> denyKeys;

    @InterfaceC65349Pkn("enable")
    public final Boolean enable;

    @InterfaceC65349Pkn("regions")
    public final Set<String> regions;

    @InterfaceC65349Pkn("scope")
    public final Integer scope;

    public HeaderParamConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderParamConfig)) {
            return false;
        }
        HeaderParamConfig headerParamConfig = (HeaderParamConfig) obj;
        return o.LJ(this.enable, headerParamConfig.enable) && o.LJ(this.scope, headerParamConfig.scope) && o.LJ(this.regions, headerParamConfig.regions) && o.LJ(this.denyKeys, headerParamConfig.denyKeys) && o.LJ(this.allowApis, headerParamConfig.allowApis);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.scope;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Set<String> set = this.regions;
        int hashCode3 = (hashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        Set<String> set2 = this.denyKeys;
        int hashCode4 = (hashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
        List<AllowApiConfig> list = this.allowApis;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderParamConfig(enable=");
        LIZ.append(this.enable);
        LIZ.append(", scope=");
        LIZ.append(this.scope);
        LIZ.append(", regions=");
        LIZ.append(this.regions);
        LIZ.append(", denyKeys=");
        LIZ.append(this.denyKeys);
        LIZ.append(", allowApis=");
        return C1NE.LIZIZ(LIZ, this.allowApis, ')', LIZ);
    }

    public HeaderParamConfig(Boolean bool, Integer num, Set<String> set, Set<String> set2, List<AllowApiConfig> list) {
        this.enable = bool;
        this.scope = num;
        this.regions = set;
        this.denyKeys = set2;
        this.allowApis = list;
    }

    public HeaderParamConfig(Boolean bool, Integer num, Set set, Set set2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? OQY.INSTANCE : set, (i & 8) != 0 ? OQY.INSTANCE : set2, (i & 16) == 0 ? list : null);
    }
}
