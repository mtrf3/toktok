package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class WXF extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    public WXG LJLIL;
    public WXE LJLILLLLZI;
    public C16230kN LJLJI;
    public ScaleGestureDetector LJLJJI;
    public C82536WaK LJLJJL;
    public C82537WaL LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public boolean LJLLJ;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public WXG getOnGestureListener() {
        return this.LJLIL;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.LJLJJI;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.LJLIL == null) {
            return false;
        }
        float x = motionEvent.getX() - this.LJLJLLL;
        float y = motionEvent.getY() - this.LJLL;
        if ((y * y) + (x * x) >= this.LJLJLJ) {
            return false;
        }
        float f = i;
        if (motionEvent.getX() >= f && measuredWidth - motionEvent.getX() >= f) {
            float f2 = i2;
            if (motionEvent.getY() >= f2 && measuredHeight - motionEvent.getY() >= f2) {
                return this.LJLIL.LJJJ(motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJLLI = motionEvent.getX();
            this.LJLLILLLL = motionEvent.getY();
            return false;
        }
        WXE wxe = this.LJLILLLLZI;
        if (wxe != null && wxe.LIZIZ(motionEvent, this.LJLLI, this.LJLLILLLL)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        WXG wxg = this.LJLIL;
        if (wxg != null) {
            wxg.LIZ();
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        WXG wxg = this.LJLIL;
        if (wxg != null) {
            boolean onScale = wxg.onScale(scaleGestureDetector);
            if (onScale) {
                this.LJLJL = scaleGestureDetector.getScaleFactor();
            }
            return onScale;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        WXG wxg = this.LJLIL;
        if (wxg != null && wxg.onScaleBegin(scaleGestureDetector)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        WXG wxg = this.LJLIL;
        if (wxg != null) {
            wxg.LJLJI(this.LJLJL);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        WXG wxg = this.LJLIL;
        if (wxg != null && wxg.onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLJLLL = motionEvent.getX();
        this.LJLL = motionEvent.getY();
        WXG wxg = this.LJLIL;
        if (wxg != null && wxg.onSingleTapUp(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.LJLJJI;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        this.LJLJJL.LIZJ(motionEvent);
        this.LJLJJLL.LIZJ(motionEvent);
        if ((motionEvent.getAction() & 255) == 0) {
            this.LJLLJ = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.LJLLJ = true;
        }
        if (!this.LJLLJ) {
            this.LJLJI.LIZ(motionEvent);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.LJLJI.LIZ(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
        }
        return true;
    }

    public void setOnGestureListener(WXG wxg) {
        this.LJLIL = wxg;
    }

    public void setOnInterceptListener(WXE wxe) {
        this.LJLILLLLZI = wxe;
    }

    public void setSloppyExtra(int i) {
        this.LJLJJL.LJIIJJI = i;
    }

    public WXF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJL = 1.0f;
        WXI wxi = new WXI(this);
        WXH wxh = new WXH(this);
        this.LJLJJL = new C82536WaK(context, wxi);
        this.LJLJJLL = new C82537WaL(context, wxh);
        C16230kN c16230kN = new C16230kN(context, this);
        this.LJLJI = c16230kN;
        c16230kN.LIZIZ(this);
        this.LJLJJI = new ScaleGestureDetector(context, this);
        float scaledDoubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.LJLJLJ = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.LJLJJI.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.LJLJJI)).intValue();
            Field declaredField2 = this.LJLJJI.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.LJLJJI, Integer.valueOf(intValue * 6));
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        WXG wxg = this.LJLIL;
        if (wxg == null) {
            return false;
        }
        wxg.LJIIIIZZ(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                if (action != 5) {
                    if (action == 6) {
                        this.LJLIL.LJJJIL();
                    }
                } else {
                    this.LJLIL.LJJJI();
                }
            } else {
                this.LJLIL.LJJIIZI(motionEvent);
            }
        } else {
            this.LJLIL.onDown(motionEvent);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WXG wxg = this.LJLIL;
        if (wxg != null && wxg.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WXG wxg;
        if (motionEvent == null || motionEvent2 == null || (wxg = this.LJLIL) == null) {
            return false;
        }
        wxg.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }
}
