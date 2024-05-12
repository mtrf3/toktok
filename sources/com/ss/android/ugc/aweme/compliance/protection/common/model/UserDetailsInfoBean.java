package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UserDetailsInfoBean {

    @InterfaceC65349Pkn("is_minor")
    public final Boolean isMinor;

    /* JADX WARN: Multi-variable type inference failed */
    public UserDetailsInfoBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserDetailsInfoBean) && o.LJ(this.isMinor, ((UserDetailsInfoBean) obj).isMinor);
    }

    public final int hashCode() {
        Boolean bool = this.isMinor;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserDetailsInfoBean(isMinor=");
        return C78920UyC.LIZIZ(LIZ, this.isMinor, ')', LIZ);
    }

    public UserDetailsInfoBean(Boolean bool) {
        this.isMinor = bool;
    }

    public /* synthetic */ UserDetailsInfoBean(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
