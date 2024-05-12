package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mmd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57819Mmd {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57819Mmd() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r7 = 8191(0x1fff, float:1.1478E-41)
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57819Mmd.<init>():void");
    }

    public final java.util.Map<String, String> LIZLLL() {
        String str;
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", this.LIZ));
        if (this.LIZJ.length() > 0) {
            LJJLIIIIJ.put("previous_page", this.LIZJ);
        }
        if (this.LIZIZ.length() > 0) {
            LJJLIIIIJ.put("enter_method", this.LIZIZ);
        }
        if (this.LIZLLL.length() > 0) {
            LJJLIIIIJ.put("homepage_uid", this.LIZLLL);
        }
        if (this.LJIIIIZZ.length() > 0) {
            LJJLIIIIJ.put("author_id", this.LJIIIIZZ);
        }
        if (this.LJFF.length() > 0) {
            LJJLIIIIJ.put("position", this.LJFF);
        }
        if (this.LJIIIZ.length() > 0) {
            LJJLIIIIJ.put("source_page", this.LJIIIZ);
        }
        if (C78685UuP.LJJJZ(this.LJIIJ) && (str = this.LJIIJ) != null) {
            LJJLIIIIJ.put("search_id", str);
        }
        return LJJLIIIIJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57819Mmd)) {
            return false;
        }
        C57819Mmd c57819Mmd = (C57819Mmd) obj;
        return o.LJ(this.LIZ, c57819Mmd.LIZ) && o.LJ(this.LIZIZ, c57819Mmd.LIZIZ) && o.LJ(this.LIZJ, c57819Mmd.LIZJ) && o.LJ(this.LIZLLL, c57819Mmd.LIZLLL) && this.LJ == c57819Mmd.LJ && o.LJ(this.LJFF, c57819Mmd.LJFF) && this.LJI == c57819Mmd.LJI && this.LJII == c57819Mmd.LJII && o.LJ(this.LJIIIIZZ, c57819Mmd.LJIIIIZZ) && o.LJ(this.LJIIIZ, c57819Mmd.LJIIIZ) && o.LJ(this.LJIIJ, c57819Mmd.LJIIJ) && o.LJ(this.LJIIJJI, c57819Mmd.LJIIJJI) && o.LJ(this.LJIIL, c57819Mmd.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
        boolean z = this.LJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJFF, (LJ + i2) * 31, 31);
        if (!this.LJI) {
            i = 0;
        }
        int LJ3 = C79062V1e.LJ(this.LJIIIZ, C79062V1e.LJ(this.LJIIIIZZ, (((LJ2 + i) * 31) + this.LJII) * 31, 31), 31);
        String str = this.LJIIJ;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (LJ3 + hashCode) * 31;
        String str2 = this.LJIIJJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str3 = this.LJIIL;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackerConfig(enterFrom=");
        sb.append(this.LIZ);
        sb.append(", enterMethod=");
        sb.append(this.LIZIZ);
        sb.append(", previousPage=");
        sb.append(this.LIZJ);
        sb.append(", homepageUid=");
        sb.append(this.LIZLLL);
        sb.append(", isFromPopup=");
        sb.append(this.LJ);
        sb.append(", position=");
        sb.append(this.LJFF);
        sb.append(", useVShot=");
        sb.append(this.LJI);
        sb.append(", followFrom=");
        sb.append(this.LJII);
        sb.append(", authorId=");
        sb.append(this.LJIIIIZZ);
        sb.append(", sourcePage=");
        sb.append(this.LJIIIZ);
        sb.append(", searchId=");
        sb.append(this.LJIIJ);
        sb.append(", searchResultId=");
        sb.append(this.LJIIJJI);
        sb.append(", searchKeyWord=");
        return C07670Rv.LIZIZ(sb, this.LJIIL, ')');
    }

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('-');
        LIZ.append(this.LIZIZ);
        LIZ.append('-');
        LIZ.append(this.LJFF);
        LIZ.append('-');
        LIZ.append(this.LIZLLL);
        LIZ.append('-');
        LIZ.append(this.LIZJ);
        LIZ.append('-');
        LIZ.append(this.LJ);
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZJ(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LIZJ = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C57819Mmd(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, int r23) {
        /*
            r16 = this;
            r2 = r23
            r4 = r18
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r0 = r2 & 1
            java.lang.String r12 = ""
            if (r0 == 0) goto L15
            r3 = r12
        L15:
            r0 = r2 & 2
            if (r0 == 0) goto L1a
            r4 = r12
        L1a:
            r0 = r2 & 4
            if (r0 == 0) goto L1f
            r5 = r12
        L1f:
            r0 = r2 & 8
            if (r0 == 0) goto L24
            r6 = r12
        L24:
            r0 = r2 & 16
            if (r0 == 0) goto L29
            r7 = 0
        L29:
            r0 = r2 & 32
            if (r0 == 0) goto L2e
            r8 = r12
        L2e:
            r9 = 0
            r0 = r2 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L45
            r11 = r12
        L35:
            r0 = r2 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L43
        L39:
            r13 = 0
            r2 = r16
            r10 = r9
            r14 = r13
            r15 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L43:
            r12 = r1
            goto L39
        L45:
            r11 = r1
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57819Mmd.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int):void");
    }

    public static C57819Mmd LIZ(C57819Mmd c57819Mmd, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String enterMethod;
        String previousPage;
        boolean z;
        String position;
        boolean z2;
        int i2;
        String enterFrom = str;
        String authorId = str3;
        String homepageUid = str2;
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        if ((i & 1) != 0) {
            enterFrom = c57819Mmd.LIZ;
        }
        String sourcePage = null;
        if ((i & 2) != 0) {
            enterMethod = c57819Mmd.LIZIZ;
        } else {
            enterMethod = null;
        }
        if ((i & 4) != 0) {
            previousPage = c57819Mmd.LIZJ;
        } else {
            previousPage = null;
        }
        if ((i & 8) != 0) {
            homepageUid = c57819Mmd.LIZLLL;
        }
        if ((i & 16) != 0) {
            z = c57819Mmd.LJ;
        } else {
            z = false;
        }
        if ((i & 32) != 0) {
            position = c57819Mmd.LJFF;
        } else {
            position = null;
        }
        if ((i & 64) != 0) {
            z2 = c57819Mmd.LJI;
        } else {
            z2 = false;
        }
        if ((i & 128) != 0) {
            i2 = c57819Mmd.LJII;
        } else {
            i2 = 0;
        }
        if ((i & 256) != 0) {
            authorId = c57819Mmd.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            sourcePage = c57819Mmd.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            str7 = c57819Mmd.LJIIJ;
        }
        if ((i & 2048) != 0) {
            str8 = c57819Mmd.LJIIJJI;
        }
        if ((i & 4096) != 0) {
            str9 = c57819Mmd.LJIIL;
        }
        c57819Mmd.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(homepageUid, "homepageUid");
        o.LJIIIZ(position, "position");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(sourcePage, "sourcePage");
        return new C57819Mmd(enterFrom, enterMethod, previousPage, homepageUid, z, position, z2, i2, authorId, sourcePage, str7, str8, str9);
    }

    public C57819Mmd(String enterFrom, String enterMethod, String previousPage, String homepageUid, boolean z, String position, boolean z2, int i, String authorId, String sourcePage, String str, String str2, String str3) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(homepageUid, "homepageUid");
        o.LJIIIZ(position, "position");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(sourcePage, "sourcePage");
        this.LIZ = enterFrom;
        this.LIZIZ = enterMethod;
        this.LIZJ = previousPage;
        this.LIZLLL = homepageUid;
        this.LJ = z;
        this.LJFF = position;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = authorId;
        this.LJIIIZ = sourcePage;
        this.LJIIJ = str;
        this.LJIIJJI = str2;
        this.LJIIL = str3;
    }
}
