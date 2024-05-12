package X;

import android.graphics.drawable.Animatable;

/* loaded from: classes15.dex */
public final class W4Y<INFO> implements W4Z<INFO> {
    public final W4Z<INFO>[] LIZ;

    public W4Y(W4Z<INFO>... w4zArr) {
        this.LIZ = w4zArr;
    }

    @Override // X.W4Z
    public final void LIZJ(String str) {
        W4Z<INFO>[] w4zArr = this.LIZ;
        if (w4zArr != null) {
            for (W4Z<INFO> w4z : w4zArr) {
                if (w4z != null) {
                    w4z.LIZJ(str);
                }
            }
        }
    }

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
        W4Z<INFO>[] w4zArr = this.LIZ;
        if (w4zArr != null) {
            for (W4Z<INFO> w4z : w4zArr) {
                if (w4z != null) {
                    w4z.LIZIZ(str, th);
                }
            }
        }
    }

    @Override // X.W4Z
    public final void LIZLLL(Object obj, String str) {
        W4Z<INFO>[] w4zArr = this.LIZ;
        if (w4zArr != null) {
            for (W4Z<INFO> w4z : w4zArr) {
                if (w4z != null) {
                    w4z.LIZLLL(obj, str);
                }
            }
        }
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
        W4Z<INFO>[] w4zArr = this.LIZ;
        if (w4zArr != null) {
            for (W4Z<INFO> w4z : w4zArr) {
                if (w4z != null) {
                    w4z.LJ(str, th);
                }
            }
        }
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
        W4Z<INFO>[] w4zArr = this.LIZ;
        if (w4zArr != null) {
            for (W4Z<INFO> w4z : w4zArr) {
                if (w4z != null) {
                    w4z.LJI(obj, str);
                }
            }
        }
    }

    @Override // X.W4Z
    public final void LJFF(String str, INFO info, Animatable animatable) {
        W4Z<INFO>[] w4zArr = this.LIZ;
        if (w4zArr != null) {
            for (W4Z<INFO> w4z : w4zArr) {
                if (w4z != null) {
                    w4z.LJFF(str, info, animatable);
                }
            }
        }
    }
}
