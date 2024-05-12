package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.7fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191857fx implements Serializable {
    public static final C191877fz Companion = new Object() { // from class: X.7fz
    };
    public final Integer LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final java.util.Map<String, Object> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C191857fx() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C191857fx copy$default(C191857fx c191857fx, Integer num, String str, String str2, String str3, String str4, java.util.Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c191857fx.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c191857fx.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = c191857fx.LJLJI;
        }
        if ((i & 8) != 0) {
            str3 = c191857fx.LJLJJI;
        }
        if ((i & 16) != 0) {
            str4 = c191857fx.LJLJJL;
        }
        if ((i & 32) != 0) {
            map = c191857fx.LJLJJLL;
        }
        return c191857fx.copy(num, str, str2, str3, str4, map);
    }

    public final C191857fx copy(Integer num, String str, String str2, String str3, String str4, java.util.Map<String, ? extends Object> map) {
        return new C191857fx(num, str, str2, str3, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C191857fx)) {
            return false;
        }
        C191857fx c191857fx = (C191857fx) obj;
        return o.LJ(this.LJLIL, c191857fx.LJLIL) && o.LJ(this.LJLILLLLZI, c191857fx.LJLILLLLZI) && o.LJ(this.LJLJI, c191857fx.LJLJI) && o.LJ(this.LJLJJI, c191857fx.LJLJJI) && o.LJ(this.LJLJJL, c191857fx.LJLJJL) && o.LJ(this.LJLJJLL, c191857fx.LJLJJLL);
    }

    public int hashCode() {
        Integer num = this.LJLIL;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.util.Map<String, Object> map = this.LJLJJLL;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiAnchorMobData(multiAnchor=");
        LIZ.append(this.LJLIL);
        LIZ.append(", groupId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", authorId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", musicId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", logPb=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", extraParam=");
        return C15890jp.LIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.LJLJI;
    }

    public final java.util.Map<String, Object> getExtraParam() {
        return this.LJLJJLL;
    }

    public final String getGroupId() {
        return this.LJLILLLLZI;
    }

    public final String getLogPb() {
        return this.LJLJJL;
    }

    public final Integer getMultiAnchor() {
        return this.LJLIL;
    }

    public final String getMusicId() {
        return this.LJLJJI;
    }

    public C191857fx(Integer num, String str, String str2, String str3, String str4, java.util.Map<String, ? extends Object> map) {
        this.LJLIL = num;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = map;
    }

    public /* synthetic */ C191857fx(Integer num, String str, String str2, String str3, String str4, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? map : null);
    }
}
