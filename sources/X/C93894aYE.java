package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aYE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93894aYE {
    public final Long LIZ;
    public final String LIZIZ;

    public C93894aYE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93894aYE)) {
            return false;
        }
        C93894aYE c93894aYE = (C93894aYE) obj;
        return o.LJ(this.LIZ, c93894aYE.LIZ) && o.LJ(this.LIZIZ, c93894aYE.LIZIZ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LIZIZ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OffsetCursor(nextOffset=");
        LIZ.append(this.LIZ);
        LIZ.append(", nextOffsetStr=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZ() {
        Long l = this.LIZ;
        if (l != null && l.longValue() > 0) {
            return true;
        }
        String str = this.LIZIZ;
        if (str != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C93894aYE(int i) {
        this(0L, "");
    }

    public C93894aYE(Long l, String str) {
        this.LIZ = l;
        this.LIZIZ = str;
    }
}
