package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.TDr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74291TDr extends FrameLayout {
    public boolean LJLIL;
    public Paint LJLILLLLZI;
    public boolean LJLJI;
    public AbstractC74292TDs LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C74291TDr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC74292TDs abstractC74292TDs;
        Paint paint;
        o.LJIIIZ(canvas, "canvas");
        AbstractC74292TDs abstractC74292TDs2 = this.LJLJJI;
        if (abstractC74292TDs2 != null) {
            abstractC74292TDs2.LIZ(canvas);
        }
        super.dispatchDraw(canvas);
        if (!this.LJLJI || !this.LJLIL || (abstractC74292TDs = this.LJLJJI) == null || (paint = this.LJLILLLLZI) == null) {
            return;
        }
        abstractC74292TDs.LIZIZ.set(0.0f, 0.0f, abstractC74292TDs.LIZ.getWidth(), abstractC74292TDs.LIZ.getHeight());
        abstractC74292TDs.LIZJ.reset();
        Path path = abstractC74292TDs.LIZJ;
        RectF rectF = abstractC74292TDs.LIZIZ;
        float[] fArr = abstractC74292TDs.LIZLLL;
        if (fArr != null) {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(abstractC74292TDs.LIZJ, paint);
        } else {
            o.LJIJI("radiusArray");
            throw null;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        AbstractC74292TDs abstractC74292TDs = this.LJLJJI;
        if (abstractC74292TDs != null) {
            abstractC74292TDs.LIZ(canvas);
        }
        super.draw(canvas);
    }

    public final void setRadius(float f) {
        C74289TDp c74289TDp = new C74289TDp(this);
        this.LJLJJI = c74289TDp;
        c74289TDp.LIZIZ(new float[]{f, f, f, f, f, f, f, f});
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C74291TDr(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r2 = r17
            r1 = 2
            r0 = r18 & 2
            if (r0 == 0) goto L8
            r2 = 0
        L8:
            java.lang.String r0 = "context"
            r3 = r16
            defpackage.a1.LJFF(r3, r0)
            r10 = 0
            r15.<init>(r3, r2, r10)
            r11 = 1
            r15.LJLIL = r11
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x00a0: FILL_ARRAY_DATA , data: [2130969756, 2130969757, 2130969758, 2130969759, 2130969760, 2130971081, 2130971082, 2130971083, 2130971084} // fill-array
            android.content.res.TypedArray r9 = r3.obtainStyledAttributes(r2, r0, r10, r10)
            java.lang.String r0 = "context.obtainStyledAttr…sLayout, defStyleAttr, 0)"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            r8 = 0
            float r2 = r9.getDimension(r10, r8)
            float r14 = r9.getDimension(r1, r2)
            r0 = 4
            float r13 = r9.getDimension(r0, r2)
            float r3 = r9.getDimension(r11, r2)
            r0 = 3
            float r2 = r9.getDimension(r0, r2)
            r0 = 5
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r6 = r9.getColor(r0, r7)
            r0 = 8
            int r5 = r9.getDimensionPixelOffset(r0, r10)
            r0 = 7
            int r12 = r9.getDimensionPixelOffset(r0, r10)
            r0 = 6
            int r4 = r9.getDimensionPixelOffset(r0, r10)
            int r0 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r0 != 0) goto L9c
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 != 0) goto L9c
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 != 0) goto L9c
            r15.setRadius(r14)
        L63:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r3.setAntiAlias(r11)
            r3.setColor(r6)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            if (r12 == 0) goto L87
            if (r4 == 0) goto L87
            android.graphics.DashPathEffect r2 = new android.graphics.DashPathEffect
            float[] r1 = new float[r1]
            float r0 = (float) r12
            r1[r10] = r0
            float r0 = (float) r4
            r1[r11] = r0
            r2.<init>(r1, r8)
            r3.setPathEffect(r2)
        L87:
            float r0 = (float) r5
            r3.setStrokeWidth(r0)
            r15.LJLILLLLZI = r3
            r6 = r6 & r7
            if (r6 == 0) goto L93
            if (r5 == 0) goto L93
            r10 = 1
        L93:
            r15.LJLJI = r10
            r15.invalidate()
            r9.recycle()
            return
        L9c:
            r15.LIZ(r14, r13, r3, r2)
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74291TDr.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZ(float f, float f2, float f3, float f4) {
        float[] fArr;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            fArr = new float[]{f2, f2, f, f, f3, f3, f4, f4};
        } else {
            fArr = new float[]{f, f, f2, f2, f4, f4, f3, f3};
        }
        C74290TDq c74290TDq = new C74290TDq(this);
        this.LJLJJI = c74290TDq;
        c74290TDq.LIZIZ(fArr);
        invalidate();
    }
}
