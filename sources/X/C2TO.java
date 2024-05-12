package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2TO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TO implements C2K7 {
    public final String LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2TO) && o.LJ(this.LJLIL, ((C2TO) obj).LJLIL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryPlayCompletedParam(sourceId=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C2TO(String str) {
        this.LJLIL = str;
    }
}
