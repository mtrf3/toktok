package X;

/* renamed from: X.W6u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81756W6u<T> implements W7F<T> {
    public boolean LIZ;

    public static boolean LIZLLL(int i) {
        return (i & 1) == 1;
    }

    public static boolean LJIIJ(int i, int i2) {
        return (i & i2) == i2;
    }

    @Override // X.W7F
    public final synchronized void LIZJ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        try {
            LJFF();
        } catch (Exception e) {
            LJIIIZ(e);
        }
    }

    public abstract void LJFF();

    public abstract void LJI(Throwable th);

    public abstract void LJII(int i, Object obj);

    public abstract void LJIIIIZZ(float f);

    public static boolean LJ(int i) {
        return !LIZLLL(i);
    }

    @Override // X.W7F
    public final synchronized void LIZ(float f) {
        if (this.LIZ) {
            return;
        }
        try {
            LJIIIIZZ(f);
        } catch (Exception e) {
            LJIIIZ(e);
        }
    }

    public final void LJIIIZ(Exception exc) {
        Class<?> cls = getClass();
        if (W58.LIZ.LJIIIIZZ(6)) {
            W58.LIZ.LJI(C16880lQ.LJLLJ(cls), exc);
        }
    }

    @Override // X.W7F
    public final synchronized void onFailure(Throwable th) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        try {
            LJI(th);
        } catch (Exception e) {
            LJIIIZ(e);
        }
    }

    @Override // X.W7F
    public final synchronized void LIZIZ(int i, Object obj) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = LIZLLL(i);
        try {
            LJII(i, obj);
        } catch (Exception e) {
            LJIIIZ(e);
        }
    }
}
