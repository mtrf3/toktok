package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50427Jqh implements InterfaceC63694OzC<C50427Jqh> {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final boolean LJLLI;
    public final String LJLLILLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50427Jqh() {
        /*
            r11 = this;
            r4 = 0
            r1 = 0
            r3 = 4095(0xfff, float:5.738E-42)
            r0 = r11
            r2 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50427Jqh.<init>():void");
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_entrance", this.LJLIL);
        linkedHashMap.put("search_entrance_sub", this.LJLILLLLZI);
        linkedHashMap.put("previous_page", this.LJLJI);
        linkedHashMap.put("should_show_scan_view", Boolean.valueOf(this.LJLJJI));
        linkedHashMap.put("should_show_sug", Boolean.valueOf(this.LJLJJL));
        linkedHashMap.put("is_from_comment", this.LJLJJLL);
        linkedHashMap.put("is_from_video", this.LJLJL);
        linkedHashMap.put("back_press_flag", Integer.valueOf(this.LJLJLLL));
        linkedHashMap.put("feed_search_bar_flag", Integer.valueOf(this.LJLL));
        linkedHashMap.put("keep_tab_position", Boolean.valueOf(this.LJLLI));
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        boolean z = this.LJLJJI;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        boolean z2 = this.LJLJJL;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int LJ2 = (((C79062V1e.LJ(this.LJLJLJ, C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, (i3 + i4) * 31, 31), 31), 31) + this.LJLJLLL) * 31) + this.LJLL) * 31;
        if (!this.LJLLI) {
            i = 0;
        }
        return this.LJLLILLLL.hashCode() + ((LJ2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchCommonState(searchEntrance=");
        sb.append(this.LJLIL);
        sb.append(", searchEntranceSub=");
        sb.append(this.LJLILLLLZI);
        sb.append(", previousPage=");
        sb.append(this.LJLJI);
        sb.append(", shouldShowScanView=");
        sb.append(this.LJLJJI);
        sb.append(", shouldShowSug=");
        sb.append(this.LJLJJL);
        sb.append(", isFromComment=");
        sb.append(this.LJLJJLL);
        sb.append(", isFromVideo=");
        sb.append(this.LJLJL);
        sb.append(", isFromVideoOld=");
        sb.append(this.LJLJLJ);
        sb.append(", backPressFlag=");
        sb.append(this.LJLJLLL);
        sb.append(", feedSearchBarFlag=");
        sb.append(this.LJLL);
        sb.append(", keepTabPosition=");
        sb.append(this.LJLLI);
        sb.append(", sourceId=");
        return C07670Rv.LIZIZ(sb, this.LJLLILLLL, ')');
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50427Jqh)) {
            return false;
        }
        C50427Jqh c50427Jqh = (C50427Jqh) obj;
        if (o.LJ(this.LJLIL, c50427Jqh.LJLIL) && o.LJ(this.LJLILLLLZI, c50427Jqh.LJLILLLLZI) && o.LJ(this.LJLJI, c50427Jqh.LJLJI) && this.LJLJJI == c50427Jqh.LJLJJI && this.LJLJJL == c50427Jqh.LJLJJL && o.LJ(this.LJLJJLL, c50427Jqh.LJLJJLL) && o.LJ(this.LJLJL, c50427Jqh.LJLJL) && o.LJ(this.LJLJLJ, c50427Jqh.LJLJLJ) && this.LJLJLLL == c50427Jqh.LJLJLLL && this.LJLL == c50427Jqh.LJLL && this.LJLLI == c50427Jqh.LJLLI && o.LJ(this.LJLLILLLL, c50427Jqh.LJLLILLLL)) {
            return true;
        }
        return false;
    }

    public static C50427Jqh LIZ(C50427Jqh c50427Jqh, String str, String str2, int i) {
        String previousPage;
        boolean z;
        boolean z2;
        String isFromComment;
        String isFromVideo;
        String isFromVideoOld;
        int i2;
        int i3;
        boolean z3;
        String searchEntrance = str;
        String searchEntranceSub = str2;
        if ((i & 1) != 0) {
            searchEntrance = c50427Jqh.LJLIL;
        }
        if ((i & 2) != 0) {
            searchEntranceSub = c50427Jqh.LJLILLLLZI;
        }
        String sourceId = null;
        if ((i & 4) != 0) {
            previousPage = c50427Jqh.LJLJI;
        } else {
            previousPage = null;
        }
        if ((i & 8) != 0) {
            z = c50427Jqh.LJLJJI;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = c50427Jqh.LJLJJL;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            isFromComment = c50427Jqh.LJLJJLL;
        } else {
            isFromComment = null;
        }
        if ((i & 64) != 0) {
            isFromVideo = c50427Jqh.LJLJL;
        } else {
            isFromVideo = null;
        }
        if ((i & 128) != 0) {
            isFromVideoOld = c50427Jqh.LJLJLJ;
        } else {
            isFromVideoOld = null;
        }
        if ((i & 256) != 0) {
            i2 = c50427Jqh.LJLJLLL;
        } else {
            i2 = 0;
        }
        if ((i & 512) != 0) {
            i3 = c50427Jqh.LJLL;
        } else {
            i3 = 0;
        }
        if ((i & 1024) != 0) {
            z3 = c50427Jqh.LJLLI;
        } else {
            z3 = false;
        }
        if ((i & 2048) != 0) {
            sourceId = c50427Jqh.LJLLILLLL;
        }
        c50427Jqh.getClass();
        o.LJIIIZ(searchEntrance, "searchEntrance");
        o.LJIIIZ(searchEntranceSub, "searchEntranceSub");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(isFromComment, "isFromComment");
        o.LJIIIZ(isFromVideo, "isFromVideo");
        o.LJIIIZ(isFromVideoOld, "isFromVideoOld");
        o.LJIIIZ(sourceId, "sourceId");
        return new C50427Jqh(i2, i3, searchEntrance, searchEntranceSub, previousPage, isFromComment, isFromVideo, isFromVideoOld, sourceId, z, z2, z3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50427Jqh(int r15, int r16, int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            r14 = this;
            r1 = r17
            r13 = r24
            r3 = r16
            r6 = r19
            r4 = r18
            r11 = r23
            r7 = r20
            r8 = r21
            r2 = r15
            r0 = r1 & 1
            if (r0 == 0) goto L17
            java.lang.String r4 = "discovery"
        L17:
            r0 = r1 & 2
            r10 = 0
            java.lang.String r9 = ""
            if (r0 == 0) goto L5f
            r5 = r9
        L1f:
            r0 = r1 & 4
            if (r0 == 0) goto L24
            r6 = r9
        L24:
            r0 = r1 & 8
            if (r0 == 0) goto L29
            r11 = 1
        L29:
            r0 = r1 & 16
            if (r0 == 0) goto L5d
            r12 = 1
        L2e:
            r0 = r1 & 32
            if (r0 == 0) goto L33
            r7 = r9
        L33:
            r0 = r1 & 64
            if (r0 == 0) goto L38
            r8 = r9
        L38:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L5a
        L3c:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L41
            r2 = 0
        L41:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L46
            r3 = 0
        L46:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4b
            r13 = 0
        L4b:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L55
            java.lang.String r0 = "randomUUID().toString()"
            java.lang.String r10 = X.AnonymousClass629.LIZ(r0)
        L55:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L5a:
            r9 = r22
            goto L3c
        L5d:
            r12 = 0
            goto L2e
        L5f:
            r5 = r10
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50427Jqh.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public C50427Jqh(int i, int i2, String searchEntrance, String searchEntranceSub, String previousPage, String isFromComment, String isFromVideo, String isFromVideoOld, String sourceId, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(searchEntrance, "searchEntrance");
        o.LJIIIZ(searchEntranceSub, "searchEntranceSub");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(isFromComment, "isFromComment");
        o.LJIIIZ(isFromVideo, "isFromVideo");
        o.LJIIIZ(isFromVideoOld, "isFromVideoOld");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = searchEntrance;
        this.LJLILLLLZI = searchEntranceSub;
        this.LJLJI = previousPage;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = isFromComment;
        this.LJLJL = isFromVideo;
        this.LJLJLJ = isFromVideoOld;
        this.LJLJLLL = i;
        this.LJLL = i2;
        this.LJLLI = z3;
        this.LJLLILLLL = sourceId;
    }
}
