package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50428Jqi implements InterfaceC63694OzC<C50428Jqi> {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final boolean LJLJLLL;
    public final String LJLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50428Jqi() {
        /*
            r6 = this;
            r1 = 0
            r5 = 1023(0x3ff, float:1.434E-42)
            r0 = r6
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50428Jqi.<init>():void");
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("last_showing_page_index", Integer.valueOf(this.LJLIL));
        linkedHashMap.put("last_show_page_index", Integer.valueOf(this.LJLILLLLZI));
        linkedHashMap.put("launch_schema_string", this.LJLJI);
        linkedHashMap.put("enter_from_second", this.LJLJJI);
        linkedHashMap.put("blank_page_enter_from", this.LJLJJL);
        linkedHashMap.put("blank_page_enter_method", this.LJLJJLL);
        linkedHashMap.put("blank_page_enter_action", this.LJLJL);
        linkedHashMap.put("real_search_word_while_open_search", this.LJLJLJ);
        linkedHashMap.put("is_search_middle_page_cold_launch_key_board_show", Boolean.valueOf(this.LJLJLLL));
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = C79062V1e.LJ(this.LJLJLJ, C79062V1e.LJ(this.LJLJL, C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, ((this.LJLIL * 31) + this.LJLILLLLZI) * 31, 31), 31), 31), 31), 31), 31);
        boolean z = this.LJLJLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLL.hashCode() + ((LJ + i) * 31);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchGlobalState(lastShowingPageIndex=");
        LIZ.append(this.LJLIL);
        LIZ.append(", searchLastShowPageIndex=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", launchSchemaString=");
        LIZ.append(this.LJLJI);
        LIZ.append(", enterFromSecond=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", blankPageEnterFrom=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", blankPageEnterMethod=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", blankPageEnterAction=");
        LIZ.append(this.LJLJL);
        LIZ.append(", realSearchWordWhileOpenSearch=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", isSearchMiddlePageColdLaunchKeyBoardShow=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50428Jqi)) {
            return false;
        }
        C50428Jqi c50428Jqi = (C50428Jqi) obj;
        if (this.LJLIL == c50428Jqi.LJLIL && this.LJLILLLLZI == c50428Jqi.LJLILLLLZI && o.LJ(this.LJLJI, c50428Jqi.LJLJI) && o.LJ(this.LJLJJI, c50428Jqi.LJLJJI) && o.LJ(this.LJLJJL, c50428Jqi.LJLJJL) && o.LJ(this.LJLJJLL, c50428Jqi.LJLJJLL) && o.LJ(this.LJLJL, c50428Jqi.LJLJL) && o.LJ(this.LJLJLJ, c50428Jqi.LJLJLJ) && this.LJLJLLL == c50428Jqi.LJLJLLL && o.LJ(this.LJLL, c50428Jqi.LJLL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50428Jqi(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17) {
        /*
            r12 = this;
            r1 = r17
            r8 = r15
            r3 = r13
            r7 = r14
            r0 = r1 & 1
            r2 = 0
            if (r0 == 0) goto L47
            r4 = -1
        Lb:
            r6 = 0
            r0 = r1 & 4
            java.lang.String r10 = ""
            if (r0 == 0) goto L13
            r3 = r10
        L13:
            r0 = r1 & 8
            r11 = 0
            if (r0 == 0) goto L45
            r5 = r10
        L19:
            r0 = r1 & 16
            if (r0 == 0) goto L1e
            r7 = r10
        L1e:
            r0 = r1 & 32
            if (r0 == 0) goto L23
            r8 = r10
        L23:
            r0 = r1 & 64
            if (r0 == 0) goto L43
            r9 = r10
        L28:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L40
        L2c:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L31
            r2 = 1
        L31:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "randomUUID().toString()"
            java.lang.String r11 = X.AnonymousClass629.LIZ(r0)
        L3b:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L40:
            r10 = r16
            goto L2c
        L43:
            r9 = r11
            goto L28
        L45:
            r5 = r11
            goto L19
        L47:
            r4 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50428Jqi.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public static C50428Jqi LIZ(C50428Jqi c50428Jqi, int i, int i2, String str, String str2, String str3, boolean z, int i3) {
        String launchSchemaString;
        String enterFromSecond;
        String realSearchWordWhileOpenSearch;
        int i4 = i2;
        int i5 = i;
        String blankPageEnterFrom = str;
        String blankPageEnterMethod = str2;
        String blankPageEnterAction = str3;
        boolean z2 = z;
        if ((i3 & 1) != 0) {
            i5 = c50428Jqi.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i4 = c50428Jqi.LJLILLLLZI;
        }
        String sourceId = null;
        if ((i3 & 4) != 0) {
            launchSchemaString = c50428Jqi.LJLJI;
        } else {
            launchSchemaString = null;
        }
        if ((i3 & 8) != 0) {
            enterFromSecond = c50428Jqi.LJLJJI;
        } else {
            enterFromSecond = null;
        }
        if ((i3 & 16) != 0) {
            blankPageEnterFrom = c50428Jqi.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            blankPageEnterMethod = c50428Jqi.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            blankPageEnterAction = c50428Jqi.LJLJL;
        }
        if ((i3 & 128) != 0) {
            realSearchWordWhileOpenSearch = c50428Jqi.LJLJLJ;
        } else {
            realSearchWordWhileOpenSearch = null;
        }
        if ((i3 & 256) != 0) {
            z2 = c50428Jqi.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            sourceId = c50428Jqi.LJLL;
        }
        c50428Jqi.getClass();
        o.LJIIIZ(launchSchemaString, "launchSchemaString");
        o.LJIIIZ(enterFromSecond, "enterFromSecond");
        o.LJIIIZ(blankPageEnterFrom, "blankPageEnterFrom");
        o.LJIIIZ(blankPageEnterMethod, "blankPageEnterMethod");
        o.LJIIIZ(blankPageEnterAction, "blankPageEnterAction");
        o.LJIIIZ(realSearchWordWhileOpenSearch, "realSearchWordWhileOpenSearch");
        o.LJIIIZ(sourceId, "sourceId");
        return new C50428Jqi(z2, launchSchemaString, i5, enterFromSecond, i4, blankPageEnterFrom, blankPageEnterMethod, blankPageEnterAction, realSearchWordWhileOpenSearch, sourceId);
    }

    public C50428Jqi(boolean z, String launchSchemaString, int i, String enterFromSecond, int i2, String blankPageEnterFrom, String blankPageEnterMethod, String blankPageEnterAction, String realSearchWordWhileOpenSearch, String sourceId) {
        o.LJIIIZ(launchSchemaString, "launchSchemaString");
        o.LJIIIZ(enterFromSecond, "enterFromSecond");
        o.LJIIIZ(blankPageEnterFrom, "blankPageEnterFrom");
        o.LJIIIZ(blankPageEnterMethod, "blankPageEnterMethod");
        o.LJIIIZ(blankPageEnterAction, "blankPageEnterAction");
        o.LJIIIZ(realSearchWordWhileOpenSearch, "realSearchWordWhileOpenSearch");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = launchSchemaString;
        this.LJLJJI = enterFromSecond;
        this.LJLJJL = blankPageEnterFrom;
        this.LJLJJLL = blankPageEnterMethod;
        this.LJLJL = blankPageEnterAction;
        this.LJLJLJ = realSearchWordWhileOpenSearch;
        this.LJLJLLL = z;
        this.LJLL = sourceId;
    }
}
