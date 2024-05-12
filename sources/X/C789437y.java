package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.37y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C789437y {
    public final String LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Boolean LIZLLL;
    public final long LJ;

    public final C789437y LIZ() {
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL})).isEmpty()) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789437y)) {
            return false;
        }
        C789437y c789437y = (C789437y) obj;
        return o.LJ(this.LIZ, c789437y.LIZ) && o.LJ(this.LIZIZ, c789437y.LIZIZ) && o.LJ(this.LIZJ, c789437y.LIZJ) && o.LJ(this.LIZLLL, c789437y.LIZLLL) && this.LJ == c789437y.LJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        return C16880lQ.LLJIJIL(this.LJ) + ((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserStatus(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", followStatus=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", followerStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isBlock=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", version=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C789437y(String uid, Integer num, Integer num2, Boolean bool, long j) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = uid;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = bool;
        this.LJ = j;
    }
}
