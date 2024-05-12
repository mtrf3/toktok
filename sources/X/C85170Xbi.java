package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Xbi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85170Xbi implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Context LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85170Xbi)) {
            return false;
        }
        C85170Xbi c85170Xbi = (C85170Xbi) obj;
        return o.LJ(this.LJLIL, c85170Xbi.LJLIL) && o.LJ(this.LJLILLLLZI, c85170Xbi.LJLILLLLZI) && o.LJ(this.LJLJI, c85170Xbi.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Context context = this.LJLJI;
        return hashCode2 + (context != null ? context.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrustDevicesHierarchyData(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", fragmentContext=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C85170Xbi(Context context, String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = context;
    }
}
