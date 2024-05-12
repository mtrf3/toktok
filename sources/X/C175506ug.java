package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175506ug extends AbstractC175526ui {
    public final int LIZ;
    public final java.util.Set<String> LIZIZ;
    public final java.util.Map<String, Comment> LIZJ;
    public final java.util.Map<String, Comment> LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175506ug)) {
            return false;
        }
        C175506ug c175506ug = (C175506ug) obj;
        return this.LIZ == c175506ug.LIZ && o.LJ(this.LIZIZ, c175506ug.LIZIZ) && o.LJ(this.LIZJ, c175506ug.LIZJ) && o.LJ(this.LIZLLL, c175506ug.LIZLLL) && this.LJ == c175506ug.LJ;
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = HXX.LIZ(this.LIZIZ, this.LIZ * 31, 31);
        java.util.Map<String, Comment> map = this.LIZJ;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (LIZ + hashCode) * 31;
        java.util.Map<String, Comment> map2 = this.LIZLLL;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return ((i2 + i) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportError(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", cids=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", submited=");
        LIZ.append(this.LIZJ);
        LIZ.append(", selected=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", totalDelete=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C175506ug(int i, int i2, java.util.Map map, java.util.Map map2, java.util.Set cids) {
        o.LJIIIZ(cids, "cids");
        this.LIZ = i;
        this.LIZIZ = cids;
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = i2;
    }
}
