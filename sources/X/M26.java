package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M26 implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Long LJLJJI;
    public final java.util.Map<String, String> LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public M26() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ M26 copy$default(M26 m26, String str, String str2, String str3, Long l, java.util.Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = m26.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = m26.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = m26.LJLJI;
        }
        if ((i & 8) != 0) {
            l = m26.LJLJJI;
        }
        if ((i & 16) != 0) {
            map = m26.LJLJJL;
        }
        return m26.copy(str, str2, str3, l, map);
    }

    public final M26 copy(String str, String str2, String str3, Long l, java.util.Map<String, String> map) {
        return new M26(str, str2, str3, l, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M26)) {
            return false;
        }
        M26 m26 = (M26) obj;
        return o.LJ(this.LJLIL, m26.LJLIL) && o.LJ(this.LJLILLLLZI, m26.LJLILLLLZI) && o.LJ(this.LJLJI, m26.LJLJI) && o.LJ(this.LJLJJI, m26.LJLJJI) && o.LJ(this.LJLJJL, m26.LJLJJL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.LJLJJI;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        java.util.Map<String, String> map = this.LJLJJL;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiscoveryMobParams(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", previousPage=");
        LIZ.append(this.LJLJI);
        LIZ.append(", clickTimeMs=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", extraParams=");
        return C15890jp.LIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public final Long getClickTimeMs() {
        return this.LJLJJI;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final java.util.Map<String, String> getExtraParams() {
        return this.LJLJJL;
    }

    public final String getPreviousPage() {
        return this.LJLJI;
    }

    public M26(String str, String str2, String str3, Long l, java.util.Map<String, String> map) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = l;
        this.LJLJJL = map;
    }

    public /* synthetic */ M26(String str, String str2, String str3, Long l, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) == 0 ? map : null);
    }
}
