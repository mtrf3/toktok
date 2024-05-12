package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189187be implements InterfaceC87283bg {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final C190817eH LJLJL;

    public C189187be() {
        this(null, false, 0, null, null, false, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189187be)) {
            return false;
        }
        C189187be c189187be = (C189187be) obj;
        return o.LJ(this.LJLIL, c189187be.LJLIL) && this.LJLILLLLZI == c189187be.LJLILLLLZI && this.LJLJI == c189187be.LJLJI && o.LJ(this.LJLJJI, c189187be.LJLJJI) && o.LJ(this.LJLJJL, c189187be.LJLJJL) && this.LJLJJLL == c189187be.LJLJJLL && o.LJ(this.LJLJL, c189187be.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + this.LJLJI) * 31;
        String str2 = this.LJLJJI;
        int hashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJL;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.LJLJJLL ? 1 : 0)) * 31;
        C190817eH c190817eH = this.LJLJL;
        return hashCode3 + (c190817eH != null ? c190817eH.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiCollectHierarchyData(poiId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isCollected=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", style=");
        LIZ.append(this.LJLJI);
        LIZ.append(", poiName=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", poiAddress=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isReserveTableBtnShow=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", poiCollectMobData=");
        LIZ.append(this.LJLJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C189187be(String str, boolean z, int i, String str2, String str3, boolean z2, C190817eH c190817eH, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        z = (i2 & 2) != 0 ? false : z;
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 8) != 0 ? null : str2;
        str3 = (i2 & 16) != 0 ? null : str3;
        z2 = (i2 & 32) != 0 ? false : z2;
        c190817eH = (i2 & 64) != 0 ? null : c190817eH;
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = z2;
        this.LJLJL = c190817eH;
    }
}
