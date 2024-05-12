package X;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.2YQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2YQ implements Serializable {
    public static final C2YR Companion = new Object() { // from class: X.2YR
    };
    public final int LJLIL;
    public String LJLILLLLZI;
    public final Bundle LJLJI;

    public static /* synthetic */ C2YQ copy$default(C2YQ c2yq, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c2yq.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str = c2yq.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            bundle = c2yq.LJLJI;
        }
        return c2yq.copy(i, str, bundle);
    }

    public final C2YQ copy(int i, String str, Bundle bundle) {
        return new C2YQ(i, str, bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2YQ)) {
            return false;
        }
        C2YQ c2yq = (C2YQ) obj;
        return this.LJLIL == c2yq.LJLIL && o.LJ(this.LJLILLLLZI, c2yq.LJLILLLLZI) && o.LJ(this.LJLJI, c2yq.LJLJI);
    }

    public int hashCode() {
        int i = this.LJLIL * 31;
        String str = this.LJLILLLLZI;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Bundle bundle = this.LJLJI;
        return hashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicSubConfig(type=");
        LIZ.append(this.LJLIL);
        LIZ.append(", value=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", extra=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Bundle getExtra() {
        return this.LJLJI;
    }

    public final int getType() {
        return this.LJLIL;
    }

    public final String getValue() {
        return this.LJLILLLLZI;
    }

    public final void setValue(String str) {
        this.LJLILLLLZI = str;
    }

    public C2YQ(int i, String str, Bundle bundle) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = bundle;
    }

    public /* synthetic */ C2YQ(int i, String str, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bundle);
    }
}
