package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.ugc.android.editor.track.widget.Vector2D;
import kotlin.jvm.internal.o;

/* renamed from: X.YAf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86941YAf {
    public final InterfaceC86942YAg LIZ;
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
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;

    public final float LIZIZ() {
        if (this.LJIIJJI == -1.0f) {
            if (this.LJIIIZ == -1.0f) {
                float f = this.LJII;
                float f2 = this.LJIIIIZZ;
                this.LJIIIZ = (float) Math.sqrt((f2 * f2) + (f * f));
            }
            float f3 = this.LJIIIZ;
            if (this.LJIIJ == -1.0f) {
                float f4 = this.LJFF;
                float f5 = this.LJI;
                this.LJIIJ = (float) Math.sqrt((f5 * f5) + (f4 * f4));
            }
            this.LJIIJJI = f3 / this.LJIIJ;
        }
        return this.LJIIJJI;
    }

    public final void LIZLLL() {
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
        this.LJIILL = -1;
        this.LJIILLIIL = -1;
        this.LJIILJJIL = false;
    }

    public C86941YAf(InterfaceC86942YAg mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LIZ = mListener;
        this.LJ = new Vector2D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (r5 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.view.MotionEvent r8, android.view.View r9) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86941YAf.LIZJ(android.view.MotionEvent, android.view.View):boolean");
    }

    public final void LJ(MotionEvent motionEvent, View view) {
        MotionEvent motionEvent2 = this.LIZLLL;
        if (motionEvent2 != null) {
            o.LJI(motionEvent2);
            motionEvent2.recycle();
        }
        this.LIZLLL = MotionEvent.obtain(motionEvent);
        this.LJIIIZ = -1.0f;
        this.LJIIJ = -1.0f;
        this.LJIIJJI = -1.0f;
        this.LJ.set(0.0f, 0.0f);
        MotionEvent motionEvent3 = this.LIZJ;
        o.LJI(motionEvent3);
        int findPointerIndex = motionEvent3.findPointerIndex(this.LJIILL);
        int findPointerIndex2 = motionEvent3.findPointerIndex(this.LJIILLIIL);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.LJIILL);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.LJIILLIIL);
        if (findPointerIndex < 0 || findPointerIndex2 < 0 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
            this.LJIILJJIL = true;
            C131935Ft.LIZLLL("ScaleGestureDetector", "Invalid MotionEvent stream detected.");
            if (this.LIZIZ) {
                this.LIZ.LIZ(view, this);
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
        this.LJFF = x2 - x;
        this.LJI = y2 - y;
        this.LJII = x4;
        this.LJIIIIZZ = y4;
        motionEvent.getEventTime();
        motionEvent3.getEventTime();
        this.LJIIL = motionEvent.getPressure(findPointerIndex4) + motionEvent.getPressure(findPointerIndex3);
        this.LJIILIIL = motionEvent3.getPressure(findPointerIndex2) + motionEvent3.getPressure(findPointerIndex);
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
