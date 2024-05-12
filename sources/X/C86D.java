package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.86D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86D implements C33Q {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final OSZ<String, String> LJLJI;
    public final String LJLJJI;

    public C86D() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86D)) {
            return false;
        }
        C86D c86d = (C86D) obj;
        return o.LJ(this.LJLIL, c86d.LJLIL) && this.LJLILLLLZI == c86d.LJLILLLLZI && o.LJ(this.LJLJI, c86d.LJLJI) && o.LJ(this.LJLJJI, c86d.LJLJJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LJLILLLLZI) * 31;
        OSZ<String, String> osz = this.LJLJI;
        int hashCode2 = (hashCode + (osz == null ? 0 : osz.hashCode())) * 31;
        String str2 = this.LJLJJI;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoAuthorInfoState(titleViewText=");
        LIZ.append(this.LJLIL);
        LIZ.append(", titleViewVisible=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", titleVerifyInfo=");
        LIZ.append(this.LJLJI);
        LIZ.append(", postTimeText=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public /* synthetic */ C86D(int i) {
        this(8, null, null, null);
    }

    public C86D(int i, String str, String str2, OSZ osz) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = osz;
        this.LJLJJI = str2;
    }
}
