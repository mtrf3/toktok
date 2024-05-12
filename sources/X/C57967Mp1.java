package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mp1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57967Mp1 {
    public final EnumC57876MnY LIZ;
    public final String LIZIZ;
    public final List<EnumC58046MqI> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57967Mp1() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r7 = 255(0xff, float:3.57E-43)
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57967Mp1.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57967Mp1)) {
            return false;
        }
        C57967Mp1 c57967Mp1 = (C57967Mp1) obj;
        return this.LIZ == c57967Mp1.LIZ && o.LJ(this.LIZIZ, c57967Mp1.LIZIZ) && o.LJ(this.LIZJ, c57967Mp1.LIZJ) && o.LJ(this.LIZLLL, c57967Mp1.LIZLLL) && o.LJ(this.LJ, c57967Mp1.LJ) && this.LJFF == c57967Mp1.LJFF && this.LJI == c57967Mp1.LJI && this.LJII == c57967Mp1.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        List<EnumC58046MqI> list = this.LIZJ;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i4 = (((((i3 + i) * 31) + this.LJFF) * 31) + this.LJI) * 31;
        boolean z = this.LJII;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MafRequestParams(scene=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageToken=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", platform=");
        LIZ.append(this.LIZJ);
        LIZ.append(", targetUserId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", secTargetUserId=");
        LIZ.append(this.LJ);
        LIZ.append(", maxCount=");
        LIZ.append(this.LJFF);
        LIZ.append(", newMafCount=");
        LIZ.append(this.LJI);
        LIZ.append(", isFetchAfterAuth=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C57967Mp1(X.EnumC57876MnY r10, java.util.List r11, java.lang.String r12, java.lang.String r13, int r14, int r15, int r16) {
        /*
            r9 = this;
            r7 = r15
            r6 = r14
            r4 = r12
            r1 = r10
            r3 = r11
            r0 = r16 & 1
            if (r0 == 0) goto Lb
            X.MnY r1 = X.EnumC57876MnY.FIND_FRIENDS
        Lb:
            r0 = r16 & 2
            r5 = 0
            if (r0 == 0) goto L33
            java.lang.String r2 = ""
        L12:
            r0 = r16 & 4
            if (r0 == 0) goto L17
            r3 = r5
        L17:
            r0 = r16 & 8
            if (r0 == 0) goto L1c
            r4 = r5
        L1c:
            r0 = r16 & 16
            if (r0 == 0) goto L31
        L20:
            r0 = r16 & 32
            if (r0 == 0) goto L26
            r6 = 20
        L26:
            r0 = r16 & 64
            if (r0 == 0) goto L2b
            r7 = 0
        L2b:
            r8 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L31:
            r5 = r13
            goto L20
        L33:
            r2 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57967Mp1.<init>(X.MnY, java.util.List, java.lang.String, java.lang.String, int, int, int):void");
    }

    public static C57967Mp1 LIZ(C57967Mp1 c57967Mp1, String str, List list, String str2, String str3, boolean z, int i) {
        EnumC57876MnY scene;
        int i2;
        int i3;
        boolean z2 = z;
        String str4 = str3;
        String str5 = str2;
        String pageToken = str;
        List list2 = list;
        if ((i & 1) != 0) {
            scene = c57967Mp1.LIZ;
        } else {
            scene = null;
        }
        if ((i & 2) != 0) {
            pageToken = c57967Mp1.LIZIZ;
        }
        if ((i & 4) != 0) {
            list2 = c57967Mp1.LIZJ;
        }
        if ((i & 8) != 0) {
            str5 = c57967Mp1.LIZLLL;
        }
        if ((i & 16) != 0) {
            str4 = c57967Mp1.LJ;
        }
        if ((i & 32) != 0) {
            i2 = c57967Mp1.LJFF;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            i3 = c57967Mp1.LJI;
        } else {
            i3 = 0;
        }
        if ((i & 128) != 0) {
            z2 = c57967Mp1.LJII;
        }
        c57967Mp1.getClass();
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(pageToken, "pageToken");
        return new C57967Mp1(scene, pageToken, list2, str5, str4, i2, i3, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57967Mp1(EnumC57876MnY scene, String pageToken, List<? extends EnumC58046MqI> list, String str, String str2, int i, int i2, boolean z) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(pageToken, "pageToken");
        this.LIZ = scene;
        this.LIZIZ = pageToken;
        this.LIZJ = list;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = z;
    }
}
