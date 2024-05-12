package com.ss.android.ugc.aweme.search.ecommerce.ab;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LynxMiddleViewPreloadConfig {

    @InterfaceC65349Pkn("duration")
    public final Long duration;

    @InterfaceC65349Pkn("open")
    public final Integer open;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxMiddleViewPreloadConfig)) {
            return false;
        }
        LynxMiddleViewPreloadConfig lynxMiddleViewPreloadConfig = (LynxMiddleViewPreloadConfig) obj;
        return o.LJ(this.open, lynxMiddleViewPreloadConfig.open) && o.LJ(this.duration, lynxMiddleViewPreloadConfig.duration);
    }

    public final int hashCode() {
        Integer num = this.open;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.duration;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxMiddleViewPreloadConfig(open=");
        LIZ.append(this.open);
        LIZ.append(", duration=");
        return JBR.LJ(LIZ, this.duration, ')', LIZ);
    }

    public LynxMiddleViewPreloadConfig(Integer num, Long l) {
        this.open = num;
        this.duration = l;
    }
}
