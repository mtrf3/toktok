package X;

import Y.AUListenerS99S0100000_12;
import Y.IDAListenerS79S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.S4s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71510S4s extends FrameLayout implements SJ8<SJ5>, InterfaceC71511S4t {
    public Rect LJLIL;
    public final Rect LJLILLLLZI;
    public final Rect LJLJI;
    public final RectF LJLJJI;
    public final Matrix LJLJJL;
    public View LJLJJLL;
    public ViewGroup.LayoutParams LJLJL;
    public final FrameLayout.LayoutParams LJLJLJ;
    public final ValueAnimator LJLJLLL;
    public final SJ5 LJLL;
    public int LJLLI;
    public InterfaceC71511S4t LJLLILLLL;
    public final ValueAnimator LJLLJ;
    public final LinkedHashSet<InterfaceC71509S4r> LJLLL;
    public float LJLLLL;
    public boolean LJLLLLLL;
    public float LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    private final float getDragFactor() {
        float f = this.LJLL.LJLJJLL;
        if (f > 0.0f) {
            float f2 = 1;
            float f3 = f / 1300;
            if (f3 > 0.95f) {
                f3 = 0.95f;
            }
            return f2 - f3;
        }
        return 1.0f;
    }

    public final void LJIIIIZZ() {
        InterfaceC71511S4t interfaceC71511S4t = this.LJLLILLLL;
        if (interfaceC71511S4t != null) {
            interfaceC71511S4t.setDragTransitionEnabled(this.LJLLLLLL);
        }
        InterfaceC71511S4t interfaceC71511S4t2 = this.LJLLILLLL;
        if (interfaceC71511S4t2 != null) {
            interfaceC71511S4t2.setMaxDragTransitionFactor(this.LJLZ);
        }
    }

    public final View LJFF() {
        if (getChildCount() < 2) {
            if (this.LJLJJLL == null) {
                this.LJLJJLL = getChildAt(0);
            }
            return this.LJLJJLL;
        }
        throw new IllegalStateException("only allow one child view");
    }

    @Override // X.SJ8
    public final void LIZ(SJ5 detector) {
        o.LJIIIZ(detector, "detector");
        if (this.LJLLI == 3) {
            Iterator<InterfaceC71509S4r> it = this.LJLLL.iterator();
            while (it.hasNext()) {
                it.next().LIZ(this.LJLLI);
            }
            float dragFactor = getDragFactor();
            this.LJLLLL = dragFactor;
            if (dragFactor < this.LJLZ) {
                this.LJLIL.set(this.LJLJI);
                this.LJLJJL.reset();
                this.LJLJJL.postScale(0.0f, 0.0f, this.LJLJI.centerX(), this.LJLJI.centerY());
                this.LJLJJI.set(this.LJLILLLLZI);
                this.LJLJJL.mapRect(this.LJLJJI);
                LJI(this.LJLJI, this.LJLJJI);
                this.LJLILLLLZI.set(this.LJLJI);
                this.LJLLI = 2;
                this.LJLJLLL.start();
                this.LJLLJ.start();
                return;
            }
            this.LJLIL.set(this.LJLJI);
            this.LJLLI = 1;
            this.LJLJLLL.start();
        }
    }

    @Override // X.SJ8
    public final void LIZIZ(SJ5 detector) {
        o.LJIIIZ(detector, "detector");
        if (this.LJLL.LJLLILLLL == 4 && this.LJLLI != 3) {
            this.LJLLI = 3;
            Iterator<InterfaceC71509S4r> it = this.LJLLL.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(this.LJLLI);
            }
            View LJFF = LJFF();
            if (LJFF != null) {
                this.LJLJL = LJFF.getLayoutParams();
                LJFF.setLayoutParams(this.LJLJLJ);
            }
        }
        if (this.LJLLI == 3) {
            this.LJLJJL.reset();
            this.LJLLLL = getDragFactor();
            Matrix matrix = this.LJLJJL;
            SJ5 sj5 = this.LJLL;
            matrix.postTranslate(sj5.LJLJJL, sj5.LJLJJLL);
            Matrix matrix2 = this.LJLJJL;
            float f = this.LJLLLL;
            matrix2.postScale(f, f, this.LJLJI.centerX(), this.LJLJI.centerY());
            this.LJLJJI.set(this.LJLILLLLZI);
            this.LJLJJL.mapRect(this.LJLJJI);
            LJI(this.LJLJI, this.LJLJJI);
            View LJFF2 = LJFF();
            if (LJFF2 != null) {
                LJII(this.LJLJI, LJFF2);
            }
            Iterator<InterfaceC71509S4r> it2 = this.LJLLL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(this.LJLLLL, this.LJLLI);
            }
        }
    }

    @Override // X.InterfaceC71511S4t
    public final void LIZJ(InterfaceC71509S4r listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLL.add(listener);
        InterfaceC71511S4t interfaceC71511S4t = this.LJLLILLLL;
        if (interfaceC71511S4t != null) {
            interfaceC71511S4t.LIZJ(listener);
        }
    }

    @Override // X.InterfaceC71511S4t
    public final void LIZLLL(C70777Rq9 c70777Rq9) {
        this.LJLLL.remove(c70777Rq9);
        InterfaceC71511S4t interfaceC71511S4t = this.LJLLILLLL;
        if (interfaceC71511S4t != null) {
            interfaceC71511S4t.LIZLLL(c70777Rq9);
        }
    }

    @Override // X.SJ8
    public final void LJ(SJ5 detector) {
        o.LJIIIZ(detector, "detector");
        this.LJLLI = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJLLL.isRunning()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.LJLLILLLL == null) {
            if (motionEvent != null) {
                this.LJLL.LIZLLL(motionEvent);
            }
            if (this.LJLLI == 3) {
                z = true;
            } else {
                z = false;
            }
            requestDisallowInterceptTouchEvent(z);
        }
        if (this.LJLLI == 3) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LJLLI == 3) {
            requestDisallowInterceptTouchEvent(true);
        }
        this.LJLL.LIZLLL(event);
        return true;
    }

    public final void setDelegateDragTransitionView(InterfaceC71511S4t transitionView) {
        o.LJIIIZ(transitionView, "transitionView");
        this.LJLLILLLL = transitionView;
        LJIIIIZZ();
        Iterator<InterfaceC71509S4r> it = this.LJLLL.iterator();
        while (it.hasNext()) {
            InterfaceC71509S4r next = it.next();
            InterfaceC71511S4t interfaceC71511S4t = this.LJLLILLLL;
            if (interfaceC71511S4t != null) {
                interfaceC71511S4t.LIZJ(next);
            }
        }
    }

    @Override // X.InterfaceC71511S4t
    public void setDragTransitionEnabled(boolean z) {
        this.LJLLLLLL = z;
        LJIIIIZZ();
    }

    @Override // X.InterfaceC71511S4t
    public void setMaxDragTransitionFactor(float f) {
        this.LJLZ = f;
        LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71510S4s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        this.LJLIL = new Rect();
        this.LJLILLLLZI = new Rect();
        this.LJLJI = new Rect();
        this.LJLJJI = new RectF();
        this.LJLJJL = new Matrix();
        this.LJLJLJ = new FrameLayout.LayoutParams(0, 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0f, 1f)");
        this.LJLJLLL = ofFloat;
        SJ5 sj5 = new SJ5();
        this.LJLL = sj5;
        this.LJLLI = -1;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.LJLLJ = ofFloat2;
        this.LJLLL = new LinkedHashSet<>();
        this.LJLLLL = 1.0f;
        AUListenerS99S0100000_12 aUListenerS99S0100000_12 = new AUListenerS99S0100000_12(this, 2);
        this.LJLLLLLL = true;
        this.LJLZ = 0.7f;
        AUListenerS99S0100000_12 aUListenerS99S0100000_122 = new AUListenerS99S0100000_12(this, 1);
        IDAListenerS79S0100000_12 iDAListenerS79S0100000_12 = new IDAListenerS79S0100000_12(this, 0);
        if (!sj5.LJLJI.contains(2)) {
            sj5.LJLJI.add(2);
        }
        ofFloat.addUpdateListener(aUListenerS99S0100000_122);
        ofFloat.addListener(iDAListenerS79S0100000_12);
        ofFloat.setDuration(250L);
        ofFloat2.setDuration(250L);
        ofFloat2.addUpdateListener(aUListenerS99S0100000_12);
        sj5.LJLIL = this;
    }

    public static void LJI(Rect rect, RectF rectF) {
        o.LJIIIZ(rect, "<this>");
        o.LJIIIZ(rectF, "rectF");
        rect.left = (int) rectF.left;
        rect.top = (int) rectF.top;
        rect.right = (int) rectF.right;
        rect.bottom = (int) rectF.bottom;
    }

    public static void LJII(Rect rect, View view) {
        view.setX(rect.left);
        view.setY(rect.top);
        view.getLayoutParams().width = rect.width();
        view.getLayoutParams().height = rect.height();
        view.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View LJFF = LJFF();
        if (LJFF != null && this.LJLLI == -1) {
            this.LJLILLLLZI.set(0, 0, LJFF.getMeasuredWidth(), LJFF.getMeasuredHeight());
        }
    }
}
