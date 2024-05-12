package X;

import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175646uu extends AbstractC175526ui {
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public final java.util.Set<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175646uu)) {
            return false;
        }
        C175646uu c175646uu = (C175646uu) obj;
        return o.LJ(this.LIZ, c175646uu.LIZ) && o.LJ(this.LIZIZ, c175646uu.LIZIZ) && o.LJ(this.LIZJ, c175646uu.LIZJ) && this.LIZLLL == c175646uu.LIZLLL && this.LJ == c175646uu.LJ;
    }

    public final int hashCode() {
        return ((HXX.LIZ(this.LIZJ, AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ValidateSuccess(cids=");
        LIZ.append(this.LIZ);
        LIZ.append(", uids=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", uidsUnique=");
        LIZ.append(this.LIZJ);
        LIZ.append(", selectCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", videoReplyNumber=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C175646uu(List<String> cids, List<String> uids, java.util.Set<String> uidsUnique, int i, int i2) {
        o.LJIIIZ(cids, "cids");
        o.LJIIIZ(uids, "uids");
        o.LJIIIZ(uidsUnique, "uidsUnique");
        this.LIZ = cids;
        this.LIZIZ = uids;
        this.LIZJ = uidsUnique;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
