package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1NA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NA extends AbstractC08450Uv {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerbatimTtsAnnotation(verbatim=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C1NA(String verbatim) {
        o.LJIIIZ(verbatim, "verbatim");
        this.LIZ = verbatim;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1NA) && o.LJ(this.LIZ, ((C1NA) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
