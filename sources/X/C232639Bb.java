package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232639Bb {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232639Bb)) {
            return false;
        }
        C232639Bb c232639Bb = (C232639Bb) obj;
        return o.LJ(this.LIZ, c232639Bb.LIZ) && o.LJ(this.LIZIZ, c232639Bb.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Key(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", scene=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C232639Bb(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
