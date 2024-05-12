package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StoryTag extends LinearLayout {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final Paint LJLJJI;
    public final RectF LJLJJL;
    public float LJLJJLL;
    public LinearGradient LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final Paint getPaint() {
        return this.LJLJJI;
    }

    public final float getRadius() {
        return this.LJLJJLL;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.LJLJJI.setShader(this.LJLJL);
        this.LJLJJI.setStyle(Paint.Style.FILL);
        this.LJLJJI.setColor(-16777216);
        RectF rectF = this.LJLJJL;
        float f = this.LJLJJLL;
        canvas.drawRoundRect(rectF, f, f, this.LJLJJI);
    }

    public final void setRadius(float f) {
        this.LJLJJLL = f;
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StoryTag(android.content.Context r3, android.util.AttributeSet r4, int r5) {
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
            java.lang.String r0 = "#10B7FF"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.LJLIL = r0
            java.lang.String r0 = "#20D5EC"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.LJLILLLLZI = r0
            java.lang.String r0 = "#17E9B6"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.LJLJI = r0
            r0 = 1
            android.graphics.Paint r1 = X.C6D8.LIZIZ(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r0)
            r2.LJLJJI = r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.LJLJJL = r0
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            r2.LJLJJLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.StoryTag.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        RectF rectF = this.LJLJJL;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = i;
        rectF.bottom = i2;
        float width = getWidth();
        float height = getHeight();
        int[] iArr = new int[3];
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            int i7 = this.LJLIL;
            while (true) {
                iArr[i6] = i7;
                i6++;
                if (i6 >= 3) {
                    break loop0;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            i7 = 0;
                        } else {
                            i7 = this.LJLJI;
                        }
                    } else {
                        i7 = this.LJLILLLLZI;
                    }
                }
            }
        }
        float[] fArr = new float[3];
        while (true) {
            float f = 0.0f;
            while (true) {
                fArr[i5] = f;
                i5++;
                if (i5 < 3) {
                    if (i5 == 0) {
                        break;
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            break;
                        } else {
                            f = 1.0f;
                        }
                    } else {
                        f = 0.5f;
                    }
                } else {
                    this.LJLJL = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
                    return;
                }
            }
        }
    }
}
