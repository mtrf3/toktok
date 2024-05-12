package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RangeConf extends F9E {

    @InterfaceC65349Pkn("domains")
    public final DomainRange domains;

    @InterfaceC65349Pkn("paths")
    public final PathRange paths;

    @InterfaceC65349Pkn("schemes")
    public final Set<String> schemes;

    @InterfaceC65349Pkn("targets")
    public final Set<Integer> targets;

    public RangeConf() {
        this(null, null, null, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.targets, this.schemes, this.domains, this.paths};
    }

    public RangeConf(Set<Integer> targets, Set<String> schemes, DomainRange domains, PathRange paths) {
        o.LJIIIZ(targets, "targets");
        o.LJIIIZ(schemes, "schemes");
        o.LJIIIZ(domains, "domains");
        o.LJIIIZ(paths, "paths");
        this.targets = targets;
        this.schemes = schemes;
        this.domains = domains;
        this.paths = paths;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.RangeConf.L(int, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public RangeConf(Set set, Set set2, DomainRange domainRange, PathRange pathRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OQY.INSTANCE : set, (i & 2) != 0 ? OQY.INSTANCE : set2, (i & 4) != 0 ? new DomainRange(null, null, null, null, null, 31, null) : domainRange, (i & 8) != 0 ? new PathRange(null, null, null, null, 15, null) : pathRange);
    }
}
