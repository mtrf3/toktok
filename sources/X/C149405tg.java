package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149405tg<V> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final EnumC149415th LIZ;
    public final V LIZIZ;
    public final Throwable LIZJ;

    public C149405tg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C149405tg)) {
            return false;
        }
        C149405tg c149405tg = (C149405tg) obj;
        return this.LIZ == c149405tg.LIZ && o.LJ(this.LIZIZ, c149405tg.LIZIZ) && o.LJ(this.LIZJ, c149405tg.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        V v = this.LIZIZ;
        int hashCode2 = (hashCode + (v == null ? 0 : v.hashCode())) * 31;
        Throwable th = this.LIZJ;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadEvent(state=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", exception=");
        return C169696lJ.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C149405tg(EnumC149415th state, C149465tm c149465tm, Throwable th, int i) {
        Object obj = (i & 2) != 0 ? (V) null : c149465tm;
        th = (i & 4) != 0 ? null : th;
        o.LJIIIZ(state, "state");
        this.LIZ = state;
        this.LIZIZ = (V) obj;
        this.LIZJ = th;
    }
}
