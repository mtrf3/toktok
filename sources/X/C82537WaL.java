package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WaL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82537WaL extends AbstractC82538WaM {
    public static final PointF LJIIL = new PointF();
    public PointF LJI;
    public PointF LJII;
    public final PointF LJIIIIZZ;
    public PointF LJIIIZ;
    public int LJIIJ;
    public final InterfaceC82539WaN LJIIJJI;

    public final float LJI() {
        MotionEvent motionEvent = this.LIZIZ;
        if (motionEvent == null) {
            return -1.0f;
        }
        return motionEvent.getX();
    }

    public final float LJII() {
        MotionEvent motionEvent = this.LIZIZ;
        if (motionEvent == null) {
            return -1.0f;
        }
        return motionEvent.getY();
    }

    public static PointF LJFF(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    @Override // X.AbstractC82538WaM
    public final void LJ(MotionEvent curr) {
        PointF pointF;
        o.LJIIIZ(curr, "curr");
        super.LJ(curr);
        MotionEvent motionEvent = this.LIZ;
        this.LJI = LJFF(curr);
        o.LJI(motionEvent);
        this.LJII = LJFF(motionEvent);
        if (motionEvent.getPointerCount() != curr.getPointerCount()) {
            pointF = LJIIL;
        } else {
            PointF pointF2 = this.LJI;
            o.LJI(pointF2);
            float f = pointF2.x;
            PointF pointF3 = this.LJII;
            o.LJI(pointF3);
            float f2 = f - pointF3.x;
            PointF pointF4 = this.LJI;
            o.LJI(pointF4);
            float f3 = pointF4.y;
            PointF pointF5 = this.LJII;
            o.LJI(pointF5);
            pointF = new PointF(f2, f3 - pointF5.y);
        }
        this.LJIIIZ = pointF;
        PointF pointF6 = this.LJIIIIZZ;
        pointF6.x += pointF.x;
        pointF6.y += pointF.y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82537WaL(Context context, InterfaceC82539WaN mListener) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mListener, "mListener");
        this.LJIIJJI = mListener;
        this.LJIIIIZZ = new PointF();
        this.LJIIIZ = new PointF();
    }

    @Override // X.AbstractC82538WaM
    public final void LIZ(MotionEvent event, int i) {
        o.LJIIIZ(event, "event");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else {
                if (this.LIZ == null) {
                    this.LIZ = MotionEvent.obtain(event);
                }
                LJ(event);
                if (this.LIZJ / this.LIZLLL <= 0.67f) {
                    return;
                }
                this.LJIIJ = event.getPointerCount();
                this.LJIIJJI.LJLI(this);
                MotionEvent motionEvent = this.LIZ;
                o.LJI(motionEvent);
                motionEvent.recycle();
                this.LIZ = MotionEvent.obtain(event);
                return;
            }
        }
        this.LJIIJJI.LJLJJI(this);
        LIZLLL();
    }

    @Override // X.AbstractC82538WaM
    public final void LIZIZ(MotionEvent event, int i) {
        float x;
        o.LJIIIZ(event, "event");
        if (i != 0) {
            if (i != 2) {
                return;
            }
            InterfaceC82539WaN interfaceC82539WaN = this.LJIIJJI;
            MotionEvent motionEvent = this.LIZ;
            float f = -1.0f;
            if (motionEvent == null) {
                x = -1.0f;
            } else {
                x = motionEvent.getX();
            }
            MotionEvent motionEvent2 = this.LIZ;
            if (motionEvent2 != null) {
                f = motionEvent2.getY();
            }
            interfaceC82539WaN.LJJLIL(this, x, f);
            this.LJ = true;
            return;
        }
        LIZLLL();
        PointF pointF = this.LJIIIIZZ;
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        this.LIZ = MotionEvent.obtain(event);
        LJ(event);
    }
}
