package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62582cw {
    public final Class<?> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62582cw)) {
            return false;
        }
        C62582cw c62582cw = (C62582cw) obj;
        return o.LJ(this.LIZ, c62582cw.LIZ) && o.LJ(this.LIZIZ, c62582cw.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ServiceIdentifier(serviceClazz=");
        LIZ.append(this.LIZ);
        LIZ.append(", serviceKey=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C62582cw(Class<?> cls, String str) {
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
