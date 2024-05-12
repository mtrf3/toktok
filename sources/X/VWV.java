package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VWV extends C80217Ve1 implements InterfaceC33971Uz {
    public final C16610kz LJLZ;
    public final VWW LJZ;
    public InterfaceC65784Pro<Boolean> LJZI;

    public final boolean LJII() {
        try {
            if (getTotalScrollRange() == 0) {
                return true;
            }
            return Math.abs(getY() / ((float) getTotalScrollRange())) == 0.0f;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LJLZ.LIZLLL;
    }

    @Override // X.C80217Ve1, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VWW vww = this.LJZ;
        VelocityTracker velocityTracker = vww.LIZ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        vww.LIZ = null;
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LJLZ.LJIIL(i);
    }

    public final void setNeedInterceptScroll(InterfaceC65784Pro<Boolean> needInterceptScroll) {
        o.LJIIIZ(needInterceptScroll, "needInterceptScroll");
        this.LJZI = needInterceptScroll;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LJLZ.LJIIJ(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VWV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLZ = new C16610kz(this);
        this.LJZ = new VWW(this);
        setNestedScrollingEnabled(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r4 != 3) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(android.view.MotionEvent r18, X.InterfaceC88471Ynr<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VWV.LJIIIZ(android.view.MotionEvent, X.Ynr):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LJLZ.LIZIZ(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LJLZ.LIZ(f, f2, z);
    }
}
