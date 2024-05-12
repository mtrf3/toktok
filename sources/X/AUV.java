package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AUV {
    public final java.util.Set<? extends InterfaceC53590L1m<?>> LIZ;
    public final AUW LIZIZ;

    public AUV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AUV)) {
            return false;
        }
        AUV auv = (AUV) obj;
        return o.LJ(this.LIZ, auv.LIZ) && this.LIZIZ == auv.LIZIZ;
    }

    public final int hashCode() {
        java.util.Set<? extends InterfaceC53590L1m<?>> set = this.LIZ;
        return this.LIZIZ.hashCode() + ((set == null ? 0 : set.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarBusinessConfig(businesses=");
        LIZ.append(this.LIZ);
        LIZ.append(", businessPriority=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ AUV(int i) {
        this(null, AUW.DEFAULT);
    }

    public AUV(java.util.Set<? extends InterfaceC53590L1m<?>> set, AUW businessPriority) {
        o.LJIIIZ(businessPriority, "businessPriority");
        this.LIZ = set;
        this.LIZIZ = businessPriority;
    }
}
