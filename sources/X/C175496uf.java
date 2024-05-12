package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175496uf extends AbstractC175526ui {
    public final java.util.Set<String> LIZ;
    public final java.util.Map<String, Comment> LIZIZ;
    public final java.util.Map<String, Comment> LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175496uf)) {
            return false;
        }
        C175496uf c175496uf = (C175496uf) obj;
        return o.LJ(this.LIZ, c175496uf.LIZ) && o.LJ(this.LIZIZ, c175496uf.LIZIZ) && o.LJ(this.LIZJ, c175496uf.LIZJ) && this.LIZLLL == c175496uf.LIZLLL;
    }

    public final int hashCode() {
        return C12400eC.LIZ(this.LIZJ, C12400eC.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportSuccess(cids=");
        LIZ.append(this.LIZ);
        LIZ.append(", submited=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", selected=");
        LIZ.append(this.LIZJ);
        LIZ.append(", totalDelete=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C175496uf(int i, java.util.Map submited, java.util.Map selected, java.util.Set cids) {
        o.LJIIIZ(cids, "cids");
        o.LJIIIZ(submited, "submited");
        o.LJIIIZ(selected, "selected");
        this.LIZ = cids;
        this.LIZIZ = submited;
        this.LIZJ = selected;
        this.LIZLLL = i;
    }
}
