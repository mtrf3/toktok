package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.5FY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FY extends View {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5FY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            if (this.LJLILLLLZI.getStrokeWidth() <= 0.0f) {
                this.LJLILLLLZI.setStrokeWidth(getHeight() * 0.1f);
            }
            int height = getHeight();
            float height2 = getHeight() / 2.0f;
            float height3 = getHeight() / 2.0f;
            float height4 = getHeight() * 0.5f;
            float f = height;
            float f2 = 2;
            float width = (getWidth() - getPaddingRight()) - ((f - height4) / f2);
            float f3 = width - height4;
            float f4 = height4 / f2;
            canvas.drawCircle(height3, height2, f / 2.0f, this.LJLIL);
            canvas.save();
            canvas.rotate(45.0f, height3, height2);
            canvas.drawLine(f3, height2, width, height2, this.LJLILLLLZI);
            canvas.drawLine(height3, height2 - f4, height3, height2 + f4, this.LJLILLLLZI);
            canvas.restore();
        }
    }

    public final void setButtonBackgroundColor(int i) {
        this.LJLIL.setColor(i);
    }

    public final void setCrossLineColor(int i) {
        this.LJLILLLLZI.setColor(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5FY(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r5, r0)
            r0 = 0
            r4.<init>(r5, r6, r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r4.LJLIL = r3
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r4.LJLILLLLZI = r2
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r3.setStyle(r0)
            r1 = 1
            r3.setAntiAlias(r1)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r0)
            r2.setAntiAlias(r1)
            r0 = 2130968758(0x7f0400b6, float:1.7546179E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r5)
            r4.setButtonBackgroundColor(r0)
            r0 = 2130968606(0x7f04001e, float:1.754587E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r5)
            r4.setCrossLineColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5FY.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
