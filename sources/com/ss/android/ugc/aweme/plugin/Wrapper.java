package com.ss.android.ugc.aweme.plugin;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Wrapper {

    @InterfaceC65349Pkn("allowlist")
    public final Set<String> allowedEventNames;

    /* JADX WARN: Multi-variable type inference failed */
    public Wrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wrapper) && o.LJ(this.allowedEventNames, ((Wrapper) obj).allowedEventNames);
    }

    public final int hashCode() {
        Set<String> set = this.allowedEventNames;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Wrapper(allowedEventNames=");
        LIZ.append(this.allowedEventNames);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Wrapper(Set<String> set) {
        this.allowedEventNames = set;
    }

    public /* synthetic */ Wrapper(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set);
    }
}
