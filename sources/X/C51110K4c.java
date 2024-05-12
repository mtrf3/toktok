package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.K4c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51110K4c implements Serializable {
    public final String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C51110K4c() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C51110K4c copy$default(C51110K4c c51110K4c, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c51110K4c.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c51110K4c.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c51110K4c.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c51110K4c.LJLJJI;
        }
        if ((i & 16) != 0) {
            str5 = c51110K4c.LJLJJL;
        }
        if ((i & 32) != 0) {
            str6 = c51110K4c.LJLJJLL;
        }
        return c51110K4c.copy(str, str2, str3, str4, str5, str6);
    }

    public final C51110K4c copy(String srcMaterialId, String str, String str2, String str3, String str4, String str5) {
        o.LJIIIZ(srcMaterialId, "srcMaterialId");
        return new C51110K4c(srcMaterialId, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51110K4c)) {
            return false;
        }
        C51110K4c c51110K4c = (C51110K4c) obj;
        return o.LJ(this.LJLIL, c51110K4c.LJLIL) && o.LJ(this.LJLILLLLZI, c51110K4c.LJLILLLLZI) && o.LJ(this.LJLJI, c51110K4c.LJLJI) && o.LJ(this.LJLJJI, c51110K4c.LJLJJI) && o.LJ(this.LJLJJL, c51110K4c.LJLJJL) && o.LJ(this.LJLJJLL, c51110K4c.LJLJJLL);
    }

    public int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJLJJLL;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingleSearchEcommerceModel(srcMaterialId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", srcAnchorProductId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", productPanelType=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isEcomSearch=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", enterGroupId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", originIsMallTab=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public final String getEnterGroupId() {
        return this.LJLJJL;
    }

    public final String getOriginIsMallTab() {
        return this.LJLJJLL;
    }

    public final String getProductPanelType() {
        return this.LJLJI;
    }

    public final String getSrcAnchorProductId() {
        return this.LJLILLLLZI;
    }

    public final String getSrcMaterialId() {
        return this.LJLIL;
    }

    public final String isEcomSearch() {
        return this.LJLJJI;
    }

    public final void setEcomSearch(String str) {
        this.LJLJJI = str;
    }

    public final void setEnterGroupId(String str) {
        this.LJLJJL = str;
    }

    public final void setOriginIsMallTab(String str) {
        this.LJLJJLL = str;
    }

    public final void setProductPanelType(String str) {
        this.LJLJI = str;
    }

    public final void setSrcAnchorProductId(String str) {
        this.LJLILLLLZI = str;
    }

    public C51110K4c(String srcMaterialId, String str, String str2, String str3, String str4, String str5) {
        o.LJIIIZ(srcMaterialId, "srcMaterialId");
        this.LJLIL = srcMaterialId;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
    }

    public /* synthetic */ C51110K4c(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
