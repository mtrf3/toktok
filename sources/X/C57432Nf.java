package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57432Nf {
    public final EnumC222138nh LIZ;
    public final C2K7 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57432Nf)) {
            return false;
        }
        C57432Nf c57432Nf = (C57432Nf) obj;
        return this.LIZ == c57432Nf.LIZ && o.LJ(this.LIZIZ, c57432Nf.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C2K7 c2k7 = this.LIZIZ;
        return hashCode + (c2k7 == null ? 0 : c2k7.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoryEvent(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", params=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C57432Nf(EnumC222138nh type, C2K7 c2k7) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = c2k7;
    }
}
