package X;

import sun.misc.Unsafe;

/* loaded from: classes16.dex */
public abstract class YJ1 {
    public final Unsafe LIZ;

    public abstract void LIZIZ(long j, Object obj, boolean z);

    public abstract void LIZJ(Object obj, long j, double d);

    public abstract void LIZLLL(Object obj, long j, float f);

    public abstract void LJFF(Object obj, long j, byte b);

    public abstract boolean LJIIIIZZ(long j, Object obj);

    public abstract float LJIIIZ(long j, Object obj);

    public abstract double LJIIJ(long j, Object obj);

    public abstract byte LJIIJJI(long j, Object obj);

    public YJ1(Unsafe unsafe) {
        this.LIZ = unsafe;
    }

    public final int LJI(long j, Object obj) {
        return this.LIZ.getInt(obj, j);
    }

    public final long LJII(long j, Object obj) {
        return this.LIZ.getLong(obj, j);
    }

    public final void LIZ(long j, Object obj, long j2) {
        this.LIZ.putLong(obj, j, j2);
    }

    public final void LJ(long j, int i, Object obj) {
        this.LIZ.putInt(obj, j, i);
    }
}
