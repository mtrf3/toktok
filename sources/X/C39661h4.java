package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.1h4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39661h4 extends C17T<C39661h4> {
    public C00Q LJIL;
    public float LJJ;
    public boolean LJJI;

    public final void LJIIIIZZ() {
        if (this.LJIL.LIZIZ > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                if (this.LJFF) {
                    this.LJJI = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    public final void LJIIIZ() {
        C00Q c00q = this.LJIL;
        if (c00q != null) {
            double d = (float) c00q.LJIIIIZZ;
            if (d <= this.LJI) {
                if (d >= this.LJII) {
                    double abs = Math.abs(this.LJIIIZ * 0.75f);
                    c00q.LIZLLL = abs;
                    c00q.LJ = abs * 62.5d;
                    if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                        if (!this.LJFF) {
                            this.LJFF = true;
                            if (!this.LIZJ) {
                                this.LIZIZ = this.LJ.LLJJIJI(this.LIZLLL);
                            }
                            float f = this.LIZIZ;
                            if (f <= this.LJI && f >= this.LJII) {
                                ThreadLocal<C00M> threadLocal = C00M.LJI;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new C00M());
                                }
                                C00M c00m = threadLocal.get();
                                if (c00m.LIZIZ.size() == 0) {
                                    if (c00m.LIZLLL == null) {
                                        c00m.LIZLLL = new C17S(c00m.LIZJ);
                                    }
                                    C17S c17s = c00m.LIZLLL;
                                    c17s.LIZIZ.postFrameCallback(c17s.LIZJ);
                                }
                                if (!c00m.LIZIZ.contains(this)) {
                                    c00m.LIZIZ.add(this);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public final void LJII(float f) {
        if (this.LJFF) {
            this.LJJ = f;
            return;
        }
        if (this.LJIL == null) {
            this.LJIL = new C00Q(f);
        }
        this.LJIL.LJIIIIZZ = f;
        LJIIIZ();
    }

    public <K> C39661h4(K k, QXX qxx) {
        super(k, qxx);
        this.LJJ = Float.MAX_VALUE;
    }

    public <K> C39661h4(K k, QXX qxx, float f) {
        super(k, qxx);
        this.LJJ = Float.MAX_VALUE;
        this.LJIL = new C00Q(f);
    }
}
