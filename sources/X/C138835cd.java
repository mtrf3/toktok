package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.5cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138835cd implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public static /* synthetic */ C138835cd copy$default(C138835cd c138835cd, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c138835cd.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c138835cd.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c138835cd.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c138835cd.LJLJJI;
        }
        return c138835cd.copy(str, str2, str3, str4);
    }

    public final C138835cd copy(String str, String str2, String str3, String str4) {
        return new C138835cd(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C138835cd)) {
            return false;
        }
        C138835cd c138835cd = (C138835cd) obj;
        return o.LJ(this.LJLIL, c138835cd.LJLIL) && o.LJ(this.LJLILLLLZI, c138835cd.LJLILLLLZI) && o.LJ(this.LJLJI, c138835cd.LJLJI) && o.LJ(this.LJLJJI, c138835cd.LJLJJI);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJI;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NatureStickerMobParams(shootWay=");
        LIZ.append(this.LJLIL);
        LIZ.append(", creationId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", contentSource=");
        LIZ.append(this.LJLJI);
        LIZ.append(", contentType=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final String getContentSource() {
        return this.LJLJI;
    }

    public final String getContentType() {
        return this.LJLJJI;
    }

    public final String getCreationId() {
        return this.LJLILLLLZI;
    }

    public final String getShootWay() {
        return this.LJLIL;
    }

    public C138835cd(String str, String str2, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }
}
