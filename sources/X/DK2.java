package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DK2 extends View {
    public final Paint LJLIL;
    public final double LJLILLLLZI;
    public final int LJLJI;
    public final C62822Ol8 LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DK2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.LJLIL;
        paint.setColor(-1);
        paint.setAlpha(51);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        int height = (int) (getHeight() / Math.tan(this.LJLILLLLZI));
        int i = height / this.LJLJI;
        if (((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            int width = getWidth() + height;
            if (i > 0) {
                int i2 = -i;
                int LJIJ = C78939UyV.LJIJ(width, 0, i2);
                if (LJIJ > width) {
                    return;
                }
                while (true) {
                    if (width > getWidth()) {
                        double tan = Math.tan(this.LJLILLLLZI) * ((getWidth() + height) - width);
                        if (canvas != null) {
                            canvas.drawLine(getWidth(), (float) tan, width - height, 0.0f, this.LJLIL);
                        }
                    } else if (canvas != null) {
                        canvas.drawLine(width, getHeight(), width - height, 0.0f, this.LJLIL);
                    }
                    if (width != LJIJ) {
                        width += i2;
                    } else {
                        return;
                    }
                }
            } else {
                throw new IllegalArgumentException(C10120aW.LIZ("Step must be positive, was: ", i, '.'));
            }
        } else {
            int width2 = getWidth() + height;
            if (i > 0) {
                int LJIJ2 = C78939UyV.LJIJ(0, width2, i);
                if (LJIJ2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < height) {
                            double tan2 = Math.tan(this.LJLILLLLZI) * i3;
                            if (canvas != null) {
                                canvas.drawLine(0.0f, (float) tan2, i3, 0.0f, this.LJLIL);
                            }
                        } else if (canvas != null) {
                            canvas.drawLine(i3 - height, getHeight(), i3, 0.0f, this.LJLIL);
                        }
                        if (i3 != LJIJ2) {
                            i3 += i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(C10120aW.LIZ("Step must be positive, was: ", i, '.'));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DK2(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.LJLIL = r0
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r0 = java.lang.Math.toRadians(r0)
            r2.LJLILLLLZI = r0
            r0 = 15
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS156S0100000_6 r1 = new kotlin.jvm.internal.AqS156S0100000_6
            r0 = 77
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DK2.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
