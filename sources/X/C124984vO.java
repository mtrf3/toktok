package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.4vO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124984vO {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C124984vO)) {
            return false;
        }
        C124984vO c124984vO = (C124984vO) obj;
        return o.LJ(this.LIZ, c124984vO.LIZ) && this.LIZIZ == c124984vO.LIZIZ && o.LJ(this.LIZJ, c124984vO.LIZJ) && this.LIZLLL == c124984vO.LIZLLL && this.LJ == c124984vO.LJ && o.LJ(this.LJFF, c124984vO.LJFF) && o.LJ(this.LJI, c124984vO.LJI) && o.LJ(this.LJII, c124984vO.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31, 31), 31);
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LIZJ + i) * 31;
        String str = this.LJFF;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str3 = this.LJII;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransitionParam(tabName=");
        LIZ.append(this.LIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", transition=");
        LIZ.append(this.LIZJ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isOverlap=");
        LIZ.append(this.LJ);
        LIZ.append(", effectId=");
        LIZ.append(this.LJFF);
        LIZ.append(", transitionName=");
        LIZ.append(this.LJI);
        LIZ.append(", resourceId=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C124984vO(int r11, int r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            r10 = this;
            r6 = r17
            r9 = r18
            r0 = r12 & 16
            if (r0 == 0) goto L9
            r9 = 1
        L9:
            r5 = 0
            r0 = r12 & 64
            if (r0 == 0) goto Lf
            r6 = r5
        Lf:
            r4 = r16
            r0 = r10
            r7 = r11
            r1 = r13
            r3 = r15
            r8 = r5
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124984vO.<init>(int, int, long, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public C124984vO(long j, String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = z;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
    }
}
