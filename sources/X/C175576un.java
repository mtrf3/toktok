package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.o;

/* renamed from: X.6un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175576un extends AbstractC175586uo {
    public final int LIZ;
    public final java.util.Set<String> LIZIZ;
    public final java.util.Map<String, Comment> LIZJ;
    public final Throwable LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175576un)) {
            return false;
        }
        C175576un c175576un = (C175576un) obj;
        return this.LIZ == c175576un.LIZ && o.LJ(this.LIZIZ, c175576un.LIZIZ) && o.LJ(this.LIZJ, c175576un.LIZJ) && o.LJ(this.LIZLLL, c175576un.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + C12400eC.LIZ(this.LIZJ, HXX.LIZ(this.LIZIZ, this.LIZ * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestError(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", uids=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", selected=");
        LIZ.append(this.LIZJ);
        LIZ.append(", error=");
        return C169696lJ.LIZLLL(LIZ, this.LIZLLL, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C175576un(int i, java.util.Set<String> uids, java.util.Map<String, ? extends Comment> selected, Throwable error) {
        o.LJIIIZ(uids, "uids");
        o.LJIIIZ(selected, "selected");
        o.LJIIIZ(error, "error");
        this.LIZ = i;
        this.LIZIZ = uids;
        this.LIZJ = selected;
        this.LIZLLL = error;
    }
}
