package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class IncentivePreload extends C95U {

    @InterfaceC65349Pkn("enable_preload")
    public Boolean enablePreload;

    public final int hashCode() {
        return Objects.hash(this.enablePreload);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("IncentivePreload:%s", this.enablePreload);
    }

    public IncentivePreload(Boolean bool) {
        this.enablePreload = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentivePreload)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((IncentivePreload) obj).enablePreload}, new Object[]{this.enablePreload});
    }
}
