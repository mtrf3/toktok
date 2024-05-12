package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MnO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57866MnO {
    public EnumC57876MnY LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public List<? extends EnumC58046MqI> LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public final EnumC57870MnS LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public final boolean LJIIL;
    public EnumC57870MnS LJIILIIL;
    public Boolean LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;

    public C57866MnO() {
        this(null, 131071);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57866MnO)) {
            return false;
        }
        C57866MnO c57866MnO = (C57866MnO) obj;
        return this.LIZ == c57866MnO.LIZ && this.LIZIZ == c57866MnO.LIZIZ && this.LIZJ == c57866MnO.LIZJ && this.LIZLLL == c57866MnO.LIZLLL && o.LJ(this.LJ, c57866MnO.LJ) && o.LJ(this.LJFF, c57866MnO.LJFF) && o.LJ(this.LJI, c57866MnO.LJI) && this.LJII == c57866MnO.LJII && this.LJIIIIZZ == c57866MnO.LJIIIIZZ && o.LJ(this.LJIIIZ, c57866MnO.LJIIIZ) && this.LJIIJ == c57866MnO.LJIIJ && o.LJ(this.LJIIJJI, c57866MnO.LJIIJJI) && this.LJIIL == c57866MnO.LJIIL && this.LJIILIIL == c57866MnO.LJIILIIL && o.LJ(this.LJIILJJIL, c57866MnO.LJIILJJIL) && this.LJIILL == c57866MnO.LJIILL && this.LJIILLIIL == c57866MnO.LJIILLIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJ, ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31, 31);
        String str = this.LJFF;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.LJII;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        EnumC57870MnS enumC57870MnS = this.LJIIIIZZ;
        if (enumC57870MnS == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = enumC57870MnS.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        String str3 = this.LJIIIZ;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        boolean z2 = this.LJIIJ;
        int i9 = z2;
        if (z2 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        String str4 = this.LJIIJJI;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i11 = (i10 + hashCode5) * 31;
        boolean z3 = this.LJIIL;
        int i12 = z3;
        if (z3 != 0) {
            i12 = 1;
        }
        int hashCode6 = (this.LJIILIIL.hashCode() + ((i11 + i12) * 31)) * 31;
        Boolean bool = this.LJIILJJIL;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i13 = (((hashCode6 + i) * 31) + this.LJIILL) * 31;
        if (!this.LJIILLIIL) {
            i4 = 0;
        }
        return i13 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiConfig(mafScene=");
        sb.append(this.LIZ);
        sb.append(", maxRequestCount=");
        sb.append(this.LIZIZ);
        sb.append(", fetchCount=");
        sb.append(this.LIZJ);
        sb.append(", limitSize=");
        sb.append(this.LIZLLL);
        sb.append(", authPlatforms=");
        sb.append(this.LJ);
        sb.append(", targetUserId=");
        sb.append(this.LJFF);
        sb.append(", secTargetUserId=");
        sb.append(this.LJI);
        sb.append(", useStorageData=");
        sb.append(this.LJII);
        sb.append(", mafUserType=");
        sb.append(this.LJIIIIZZ);
        sb.append(", shareSourceKey=");
        sb.append(this.LJIIIZ);
        sb.append(", persistentSource=");
        sb.append(this.LJIIJ);
        sb.append(", shareRelatedSourceKey=");
        sb.append(this.LJIIJJI);
        sb.append(", forceCleanSource=");
        sb.append(this.LJIIL);
        sb.append(", recMoreType=");
        sb.append(this.LJIILIIL);
        sb.append(", suppressRefreshError=");
        sb.append(this.LJIILJJIL);
        sb.append(", newMafCount=");
        sb.append(this.LJIILL);
        sb.append(", isAfterAuth=");
        return C08880Wm.LIZJ(sb, this.LJIILLIIL, ')');
    }

    public final void LIZ(EnumC57876MnY enumC57876MnY) {
        o.LJIIIZ(enumC57876MnY, "<set-?>");
        this.LIZ = enumC57876MnY;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57866MnO(X.EnumC57876MnY r20, int r21) {
        /*
            r19 = this;
            r2 = r20
            r1 = r21
            r0 = r1 & 1
            if (r0 == 0) goto La
            X.MnY r2 = X.EnumC57876MnY.AFTER_PERMISSION_POP_UP
        La:
            r0 = r1 & 2
            if (r0 == 0) goto L51
            r3 = 2147483647(0x7fffffff, float:NaN)
        L11:
            r0 = r1 & 4
            if (r0 == 0) goto L4f
            r4 = 30
        L17:
            r0 = r1 & 8
            if (r0 == 0) goto L4d
            r5 = 2147483647(0x7fffffff, float:NaN)
        L1e:
            r0 = r1 & 16
            r15 = 0
            if (r0 == 0) goto L4b
            X.OQg r6 = X.C61878OQg.INSTANCE
        L25:
            r7 = 0
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L49
            r9 = 1
        L2b:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L47
            r14 = 1
        L30:
            r0 = r1 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L36
            X.MnS r15 = X.EnumC57870MnS.RECOMMEND_MORE
        L36:
            r12 = 0
            r1 = r19
            r8 = r7
            r10 = r7
            r11 = r7
            r13 = r7
            r16 = r7
            r17 = r12
            r18 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L47:
            r14 = 0
            goto L30
        L49:
            r9 = 0
            goto L2b
        L4b:
            r6 = r15
            goto L25
        L4d:
            r5 = 0
            goto L1e
        L4f:
            r4 = 0
            goto L17
        L51:
            r3 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57866MnO.<init>(X.MnY, int):void");
    }

    public C57866MnO(EnumC57876MnY mafScene, int i, int i2, int i3, List<? extends EnumC58046MqI> authPlatforms, String str, String str2, boolean z, EnumC57870MnS enumC57870MnS, String str3, boolean z2, String str4, boolean z3, EnumC57870MnS recMoreType, Boolean bool, int i4, boolean z4) {
        o.LJIIIZ(mafScene, "mafScene");
        o.LJIIIZ(authPlatforms, "authPlatforms");
        o.LJIIIZ(recMoreType, "recMoreType");
        this.LIZ = mafScene;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = authPlatforms;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = z;
        this.LJIIIIZZ = enumC57870MnS;
        this.LJIIIZ = str3;
        this.LJIIJ = z2;
        this.LJIIJJI = str4;
        this.LJIIL = z3;
        this.LJIILIIL = recMoreType;
        this.LJIILJJIL = bool;
        this.LJIILL = i4;
        this.LJIILLIIL = z4;
    }
}
