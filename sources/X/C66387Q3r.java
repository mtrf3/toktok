package X;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import kotlin.jvm.internal.o;

/* renamed from: X.Q3r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66387Q3r {
    public final AccessToken LIZ;
    public final AuthenticationToken LIZIZ;
    public final java.util.Set<String> LIZJ;
    public final java.util.Set<String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66387Q3r)) {
            return false;
        }
        C66387Q3r c66387Q3r = (C66387Q3r) obj;
        return o.LJ(this.LIZ, c66387Q3r.LIZ) && o.LJ(this.LIZIZ, c66387Q3r.LIZIZ) && o.LJ(this.LIZJ, c66387Q3r.LIZJ) && o.LJ(this.LIZLLL, c66387Q3r.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoginResult(accessToken=");
        LIZ.append(this.LIZ);
        LIZ.append(", authenticationToken=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", recentlyGrantedPermissions=");
        LIZ.append(this.LIZJ);
        LIZ.append(", recentlyDeniedPermissions=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        AuthenticationToken authenticationToken = this.LIZIZ;
        if (authenticationToken == null) {
            hashCode = 0;
        } else {
            hashCode = authenticationToken.hashCode();
        }
        return this.LIZLLL.hashCode() + HXX.LIZ(this.LIZJ, (hashCode2 + hashCode) * 31, 31);
    }

    public C66387Q3r(AccessToken accessToken, AuthenticationToken authenticationToken, java.util.Set<String> set, java.util.Set<String> set2) {
        this.LIZ = accessToken;
        this.LIZIZ = authenticationToken;
        this.LIZJ = set;
        this.LIZLLL = set2;
    }
}
