package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JVF {
    public final Comment LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JVF)) {
            return false;
        }
        JVF jvf = (JVF) obj;
        return o.LJ(this.LIZ, jvf.LIZ) && this.LIZIZ == jvf.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Comment comment = this.LIZ;
        int hashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopCommentState(comment=");
        LIZ.append(this.LIZ);
        LIZ.append(", likeStateChanged=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public JVF(Comment comment, boolean z) {
        this.LIZ = comment;
        this.LIZIZ = z;
    }
}
