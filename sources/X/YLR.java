package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class YLR {
    public final Context LIZ;
    public boolean LIZIZ;
    public MotionEvent LIZJ;
    public MotionEvent LIZLLL;
    public MotionEvent LJ;
    public float LJFF;
    public float LJI;
    public final int LJII;

    public void LIZ() {
        MotionEvent motionEvent = this.LIZJ;
        if (motionEvent != null) {
            o.LJI(motionEvent);
            motionEvent.recycle();
            this.LIZJ = null;
        }
        MotionEvent motionEvent2 = this.LIZLLL;
        if (motionEvent2 != null) {
            o.LJI(motionEvent2);
            motionEvent2.recycle();
            this.LIZLLL = null;
        }
        MotionEvent motionEvent3 = this.LJ;
        if (motionEvent3 != null) {
            o.LJI(motionEvent3);
            motionEvent3.recycle();
            this.LJ = null;
        }
        this.LIZIZ = false;
    }

    public YLR(Context mContext) {
        o.LJIIIZ(mContext, "mContext");
        this.LIZ = mContext;
        this.LJII = ViewConfiguration.get(mContext).getScaledTouchSlop();
    }

    public void LIZIZ(MotionEvent curr) {
        o.LJIIIZ(curr, "curr");
        MotionEvent motionEvent = this.LIZLLL;
        MotionEvent motionEvent2 = this.LJ;
        if (motionEvent2 != null) {
            o.LJI(motionEvent2);
            motionEvent2.recycle();
            this.LJ = null;
        }
        this.LJ = MotionEvent.obtain(curr);
        curr.getEventTime();
        o.LJI(motionEvent);
        motionEvent.getEventTime();
        this.LJFF = curr.getPressure(curr.getActionIndex());
        this.LJI = motionEvent.getPressure(motionEvent.getActionIndex());
    }
}
