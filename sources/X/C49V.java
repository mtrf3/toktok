package X;

import kotlin.jvm.internal.o;

/* renamed from: X.49V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49V {
    public final C4AH LIZ;
    public final C4KA LIZIZ;
    public final C48E LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C49V() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49V)) {
            return false;
        }
        C49V c49v = (C49V) obj;
        return o.LJ(this.LIZ, c49v.LIZ) && o.LJ(this.LIZIZ, c49v.LIZIZ) && o.LJ(this.LIZJ, c49v.LIZJ);
    }

    public final int hashCode() {
        C4AH c4ah = this.LIZ;
        int hashCode = (c4ah == null ? 0 : c4ah.hashCode()) * 31;
        C4KA c4ka = this.LIZIZ;
        int hashCode2 = (hashCode + (c4ka == null ? 0 : c4ka.hashCode())) * 31;
        C48E c48e = this.LIZJ;
        return hashCode2 + (c48e != null ? c48e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BackgroundConfig(cornerConfig=");
        LIZ.append(this.LIZ);
        LIZ.append(", strokeConfig=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", solidConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C49V(C4AH c4ah, C4KA c4ka, C48E c48e) {
        this.LIZ = c4ah;
        this.LIZIZ = c4ka;
        this.LIZJ = c48e;
    }

    public /* synthetic */ C49V(C4AH c4ah, C1042347f c1042347f, C48E c48e, int i) {
        this((i & 1) != 0 ? null : c4ah, (i & 2) != 0 ? null : c1042347f, (i & 4) != 0 ? null : c48e);
    }
}
