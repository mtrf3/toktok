package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.HDq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43714HDq implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C43714HDq() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C43714HDq copy$default(C43714HDq c43714HDq, String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43714HDq.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c43714HDq.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c43714HDq.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c43714HDq.LJLJJI;
        }
        if ((i & 16) != 0) {
            z = c43714HDq.LJLJJL;
        }
        if ((i & 32) != 0) {
            str5 = c43714HDq.LJLJJLL;
        }
        if ((i & 64) != 0) {
            str6 = c43714HDq.LJLJL;
        }
        return c43714HDq.copy(str, str2, str3, str4, z, str5, str6);
    }

    public final C43714HDq copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        return new C43714HDq(str, str2, str3, str4, z, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43714HDq)) {
            return false;
        }
        C43714HDq c43714HDq = (C43714HDq) obj;
        return o.LJ(this.LJLIL, c43714HDq.LJLIL) && o.LJ(this.LJLILLLLZI, c43714HDq.LJLILLLLZI) && o.LJ(this.LJLJI, c43714HDq.LJLJI) && o.LJ(this.LJLJJI, c43714HDq.LJLJJI) && this.LJLJJL == c43714HDq.LJLJJL && o.LJ(this.LJLJJLL, c43714HDq.LJLJJLL) && o.LJ(this.LJLJL, c43714HDq.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str5 = this.LJLJJLL;
        int hashCode5 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJLJL;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryMobBasis(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", shootWay=");
        LIZ.append(this.LJLJI);
        LIZ.append(", creationId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isFromSearch=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isThroughAnchor=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", libraryEntryPoint=");
        return q.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final String getCreationId() {
        return this.LJLJJI;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final String getLibraryEntryPoint() {
        return this.LJLJL;
    }

    public final String getShootWay() {
        return this.LJLJI;
    }

    public final boolean isFromSearch() {
        return this.LJLJJL;
    }

    public final String isThroughAnchor() {
        return this.LJLJJLL;
    }

    public C43714HDq(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = z;
        this.LJLJJLL = str5;
        this.LJLJL = str6;
    }

    public /* synthetic */ C43714HDq(String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null);
    }
}
