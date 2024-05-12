package X;

import sun.misc.Unsafe;

/* loaded from: classes15.dex */
public final class VKQ extends YJ1 {
    public VKQ(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.YJ1
    public final boolean LJIIIIZZ(long j, Object obj) {
        return this.LIZ.getBoolean(obj, j);
    }

    @Override // X.YJ1
    public final float LJIIIZ(long j, Object obj) {
        return this.LIZ.getFloat(obj, j);
    }

    @Override // X.YJ1
    public final double LJIIJ(long j, Object obj) {
        return this.LIZ.getDouble(obj, j);
    }

    @Override // X.YJ1
    public final byte LJIIJJI(long j, Object obj) {
        return this.LIZ.getByte(obj, j);
    }

    @Override // X.YJ1
    public final void LIZIZ(long j, Object obj, boolean z) {
        this.LIZ.putBoolean(obj, j, z);
    }

    @Override // X.YJ1
    public final void LIZJ(Object obj, long j, double d) {
        this.LIZ.putDouble(obj, j, d);
    }

    @Override // X.YJ1
    public final void LIZLLL(Object obj, long j, float f) {
        this.LIZ.putFloat(obj, j, f);
    }

    @Override // X.YJ1
    public final void LJFF(Object obj, long j, byte b) {
        this.LIZ.putByte(obj, j, b);
    }
}
