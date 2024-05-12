package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.7dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190487dk implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Integer LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final int LJLLI;
    public final String LJLLILLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C190487dk() {
        /*
            r15 = this;
            r1 = 0
            r6 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r6
            r12 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190487dk.<init>():void");
    }

    public static /* synthetic */ C190487dk copy$default(C190487dk c190487dk, String str, String str2, String str3, Integer num, String str4, boolean z, String str5, String str6, String str7, String str8, int i, String str9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c190487dk.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str2 = c190487dk.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str3 = c190487dk.LJLJI;
        }
        if ((i2 & 8) != 0) {
            num = c190487dk.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            str4 = c190487dk.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            z = c190487dk.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            str5 = c190487dk.LJLJL;
        }
        if ((i2 & 128) != 0) {
            str6 = c190487dk.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            str7 = c190487dk.LJLJLLL;
        }
        if ((i2 & 512) != 0) {
            str8 = c190487dk.LJLL;
        }
        if ((i2 & 1024) != 0) {
            i = c190487dk.LJLLI;
        }
        if ((i2 & 2048) != 0) {
            str9 = c190487dk.LJLLILLLL;
        }
        return c190487dk.copy(str, str2, str3, num, str4, z, str5, str6, str7, str8, i, str9);
    }

    public final C190487dk copy(String str, String str2, String str3, Integer num, String str4, boolean z, String str5, String str6, String str7, String str8, int i, String str9) {
        return new C190487dk(str, str2, str3, num, str4, z, str5, str6, str7, str8, i, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190487dk)) {
            return false;
        }
        C190487dk c190487dk = (C190487dk) obj;
        return o.LJ(this.LJLIL, c190487dk.LJLIL) && o.LJ(this.LJLILLLLZI, c190487dk.LJLILLLLZI) && o.LJ(this.LJLJI, c190487dk.LJLJI) && o.LJ(this.LJLJJI, c190487dk.LJLJJI) && o.LJ(this.LJLJJL, c190487dk.LJLJJL) && this.LJLJJLL == c190487dk.LJLJJLL && o.LJ(this.LJLJL, c190487dk.LJLJL) && o.LJ(this.LJLJLJ, c190487dk.LJLJLJ) && o.LJ(this.LJLJLLL, c190487dk.LJLJLLL) && o.LJ(this.LJLL, c190487dk.LJLL) && this.LJLLI == c190487dk.LJLLI && o.LJ(this.LJLLILLLL, c190487dk.LJLLILLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJLJJI;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.LJLJJLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        String str5 = this.LJLJL;
        int hashCode6 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJLJLJ;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJLJLLL;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJLL;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.LJLLI) * 31;
        String str9 = this.LJLLILLLL;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoiDetailParams(poiId=");
        sb.append(this.LJLIL);
        sb.append(", enterFrom=");
        sb.append(this.LJLILLLLZI);
        sb.append(", enterMethod=");
        sb.append(this.LJLJI);
        sb.append(", hasTitle=");
        sb.append(this.LJLJJI);
        sb.append(", fromPage=");
        sb.append(this.LJLJJL);
        sb.append(", isAnchorExpand=");
        sb.append(this.LJLJJLL);
        sb.append(", trackInfo=");
        sb.append(this.LJLJL);
        sb.append(", previousPage=");
        sb.append(this.LJLJLJ);
        sb.append(", actionFromParam=");
        sb.append(this.LJLJLLL);
        sb.append(", isCollectFromParam=");
        sb.append(this.LJLL);
        sb.append(", fromOtherPoi=");
        sb.append(this.LJLLI);
        sb.append(", fromGroupId=");
        return C07670Rv.LIZIZ(sb, this.LJLLILLLL, ')');
    }

    public final String getActionFromParam() {
        return this.LJLJLLL;
    }

    public final String getEnterFrom() {
        return this.LJLILLLLZI;
    }

    public final String getEnterMethod() {
        return this.LJLJI;
    }

    public final String getFromGroupId() {
        return this.LJLLILLLL;
    }

    public final int getFromOtherPoi() {
        return this.LJLLI;
    }

    public final String getFromPage() {
        return this.LJLJJL;
    }

    public final Integer getHasTitle() {
        return this.LJLJJI;
    }

    public final String getPoiId() {
        return this.LJLIL;
    }

    public final String getPreviousPage() {
        return this.LJLJLJ;
    }

    public final String getTrackInfo() {
        return this.LJLJL;
    }

    public final boolean isAnchorExpand() {
        return this.LJLJJLL;
    }

    public final String isCollectFromParam() {
        return this.LJLL;
    }

    public C190487dk(String str, String str2, String str3, Integer num, String str4, boolean z, String str5, String str6, String str7, String str8, int i, String str9) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = num;
        this.LJLJJL = str4;
        this.LJLJJLL = z;
        this.LJLJL = str5;
        this.LJLJLJ = str6;
        this.LJLJLLL = str7;
        this.LJLL = str8;
        this.LJLLI = i;
        this.LJLLILLLL = str9;
    }

    public /* synthetic */ C190487dk(String str, String str2, String str3, Integer num, String str4, boolean z, String str5, String str6, String str7, String str8, int i, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : str8, (i2 & 1024) == 0 ? i : 0, (i2 & 2048) == 0 ? str9 : null);
    }
}
