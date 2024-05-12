package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class YLT extends FrameLayout implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, InterfaceC87222YLa, View.OnTouchListener {
    public C16230kN LJLIL;
    public YLV LJLILLLLZI;
    public YLU LJLJI;
    public YLS LJLJJI;
    public boolean LJLJJL;

    @Override // X.InterfaceC87222YLa
    public final void LIZ(View view, YLV ylv) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC87222YLa
    public final void LIZIZ(View view, YLV detector) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(detector, "detector");
    }

    @Override // X.InterfaceC87222YLa
    public final void LIZJ(View view, YLV ylv) {
        o.LJIIIZ(view, "view");
    }

    public final InterfaceC87229YLh getMOnGestureListener() {
        return null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(motionEvent, "motionEvent");
        return false;
    }

    public final void setMOnGestureListener(InterfaceC87229YLh interfaceC87229YLh) {
    }

    public final void setOnGestureListener(InterfaceC87229YLh interfaceC87229YLh) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (e.getAction() == 1) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        o.LJIIIZ(e, "e");
        e.getX();
        e.getY();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        if (r1 != false) goto L68;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YLT.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YLT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        YLW ylw = new YLW(this);
        YLX ylx = new YLX(this);
        this.LJLJI = new YLU(context, ylw);
        this.LJLJJI = new YLS(context, ylx);
        C16230kN c16230kN = new C16230kN(context, this);
        this.LJLIL = c16230kN;
        c16230kN.LIZIZ(this);
        this.LJLILLLLZI = new YLV(this);
        ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        setOnTouchListener(this);
    }
}
