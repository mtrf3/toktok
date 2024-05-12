package com.ss.android.ugc.aweme.kpro;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class KproPopupPeriod {

    @InterfaceC65349Pkn("show_id")
    public final String show_id;

    @InterfaceC65349Pkn("number")
    public final long[] timePair;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KproPopupPeriod)) {
            return false;
        }
        KproPopupPeriod kproPopupPeriod = (KproPopupPeriod) obj;
        return o.LJ(this.show_id, kproPopupPeriod.show_id) && o.LJ(this.timePair, kproPopupPeriod.timePair);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.timePair) + (this.show_id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KproPopupPeriod(show_id=");
        LIZ.append(this.show_id);
        LIZ.append(", timePair=");
        LIZ.append(Arrays.toString(this.timePair));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public KproPopupPeriod(String show_id, long[] timePair) {
        o.LJIIIZ(show_id, "show_id");
        o.LJIIIZ(timePair, "timePair");
        this.show_id = show_id;
        this.timePair = timePair;
    }
}
