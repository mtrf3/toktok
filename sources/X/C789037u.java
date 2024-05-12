package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.37u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C789037u {
    public final C789337x LIZ;
    public final List<C789537z> LIZIZ;
    public final C789437y LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789037u)) {
            return false;
        }
        C789037u c789037u = (C789037u) obj;
        return o.LJ(this.LIZ, c789037u.LIZ) && o.LJ(this.LIZIZ, c789037u.LIZIZ) && o.LJ(this.LIZJ, c789037u.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<C789537z> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        C789437y c789437y = this.LIZJ;
        return hashCode2 + (c789437y != null ? c789437y.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserQueryEntity(userInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", mafInfoList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", userStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C789037u(C789337x userInfo, List<C789537z> list, C789437y c789437y) {
        o.LJIIIZ(userInfo, "userInfo");
        this.LIZ = userInfo;
        this.LIZIZ = list;
        this.LIZJ = c789437y;
    }
}
