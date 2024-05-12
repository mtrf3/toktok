package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.L2f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53609L2f {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53609L2f)) {
            return false;
        }
        C53609L2f c53609L2f = (C53609L2f) obj;
        return o.LJ(this.LIZ, c53609L2f.LIZ) && o.LJ(this.LIZIZ, c53609L2f.LIZIZ) && o.LJ(this.LIZJ, c53609L2f.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LIZJ;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoEcomTrackData(isECom=");
        LIZ.append(this.LIZ);
        LIZ.append(", productCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", productIds=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C53609L2f(Integer num, Integer num2, String str) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = str;
    }
}
