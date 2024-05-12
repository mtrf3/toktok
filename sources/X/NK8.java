package X;

import Y.ARunnableS46S0100000_10;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NK8 {
    public List<Long> LIZ;
    public int LIZIZ;
    public final ARunnableS46S0100000_10 LIZJ;

    public NK8() {
        this(null, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NK8)) {
            return false;
        }
        NK8 nk8 = (NK8) obj;
        return o.LJ(this.LIZ, nk8.LIZ) && this.LIZIZ == nk8.LIZIZ;
    }

    public final int hashCode() {
        List<Long> list = this.LIZ;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomBannerGameLiveModel(roomList=");
        LIZ.append(this.LIZ);
        LIZ.append(", lastIndex=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public NK8(List<Long> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = new ARunnableS46S0100000_10(this, 96);
    }
}
