package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.Vector2D;
import kotlin.jvm.internal.o;

/* renamed from: X.WGr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82013WGr {
    public final InterfaceC82015WGt LIZ;
    public boolean LIZIZ;
    public MotionEvent LIZJ;
    public MotionEvent LIZLLL;
    public final Vector2D LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;

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
        this.LJIIZILJ = -1;
        this.LJIJ = -1;
        this.LJIILLIIL = false;
    }

    public C82013WGr(C82019WGx mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LIZ = mListener;
        this.LJ = new Vector2D();
    }

    public final void LIZJ(MotionEvent motionEvent, View view) {
        MotionEvent motionEvent2 = this.LIZLLL;
        if (motionEvent2 != null) {
            o.LJI(motionEvent2);
            motionEvent2.recycle();
        }
        this.LIZLLL = MotionEvent.obtain(motionEvent);
        this.LJIIJJI = -1.0f;
        this.LJIIL = -1.0f;
        this.LJIILIIL = -1.0f;
        this.LJ.set(0.0f, 0.0f);
        MotionEvent motionEvent3 = this.LIZJ;
        o.LJI(motionEvent3);
        int findPointerIndex = motionEvent3.findPointerIndex(this.LJIIZILJ);
        int findPointerIndex2 = motionEvent3.findPointerIndex(this.LJIJ);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.LJIIZILJ);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.LJIJ);
        if (findPointerIndex < 0 || findPointerIndex2 < 0 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
            this.LJIILLIIL = true;
            if (this.LIZIZ) {
                this.LIZ.LIZJ(view, this);
                return;
            }
            return;
        }
        float x = motionEvent3.getX(findPointerIndex);
        float y = motionEvent3.getY(findPointerIndex);
        float x2 = motionEvent3.getX(findPointerIndex2);
        float y2 = motionEvent3.getY(findPointerIndex2);
        float x3 = motionEvent.getX(findPointerIndex3);
        float y3 = motionEvent.getY(findPointerIndex3);
        float x4 = motionEvent.getX(findPointerIndex4) - x3;
        float y4 = motionEvent.getY(findPointerIndex4) - y3;
        this.LJ.set(x4, y4);
        this.LJII = x2 - x;
        this.LJIIIIZZ = y2 - y;
        this.LJIIIZ = x4;
        this.LJIIJ = y4;
        this.LJFF = (x4 * 0.5f) + x3;
        this.LJI = (y4 * 0.5f) + y3;
        motionEvent.getEventTime();
        motionEvent3.getEventTime();
        this.LJIILJJIL = motionEvent.getPressure(findPointerIndex4) + motionEvent.getPressure(findPointerIndex3);
        this.LJIILL = motionEvent3.getPressure(findPointerIndex2) + motionEvent3.getPressure(findPointerIndex);
    }

    public static int LIZ(int i, int i2, MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int findPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i3 != i2 && i3 != findPointerIndex) {
                return i3;
            }
        }
        return -1;
    }
}
