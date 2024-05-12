package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jpp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50373Jpp implements Serializable {
    public final java.util.Map<String, String> LJLIL;
    public final String LJLILLLLZI;
    public Boolean LJLJI;
    public String LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C50373Jpp() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C50373Jpp copy$default(C50373Jpp c50373Jpp, java.util.Map map, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c50373Jpp.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c50373Jpp.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            bool = c50373Jpp.LJLJI;
        }
        if ((i & 8) != 0) {
            str2 = c50373Jpp.LJLJJI;
        }
        return c50373Jpp.copy(map, str, bool, str2);
    }

    public final C50373Jpp copy(java.util.Map<String, String> map, String str, Boolean bool, String str2) {
        return new C50373Jpp(map, str, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50373Jpp)) {
            return false;
        }
        C50373Jpp c50373Jpp = (C50373Jpp) obj;
        return o.LJ(this.LJLIL, c50373Jpp.LJLIL) && o.LJ(this.LJLILLLLZI, c50373Jpp.LJLILLLLZI) && o.LJ(this.LJLJI, c50373Jpp.LJLJI) && o.LJ(this.LJLJJI, c50373Jpp.LJLJJI);
    }

    public int hashCode() {
        java.util.Map<String, String> map = this.LJLIL;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LJLJI;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LJLJJI;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchEventModel(extraLogParams=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterCommentId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isFromOutside=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isFromPhoto=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final String getEnterCommentId() {
        return this.LJLILLLLZI;
    }

    public final java.util.Map<String, String> getExtraLogParams() {
        return this.LJLIL;
    }

    public final Boolean isFromOutside() {
        return this.LJLJI;
    }

    public final String isFromPhoto() {
        return this.LJLJJI;
    }

    public final void setFromOutside(Boolean bool) {
        this.LJLJI = bool;
    }

    public final void setFromPhoto(String str) {
        this.LJLJJI = str;
    }

    public C50373Jpp(java.util.Map<String, String> map, String str, Boolean bool, String str2) {
        this.LJLIL = map;
        this.LJLILLLLZI = str;
        this.LJLJI = bool;
        this.LJLJJI = str2;
    }

    public /* synthetic */ C50373Jpp(java.util.Map map, String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str2);
    }
}
