package X;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes16.dex */
public abstract class YJ0 {
    public final Unsafe LIZ;

    public YJ0(Unsafe unsafe) {
        this.LIZ = unsafe;
    }

    public abstract double LIZ(long j, Object obj);

    public abstract float LIZIZ(long j, Object obj);

    public abstract void LIZJ(long j, Object obj, boolean z);

    public abstract void LIZLLL(Object obj, long j, byte b);

    public abstract void LJ(Object obj, long j, double d);

    public abstract void LJFF(Object obj, long j, float f);

    public abstract boolean LJI(long j, Object obj);

    public final int LJII(Class cls) {
        return this.LIZ.arrayBaseOffset(cls);
    }

    public final int LJIIIIZZ(Class cls) {
        return this.LIZ.arrayIndexScale(cls);
    }

    public final void LJIIJJI(Field field) {
        this.LIZ.objectFieldOffset(field);
    }

    public final int LJIIIZ(long j, Object obj) {
        return this.LIZ.getInt(obj, j);
    }

    public final long LJIIJ(long j, Object obj) {
        return this.LIZ.getLong(obj, j);
    }

    public final Object LJIIL(long j, Object obj) {
        return this.LIZ.getObject(obj, j);
    }

    public final void LJIILIIL(long j, int i, Object obj) {
        this.LIZ.putInt(obj, j, i);
    }

    public final void LJIILJJIL(long j, Object obj, long j2) {
        this.LIZ.putLong(obj, j, j2);
    }

    public final void LJIILL(long j, Object obj, Object obj2) {
        this.LIZ.putObject(obj, j, obj2);
    }
}
