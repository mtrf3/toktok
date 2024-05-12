package com.ss.android.ugc.aweme.compliance.api.model;

import X.InterfaceC65349Pkn;
import X.OQY;
import X.X1D;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AllowApiConfig {

    @InterfaceC65349Pkn("domains")
    public final Set<String> domains;

    @InterfaceC65349Pkn("paths")
    public final Set<String> paths;

    public AllowApiConfig() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllowApiConfig)) {
            return false;
        }
        AllowApiConfig allowApiConfig = (AllowApiConfig) obj;
        return o.LJ(this.domains, allowApiConfig.domains) && o.LJ(this.paths, allowApiConfig.paths);
    }

    public final int hashCode() {
        Set<String> set = this.domains;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<String> set2 = this.paths;
        return hashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AllowApiConfig(domains=");
        LIZ.append(this.domains);
        LIZ.append(", paths=");
        LIZ.append(this.paths);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AllowApiConfig(Set<String> set, Set<String> set2) {
        this.domains = set;
        this.paths = set2;
    }

    public AllowApiConfig(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? OQY.INSTANCE : set2);
    }
}
