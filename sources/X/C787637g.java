package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.37g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C787637g {
    public final String LIZ;
    public final C789337x LIZIZ;
    public final C789537z LIZJ;
    public final C789437y LIZLLL;

    public final int hashCode() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.LIZ.hashCode());
        C789537z c789537z = this.LIZJ;
        if (c789537z != null) {
            str = c789537z.LIZIZ;
        } else {
            str = null;
        }
        objArr[1] = str;
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserEntity(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", userInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mafInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", status=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        C787637g c787637g;
        String str;
        String str2 = null;
        if (obj instanceof C787637g) {
            c787637g = (C787637g) obj;
        } else {
            c787637g = null;
        }
        if (c787637g == null || !o.LJ(c787637g.LIZ, this.LIZ)) {
            return false;
        }
        C789537z c789537z = c787637g.LIZJ;
        if (c789537z != null) {
            str = c789537z.LIZIZ;
        } else {
            str = null;
        }
        C789537z c789537z2 = this.LIZJ;
        if (c789537z2 != null) {
            str2 = c789537z2.LIZIZ;
        }
        if (!o.LJ(str, str2)) {
            return false;
        }
        return true;
    }

    public C787637g(String uid, C789337x c789337x, C789537z c789537z, C789437y c789437y) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = uid;
        this.LIZIZ = c789337x;
        this.LIZJ = c789537z;
        this.LIZLLL = c789437y;
    }
}
