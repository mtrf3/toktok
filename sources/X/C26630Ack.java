package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* renamed from: X.Ack, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26630Ack {
    public final String LIZ;
    public final String LIZIZ;
    public final Icon LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26630Ack)) {
            return false;
        }
        C26630Ack c26630Ack = (C26630Ack) obj;
        return o.LJ(this.LIZ, c26630Ack.LIZ) && o.LJ(this.LIZIZ, c26630Ack.LIZIZ) && o.LJ(this.LIZJ, c26630Ack.LIZJ) && o.LJ(this.LIZLLL, c26630Ack.LIZLLL) && this.LJ == c26630Ack.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.LIZJ;
        int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CodVO(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", schema=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", icon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", desc=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showDivider=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C26630Ack(String str, String str2, Icon icon, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = icon;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}
