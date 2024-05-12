package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Aco, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26634Aco {
    public final Address LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26634Aco)) {
            return false;
        }
        C26634Aco c26634Aco = (C26634Aco) obj;
        return o.LJ(this.LIZ, c26634Aco.LIZ) && this.LIZIZ == c26634Aco.LIZIZ && this.LIZJ == c26634Aco.LIZJ && this.LIZLLL == c26634Aco.LIZLLL && o.LJ(this.LJ, c26634Aco.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Address address = this.LIZ;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LIZJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        String str = this.LJ;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalAddressItemVO(address=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSelect=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", reachable=");
        LIZ.append(this.LIZJ);
        LIZ.append(", addressValid=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", invalidHintMessage=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C26634Aco(Address address, boolean z, boolean z2, boolean z3, String str) {
        this.LIZ = address;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = str;
    }
}
