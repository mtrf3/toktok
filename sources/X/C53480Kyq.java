package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Kyq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53480Kyq implements L50, InterfaceC53481Kyr {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final InterfaceC53515KzP LIZJ;
    public final C53455KyR LIZLLL;
    public final boolean LJ;
    public final InterfaceC88472Yns<C53447KyJ, Float> LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public C53480Kyq() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.LIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.LIZIZ;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int hashCode3 = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((i2 + hashCode2) * 31)) * 31)) * 31;
        boolean z = this.LJ;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (hashCode3 + i4) * 31;
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns = this.LJFF;
        if (interfaceC88472Yns != null) {
            i = interfaceC88472Yns.hashCode();
        }
        int i6 = (i5 + i) * 31;
        if (!this.LJI) {
            i3 = 0;
        }
        return i6 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarDotUIData(color=");
        LIZ.append(this.LIZ);
        LIZ.append(", colorRes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZJ);
        LIZ.append(", size=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hasHollowOutline=");
        LIZ.append(this.LJ);
        LIZ.append(", outlineWidth=");
        LIZ.append(this.LJFF);
        LIZ.append(", autoRTL=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    @Override // X.L50
    public final boolean LIZ() {
        return this.LJII;
    }

    @Override // X.L50
    public final boolean LIZIZ() {
        return this.LJI;
    }

    @Override // X.L50
    public final InterfaceC53515KzP getPosition() {
        return this.LIZJ;
    }

    @Override // X.L50
    public final C53455KyR getSize() {
        return this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53480Kyq)) {
            return false;
        }
        C53480Kyq c53480Kyq = (C53480Kyq) obj;
        if (o.LJ(this.LIZ, c53480Kyq.LIZ) && o.LJ(this.LIZIZ, c53480Kyq.LIZIZ) && o.LJ(this.LIZJ, c53480Kyq.LIZJ) && o.LJ(this.LIZLLL, c53480Kyq.LIZLLL) && this.LJ == c53480Kyq.LJ && o.LJ(this.LJFF, c53480Kyq.LJFF) && this.LJI == c53480Kyq.LJI) {
            return true;
        }
        return false;
    }

    public C53480Kyq(Integer num, C53456KyS c53456KyS, C53443KyF c53443KyF) {
        C53455KyR c53455KyR = new C53455KyR(C53453KyP.LJLIL, C53454KyQ.LJLIL);
        this.LIZ = null;
        this.LIZIZ = num;
        this.LIZJ = c53456KyS;
        this.LIZLLL = c53455KyR;
        this.LJ = true;
        this.LJFF = c53443KyF;
        this.LJI = true;
        this.LJII = true;
    }
}
