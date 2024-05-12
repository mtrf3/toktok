package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.6ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175486ue extends AbstractC175546uk {
    public final java.util.Set<String> LIZ;
    public final java.util.Map<String, Comment> LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175486ue)) {
            return false;
        }
        C175486ue c175486ue = (C175486ue) obj;
        return o.LJ(this.LIZ, c175486ue.LIZ) && o.LJ(this.LIZIZ, c175486ue.LIZIZ) && this.LIZJ == c175486ue.LIZJ && this.LIZLLL == c175486ue.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZ = C12400eC.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((LIZ + i) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestSuccess(cids=");
        LIZ.append(this.LIZ);
        LIZ.append(", commentSelectedMap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isAllDelete=");
        LIZ.append(this.LIZJ);
        LIZ.append(", totalDelete=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C175486ue(int i, java.util.Map commentSelectedMap, java.util.Set cids) {
        o.LJIIIZ(cids, "cids");
        o.LJIIIZ(commentSelectedMap, "commentSelectedMap");
        this.LIZ = cids;
        this.LIZIZ = commentSelectedMap;
        this.LIZJ = true;
        this.LIZLLL = i;
    }
}
