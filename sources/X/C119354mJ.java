package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.4mJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119354mJ extends View {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119354mJ(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119354mJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final Paint getStatusPaint() {
        return (Paint) this.LJLL.getValue();
    }

    public final int getActiveStatusColor() {
        return this.LJLJJL;
    }

    public final boolean getDrawStroke() {
        return this.LJLILLLLZI;
    }

    public final int getInactiveStatusColor() {
        return this.LJLJJLL;
    }

    public final int getStrokeColor() {
        return this.LJLJJI;
    }

    public final int getStrokeWidth() {
        return this.LJLJI;
    }

    public final void LIZ(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            setStrokeColor(LJI.intValue());
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        int i3 = this.LJLJLJ;
        float f = i3 * 0.5f;
        float f2 = i3 * 0.5f;
        if (this.LJLILLLLZI) {
            getStatusPaint().setColor(this.LJLJL);
            canvas.drawCircle(f, f2, f, getStatusPaint());
            if (this.LJLJJI != this.LJLJL) {
                getStatusPaint().setColor(this.LJLJJI);
                canvas.drawCircle(f, f2, f, getStatusPaint());
            }
            Paint statusPaint = getStatusPaint();
            if (this.LJLJLLL) {
                i2 = this.LJLJJL;
            } else {
                i2 = this.LJLJJLL;
            }
            statusPaint.setColor(i2);
            canvas.drawCircle(f, f2, f - this.LJLJI, getStatusPaint());
            return;
        }
        Paint statusPaint2 = getStatusPaint();
        if (this.LJLJLLL) {
            i = this.LJLJJL;
        } else {
            i = this.LJLJJLL;
        }
        statusPaint2.setColor(i);
        canvas.drawCircle(f, f2, f, getStatusPaint());
    }

    public final void setActive(boolean z) {
        this.LJLJLLL = z;
        invalidate();
    }

    public final void setActiveStatusColor(int i) {
        if (i == this.LJLJJL) {
            return;
        }
        this.LJLJJL = i;
        invalidate();
    }

    public final void setDrawStroke(boolean z) {
        if (z == this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = z;
        invalidate();
    }

    public final void setInactiveStatusColor(int i) {
        if (i == this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = i;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        if (i == this.LJLJJI) {
            return;
        }
        this.LJLJJI = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        if (i == this.LJLJI) {
            return;
        }
        this.LJLJI = i;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LJLIL) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = this.LJLJI * 2;
        setMeasuredDimension(View.MeasureSpec.getSize(i) + i3, View.MeasureSpec.getSize(i2) + i3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C119354mJ(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            r0 = r8 & 2
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r2 = 0
            r5.<init>(r6, r7, r2)
            X.0zU r3 = new X.0zU
            r0 = 2131886835(0x7f1202f3, float:1.940826E38)
            r3.<init>(r6, r0)
            X.0zU r1 = new X.0zU
            r0 = 2131886847(0x7f1202ff, float:1.9408284E38)
            r1.<init>(r6, r0)
            boolean r0 = X.AnonymousClass636.LJIILJJIL(r6)
            if (r0 == 0) goto L26
            r3 = r1
        L26:
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [2130969286, 2130969350, 2130969882, 2130970153, 2130971428, 2130971429} // fill-array
            android.content.res.TypedArray r1 = r3.obtainStyledAttributes(r7, r0)
            r0 = 1
            boolean r0 = r1.getBoolean(r0, r0)     // Catch: java.lang.Throwable -> L7d
            r5.LJLIL = r0     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r1.getBoolean(r4, r2)     // Catch: java.lang.Throwable -> L7d
            r5.setDrawStroke(r0)     // Catch: java.lang.Throwable -> L7d
            r0 = 5
            int r0 = r1.getDimensionPixelSize(r0, r2)     // Catch: java.lang.Throwable -> L7d
            r5.setStrokeWidth(r0)     // Catch: java.lang.Throwable -> L7d
            r0 = 4
            int r0 = r1.getColor(r0, r2)     // Catch: java.lang.Throwable -> L7d
            r5.setStrokeColor(r0)     // Catch: java.lang.Throwable -> L7d
            int r0 = r1.getColor(r2, r2)     // Catch: java.lang.Throwable -> L7d
            r5.setActiveStatusColor(r0)     // Catch: java.lang.Throwable -> L7d
            r0 = 3
            int r0 = r1.getColor(r0, r2)     // Catch: java.lang.Throwable -> L7d
            r5.setInactiveStatusColor(r0)     // Catch: java.lang.Throwable -> L7d
            r0 = 2130968606(0x7f04001e, float:1.754587E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r6)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L6a
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L7d
        L6a:
            r5.LJLJL = r2     // Catch: java.lang.Throwable -> L7d
            r1.recycle()
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 729(0x2d9, float:1.022E-42)
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLL = r0
            return
        L7d:
            r0 = move-exception
            r1.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119354mJ.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJLJ = i;
    }
}
