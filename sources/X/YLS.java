package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YLS extends YLR {
    public static final PointF LJIILIIL = new PointF();
    public final YLY LJIIIIZZ;
    public PointF LJIIIZ;
    public PointF LJIIJ;
    public final PointF LJIIJJI;
    public final PointF LJIIL;

    public static PointF LIZJ(MotionEvent motionEvent) {
        float f;
        int pointerCount = motionEvent.getPointerCount();
        float f2 = 0.0f;
        if (pointerCount > 0) {
            f = 0.0f;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                f2 += motionEvent.getX(i);
                f += motionEvent.getY(i);
                if (i2 >= pointerCount) {
                    break;
                }
                i = i2;
            }
        } else {
            f = 0.0f;
        }
        float f3 = pointerCount;
        return new PointF(f2 / f3, f / f3);
    }

    @Override // X.YLR
    public final void LIZIZ(MotionEvent curr) {
        PointF pointF;
        o.LJIIIZ(curr, "curr");
        super.LIZIZ(curr);
        MotionEvent motionEvent = this.LIZLLL;
        this.LJIIIZ = LIZJ(curr);
        o.LJI(motionEvent);
        this.LJIIJ = LIZJ(motionEvent);
        if (motionEvent.getPointerCount() != curr.getPointerCount()) {
            pointF = LJIILIIL;
        } else {
            PointF pointF2 = this.LJIIIZ;
            o.LJI(pointF2);
            float f = pointF2.x;
            PointF pointF3 = this.LJIIJ;
            o.LJI(pointF3);
            float f2 = f - pointF3.x;
            PointF pointF4 = this.LJIIIZ;
            o.LJI(pointF4);
            float f3 = pointF4.y;
            PointF pointF5 = this.LJIIJ;
            o.LJI(pointF5);
            pointF = new PointF(f2, f3 - pointF5.y);
        }
        PointF pointF6 = this.LJIIJJI;
        pointF6.x += pointF.x;
        pointF6.y += pointF.y;
        this.LJIIL.x = curr.getRawX();
        this.LJIIL.y = curr.getRawY();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLS(Context context, YLX mListener) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mListener, "mListener");
        this.LJIIIIZZ = mListener;
        this.LJIIJJI = new PointF();
        new PointF();
        this.LJIIL = new PointF();
    }

    public final void LIZLLL(MotionEvent event, int i) {
        MotionEvent motionEvent;
        o.LJIIIZ(event, "event");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 6) {
                        return;
                    }
                    MotionEvent motionEvent2 = this.LIZLLL;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.LIZLLL = MotionEvent.obtain(event);
                    return;
                }
            } else {
                if (this.LIZLLL == null) {
                    return;
                }
                LIZIZ(event);
                MotionEvent motionEvent3 = this.LJ;
                if (motionEvent3 == null || (motionEvent = this.LIZJ) == null) {
                    return;
                }
                float x = motionEvent3.getX() - motionEvent.getX();
                float y = motionEvent3.getY() - motionEvent.getY();
                float f = (y * y) + (x * x);
                int i2 = this.LJII;
                if (f <= i2 * i2 || this.LJFF / this.LJI <= 0.67f) {
                    return;
                }
                this.LJIIIIZZ.LIZIZ(this);
                MotionEvent motionEvent4 = this.LIZLLL;
                o.LJI(motionEvent4);
                motionEvent4.recycle();
                this.LIZLLL = MotionEvent.obtain(event);
                return;
            }
        }
        this.LJIIIIZZ.LIZJ(this);
        LIZ();
    }

    public final void LJ(MotionEvent event, int i) {
        o.LJIIIZ(event, "event");
        if (i != 0) {
            if (i != 2) {
                return;
            }
            YLY yly = this.LJIIIIZZ;
            MotionEvent motionEvent = this.LIZLLL;
            if (motionEvent != null) {
                motionEvent.getRawX();
            }
            MotionEvent motionEvent2 = this.LIZLLL;
            if (motionEvent2 != null) {
                motionEvent2.getRawY();
            }
            yly.LIZ(this);
            this.LIZIZ = true;
            return;
        }
        LIZ();
        PointF pointF = this.LJIIJJI;
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        this.LIZJ = MotionEvent.obtain(event);
        this.LIZLLL = MotionEvent.obtain(event);
        LIZIZ(event);
    }
}
