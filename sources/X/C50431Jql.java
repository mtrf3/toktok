package X;

import defpackage.q;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jql, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50431Jql implements Serializable {
    public int LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public final java.util.Map<String, String> LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50431Jql() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50431Jql.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C50431Jql copy$default(C50431Jql c50431Jql, int i, int i2, String str, java.util.Map map, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c50431Jql.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i2 = c50431Jql.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            str = c50431Jql.LJLJI;
        }
        if ((i3 & 8) != 0) {
            map = c50431Jql.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            str2 = c50431Jql.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            str3 = c50431Jql.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            str4 = c50431Jql.LJLJL;
        }
        return c50431Jql.copy(i, i2, str, map, str2, str3, str4);
    }

    public final C50431Jql copy(int i, int i2, String launchSchemaString, java.util.Map<String, String> extraTrackMap, String str, String str2, String blankPageEnterAction) {
        o.LJIIIZ(launchSchemaString, "launchSchemaString");
        o.LJIIIZ(extraTrackMap, "extraTrackMap");
        o.LJIIIZ(blankPageEnterAction, "blankPageEnterAction");
        return new C50431Jql(i, i2, launchSchemaString, extraTrackMap, str, str2, blankPageEnterAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50431Jql)) {
            return false;
        }
        C50431Jql c50431Jql = (C50431Jql) obj;
        return this.LJLIL == c50431Jql.LJLIL && this.LJLILLLLZI == c50431Jql.LJLILLLLZI && o.LJ(this.LJLJI, c50431Jql.LJLJI) && o.LJ(this.LJLJJI, c50431Jql.LJLJJI) && o.LJ(this.LJLJJL, c50431Jql.LJLJJL) && o.LJ(this.LJLJJLL, c50431Jql.LJLJJLL) && o.LJ(this.LJLJL, c50431Jql.LJLJL);
    }

    public int hashCode() {
        int hashCode;
        int LIZ = C12400eC.LIZ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, ((this.LJLIL * 31) + this.LJLILLLLZI) * 31, 31), 31);
        String str = this.LJLJJL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZ + hashCode) * 31;
        String str2 = this.LJLJJLL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.LJLJL.hashCode() + ((i2 + i) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchGlobalData(lastShowingPageIndex=");
        LIZ.append(this.LJLIL);
        LIZ.append(", searchLastShowPageIndex=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", launchSchemaString=");
        LIZ.append(this.LJLJI);
        LIZ.append(", extraTrackMap=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", blankPageEnterForm=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", blankPageEnterMethod=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", blankPageEnterAction=");
        return q.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final String getBlankPageEnterAction() {
        return this.LJLJL;
    }

    public final String getBlankPageEnterForm() {
        return this.LJLJJL;
    }

    public final String getBlankPageEnterMethod() {
        return this.LJLJJLL;
    }

    public final java.util.Map<String, String> getExtraTrackMap() {
        return this.LJLJJI;
    }

    public final int getLastShowingPageIndex() {
        return this.LJLIL;
    }

    public final String getLaunchSchemaString() {
        return this.LJLJI;
    }

    public final int getSearchLastShowPageIndex() {
        return this.LJLILLLLZI;
    }

    public final void setBlankPageEnterAction(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJL = str;
    }

    public final void setBlankPageEnterForm(String str) {
        this.LJLJJL = str;
    }

    public final void setBlankPageEnterMethod(String str) {
        this.LJLJJLL = str;
    }

    public final void setLastShowingPageIndex(int i) {
        this.LJLIL = i;
    }

    public final void setLaunchSchemaString(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJI = str;
    }

    public final void setSearchLastShowPageIndex(int i) {
        this.LJLILLLLZI = i;
    }

    public C50431Jql(int i, int i2, String launchSchemaString, java.util.Map<String, String> extraTrackMap, String str, String str2, String blankPageEnterAction) {
        o.LJIIIZ(launchSchemaString, "launchSchemaString");
        o.LJIIIZ(extraTrackMap, "extraTrackMap");
        o.LJIIIZ(blankPageEnterAction, "blankPageEnterAction");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = launchSchemaString;
        this.LJLJJI = extraTrackMap;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = blankPageEnterAction;
    }

    public /* synthetic */ C50431Jql(int i, int i2, String str, java.util.Map map, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? new LinkedHashMap() : map, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) == 0 ? str4 : "");
    }
}
