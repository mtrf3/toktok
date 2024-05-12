package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PinStatusDetail {

    @InterfaceC65349Pkn("unfrozen_time")
    public final String unfrozenTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PinStatusDetail) && o.LJ(this.unfrozenTime, ((PinStatusDetail) obj).unfrozenTime);
    }

    public final int hashCode() {
        String str = this.unfrozenTime;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinStatusDetail(unfrozenTime=");
        LIZ.append(this.unfrozenTime);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PinStatusDetail(String str) {
        this.unfrozenTime = str;
    }
}
