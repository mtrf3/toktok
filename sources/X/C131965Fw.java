package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.5Fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131965Fw extends View {
    public final Paint LJLIL;
    public float LJLILLLLZI;

    public C131965Fw() {
        this(null, null, 7);
    }

    public C131965Fw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float min = Math.min((getWidth() - C32151Nz.LJIIZILJ(6)) / 2.0f, (getHeight() - C32151Nz.LJIIZILJ(6)) / 2.0f);
        if (min < 0.0f) {
            min = 0.0f;
        }
        Paint paint = this.LJLIL;
        if (paint != null && canvas != null) {
            canvas.drawRoundRect(C32151Nz.LJIIZILJ(3), C32151Nz.LJIIZILJ(3), getWidth() - C32151Nz.LJIIZILJ(3), getHeight() - C32151Nz.LJIIZILJ(3), min, min, paint);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C131965Fw(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r0 = r11 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r9 = r1
        L6:
            r2 = 2
            r0 = r11 & 2
            if (r0 == 0) goto Lc
            r10 = r1
        Lc:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r7 = 0
            r8.<init>(r9, r10, r7)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r8.LJLIL = r5
            r6 = 1
            r8.setLayerType(r6, r1)
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L6d
            if (r10 == 0) goto L6d
            android.content.Context r1 = r8.getContext()
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x007a: FILL_ARRAY_DATA , data: [2130971656, 2130971657, 2130971658} // fill-array
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r10, r0)
            java.lang.String r0 = "context.obtainStyledAttr…le.TrendingFeedShadowDot)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r3 = 0
            float r0 = r4.getDimension(r2, r3)     // Catch: java.lang.Throwable -> L65
            r8.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L65
            r2 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r2, r2, r2, r2)     // Catch: java.lang.Throwable -> L65
            int r1 = r4.getColor(r7, r0)     // Catch: java.lang.Throwable -> L65
            int r0 = android.graphics.Color.argb(r2, r7, r7, r7)     // Catch: java.lang.Throwable -> L65
            int r2 = r4.getColor(r6, r0)     // Catch: java.lang.Throwable -> L65
            r5.setColor(r1)     // Catch: java.lang.Throwable -> L65
            float r1 = r8.LJLILLLLZI     // Catch: java.lang.Throwable -> L65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L65
            float r0 = X.C32151Nz.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> L65
            r5.setShadowLayer(r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L65
            goto L6a
        L65:
            r0 = move-exception
            r4.recycle()
            throw r0
        L6a:
            r4.recycle()
        L6d:
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            r8.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131965Fw.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
