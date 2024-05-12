package X;

import android.os.SystemClock;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.6qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173166qu {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;
    public long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C173166qu() {
        /*
            r2 = this;
            r1 = 0
            r0 = 127(0x7f, float:1.78E-43)
            r2.<init>(r1, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173166qu.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C173166qu)) {
            return false;
        }
        C173166qu c173166qu = (C173166qu) obj;
        return this.LIZ == c173166qu.LIZ && this.LIZIZ == c173166qu.LIZIZ && o.LJ(this.LIZJ, c173166qu.LIZJ) && this.LIZLLL == c173166qu.LIZLLL && o.LJ(this.LJ, c173166qu.LJ) && o.LJ(this.LJFF, c173166qu.LJFF) && o.LJ(this.LJI, c173166qu.LJI);
    }

    public final C173166qu LIZ() {
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        return new C173166qu(this.LIZLLL, i, this.LIZJ, this.LJ, this.LJFF, this.LJI, i2);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZLLL, (i + hashCode) * 31, 31);
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (LIZJ + hashCode2) * 31;
        String str3 = this.LJFF;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.LJI;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i4 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MvPerformanceMobParams(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", creationId=");
        LIZ.append(this.LJ);
        LIZ.append(", shootWay=");
        LIZ.append(this.LJFF);
        LIZ.append(", mvId=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public final void LIZIZ(long j) {
        this.LIZLLL = SystemClock.elapsedRealtime() - j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C173166qu(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            r5 = r10
            r6 = r11
            r3 = 0
            r0 = r13 & 4
            java.lang.String r7 = ""
            if (r0 == 0) goto L22
            r4 = r7
        La:
            r0 = r13 & 16
            if (r0 == 0) goto Lf
            r5 = r7
        Lf:
            r0 = r13 & 32
            if (r0 == 0) goto L14
            r6 = r7
        L14:
            r0 = r13 & 64
            if (r0 == 0) goto L20
        L18:
            r1 = 0
            r0 = r9
            r8 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return
        L20:
            r7 = r12
            goto L18
        L22:
            r4 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173166qu.<init>(java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public C173166qu(long j, int i, String str, String str2, String str3, String str4, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
