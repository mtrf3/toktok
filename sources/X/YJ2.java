package X;

import sun.misc.Unsafe;

/* loaded from: classes16.dex */
public final class YJ2 extends YJ1 {
    public YJ2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.YJ1
    public final boolean LJIIIIZZ(long j, Object obj) {
        if (C87166YIw.LJII) {
            if (C87166YIw.LJIJ(j, obj) != 0) {
                return true;
            }
            return false;
        }
        if (C87166YIw.LJIJI(j, obj) != 0) {
            return true;
        }
        return false;
    }

    @Override // X.YJ1
    public final float LJIIIZ(long j, Object obj) {
        return Float.intBitsToFloat(LJI(j, obj));
    }

    @Override // X.YJ1
    public final double LJIIJ(long j, Object obj) {
        return Double.longBitsToDouble(LJII(j, obj));
    }

    @Override // X.YJ1
    public final byte LJIIJJI(long j, Object obj) {
        if (C87166YIw.LJII) {
            return C87166YIw.LJIJ(j, obj);
        }
        return C87166YIw.LJIJI(j, obj);
    }

    @Override // X.YJ1
    public final void LIZIZ(long j, Object obj, boolean z) {
        if (C87166YIw.LJII) {
            C87166YIw.LIZJ(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            C87166YIw.LJII(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // X.YJ1
    public final void LIZJ(Object obj, long j, double d) {
        LIZ(j, obj, Double.doubleToLongBits(d));
    }

    @Override // X.YJ1
    public final void LIZLLL(Object obj, long j, float f) {
        LJ(j, Float.floatToIntBits(f), obj);
    }

    @Override // X.YJ1
    public final void LJFF(Object obj, long j, byte b) {
        if (C87166YIw.LJII) {
            C87166YIw.LIZJ(obj, j, b);
        } else {
            C87166YIw.LJII(obj, j, b);
        }
    }
}
