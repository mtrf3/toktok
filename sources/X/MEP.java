package X;

import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MEP {
    public float LIZ = 1.0f;
    public float LIZIZ = 1.0f;
    public float LIZJ = 4.0f;
    public final PointF LIZLLL = new PointF();
    public float LJ;
    public float LJFF;
    public int LJI;
    public final ScaleGestureDetector LJII;
    public InterfaceC222998p5 LJIIIIZZ;
    public ViewGroup LJIIIZ;

    public final void LIZ() {
        InterfaceC222998p5 interfaceC222998p5 = this.LJIIIIZZ;
        if (interfaceC222998p5 != null) {
            interfaceC222998p5.Y1(this.LIZ);
        }
        this.LJI = 2;
        ViewGroup viewGroup = this.LJIIIZ;
        if (viewGroup == null) {
            return;
        }
        viewGroup.animate().x(this.LJ).y(this.LJFF).setInterpolator(new DecelerateInterpolator()).scaleX(1.0f).scaleY(1.0f).withEndAction(new ARunnableS45S0100000_9(this, 118)).start();
    }

    public MEP(Context context) {
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new MEO(this));
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.LJII = scaleGestureDetector;
    }

    public final boolean LIZIZ(MotionEvent event) {
        float f;
        o.LJIIIZ(event, "event");
        if (event.getPointerCount() <= 2) {
            this.LJII.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6 && this.LJI == 1) {
                            LIZ();
                        }
                    } else if (this.LJI == 0 && event.getPointerCount() == 2) {
                        ViewGroup viewGroup = this.LJIIIZ;
                        if (viewGroup != null) {
                            viewGroup.requestDisallowInterceptTouchEvent(true);
                        }
                        this.LJI = 1;
                        ViewGroup viewGroup2 = this.LJIIIZ;
                        float f2 = 0.0f;
                        if (viewGroup2 != null) {
                            f = viewGroup2.getX();
                        } else {
                            f = 0.0f;
                        }
                        this.LJ = f;
                        ViewGroup viewGroup3 = this.LJIIIZ;
                        if (viewGroup3 != null) {
                            f2 = viewGroup3.getY();
                        }
                        this.LJFF = f2;
                        InterfaceC222998p5 interfaceC222998p5 = this.LJIIIIZZ;
                        if (interfaceC222998p5 != null) {
                            interfaceC222998p5.m();
                        }
                        float f3 = 2;
                        this.LIZLLL.x = (event.getX(1) + event.getX(0)) / f3;
                        this.LIZLLL.y = (event.getY(1) + event.getY(0)) / f3;
                    }
                } else if (this.LJI == 1) {
                    LIZ();
                    ViewGroup viewGroup4 = this.LJIIIZ;
                    if (viewGroup4 != null) {
                        viewGroup4.requestDisallowInterceptTouchEvent(false);
                    }
                    return false;
                }
            } else if (this.LJI == 1 && event.getPointerCount() == 2) {
                float f4 = 2;
                float x = (event.getX(1) + event.getX(0)) / f4;
                float y = (event.getY(1) + event.getY(0)) / f4;
                ViewGroup viewGroup5 = this.LJIIIZ;
                if (viewGroup5 != null) {
                    viewGroup5.setX(viewGroup5.getX() - (this.LIZLLL.x - x));
                    viewGroup5.setY(viewGroup5.getY() - (this.LIZLLL.y - y));
                }
                PointF pointF = this.LIZLLL;
                pointF.x = x;
                pointF.y = y;
            }
        } else {
            if (this.LJI == 1) {
                this.LJI = 0;
            }
            ViewGroup viewGroup6 = this.LJIIIZ;
            if (viewGroup6 != null) {
                viewGroup6.requestDisallowInterceptTouchEvent(false);
            }
        }
        return true;
    }
}
