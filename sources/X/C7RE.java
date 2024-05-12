package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7RE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7RE implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7RE)) {
            return false;
        }
        C7RE c7re = (C7RE) obj;
        return o.LJ(this.LJLIL, c7re.LJLIL) && o.LJ(this.LJLILLLLZI, c7re.LJLILLLLZI) && o.LJ(this.LJLJI, c7re.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public C7RE() {
        this("", "", "");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MovieDetailHierarchyData(movieId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pageId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C7RE(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }
}
