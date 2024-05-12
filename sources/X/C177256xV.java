package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.o;

/* renamed from: X.6xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177256xV {
    public final Comment LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C177256xV() {
        this(null, 0 == true ? 1 : 0, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C177256xV)) {
            return false;
        }
        C177256xV c177256xV = (C177256xV) obj;
        return o.LJ(this.LIZ, c177256xV.LIZ) && o.LJ(this.LIZIZ, c177256xV.LIZIZ) && this.LIZJ == c177256xV.LIZJ;
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

    public C177256xV(Comment comment, String str, boolean z) {
        this.LIZ = comment;
        this.LIZIZ = str;
        this.LIZJ = z;
    }

    public /* synthetic */ C177256xV(Comment comment, String str, boolean z, int i) {
        this((i & 1) != 0 ? null : comment, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z);
    }
}
