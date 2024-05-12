package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Kyg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53470Kyg implements InterfaceC53515KzP {
    public final int LIZ;
    public final InterfaceC88472Yns<C53447KyJ, C53527Kzb> LIZIZ;
    public final boolean LIZJ;

    public C53470Kyg() {
        this(0, null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        InterfaceC88472Yns<C53447KyJ, C53527Kzb> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88472Yns.hashCode();
        }
        int i2 = (i + hashCode) * 31;
        boolean z = this.LIZJ;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return i2 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomizePosition(gravity=");
        LIZ.append(this.LIZ);
        LIZ.append(", margin=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", referToAvatar=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    @Override // X.InterfaceC53515KzP
    public final int LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC53515KzP
    public final boolean LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC53515KzP
    public final InterfaceC88472Yns<C53447KyJ, C53527Kzb> u1() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53470Kyg)) {
            return false;
        }
        C53470Kyg c53470Kyg = (C53470Kyg) obj;
        if (this.LIZ == c53470Kyg.LIZ && o.LJ(this.LIZIZ, c53470Kyg.LIZIZ) && this.LIZJ == c53470Kyg.LIZJ) {
            return true;
        }
        return false;
    }

    public C53470Kyg(int i, InterfaceC88472Yns interfaceC88472Yns, int i2) {
        boolean z;
        i = (i2 & 1) != 0 ? 8388693 : i;
        interfaceC88472Yns = (i2 & 2) != 0 ? null : interfaceC88472Yns;
        if ((i2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = i;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = z;
    }
}
