package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.DyL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35613DyL implements Serializable {
    public String LJLIL;
    public String LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C35613DyL() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C35613DyL copy$default(C35613DyL c35613DyL, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c35613DyL.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c35613DyL.LJLILLLLZI;
        }
        return c35613DyL.copy(str, str2);
    }

    public final C35613DyL copy(String str, String str2) {
        return new C35613DyL(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35613DyL)) {
            return false;
        }
        C35613DyL c35613DyL = (C35613DyL) obj;
        return o.LJ(this.LJLIL, c35613DyL.LJLIL) && o.LJ(this.LJLILLLLZI, c35613DyL.LJLILLLLZI);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductInfoFromEcommerce(productList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", scene=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final String getProductList() {
        return this.LJLIL;
    }

    public final String getScene() {
        return this.LJLILLLLZI;
    }

    public final void setProductList(String str) {
        this.LJLIL = str;
    }

    public final void setScene(String str) {
        this.LJLILLLLZI = str;
    }

    public C35613DyL(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    public /* synthetic */ C35613DyL(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
