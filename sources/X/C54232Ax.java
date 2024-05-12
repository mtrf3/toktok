package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54232Ax extends C47171tB {
    public final Paint LJLJJL;
    public final Path LJLJJLL;
    public final Rect LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54232Ax(Context context) {
        this(context, null, 14);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54232Ax(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C47171tB, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LJLJJLL.isEmpty() && canvas != null) {
            canvas.saveLayer(new RectF(this.LJLJL), null);
        }
        super.onDraw(canvas);
        if (!this.LJLJJLL.isEmpty() && canvas != null) {
            canvas.drawPath(this.LJLJJLL, this.LJLJJL);
            canvas.restore();
        }
    }

    public final void LIZ(List<Rect> list, float f) {
        this.LJLJJLL.reset();
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.LJLJJLL.addRoundRect(new RectF((Rect) it.next()), f, f, Path.Direction.CW);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateClipPath => ");
        LIZ.append(list);
        LIZ.append(" , size = ");
        LIZ.append(arrayList.size());
        C0NB.LIZIZ("maskhollow", X1D.LIZIZ(LIZ));
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54232Ax(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r4, r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 1
            r2.<init>(r0)
            r3.LJLJJL = r2
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r3.LJLJJLL = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.LJLJL = r0
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r1.setFillType(r0)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DST_OUT
            r1.<init>(r0)
            r2.setXfermode(r1)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            r0 = -1
            r2.setColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54232Ax.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // X.C47171tB, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJL.set(0, 0, i, i2);
    }
}
