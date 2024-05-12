package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229708zu {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C229708zu)) {
            return false;
        }
        C229708zu c229708zu = (C229708zu) obj;
        return o.LJ(this.LIZ, c229708zu.LIZ) && o.LJ(this.LIZIZ, c229708zu.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheKey(mixId=");
        LIZ.append(this.LIZ);
        LIZ.append(", aid=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C229708zu(String mixId, String aid) {
        o.LJIIIZ(mixId, "mixId");
        o.LJIIIZ(aid, "aid");
        this.LIZ = mixId;
        this.LIZIZ = aid;
    }
}
