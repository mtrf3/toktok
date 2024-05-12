package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import kotlin.jvm.internal.o;

/* renamed from: X.T5u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74086T5u extends View {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final Paint LJLJJL;
    public RectF LJLJJLL;
    public final C62822Ol8 LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C74086T5u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZIZ() {
        this.LJLJJI = true;
        if (!this.LJLJI) {
            return;
        }
        LIZ();
    }

    public final void LIZJ() {
        this.LJLJJI = false;
        clearAnimation();
    }

    private final RotateAnimation getRotateAnim() {
        return (RotateAnimation) this.LJLJL.getValue();
    }

    public final void LIZ() {
        if (getRotateAnim().hasStarted() && !getRotateAnim().hasEnded()) {
            return;
        }
        startAnimation(getRotateAnim());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJI = true;
        if (this.LJLJJI) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJI = false;
        clearAnimation();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJLJJLL == null) {
            float f = this.LJLIL / 2;
            this.LJLJJLL = new RectF(C16310kV.LJFF(this) + f, getPaddingTop() + f, (getWidth() - C16310kV.LJ(this)) - f, (getHeight() - getPaddingBottom()) - f);
        }
        if (canvas != null) {
            RectF rectF = this.LJLJJLL;
            o.LJI(rectF);
            canvas.drawArc(rectF, 0.0f, this.LJLILLLLZI, false, this.LJLJJL);
        }
    }

    public final void setLineWidth(float f) {
        this.LJLJJL.setStrokeWidth(f);
    }

    public final void setLoadingColor(int i) {
        this.LJLJJL.setColor(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C74086T5u(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r5 = 2
            r0 = r10 & 2
            if (r0 == 0) goto L6
            r9 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r8, r0)
            r1 = 0
            r7.<init>(r8, r9, r1)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r7.LJLJJL = r4
            X.JIQ r0 = X.JIQ.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r7.LJLJL = r0
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [2130969574, 2130970419, 2130971462} // fill-array
            android.content.res.TypedArray r6 = r8.obtainStyledAttributes(r9, r0)
            java.lang.String r0 = "context.obtainStyledAttr…leable.LoadingCircleView)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r3 = r6.getColor(r1, r0)
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = X.C17N.LJIILL(r0)
            r2 = 1
            int r0 = r6.getDimensionPixelSize(r2, r0)
            float r1 = (float) r0
            r7.LJLIL = r1
            r0 = 1133903872(0x43960000, float:300.0)
            float r0 = r6.getFloat(r5, r0)
            r7.LJLILLLLZI = r0
            r6.recycle()
            r4.setAntiAlias(r2)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r4.setStrokeCap(r0)
            r7.setLoadingColor(r3)
            r7.setLineWidth(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74086T5u.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
