package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import defpackage.b0;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6uh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175516uh extends AbstractC175546uk {
    public final int LIZ;
    public final Exception LIZIZ;
    public final java.util.Set<String> LIZJ;
    public final java.util.Map<String, Comment> LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175516uh)) {
            return false;
        }
        C175516uh c175516uh = (C175516uh) obj;
        return this.LIZ == c175516uh.LIZ && o.LJ(this.LIZIZ, c175516uh.LIZIZ) && o.LJ(this.LIZJ, c175516uh.LIZJ) && o.LJ(this.LIZLLL, c175516uh.LIZLLL) && this.LJ == c175516uh.LJ;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        Exception exc = this.LIZIZ;
        int i2 = 0;
        if (exc == null) {
            hashCode = 0;
        } else {
            hashCode = exc.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        java.util.Set<String> set = this.LIZJ;
        if (set != null) {
            i2 = set.hashCode();
        }
        return C12400eC.LIZ(this.LIZLLL, (i3 + i2) * 31, 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestError(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", exception=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cids=");
        LIZ.append(this.LIZJ);
        LIZ.append(", selected=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", succeedCount=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ C175516uh(int i, Exception exc, int i2) {
        this(i, (i2 & 2) != 0 ? null : exc, null, (i2 & 8) != 0 ? new HashMap() : null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C175516uh(int i, Exception exc, java.util.Set<String> set, java.util.Map<String, ? extends Comment> selected, int i2) {
        o.LJIIIZ(selected, "selected");
        this.LIZ = i;
        this.LIZIZ = exc;
        this.LIZJ = set;
        this.LIZLLL = selected;
        this.LJ = i2;
    }
}
