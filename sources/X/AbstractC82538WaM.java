package X;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.WaM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82538WaM {
    public MotionEvent LIZ;
    public MotionEvent LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public final Context LJFF;

    public abstract void LIZ(MotionEvent motionEvent, int i);

    public abstract void LIZIZ(MotionEvent motionEvent, int i);

    public void LIZLLL() {
        MotionEvent motionEvent = this.LIZ;
        if (motionEvent != null) {
            o.LJI(motionEvent);
            motionEvent.recycle();
            this.LIZ = null;
        }
        MotionEvent motionEvent2 = this.LIZIZ;
        if (motionEvent2 != null) {
            o.LJI(motionEvent2);
            motionEvent2.recycle();
            this.LIZIZ = null;
        }
        this.LJ = false;
    }

    public AbstractC82538WaM(Context mContext) {
        o.LJIIIZ(mContext, "mContext");
        this.LJFF = mContext;
    }

    public final void LIZJ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        int action = event.getAction() & 255;
        if (!this.LJ) {
            LIZIZ(event, action);
        } else {
            LIZ(event, action);
        }
    }

    public void LJ(MotionEvent curr) {
        o.LJIIIZ(curr, "curr");
        MotionEvent motionEvent = this.LIZ;
        MotionEvent motionEvent2 = this.LIZIZ;
        if (motionEvent2 != null) {
            o.LJI(motionEvent2);
            motionEvent2.recycle();
            this.LIZIZ = null;
        }
        this.LIZIZ = MotionEvent.obtain(curr);
        curr.getEventTime();
        o.LJI(motionEvent);
        motionEvent.getEventTime();
        this.LIZJ = curr.getPressure(curr.getActionIndex());
        this.LIZLLL = motionEvent.getPressure(motionEvent.getActionIndex());
    }
}
