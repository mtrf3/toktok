package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Blx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29749Blx {
    public final EnumC29752Bm0 LIZ;
    public final C29750Bly LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29749Blx)) {
            return false;
        }
        C29749Blx c29749Blx = (C29749Blx) obj;
        return this.LIZ == c29749Blx.LIZ && o.LJ(this.LIZIZ, c29749Blx.LIZIZ) && this.LIZJ == c29749Blx.LIZJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        C29750Bly c29750Bly = this.LIZIZ;
        return C16880lQ.LLJIJIL(this.LIZJ) + ((hashCode + (c29750Bly == null ? 0 : c29750Bly.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FansClubAnimModel(animType=");
        LIZ.append(this.LIZ);
        LIZ.append(", clubState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scoreDelta=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C29749Blx(EnumC29752Bm0 animType, C29750Bly c29750Bly, long j) {
        o.LJIIIZ(animType, "animType");
        this.LIZ = animType;
        this.LIZIZ = c29750Bly;
        this.LIZJ = j;
    }
}
