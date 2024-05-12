package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2W2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2W2 {
    public final String LIZ;
    public final Long LIZIZ;

    public C2W2() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2W2)) {
            return false;
        }
        C2W2 c2w2 = (C2W2) obj;
        return o.LJ(this.LIZ, c2w2.LIZ) && o.LJ(this.LIZIZ, c2w2.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendedChatInfo(recommendedUserId=");
        LIZ.append(this.LIZ);
        LIZ.append(", recommendedTimestamp=");
        return JBR.LJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C2W2(String str, Long l) {
        this.LIZ = str;
        this.LIZIZ = l;
    }
}
