package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.o;

/* renamed from: X.6um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175566um extends AbstractC175586uo {
    public final java.util.Set<String> LIZ;
    public final java.util.Map<String, Comment> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175566um)) {
            return false;
        }
        C175566um c175566um = (C175566um) obj;
        return o.LJ(this.LIZ, c175566um.LIZ) && o.LJ(this.LIZIZ, c175566um.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestSuccess(uids=");
        LIZ.append(this.LIZ);
        LIZ.append(", selected=");
        return C15890jp.LIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C175566um(java.util.Map selected, java.util.Set uids) {
        o.LJIIIZ(uids, "uids");
        o.LJIIIZ(selected, "selected");
        this.LIZ = uids;
        this.LIZIZ = selected;
    }
}
