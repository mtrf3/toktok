package X;

import X.C0Q9;
import kotlin.jvm.internal.o;

/* renamed from: X.1jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41441jw<V extends C0Q9> implements C1J0<V> {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC07020Pi LJLJI;
    public final C1J3<V> LJLJJI;

    @Override // X.C0QF
    public final boolean LIZ() {
        return false;
    }

    @Override // X.C1J0
    public final int LJFF() {
        return this.LJLILLLLZI;
    }

    @Override // X.C1J0
    public final int LJI() {
        return this.LJLIL;
    }

    public C41441jw(final int i, final int i2, final InterfaceC07020Pi easing) {
        o.LJIIIZ(easing, "easing");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = easing;
        this.LJLJJI = new C1J3<>(new C1J6(i, i2, easing) { // from class: X.1jv
            public final int LIZ;
            public final int LIZIZ;
            public final InterfaceC07020Pi LIZJ;

            @Override // X.C0Q2
            public final C0QF LIZ(C0QC converter) {
                o.LJIIIZ(converter, "converter");
                return new C1J3(this);
            }

            {
                o.LJIIIZ(easing, "easing");
                this.LIZ = i;
                this.LIZIZ = i2;
                this.LIZJ = easing;
            }

            @Override // X.C1J6
            public final long LIZJ(float f, float f2, float f3) {
                return (this.LIZIZ + this.LIZ) * 1000000;
            }

            @Override // X.C1J6
            public final float LIZLLL(float f, float f2, float f3) {
                return LIZIZ(LIZJ(f, f2, f3), f, f2, f3);
            }

            @Override // X.C1J6
            public final float LIZIZ(long j, float f, float f2, float f3) {
                long LJIILIIL = C78842Uww.LJIILIIL((j / 1000000) - this.LIZIZ, 0L, this.LIZ);
                if (LJIILIIL < 0) {
                    return 0.0f;
                }
                if (LJIILIIL == 0) {
                    return f3;
                }
                return (LJ(LJIILIIL * 1000000, f, f2, f3) - LJ((LJIILIIL - 1) * 1000000, f, f2, f3)) * 1000.0f;
            }

            @Override // X.C1J6
            public final float LJ(long j, float f, float f2, float f3) {
                float f4;
                long LJIILIIL = C78842Uww.LJIILIIL((j / 1000000) - this.LIZIZ, 0L, this.LIZ);
                int i3 = this.LIZ;
                if (i3 == 0) {
                    f4 = 1.0f;
                } else {
                    f4 = ((float) LJIILIIL) / i3;
                }
                float LIZ = this.LIZJ.LIZ(C78842Uww.LJIIJJI(f4, 0.0f, 1.0f));
                return (f2 * LIZ) + ((1 - LIZ) * f);
            }
        });
    }

    @Override // X.C0QF
    public final V LIZJ(V v, V v2, V v3) {
        return (V) C07030Pj.LIZIZ(this, v, v2, v3);
    }

    @Override // X.C0QF
    public final long LJII(V v, V v2, V v3) {
        return C07030Pj.LIZ(this, v, v2, v3);
    }

    @Override // X.C0QF
    public final V LIZIZ(long j, V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        return this.LJLJJI.LIZIZ(j, initialValue, targetValue, initialVelocity);
    }

    @Override // X.C0QF
    public final V LIZLLL(long j, V initialValue, V targetValue, V initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        return this.LJLJJI.LIZLLL(j, initialValue, targetValue, initialVelocity);
    }
}
