package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1LD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LD extends AbstractC07660Ru {
    public final EnumC07640Rs LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1LD)) {
            return false;
        }
        C1LD c1ld = (C1LD) obj;
        return this.LIZ == c1ld.LIZ && this.LIZIZ == c1ld.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SongActionSuccess(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", songId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1LD(EnumC07640Rs type, long j) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = j;
    }
}
