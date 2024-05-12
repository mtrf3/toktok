package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9G2, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9G2 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9G2) && o.LJ(this.LIZ, ((C9G2) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RssUser(linkedRssUrl=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C9G2(String str) {
        this.LIZ = str;
    }
}
