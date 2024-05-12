package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LgE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54874LgE {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final double LJ;
    public final int LJFF;
    public final String LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54874LgE)) {
            return false;
        }
        C54874LgE c54874LgE = (C54874LgE) obj;
        return this.LIZ == c54874LgE.LIZ && this.LIZIZ == c54874LgE.LIZIZ && o.LJ(this.LIZJ, c54874LgE.LIZJ) && this.LIZLLL == c54874LgE.LIZLLL && Double.compare(this.LJ, c54874LgE.LJ) == 0 && this.LJFF == c54874LgE.LJFF && o.LJ(this.LJI, c54874LgE.LJI) && this.LJII == c54874LgE.LJII && o.LJ(this.LJIIIIZZ, c54874LgE.LJIIIIZZ) && this.LJIIIZ == c54874LgE.LJIIIZ && o.LJ(this.LJIIJ, c54874LgE.LJIIJ) && o.LJ(this.LJIIJJI, c54874LgE.LJIIJJI);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = (C1JX.LIZIZ(this.LJ, (((i + hashCode) * 31) + this.LIZLLL) * 31, 31) + this.LJFF) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJII, (LIZIZ + hashCode2) * 31, 31);
        String str3 = this.LJIIIIZZ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (((LIZJ + hashCode3) * 31) + this.LJIIIZ) * 31;
        String str4 = this.LJIIJ;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Integer num = this.LJIIJJI;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i4 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyApiParam(type=");
        sb.append(this.LIZ);
        sb.append(", count=");
        sb.append(this.LIZIZ);
        sb.append(", awemeId=");
        sb.append(this.LIZJ);
        sb.append(", pullType=");
        sb.append(this.LIZLLL);
        sb.append(", volume=");
        sb.append(this.LJ);
        sb.append(", sp=");
        sb.append(this.LJFF);
        sb.append(", manualCityCode=");
        sb.append(this.LJI);
        sb.append(", cursor=");
        sb.append(this.LJII);
        sb.append(", cardInsert=");
        sb.append(this.LJIIIIZZ);
        sb.append(", pageNum=");
        sb.append(this.LJIIIZ);
        sb.append(", landingAwemeIds=");
        sb.append(this.LJIIJ);
        sb.append(", landingAwemePosition=");
        return UC7.LIZ(sb, this.LJIIJJI, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C54874LgE(int r17, double r18, int r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24, java.lang.Integer r25, int r26) {
        /*
            r16 = this;
            r12 = r22
            r9 = r21
            r13 = r23
            r14 = r24
            r15 = r25
            r2 = 7
            r3 = 6
            r4 = 0
            r1 = r26
            r0 = r1 & 64
            if (r0 == 0) goto L14
            r9 = r4
        L14:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3a
            r10 = 1
        L1a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L1f
            r12 = r4
        L1f:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L24
            r13 = 0
        L24:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L29
            r14 = r4
        L29:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L2e
            r15 = r4
        L2e:
            r8 = r20
            r6 = r18
            r1 = r16
            r5 = r17
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r12, r13, r14, r15)
            return
        L3a:
            r10 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54874LgE.<init>(int, double, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, int):void");
    }

    public C54874LgE(int i, int i2, String str, int i3, double d, int i4, String str2, long j, String str3, int i5, String str4, Integer num) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = i3;
        this.LJ = d;
        this.LJFF = i4;
        this.LJI = str2;
        this.LJII = j;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = i5;
        this.LJIIJ = str4;
        this.LJIIJJI = num;
    }
}
