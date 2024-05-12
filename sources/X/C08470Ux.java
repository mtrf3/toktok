package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08470Ux {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlAnnotation(url=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C08470Ux(String url) {
        o.LJIIIZ(url, "url");
        this.LIZ = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C08470Ux) && o.LJ(this.LIZ, ((C08470Ux) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
