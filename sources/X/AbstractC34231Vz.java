package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC34231Vz implements InterfaceC11790dD {
    public final InterfaceC17460mM LIZ;
    public final InterfaceC17460mM LIZIZ;
    public final InterfaceC17460mM LIZJ;
    public final InterfaceC17460mM LIZLLL;

    public abstract C43401n6 LIZIZ(InterfaceC17460mM interfaceC17460mM, InterfaceC17460mM interfaceC17460mM2, InterfaceC17460mM interfaceC17460mM3, InterfaceC17460mM interfaceC17460mM4);

    public abstract AbstractC11540co LIZJ(long j, float f, float f2, float f3, float f4, EnumC23500w6 enumC23500w6);

    @Override // X.InterfaceC11790dD
    public final AbstractC11540co LIZ(long j, EnumC23500w6 layoutDirection, InterfaceC23370vt density) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(density, "density");
        float LIZ = this.LIZ.LIZ(j, density);
        float LIZ2 = this.LIZIZ.LIZ(j, density);
        float LIZ3 = this.LIZJ.LIZ(j, density);
        float LIZ4 = this.LIZLLL.LIZ(j, density);
        float LIZJ = C10430b1.LIZJ(j);
        float f = LIZ + LIZ4;
        if (f > LIZJ) {
            float f2 = LIZJ / f;
            LIZ *= f2;
            LIZ4 *= f2;
        }
        float f3 = LIZ2 + LIZ3;
        if (f3 > LIZJ) {
            float f4 = LIZJ / f3;
            LIZ2 *= f4;
            LIZ3 *= f4;
        }
        if (LIZ >= 0.0f && LIZ2 >= 0.0f && LIZ3 >= 0.0f && LIZ4 >= 0.0f) {
            return LIZJ(j, LIZ, LIZ2, LIZ3, LIZ4, layoutDirection);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Corner size in Px can't be negative(topStart = ");
        LIZ5.append(LIZ);
        LIZ5.append(", topEnd = ");
        LIZ5.append(LIZ2);
        LIZ5.append(", bottomEnd = ");
        LIZ5.append(LIZ3);
        LIZ5.append(", bottomStart = ");
        LIZ5.append(LIZ4);
        LIZ5.append(")!");
        String LIZIZ = X1D.LIZIZ(LIZ5);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public AbstractC34231Vz(InterfaceC17460mM topStart, InterfaceC17460mM topEnd, InterfaceC17460mM bottomEnd, InterfaceC17460mM bottomStart) {
        o.LJIIIZ(topStart, "topStart");
        o.LJIIIZ(topEnd, "topEnd");
        o.LJIIIZ(bottomEnd, "bottomEnd");
        o.LJIIIZ(bottomStart, "bottomStart");
        this.LIZ = topStart;
        this.LIZIZ = topEnd;
        this.LIZJ = bottomEnd;
        this.LIZLLL = bottomStart;
    }
}
