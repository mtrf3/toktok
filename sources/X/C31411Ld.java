package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31411Ld extends AbstractC07660Ru {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31411Ld) && o.LJ(this.LIZ, ((C31411Ld) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowSearchListEmpty(keyword=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C31411Ld(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        this.LIZ = keyword;
    }
}
