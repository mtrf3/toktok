package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.59q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1303459q extends View {
    public float LJLIL;
    public LinearGradient LJLILLLLZI;
    public final RectF LJLJI;
    public final Paint LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1303459q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final float getRingWidth() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLJJI.setShader(this.LJLILLLLZI);
        if (canvas != null) {
            canvas.drawArc(this.LJLJI, -90.0f, 360.0f, false, this.LJLJJI);
        }
    }

    public final void setRingWidth(float f) {
        this.LJLIL = f;
        this.LJLJJI.setStrokeWidth(f);
        LIZ(getWidth(), getHeight());
        invalidate();
    }

    public final void LIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        RectF rectF = this.LJLJI;
        float f = this.LJLIL;
        rectF.left = f / 2.0f;
        rectF.top = (f / 2.0f) + 0.0f;
        rectF.right = i - (f / 2.0f);
        rectF.bottom = i2 - (f / 2.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1303459q(android.content.Context r3, android.util.AttributeSet r4, int r5) {
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
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            r2.LJLIL = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.LJLJI = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            float r0 = r2.LJLIL
            r1.setStrokeWidth(r0)
            r0 = 1
            r1.setAntiAlias(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r0)
            r2.LJLJJI = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1303459q.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZ(i, i2);
        if (this.LJLILLLLZI == null && i > 0 && i2 > 0) {
            float width = getWidth();
            float height = getHeight();
            int[] iArr = new int[3];
            int i5 = 0;
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = -1;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            i7 = 0;
                        } else {
                            Context context = getContext();
                            o.LJIIIIZZ(context, "context");
                            Integer LJI = C79045V0n.LJI(R.attr.gf, context);
                            if (LJI != null) {
                                i7 = LJI.intValue();
                            }
                        }
                    } else {
                        Context context2 = getContext();
                        o.LJIIIIZZ(context2, "context");
                        Integer LJI2 = C79045V0n.LJI(R.attr.gg, context2);
                        if (LJI2 != null) {
                            i7 = LJI2.intValue();
                        }
                    }
                } else {
                    Context context3 = getContext();
                    o.LJIIIIZZ(context3, "context");
                    Integer LJI3 = C79045V0n.LJI(R.attr.gh, context3);
                    if (LJI3 != null) {
                        i7 = LJI3.intValue();
                    }
                }
                iArr[i6] = i7;
            }
            float[] fArr = new float[3];
            do {
                float f = 0.0f;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            f = 1.0f;
                        }
                    } else {
                        f = 0.5f;
                    }
                }
                fArr[i5] = f;
                i5++;
            } while (i5 < 3);
            this.LJLILLLLZI = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
        }
    }
}
