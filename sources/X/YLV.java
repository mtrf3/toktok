package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.cut_ui_impl.process.clip.gesture.Vector2D;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YLV {
    public final InterfaceC87222YLa LIZ;
    public boolean LIZIZ;
    public MotionEvent LIZJ;
    public MotionEvent LIZLLL;
    public final Vector2D LJ;
    public float LJFF;
    public float LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;

    public final void LIZIZ() {
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
        this.LIZIZ = false;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1;
        this.LJII = false;
    }

    public YLV(InterfaceC87222YLa mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LIZ = mListener;
        this.LJ = new Vector2D();
    }

    public final void LIZJ(MotionEvent motionEvent, View view) {
        MotionEvent motionEvent2 = this.LIZLLL;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.LIZLLL = MotionEvent.obtain(motionEvent);
        this.LJ.set(0.0f, 0.0f);
        MotionEvent motionEvent3 = this.LIZJ;
        o.LJI(motionEvent3);
        int findPointerIndex = motionEvent3.findPointerIndex(this.LJIIIIZZ);
        int findPointerIndex2 = motionEvent3.findPointerIndex(this.LJIIIZ);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.LJIIIIZZ);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.LJIIIZ);
        if (findPointerIndex < 0 || findPointerIndex2 < 0 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
            this.LJII = true;
            if (this.LIZIZ) {
                this.LIZ.LIZIZ(view, this);
                return;
            }
            return;
        }
        motionEvent3.getX(findPointerIndex);
        motionEvent3.getY(findPointerIndex);
        motionEvent3.getX(findPointerIndex2);
        motionEvent3.getY(findPointerIndex2);
        float x = motionEvent.getX(findPointerIndex3);
        float y = motionEvent.getY(findPointerIndex3);
        float x2 = motionEvent.getX(findPointerIndex4);
        float y2 = motionEvent.getY(findPointerIndex4) - y;
        this.LJ.set(x2 - x, y2);
        motionEvent.getEventTime();
        motionEvent3.getEventTime();
        this.LJFF = motionEvent.getPressure(findPointerIndex4) + motionEvent.getPressure(findPointerIndex3);
        this.LJI = motionEvent3.getPressure(findPointerIndex2) + motionEvent3.getPressure(findPointerIndex);
    }

    public static int LIZ(int i, int i2, MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (pointerCount > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 != i2 && i3 != findPointerIndex) {
                    return i3;
                }
                if (i4 >= pointerCount) {
                    return -1;
                }
                i3 = i4;
            }
        } else {
            return -1;
        }
    }
}
