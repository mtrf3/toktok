package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43401n6 extends AbstractC34231Vz {
    public final int hashCode() {
        return this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RoundedCornerShape(topStart = ");
        LIZ.append(this.LIZ);
        LIZ.append(", topEnd = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bottomEnd = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", bottomStart = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43401n6)) {
            return false;
        }
        AbstractC34231Vz abstractC34231Vz = (AbstractC34231Vz) obj;
        if (o.LJ(this.LIZ, abstractC34231Vz.LIZ) && o.LJ(this.LIZIZ, abstractC34231Vz.LIZIZ) && o.LJ(this.LIZJ, abstractC34231Vz.LIZJ) && o.LJ(this.LIZLLL, abstractC34231Vz.LIZLLL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43401n6(InterfaceC17460mM topStart, InterfaceC17460mM topEnd, InterfaceC17460mM bottomEnd, InterfaceC17460mM bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        o.LJIIIZ(topStart, "topStart");
        o.LJIIIZ(topEnd, "topEnd");
        o.LJIIIZ(bottomEnd, "bottomEnd");
        o.LJIIIZ(bottomStart, "bottomStart");
    }

    @Override // X.AbstractC34231Vz
    public final C43401n6 LIZIZ(InterfaceC17460mM topStart, InterfaceC17460mM topEnd, InterfaceC17460mM bottomEnd, InterfaceC17460mM bottomStart) {
        o.LJIIIZ(topStart, "topStart");
        o.LJIIIZ(topEnd, "topEnd");
        o.LJIIIZ(bottomEnd, "bottomEnd");
        o.LJIIIZ(bottomStart, "bottomStart");
        return new C43401n6(topStart, topEnd, bottomEnd, bottomStart);
    }

    @Override // X.AbstractC34231Vz
    public final AbstractC11540co LIZJ(long j, float f, float f2, float f3, float f4, EnumC23500w6 layoutDirection) {
        float f5;
        float f6;
        float f7 = f4;
        float f8 = f2;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        if (f + f8 + f3 + f7 == 0.0f) {
            return new C1QT(C78929UyL.LIZ(C10370av.LIZIZ, j));
        }
        C10390ax LIZ = C78929UyL.LIZ(C10370av.LIZIZ, j);
        EnumC23500w6 enumC23500w6 = EnumC23500w6.Ltr;
        if (layoutDirection == enumC23500w6) {
            f5 = f;
        } else {
            f5 = f8;
        }
        long LJI = C78897Uxp.LJI(f5, f5);
        if (layoutDirection != enumC23500w6) {
            f8 = f;
        }
        long LJI2 = C78897Uxp.LJI(f8, f8);
        if (layoutDirection == enumC23500w6) {
            f6 = f3;
        } else {
            f6 = f7;
        }
        long LJI3 = C78897Uxp.LJI(f6, f6);
        if (layoutDirection != enumC23500w6) {
            f7 = f3;
        }
        return new C1QU(new C10410az(LIZ.LIZ, LIZ.LIZIZ, LIZ.LIZJ, LIZ.LIZLLL, LJI, LJI2, LJI3, C78897Uxp.LJI(f7, f7)));
    }
}
