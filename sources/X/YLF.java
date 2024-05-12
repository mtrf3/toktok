package X;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YLF extends YLG {
    public final YLO LJIIJJI;
    public boolean LJIIL;

    public final void LIZIZ() {
        MotionEvent motionEvent = this.LIZIZ;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.LIZIZ = null;
        }
        MotionEvent motionEvent2 = this.LIZJ;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.LIZJ = null;
        }
        this.LJFF = false;
        this.LJIIL = false;
    }

    public final void LIZJ(MotionEvent curr) {
        float f;
        float f2;
        float f3;
        int i;
        o.LJIIIZ(curr, "curr");
        MotionEvent motionEvent = this.LIZIZ;
        MotionEvent motionEvent2 = this.LIZJ;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.LIZJ = null;
        }
        this.LIZJ = MotionEvent.obtain(curr);
        if (motionEvent != null) {
            curr.getEventTime();
            motionEvent.getEventTime();
            this.LJ = motionEvent.getPressure(motionEvent.getActionIndex());
        }
        this.LIZLLL = curr.getPressure(curr.getActionIndex());
        MotionEvent motionEvent3 = this.LIZIZ;
        float f4 = 0.0f;
        if (motionEvent3 != null) {
            f = motionEvent3.getX(0);
            f2 = motionEvent3.getY(0);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (motionEvent3 != null && motionEvent3.getPointerCount() >= 2) {
            f4 = motionEvent3.getX(1);
            f3 = motionEvent3.getY(1);
        } else {
            f3 = 0.0f;
        }
        this.LJII = f4 - f;
        this.LJIIIIZZ = f3 - f2;
        float x = curr.getX(0);
        float y = curr.getY(0);
        if (curr.getPointerCount() >= 2) {
            f4 = curr.getX(1);
            f3 = curr.getY(1);
        }
        this.LJIIIZ = f4 - x;
        this.LJIIJ = f3 - y;
        int pointerCount = curr.getPointerCount();
        if ((curr.getAction() & 255) == 6) {
            i = curr.getActionIndex();
        } else {
            i = -1;
        }
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (i != i2) {
                curr.getX(i2);
                curr.getY(i2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLF(Context context, YLL yll) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJIIJJI = yll;
    }
}
