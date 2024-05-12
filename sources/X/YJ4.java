package X;

import sun.misc.Unsafe;

/* loaded from: classes16.dex */
public final class YJ4 extends YJ0 {
    public YJ4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.YJ0
    public final double LIZ(long j, Object obj) {
        return Double.longBitsToDouble(LJIIJ(j, obj));
    }

    @Override // X.YJ0
    public final float LIZIZ(long j, Object obj) {
        return Float.intBitsToFloat(LJIIIZ(j, obj));
    }

    @Override // X.YJ0
    public final boolean LJI(long j, Object obj) {
        if (C87167YIx.LJFF) {
            if (((byte) ((C87167YIx.LIZJ.LJIIIZ((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
                return true;
            }
            return false;
        }
        if (((byte) ((C87167YIx.LIZJ.LJIIIZ((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    @Override // X.YJ0
    public final void LIZJ(long j, Object obj, boolean z) {
        if (C87167YIx.LJFF) {
            C87167YIx.LIZJ(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            C87167YIx.LIZLLL(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // X.YJ0
    public final void LIZLLL(Object obj, long j, byte b) {
        if (C87167YIx.LJFF) {
            C87167YIx.LIZJ(obj, j, b);
        } else {
            C87167YIx.LIZLLL(obj, j, b);
        }
    }

    @Override // X.YJ0
    public final void LJ(Object obj, long j, double d) {
        LJIILJJIL(j, obj, Double.doubleToLongBits(d));
    }

    @Override // X.YJ0
    public final void LJFF(Object obj, long j, float f) {
        LJIILIIL(j, Float.floatToIntBits(f), obj);
    }
}
