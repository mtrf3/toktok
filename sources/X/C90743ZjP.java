package X;

import sun.misc.Unsafe;

/* renamed from: X.ZjP, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90743ZjP extends AbstractC90367ZdL {
    public C90743ZjP(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.AbstractC90367ZdL
    public final double LIZ(long j, Object obj) {
        return Double.longBitsToDouble(LJIIJ(j, obj));
    }

    @Override // X.AbstractC90367ZdL
    public final float LIZIZ(long j, Object obj) {
        return Float.intBitsToFloat(LJIIIZ(j, obj));
    }

    @Override // X.AbstractC90367ZdL
    public final boolean LJI(long j, Object obj) {
        if (C90376ZdU.LJFF) {
            if (((byte) ((C90376ZdU.LIZJ.LJIIIZ((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
                return true;
            }
            return false;
        }
        if (((byte) ((C90376ZdU.LIZJ.LJIIIZ((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC90367ZdL
    public final void LIZJ(long j, Object obj, boolean z) {
        if (C90376ZdU.LJFF) {
            C90376ZdU.LIZJ(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            C90376ZdU.LIZLLL(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // X.AbstractC90367ZdL
    public final void LIZLLL(Object obj, long j, byte b) {
        if (C90376ZdU.LJFF) {
            C90376ZdU.LIZJ(obj, j, b);
        } else {
            C90376ZdU.LIZLLL(obj, j, b);
        }
    }

    @Override // X.AbstractC90367ZdL
    public final void LJ(Object obj, long j, double d) {
        LJIILJJIL(j, obj, Double.doubleToLongBits(d));
    }

    @Override // X.AbstractC90367ZdL
    public final void LJFF(Object obj, long j, float f) {
        LJIILIIL(j, Float.floatToIntBits(f), obj);
    }
}
