package X;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YLU extends YLQ {
    public final YLZ LJIILIIL;
    public boolean LJIILJJIL;

    @Override // X.YLR
    public final void LIZ() {
        super.LIZ();
        this.LJIILJJIL = false;
    }

    @Override // X.YLQ, X.YLR
    public final void LIZIZ(MotionEvent curr) {
        int i;
        o.LJIIIZ(curr, "curr");
        super.LIZIZ(curr);
        int pointerCount = curr.getPointerCount();
        if ((curr.getAction() & 255) == 6) {
            i = curr.getActionIndex();
        } else {
            i = -1;
        }
        if (pointerCount > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i != i2) {
                    curr.getX(i2);
                    curr.getY(i2);
                }
                if (i3 >= pointerCount) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLU(Context context, YLW mListener) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mListener, "mListener");
        this.LJIILIIL = mListener;
    }

    public final void LIZLLL(MotionEvent event, int i) {
        o.LJIIIZ(event, "event");
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    return;
                }
                LIZIZ(event);
                if (!this.LJIILJJIL) {
                    this.LJIILIIL.LIZ(this);
                }
                LIZ();
                return;
            }
            if (!this.LJIILJJIL) {
                this.LJIILIIL.LIZ(this);
            }
            LIZ();
            return;
        }
        LIZIZ(event);
        if (this.LJFF / this.LJI <= 0.67f) {
            return;
        }
        this.LJIILIIL.LIZIZ(this);
        MotionEvent motionEvent = this.LIZLLL;
        o.LJI(motionEvent);
        motionEvent.recycle();
        this.LIZLLL = MotionEvent.obtain(event);
    }

    public final void LJ(MotionEvent event, int i) {
        o.LJIIIZ(event, "event");
        if (i != 2) {
            if (i != 5) {
                return;
            }
            LIZ();
            this.LIZLLL = MotionEvent.obtain(event);
            LIZIZ(event);
            boolean LIZJ = LIZJ(event);
            this.LJIILJJIL = LIZJ;
            if (LIZJ) {
                return;
            }
            this.LJIILIIL.LIZJ(this);
            this.LIZIZ = true;
            return;
        }
        if (!this.LJIILJJIL) {
            return;
        }
        boolean LIZJ2 = LIZJ(event);
        this.LJIILJJIL = LIZJ2;
        if (LIZJ2) {
            return;
        }
        this.LJIILIIL.LIZJ(this);
        this.LIZIZ = true;
    }
}
