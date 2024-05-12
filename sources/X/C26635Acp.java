package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Acp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26635Acp {
    public final Address LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final Boolean LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26635Acp)) {
            return false;
        }
        C26635Acp c26635Acp = (C26635Acp) obj;
        return o.LJ(this.LIZ, c26635Acp.LIZ) && this.LIZIZ == c26635Acp.LIZIZ && this.LIZJ == c26635Acp.LIZJ && this.LIZLLL == c26635Acp.LIZLLL && o.LJ(this.LJ, c26635Acp.LJ) && o.LJ(this.LJFF, c26635Acp.LJFF) && o.LJ(this.LJI, c26635Acp.LJI);
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
        int hashCode2 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LJFF;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LJI;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UsAddressItemVO(address=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSelect=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", reachable=");
        LIZ.append(this.LIZJ);
        LIZ.append(", addressValid=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", invalidHintMessage=");
        LIZ.append(this.LJ);
        LIZ.append(", availableForChange=");
        LIZ.append(this.LJFF);
        LIZ.append(", unavailableChangeHint=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public C26635Acp(Address address, boolean z, boolean z2, boolean z3, String str, Boolean bool, String str2) {
        this.LIZ = address;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = str;
        this.LJFF = bool;
        this.LJI = str2;
    }
}
