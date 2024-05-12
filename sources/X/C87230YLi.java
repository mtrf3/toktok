package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.YLi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87230YLi extends FrameLayout {
    public InterfaceC87234YLm LJLIL;
    public InterfaceC87235YLn LJLILLLLZI;
    public C87231YLj LJLJI;
    public boolean LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C87230YLi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final InterfaceC87234YLm getCurrVideoGestureListener() {
        return this.LJLIL;
    }

    public final boolean getEnableTouchEvent() {
        return this.LJLJJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        InterfaceC87235YLn interfaceC87235YLn = this.LJLILLLLZI;
        if (interfaceC87235YLn != null) {
            interfaceC87235YLn.LIZ(canvas);
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MaterialGestureLayout dispatchDraw error = ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r17.getPointerCount() <= 1) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87230YLi.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setEnableTouchEvent(boolean z) {
        this.LJLJJI = z;
    }

    public final void setOnGestureListener(InterfaceC87234YLm onTouchGestureListener) {
        o.LJIIIZ(onTouchGestureListener, "onTouchGestureListener");
        this.LJLIL = onTouchGestureListener;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLJI = new C87231YLj(context, this, onTouchGestureListener);
    }

    public final void setViewStateChange(InterfaceC87235YLn interfaceC87235YLn) {
        this.LJLILLLLZI = interfaceC87235YLn;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C87230YLi(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            r0 = 1
            r1.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87230YLi.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC87235YLn interfaceC87235YLn = this.LJLILLLLZI;
        if (interfaceC87235YLn != null) {
            interfaceC87235YLn.LIZIZ();
        }
    }
}
