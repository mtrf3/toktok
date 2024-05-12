package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.7eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190787eE implements Serializable {
    public static final C190797eF Companion = new C190797eF();
    public final Integer LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final java.util.Map<String, Object> LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C190787eE() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C190787eE copy$default(C190787eE c190787eE, Integer num, String str, String str2, String str3, String str4, java.util.Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c190787eE.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c190787eE.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = c190787eE.LJLJI;
        }
        if ((i & 8) != 0) {
            str3 = c190787eE.LJLJJI;
        }
        if ((i & 16) != 0) {
            str4 = c190787eE.LJLJJL;
        }
        if ((i & 32) != 0) {
            map = c190787eE.LJLJJLL;
        }
        return c190787eE.copy(num, str, str2, str3, str4, map);
    }

    public final C190787eE copy(Integer num, String str, String str2, String str3, String str4, java.util.Map<String, ? extends Object> map) {
        return new C190787eE(num, str, str2, str3, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190787eE)) {
            return false;
        }
        C190787eE c190787eE = (C190787eE) obj;
        return o.LJ(this.LJLIL, c190787eE.LJLIL) && o.LJ(this.LJLILLLLZI, c190787eE.LJLILLLLZI) && o.LJ(this.LJLJI, c190787eE.LJLJI) && o.LJ(this.LJLJJI, c190787eE.LJLJJI) && o.LJ(this.LJLJJL, c190787eE.LJLJJL) && o.LJ(this.LJLJJLL, c190787eE.LJLJJLL);
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

    public C190787eE(Integer num, String str, String str2, String str3, String str4, java.util.Map<String, ? extends Object> map) {
        this.LJLIL = num;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = map;
    }

    public /* synthetic */ C190787eE(Integer num, String str, String str2, String str3, String str4, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? map : null);
    }
}
