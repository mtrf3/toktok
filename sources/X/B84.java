package X;

import Y.ARunnableS37S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B84 {
    public final EnumC74991Tbv LIZ;
    public final Runnable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B84)) {
            return false;
        }
        B84 b84 = (B84) obj;
        return this.LIZ == b84.LIZ && o.LJ(this.LIZIZ, b84.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Runnable runnable = this.LIZIZ;
        return hashCode + (runnable == null ? 0 : runnable.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SwitchLayoutTask(layoutName=");
        LIZ.append(this.LIZ);
        LIZ.append(", afterTask=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public B84(EnumC74991Tbv layoutName, ARunnableS37S0100000_1 aRunnableS37S0100000_1) {
        o.LJIIIZ(layoutName, "layoutName");
        this.LIZ = layoutName;
        this.LIZIZ = aRunnableS37S0100000_1;
    }
}
