package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.7B4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7B4 implements Serializable {
    public final String LJLIL;
    public final Boolean LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C7B4() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C7B4 copy$default(C7B4 c7b4, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c7b4.LJLIL;
        }
        if ((i & 2) != 0) {
            bool = c7b4.LJLILLLLZI;
        }
        return c7b4.copy(str, bool);
    }

    public final C7B4 copy(String str, Boolean bool) {
        return new C7B4(str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7B4)) {
            return false;
        }
        C7B4 c7b4 = (C7B4) obj;
        return o.LJ(this.LJLIL, c7b4.LJLIL) && o.LJ(this.LJLILLLLZI, c7b4.LJLILLLLZI);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LJLILLLLZI;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TabChangeModel(tabCode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isFirstLoad=");
        return C78920UyC.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final String getTabCode() {
        return this.LJLIL;
    }

    public final Boolean isFirstLoad() {
        return this.LJLILLLLZI;
    }

    public C7B4(String str, Boolean bool) {
        this.LJLIL = str;
        this.LJLILLLLZI = bool;
    }

    public /* synthetic */ C7B4(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
