package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JhS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49854JhS {
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final InterfaceC88471Ynr<? super String, ? super List<String>, ? extends List<String>> LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final InterfaceC49868Jhg LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C49854JhS() {
        /*
            r9 = this;
            r1 = 0
            r8 = 4095(0xfff, float:5.738E-42)
            r0 = r9
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49854JhS.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49854JhS)) {
            return false;
        }
        C49854JhS c49854JhS = (C49854JhS) obj;
        return this.LIZ == c49854JhS.LIZ && this.LIZIZ == c49854JhS.LIZIZ && this.LIZJ == c49854JhS.LIZJ && this.LIZLLL == c49854JhS.LIZLLL && o.LJ(this.LJ, c49854JhS.LJ) && this.LJFF == c49854JhS.LJFF && this.LJI == c49854JhS.LJI && this.LJII == c49854JhS.LJII && this.LJIIIIZZ == c49854JhS.LJIIIIZZ && this.LJIIIZ == c49854JhS.LJIIIZ && this.LJIIJ == c49854JhS.LJIIJ && o.LJ(this.LJIIJJI, c49854JhS.LJIIJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (((((i + i2) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        InterfaceC88471Ynr<? super String, ? super List<String>, ? extends List<String>> interfaceC88471Ynr = this.LJ;
        int hashCode = (i3 + (interfaceC88471Ynr == null ? 0 : interfaceC88471Ynr.hashCode())) * 31;
        ?? r03 = this.LJFF;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        ?? r04 = this.LJI;
        int i6 = r04;
        if (r04 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r05 = this.LJII;
        int i8 = r05;
        if (r05 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r06 = this.LJIIIIZZ;
        int i10 = r06;
        if (r06 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r07 = this.LJIIIZ;
        int i12 = r07;
        if (r07 != 0) {
            i12 = 1;
        }
        return this.LJIIJJI.hashCode() + ((((i11 + i12) * 31) + (this.LJIIJ ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{innerStreamCount : ");
        LIZ.append(this.LIZJ);
        LIZ.append(", selfCount : ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", writeBackDescending : ");
        LIZ.append(this.LJFF);
        LIZ.append(", writeBackAscending : ");
        return C19U.LIZ(LIZ, this.LJI, ", }", LIZ);
    }

    public static C49854JhS LIZ(C49854JhS c49854JhS) {
        boolean z = c49854JhS.LIZ;
        boolean z2 = c49854JhS.LIZIZ;
        int i = c49854JhS.LIZJ;
        int i2 = c49854JhS.LIZLLL;
        InterfaceC88471Ynr<? super String, ? super List<String>, ? extends List<String>> interfaceC88471Ynr = c49854JhS.LJ;
        boolean z3 = c49854JhS.LJFF;
        boolean z4 = c49854JhS.LJI;
        boolean z5 = c49854JhS.LJII;
        boolean z6 = c49854JhS.LJIIIIZZ;
        boolean z7 = c49854JhS.LJIIIZ;
        boolean z8 = c49854JhS.LJIIJ;
        InterfaceC49868Jhg loadMoreDelegate = c49854JhS.LJIIJJI;
        c49854JhS.getClass();
        o.LJIIIZ(loadMoreDelegate, "loadMoreDelegate");
        return new C49854JhS(z, z2, i, i2, interfaceC88471Ynr, z3, z4, z5, z6, z7, z8, loadMoreDelegate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C49854JhS(boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, int r22) {
        /*
            r14 = this;
            r1 = r22
            r11 = r21
            r3 = r16
            r2 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r0 = r1 & 1
            if (r0 == 0) goto L14
            r2 = 1
        L14:
            r0 = r1 & 2
            if (r0 == 0) goto L19
            r3 = 0
        L19:
            r0 = r1 & 4
            if (r0 == 0) goto L50
            r4 = 2
        L1e:
            r0 = r1 & 8
            if (r0 == 0) goto L4e
            r5 = 1
        L23:
            r6 = 0
            r0 = r1 & 32
            if (r0 == 0) goto L29
            r7 = 0
        L29:
            r0 = r1 & 64
            if (r0 == 0) goto L2e
            r8 = 0
        L2e:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L33
            r9 = 1
        L33:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L38
            r10 = 1
        L38:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3d
            r11 = 1
        L3d:
            r12 = 0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L4c
            X.UyQ r13 = new X.UyQ
            r13.<init>()
        L47:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L4c:
            r13 = 0
            goto L47
        L4e:
            r5 = 0
            goto L23
        L50:
            r4 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49854JhS.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, int):void");
    }

    public C49854JhS(boolean z, boolean z2, int i, int i2, InterfaceC88471Ynr<? super String, ? super List<String>, ? extends List<String>> interfaceC88471Ynr, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, InterfaceC49868Jhg loadMoreDelegate) {
        o.LJIIIZ(loadMoreDelegate, "loadMoreDelegate");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = interfaceC88471Ynr;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
        this.LJIIIIZZ = z6;
        this.LJIIIZ = z7;
        this.LJIIJ = z8;
        this.LJIIJJI = loadMoreDelegate;
    }
}
