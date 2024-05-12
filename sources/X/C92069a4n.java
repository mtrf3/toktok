package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.a4n, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92069a4n implements Serializable {
    public static final int $stable = 0;
    public final EnumC92073a4r LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C92069a4n() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C92069a4n copy$default(C92069a4n c92069a4n, EnumC92073a4r enumC92073a4r, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC92073a4r = c92069a4n.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c92069a4n.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = c92069a4n.LJLJI;
        }
        return c92069a4n.copy(enumC92073a4r, str, str2);
    }

    public final C92069a4n copy(EnumC92073a4r enumC92073a4r, String str, String str2) {
        return new C92069a4n(enumC92073a4r, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92069a4n)) {
            return false;
        }
        C92069a4n c92069a4n = (C92069a4n) obj;
        return this.LJLIL == c92069a4n.LJLIL && o.LJ(this.LJLILLLLZI, c92069a4n.LJLILLLLZI) && o.LJ(this.LJLJI, c92069a4n.LJLJI);
    }

    public int hashCode() {
        EnumC92073a4r enumC92073a4r = this.LJLIL;
        int hashCode = (enumC92073a4r == null ? 0 : enumC92073a4r.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinConfirmResult(status=");
        LIZ.append(this.LJLIL);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", errorContent=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getErrorCode() {
        return this.LJLILLLLZI;
    }

    public final String getErrorContent() {
        return this.LJLJI;
    }

    public final EnumC92073a4r getStatus() {
        return this.LJLIL;
    }

    public C92069a4n(EnumC92073a4r enumC92073a4r, String str, String str2) {
        this.LJLIL = enumC92073a4r;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    public /* synthetic */ C92069a4n(EnumC92073a4r enumC92073a4r, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : enumC92073a4r, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
