package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.K8k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51222K8k implements Serializable {
    public String LJLIL;
    public String LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C51222K8k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C51222K8k copy$default(C51222K8k c51222K8k, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c51222K8k.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c51222K8k.LJLILLLLZI;
        }
        return c51222K8k.copy(str, str2);
    }

    public final C51222K8k copy(String str, String str2) {
        return new C51222K8k(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51222K8k)) {
            return false;
        }
        C51222K8k c51222K8k = (C51222K8k) obj;
        return o.LJ(this.LJLIL, c51222K8k.LJLIL) && o.LJ(this.LJLILLLLZI, c51222K8k.LJLILLLLZI);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoreCard(creatorId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", shopId=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final String getCreatorId() {
        return this.LJLIL;
    }

    public final String getShopId() {
        return this.LJLILLLLZI;
    }

    public final void setCreatorId(String str) {
        this.LJLIL = str;
    }

    public final void setShopId(String str) {
        this.LJLILLLLZI = str;
    }

    public C51222K8k(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    public /* synthetic */ C51222K8k(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
