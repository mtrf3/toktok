package X;

import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mp3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57969Mp3 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C57967Mp1 LIZJ;
    public final boolean LIZLLL;
    public final List<InterfaceC57927MoN> LJ;

    public C57969Mp3() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57969Mp3)) {
            return false;
        }
        C57969Mp3 c57969Mp3 = (C57969Mp3) obj;
        return this.LIZ == c57969Mp3.LIZ && this.LIZIZ == c57969Mp3.LIZIZ && o.LJ(this.LIZJ, c57969Mp3.LIZJ) && this.LIZLLL == c57969Mp3.LIZLLL && o.LJ(this.LJ, c57969Mp3.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        C57967Mp1 c57967Mp1 = this.LIZJ;
        int hashCode = (((i3 + (c57967Mp1 == null ? 0 : c57967Mp1.hashCode())) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        List<InterfaceC57927MoN> list = this.LJ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserCardSourceState(isInit=");
        LIZ.append(this.LIZ);
        LIZ.append(", isLoading=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", params=");
        LIZ.append(this.LIZJ);
        LIZ.append(", hasMore=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", data=");
        List<InterfaceC57927MoN> list = this.LJ;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        return s0.LIZJ(LIZ, num, ')', LIZ);
    }

    public /* synthetic */ C57969Mp3(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false, null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57969Mp3(boolean z, boolean z2, C57967Mp1 c57967Mp1, boolean z3, List<? extends InterfaceC57927MoN> list) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c57967Mp1;
        this.LIZLLL = z3;
        this.LJ = list;
    }
}
