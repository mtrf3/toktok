package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import kotlin.jvm.internal.o;

/* renamed from: X.Jn3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50201Jn3 implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final EnumC50200Jn2 LJLJJI;
    public final C50214JnG LJLJJL;
    public final int LJLJJLL;
    public final C50202Jn4 LJLJL;
    public final int LJLJLJ;
    public final boolean LJLJLLL;
    public final C43I<SearchLabel> LJLL;
    public final C43I<Boolean> LJLLI;
    public final C43I<DynamicPatch> LJLLILLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C50201Jn3() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50201Jn3)) {
            return false;
        }
        C50201Jn3 c50201Jn3 = (C50201Jn3) obj;
        return o.LJ(this.LJLIL, c50201Jn3.LJLIL) && o.LJ(this.LJLILLLLZI, c50201Jn3.LJLILLLLZI) && o.LJ(this.LJLJI, c50201Jn3.LJLJI) && this.LJLJJI == c50201Jn3.LJLJJI && o.LJ(this.LJLJJL, c50201Jn3.LJLJJL) && this.LJLJJLL == c50201Jn3.LJLJJLL && o.LJ(this.LJLJL, c50201Jn3.LJLJL) && this.LJLJLJ == c50201Jn3.LJLJLJ && this.LJLJLLL == c50201Jn3.LJLJLLL && o.LJ(this.LJLL, c50201Jn3.LJLL) && o.LJ(this.LJLLI, c50201Jn3.LJLLI) && o.LJ(this.LJLLILLLL, c50201Jn3.LJLLILLLL);
    }

    public final String toString() {
        return "SearchHubHeaderState(keyword=" + this.LJLIL + ", title=" + this.LJLILLLLZI + ", subtitle=" + this.LJLJI + ", style=" + this.LJLJJI + ", picture=" + this.LJLJJL + ", selectedIndex=" + this.LJLJJLL + ", searchHubTabs=" + this.LJLJL + ", tabsHeight=" + this.LJLJLJ + ", isLoadingLockOn=" + this.LJLJLLL + ", switchTabEvent=" + this.LJLL + ", sameTabsJustRefreshEvent=" + this.LJLLI + ", lynxDataChangeEvent=" + this.LJLLILLLL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        String str = this.LJLJI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.LJLJJI.hashCode() + ((LJ + hashCode) * 31)) * 31;
        C50214JnG c50214JnG = this.LJLJJL;
        if (c50214JnG != null) {
            i = c50214JnG.hashCode();
        }
        int hashCode3 = (((this.LJLJL.hashCode() + ((((hashCode2 + i) * 31) + this.LJLJJLL) * 31)) * 31) + this.LJLJLJ) * 31;
        boolean z = this.LJLJLLL;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.LJLLILLLL.hashCode() + C40328FsC.LIZIZ(this.LJLLI, C40328FsC.LIZIZ(this.LJLL, (hashCode3 + i2) * 31, 31), 31);
    }

    public static C50201Jn3 LIZ(C50201Jn3 c50201Jn3, int i, int i2, boolean z, C43I c43i, C43I c43i2, int i3) {
        String keyword;
        String title;
        String str;
        EnumC50200Jn2 style;
        C50214JnG c50214JnG;
        C50202Jn4 searchHubTabs;
        C43I sameTabsJustRefreshEvent = c43i2;
        C43I switchTabEvent = c43i;
        boolean z2 = z;
        int i4 = i;
        int i5 = i2;
        C43I<DynamicPatch> lynxDataChangeEvent = null;
        if ((i3 & 1) != 0) {
            keyword = c50201Jn3.LJLIL;
        } else {
            keyword = null;
        }
        if ((i3 & 2) != 0) {
            title = c50201Jn3.LJLILLLLZI;
        } else {
            title = null;
        }
        if ((i3 & 4) != 0) {
            str = c50201Jn3.LJLJI;
        } else {
            str = null;
        }
        if ((i3 & 8) != 0) {
            style = c50201Jn3.LJLJJI;
        } else {
            style = null;
        }
        if ((i3 & 16) != 0) {
            c50214JnG = c50201Jn3.LJLJJL;
        } else {
            c50214JnG = null;
        }
        if ((i3 & 32) != 0) {
            i4 = c50201Jn3.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            searchHubTabs = c50201Jn3.LJLJL;
        } else {
            searchHubTabs = null;
        }
        if ((i3 & 128) != 0) {
            i5 = c50201Jn3.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            z2 = c50201Jn3.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            switchTabEvent = c50201Jn3.LJLL;
        }
        if ((i3 & 1024) != 0) {
            sameTabsJustRefreshEvent = c50201Jn3.LJLLI;
        }
        if ((i3 & 2048) != 0) {
            lynxDataChangeEvent = c50201Jn3.LJLLILLLL;
        }
        c50201Jn3.getClass();
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(searchHubTabs, "searchHubTabs");
        o.LJIIIZ(switchTabEvent, "switchTabEvent");
        o.LJIIIZ(sameTabsJustRefreshEvent, "sameTabsJustRefreshEvent");
        o.LJIIIZ(lynxDataChangeEvent, "lynxDataChangeEvent");
        return new C50201Jn3(keyword, title, str, style, c50214JnG, i4, searchHubTabs, i5, z2, switchTabEvent, sameTabsJustRefreshEvent, lynxDataChangeEvent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C50201Jn3(java.lang.String r16, java.lang.String r17, java.lang.String r18, X.EnumC50200Jn2 r19, X.C50214JnG r20, int r21, X.C50202Jn4 r22, X.C43I r23, int r24) {
        /*
            r15 = this;
            r14 = r23
            r5 = r18
            r3 = r16
            r6 = r19
            r7 = r20
            r2 = r24
            r9 = r22
            r8 = r21
            r0 = r2 & 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L17
            r3 = r4
        L17:
            r0 = r2 & 2
            if (r0 == 0) goto L61
        L1b:
            r0 = r2 & 4
            r1 = 0
            if (r0 == 0) goto L21
            r5 = r1
        L21:
            r0 = r2 & 8
            if (r0 == 0) goto L27
            X.Jn2 r6 = X.EnumC50200Jn2.COMMON
        L27:
            r0 = r2 & 16
            if (r0 == 0) goto L2c
            r7 = r1
        L2c:
            r0 = r2 & 32
            if (r0 == 0) goto L31
            r8 = -1
        L31:
            r0 = r2 & 64
            if (r0 == 0) goto L3b
            X.Jn4 r9 = new X.Jn4
            r0 = 0
            r9.<init>(r0)
        L3b:
            r10 = 0
            r0 = r2 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L5f
            X.43I r12 = new X.43I
            r12.<init>(r1)
        L45:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L5d
            X.43I r13 = new X.43I
            r13.<init>(r1)
        L4e:
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L57
            X.43I r14 = new X.43I
            r14.<init>(r1)
        L57:
            r2 = r15
            r11 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L5d:
            r13 = r1
            goto L4e
        L5f:
            r12 = r1
            goto L45
        L61:
            r4 = r17
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50201Jn3.<init>(java.lang.String, java.lang.String, java.lang.String, X.Jn2, X.JnG, int, X.Jn4, X.43I, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C50201Jn3(String keyword, String title, String str, EnumC50200Jn2 style, C50214JnG c50214JnG, int i, C50202Jn4 searchHubTabs, int i2, boolean z, C43I<SearchLabel> switchTabEvent, C43I<Boolean> sameTabsJustRefreshEvent, C43I<? extends DynamicPatch> lynxDataChangeEvent) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(searchHubTabs, "searchHubTabs");
        o.LJIIIZ(switchTabEvent, "switchTabEvent");
        o.LJIIIZ(sameTabsJustRefreshEvent, "sameTabsJustRefreshEvent");
        o.LJIIIZ(lynxDataChangeEvent, "lynxDataChangeEvent");
        this.LJLIL = keyword;
        this.LJLILLLLZI = title;
        this.LJLJI = str;
        this.LJLJJI = style;
        this.LJLJJL = c50214JnG;
        this.LJLJJLL = i;
        this.LJLJL = searchHubTabs;
        this.LJLJLJ = i2;
        this.LJLJLLL = z;
        this.LJLL = switchTabEvent;
        this.LJLLI = sameTabsJustRefreshEvent;
        this.LJLLILLLL = lynxDataChangeEvent;
    }
}
