package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import defpackage.a1;

/* loaded from: classes9.dex */
public final class KMH extends C49608JdU {
    public final Paint LJLJJI;
    public final Path LJLJJL;
    public final PathMeasure LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    private final float getPathLength() {
        this.LJLJJLL.setPath(this.LJLJJL, false);
        return this.LJLJJLL.getLength();
    }

    public final boolean LIZIZ() {
        if (C78842Uww.LJIILL(getCoreAreaXRange(), this.LJLJLJ) && C78842Uww.LJIILL(getCoreAreaYRange(), this.LJLJLLL)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        canvas.drawColor(0);
        canvas.drawPath(this.LJLJJL, this.LJLJJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        if (r4 <= 150.0d) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
    
        if (r4 <= 330.0d) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMH.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLJJI = paint;
        this.LJLJJL = new Path();
        this.LJLJJLL = new PathMeasure();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(C17N.LJIILL(4.0d));
    }
}
