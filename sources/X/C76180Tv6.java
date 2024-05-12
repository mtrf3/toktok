package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tv6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76180Tv6 {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final long LJFF;
    public final int LJI;
    public final java.util.Map<String, Object> LJII;

    public C76180Tv6() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76180Tv6)) {
            return false;
        }
        C76180Tv6 c76180Tv6 = (C76180Tv6) obj;
        return this.LIZ == c76180Tv6.LIZ && this.LIZIZ == c76180Tv6.LIZIZ && o.LJ(this.LIZJ, c76180Tv6.LIZJ) && this.LIZLLL == c76180Tv6.LIZLLL && this.LJ == c76180Tv6.LJ && this.LJFF == c76180Tv6.LJFF && this.LJI == c76180Tv6.LJI && o.LJ(this.LJII, c76180Tv6.LJII);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ2 = (JBR.LIZJ(this.LJFF, (((((LIZJ + hashCode) * 31) + this.LIZLLL) * 31) + this.LJ) * 31, 31) + this.LJI) * 31;
        java.util.Map<String, Object> map = this.LJII;
        if (map != null) {
            i = map.hashCode();
        }
        return LIZJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteParam(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", layoutId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", strategy=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", position=");
        LIZ.append(this.LJ);
        LIZ.append(", expireTimeInSeconds=");
        LIZ.append(this.LJFF);
        LIZ.append(", source=");
        LIZ.append(this.LJI);
        LIZ.append(", custom=");
        return C15890jp.LIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C76180Tv6(long j, long j2, String str, int i, long j3, int i2, java.util.Map map, int i3) {
        str = (i3 & 4) != 0 ? null : str;
        i = (i3 & 16) != 0 ? 0 : i;
        j3 = (i3 & 32) != 0 ? 0L : j3;
        i2 = (i3 & 64) != 0 ? 0 : i2;
        map = (i3 & 128) != 0 ? null : map;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = 0;
        this.LJ = i;
        this.LJFF = j3;
        this.LJI = i2;
        this.LJII = map;
    }
}
