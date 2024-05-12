package X;

import Y.ARunnableS48S0100000_12;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SJ4 extends GestureDetector.SimpleOnGestureListener {
    public final SJ3 LJLIL;
    public final PointF LJLILLLLZI;

    public SJ4(SJ3 zoomableControllerImp) {
        o.LJIIIZ(zoomableControllerImp, "zoomableControllerImp");
        this.LJLIL = zoomableControllerImp;
        this.LJLILLLLZI = new PointF();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        SJ3 sj3 = this.LJLIL;
        PointF pointF = new PointF(e.getX(), e.getY());
        int actionMasked = e.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (sj3.LJZL == null) {
                    sj3.LJZL = new C34821Yg(sj3);
                }
                SJG sjg = sj3.LJZL;
                sj3.LJLLI.getValues(sj3.LJLLJ);
                C34821Yg c34821Yg = (C34821Yg) sjg;
                c34821Yg.LJIIIIZZ(sj3.LJLLJ[0]);
                sj3.LLFZ = true;
                sj3.LJLLI.getValues(sj3.LJLLJ);
                float LJIIIIZZ = c34821Yg.LJIIIIZZ(sj3.LJLLJ[0]);
                ARunnableS48S0100000_12 aRunnableS48S0100000_12 = new ARunnableS48S0100000_12(sj3, 121);
                if (sj3.LLD.isRunning()) {
                    sj3.LJIJ();
                }
                sj3.LJLZ.reset();
                Matrix matrix = sj3.LJLZ;
                float[] fArr = sj3.LJLLJ;
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                sj3.LJLLI.invert(sj3.LJLLILLLL);
                sj3.LJLLILLLL.mapPoints(fArr, 0, fArr, 0, 1);
                PointF pointF2 = new PointF(fArr[0], fArr[1]);
                matrix.setScale(LJIIIIZZ, LJIIIIZZ, pointF2.x, pointF2.y);
                sj3.LJIIJJI(matrix, pointF2.x, pointF2.y);
                sj3.LJIIL(matrix);
                sj3.LJIIZILJ(sj3.LJLZ, sj3.LLF, aRunnableS48S0100000_12, null);
            }
        } else {
            this.LJLILLLLZI.set(pointF);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        super.onLongPress(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return super.onSingleTapConfirmed(e);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        SJ3 sj3 = this.LJLIL;
        sj3.LJLLI.getValues(sj3.LJLLJ);
        if (sj3.LJLLJ[0] > 1.0f) {
            int i = (int) f;
            int i2 = (int) f2;
            if (!sj3.LLD.isRunning() && sj3.LJLJJL) {
                if (sj3.LLFFF.computeScrollOffset() && sj3.LLFFF.computeScrollOffset()) {
                    sj3.LLFFF.forceFinished(true);
                }
                sj3.LLFFF.fling(0, 0, i, i2, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
                sj3.LJZI.set(sj3.LJLLI);
                Matrix matrix = sj3.LJLLI;
                matrix.set(matrix);
                sj3.LJFF();
            }
        }
        return false;
    }
}
