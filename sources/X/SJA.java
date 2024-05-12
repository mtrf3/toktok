package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import o53.IDdS477S0100000_12;

/* loaded from: classes13.dex */
public class SJA extends VA8 implements InterfaceC16140kE {
    public final RectF LJLIL;
    public final RectF LJLILLLLZI;
    public final SJ3 LJLJI;
    public final GestureDetector LJLJJI;
    public final SJB LJLJJL;
    public W4V<Object> LJLJJLL;
    public final IDdS477S0100000_12 LJLJL;

    public SJ3 LIZ() {
        return new SJ3(new SJ5(), getContext());
    }

    public SJ4 LIZIZ() {
        return new SJ4(this.LJLJI);
    }

    public final void LJ() {
        getHierarchy().LJIIJ(this.LJLIL);
        RectF outBounds = this.LJLILLLLZI;
        o.LJIIIZ(outBounds, "outBounds");
        outBounds.set(0.0f, 0.0f, getWidth(), getHeight());
        SJ3 sj3 = this.LJLJI;
        RectF rectF = this.LJLIL;
        if (!rectF.equals(sj3.LJLJLLL)) {
            sj3.LJLJLLL.set(rectF);
            sj3.LJII();
            sj3.LJFF();
        }
        SJ3 sj32 = this.LJLJI;
        sj32.LJLJLJ.set(this.LJLILLLLZI);
        sj32.LJII();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return (int) this.LJLJI.LJLJLJ.width();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        SJ3 sj3 = this.LJLJI;
        return (int) (sj3.LJLJLJ.left - sj3.LJLL.left);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return (int) this.LJLJI.LJLL.width();
    }

    @Override // android.view.View
    public final void computeScroll() {
        SJ3 sj3 = this.LJLJI;
        if (sj3.LLFFF.computeScrollOffset()) {
            int currX = sj3.LLFFF.getCurrX();
            int currY = sj3.LLFFF.getCurrY();
            sj3.LJLZ.set(sj3.LJZI);
            Matrix matrix = sj3.LJLZ;
            matrix.postTranslate(currX, currY);
            sj3.LJIIL(matrix);
            Matrix matrix2 = sj3.LJLZ;
            if (sj3.LLD.isRunning()) {
                sj3.LJIJ();
            }
            sj3.LJZ.set(matrix2);
            sj3.LJLLI.set(matrix2);
            sj3.LJFF();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return (int) this.LJLJI.LJLJLJ.height();
    }

    @Override // android.view.View, X.InterfaceC16140kE
    public final int computeVerticalScrollOffset() {
        SJ3 sj3 = this.LJLJI;
        return (int) (sj3.LJLJLJ.top - sj3.LJLL.top);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return (int) this.LJLJI.LJLL.height();
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return super.canScrollVertically(i);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        int save = canvas.save();
        canvas.concat(this.LJLJI.LJLLI);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // X.VA9, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        super.onTouchEvent(event);
        this.LJLJJI.onTouchEvent(event);
        if (this.LJLJI.LJIILLIIL(event)) {
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        MotionEvent obtain = MotionEvent.obtain(event);
        obtain.setAction(3);
        this.LJLJJI.onTouchEvent(obtain);
        this.LJLJI.LJIILLIIL(obtain);
        obtain.recycle();
        return false;
    }

    public final void setAnimationDuration(long j) {
        this.LJLJI.LLF = j;
    }

    @Override // X.VA9
    public void setController(InterfaceC81252Vui interfaceC81252Vui) {
        InterfaceC81252Vui controller = getController();
        if (controller instanceof W4R) {
            ((W4R) controller).LJIJJLI(this.LJLJL);
        }
        if (interfaceC81252Vui instanceof W4R) {
            ((W4R) interfaceC81252Vui).LIZLLL(this.LJLJL);
        }
        super.setController(interfaceC81252Vui);
    }

    public final void setControllerListener(W4V<Object> w4v) {
        this.LJLJJLL = w4v;
    }

    public final void setHorizontalNestedScrollEnabled(boolean z) {
        this.LJLJI.LL = z;
    }

    public final void setMaxScaleFactor(float f) {
        SJ3 sj3 = this.LJLJI;
        sj3.getClass();
        if (f >= 1.0f) {
            sj3.LJLJJLL = f;
        }
    }

    public final void setScaleFactorRetriever(SJG sjg) {
        this.LJLJI.LJZL = sjg;
    }

    public final void setTapListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.LJLJJL.LJLILLLLZI = simpleOnGestureListener;
    }

    public final void setTranslationEnabled(boolean z) {
        this.LJLJI.LJLJJL = z;
    }

    public final void setZoomingEnabled(boolean z) {
        this.LJLJI.LJLJJI = z;
    }

    public SJA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.VA8
    public final void inflateHierarchy(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        C79077V1t c79077V1t = new C79077V1t(context.getResources());
        c79077V1t.LJIIJ = InterfaceC78716Uuu.LJJL;
        C79076V1s.LIZLLL(c79077V1t, context, attributeSet);
        setAspectRatio(c79077V1t.LIZIZ);
        setHierarchy(c79077V1t.LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJLIL = new RectF();
        this.LJLILLLLZI = new RectF();
        this.LJLJL = new IDdS477S0100000_12(this, 4);
        SJ9 sj9 = new SJ9(this);
        SJ3 LIZ = LIZ();
        this.LJLJI = LIZ;
        LIZ.LJLILLLLZI = sj9;
        SJB sjb = new SJB(LIZIZ());
        this.LJLJJL = sjb;
        GestureDetector gestureDetector = new GestureDetector(context, sjb);
        this.LJLJJI = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LJ();
    }
}
