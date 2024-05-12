package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.7fK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191467fK extends C191487fM {
    public Float LLLF;
    public Float LLLFF;
    public final int LLLFFI;
    public final int LLLFZ;
    public final int LLLI;
    public ValueAnimator LLLII;
    public int LLLIIII;
    public boolean LLLIIIIL;
    public int LLLIIIL;
    public boolean LLLIIL;
    public InterfaceC1807877q LLLIILIL;
    public float LLLIL;
    public float LLLILZ;
    public final int LLLILZJ;
    public InterfaceC65784Pro<C76800UCe> LLLILZLLLI;
    public InterfaceC65784Pro<C76800UCe> LLLIZZ;
    public GestureDetector LLLJ;
    public final double LLLJIL;
    public final double LLLJL;
    public int LLLL;
    public InterfaceC65784Pro<Boolean> LLLLII;
    public InterfaceC65784Pro<Boolean> LLLLIIIILLL;
    public InterfaceC65784Pro<Boolean> LLLLIIL;

    private final int getLowerThreshold() {
        if (this.LLLL == Integer.MAX_VALUE) {
            this.LLLL = this.LLLIIIL - ((int) this.LLLJIL);
        }
        return this.LLLL;
    }

    public final int getPatientTopMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!((Boolean) C191517fP.LIZ.getValue()).booleanValue() || this.LLLJ != null) {
            return;
        }
        this.LLLJ = new GestureDetector(getContext(), new SJC() { // from class: X.7fL
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                InterfaceC65784Pro<Boolean> interfaceC65784Pro;
                if (motionEvent != null && motionEvent2 != null) {
                    float y = motionEvent2.getY() - motionEvent.getY();
                    float x = motionEvent2.getX() - motionEvent.getX();
                    if (y > 150.0f && Math.abs(x) / y < 1.0f && !C191467fK.this.canScrollVertically(-1) && (interfaceC65784Pro = C191467fK.this.LLLLIIL) != null) {
                        interfaceC65784Pro.invoke();
                    }
                }
                return false;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLJ = null;
    }

    public final double getUpperThreshold() {
        return this.LLLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191467fK(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LLLFFI = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLLFZ = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLLI = 3;
        this.LLLIIIIL = true;
        this.LLLIIIL = Integer.MAX_VALUE;
        this.LLLIL = -2.1474836E9f;
        this.LLLILZ = -2.1474836E9f;
        this.LLLILZJ = 1;
        this.LLLL = Integer.MAX_VALUE;
        if (((Boolean) C191517fP.LIZ.getValue()).booleanValue()) {
            this.LLLJIL = C7MY.LIZIZ(150);
        } else {
            this.LLLJIL = KL2.LJIIJJI(getContext()) * 0.3d;
        }
        this.LLLJL = this.LLLJIL;
    }

    public final void LJLJJL(float f) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.topMargin + ((int) (f * this.LLLILZJ));
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = -i;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if (r3 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L62;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191467fK.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBottomThresholdCallback(InterfaceC65784Pro<Boolean> bottomLambda) {
        o.LJIIIZ(bottomLambda, "bottomLambda");
        this.LLLLIIIILLL = bottomLambda;
    }

    public final void setDragUpDelegate(InterfaceC1807877q dragUpDelegate) {
        o.LJIIIZ(dragUpDelegate, "dragUpDelegate");
        this.LLLIILIL = dragUpDelegate;
    }

    public final void setFlingDownCallback(InterfaceC65784Pro<Boolean> flingDownLambda) {
        o.LJIIIZ(flingDownLambda, "flingDownLambda");
        this.LLLLIIL = flingDownLambda;
    }

    public final void setOnActionUpLambda(InterfaceC65784Pro<C76800UCe> lambda) {
        o.LJIIIZ(lambda, "lambda");
        this.LLLIZZ = lambda;
    }

    public final void setOnHorizontalSlopExceeded(InterfaceC65784Pro<C76800UCe> lambda) {
        o.LJIIIZ(lambda, "lambda");
        this.LLLILZLLLI = lambda;
    }

    public final void setUpperThresholdCallback(InterfaceC65784Pro<Boolean> upperLambda) {
        o.LJIIIZ(upperLambda, "upperLambda");
        this.LLLLII = upperLambda;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191467fK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLLFFI = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLLFZ = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLLI = 3;
        this.LLLIIIIL = true;
        this.LLLIIIL = Integer.MAX_VALUE;
        this.LLLIL = -2.1474836E9f;
        this.LLLILZ = -2.1474836E9f;
        this.LLLILZJ = 1;
        this.LLLL = Integer.MAX_VALUE;
        if (((Boolean) C191517fP.LIZ.getValue()).booleanValue()) {
            this.LLLJIL = C7MY.LIZIZ(150);
        } else {
            this.LLLJIL = KL2.LJIIJJI(getContext()) * 0.3d;
        }
        this.LLLJL = this.LLLJIL;
    }
}
