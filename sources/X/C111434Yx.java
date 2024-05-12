package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint;
import kotlin.jvm.internal.o;

/* renamed from: X.4Yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111434Yx implements InterfaceC57784Mm4 {
    public final Long LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final Long LJLJJL;
    public final Integer LJLJJLL;
    public final String LJLJL;
    public final Long LJLJLJ;
    public final boolean LJLJLLL;
    public final StoreSellingPoint LJLL;

    public C111434Yx() {
        this(null, null, null, null, null, 0, null, null, true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111434Yx)) {
            return false;
        }
        C111434Yx c111434Yx = (C111434Yx) obj;
        return o.LJ(this.LJLIL, c111434Yx.LJLIL) && o.LJ(this.LJLILLLLZI, c111434Yx.LJLILLLLZI) && o.LJ(this.LJLJI, c111434Yx.LJLJI) && o.LJ(this.LJLJJI, c111434Yx.LJLJJI) && o.LJ(this.LJLJJL, c111434Yx.LJLJJL) && o.LJ(this.LJLJJLL, c111434Yx.LJLJJLL) && o.LJ(this.LJLJL, c111434Yx.LJLJL) && o.LJ(this.LJLJLJ, c111434Yx.LJLJLJ) && this.LJLJLLL == c111434Yx.LJLJLLL && o.LJ(this.LJLL, c111434Yx.LJLL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Long l = this.LJLIL;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.LJLJL;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        boolean z = this.LJLJLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        StoreSellingPoint storeSellingPoint = this.LJLL;
        return i2 + (storeSellingPoint != null ? storeSellingPoint.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerConversationItem(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", avatarUrl=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", name=");
        LIZ.append(this.LJLJI);
        LIZ.append(", content=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", time=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", unreadCount=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", clickUrl=");
        LIZ.append(this.LJLJL);
        LIZ.append(", createTime=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", isCollaborator=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", sellingPoint=");
        LIZ.append(this.LJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(this, interfaceC57784Mm4);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        Long l;
        if ((interfaceC57784Mm4 instanceof C111434Yx) && (l = this.LJLIL) != null && o.LJ(l, ((C111434Yx) interfaceC57784Mm4).LJLIL)) {
            return true;
        }
        return false;
    }

    public C111434Yx(Long l, String str, String str2, String str3, Long l2, Integer num, String str4, Long l3, boolean z, StoreSellingPoint storeSellingPoint) {
        this.LJLIL = l;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = l2;
        this.LJLJJLL = num;
        this.LJLJL = str4;
        this.LJLJLJ = l3;
        this.LJLJLLL = z;
        this.LJLL = storeSellingPoint;
    }
}
