package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.o;

/* renamed from: X.6yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178136yv {
    public final Comment LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public C178136yv() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C178136yv)) {
            return false;
        }
        C178136yv c178136yv = (C178136yv) obj;
        return o.LJ(this.LIZ, c178136yv.LIZ) && o.LJ(this.LIZIZ, c178136yv.LIZIZ) && this.LIZJ == c178136yv.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Comment comment = this.LIZ;
        int hashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyCommentState(replyComment=");
        LIZ.append(this.LIZ);
        LIZ.append(", replyMethod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isReplying=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C178136yv(Comment comment, String str, int i) {
        boolean z;
        comment = (i & 1) != 0 ? null : comment;
        str = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = comment;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
