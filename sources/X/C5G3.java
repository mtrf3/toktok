package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5G3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5G3 extends LinearLayout {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public final int[] LJLJJLL;
    public final float[] LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5G3(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setFadingWidth(float f) {
        this.LJLJI = f;
        Paint paint = this.LJLIL;
        if (paint == null) {
            return;
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJI, this.LJLJJLL, this.LJLJL, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5G3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = new int[]{-1, 0};
        this.LJLJL = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.LJLIL;
        if (paint2 != null) {
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.LJLILLLLZI = 16;
        this.LJLJI = C32151Nz.LJIIZILJ(20);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o.LJIIIZ(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        int i = this.LJLILLLLZI;
        if (i == 0 || (i & 1) != 0) {
            int save = canvas.save();
            float f = this.LJLJJI;
            float f2 = this.LJLJI;
            Paint paint = this.LJLIL;
            o.LJI(paint);
            canvas.drawRect(0.0f, 0.0f, f, f2, paint);
            canvas.restoreToCount(save);
        }
        int i2 = this.LJLILLLLZI;
        if (i2 == 0 || (i2 & 2) != 0) {
            int save2 = canvas.save();
            float f3 = 2;
            canvas.rotate(180.0f, this.LJLJJI / f3, this.LJLJJL / f3);
            float f4 = this.LJLJJI;
            float f5 = this.LJLJI;
            Paint paint2 = this.LJLIL;
            o.LJI(paint2);
            canvas.drawRect(0.0f, 0.0f, f4, f5, paint2);
            canvas.restoreToCount(save2);
        }
        float f6 = 2;
        float f7 = (this.LJLJJL - this.LJLJJI) / f6;
        int i3 = this.LJLILLLLZI;
        if (i3 == 0 || (i3 & 4) != 0) {
            int save3 = canvas.save();
            canvas.rotate(90.0f, this.LJLJJI / f6, this.LJLJJL / f6);
            canvas.translate(0.0f, f7);
            float f8 = this.LJLJJI + f7;
            float f9 = this.LJLJI;
            Paint paint3 = this.LJLIL;
            o.LJI(paint3);
            canvas.drawRect(0 - f7, 0.0f, f8, f9, paint3);
            canvas.restoreToCount(save3);
        }
        int i4 = this.LJLILLLLZI;
        if (i4 == 0 || (i4 & 8) != 0) {
            int save4 = canvas.save();
            canvas.rotate(270.0f, this.LJLJJI / f6, this.LJLJJL / f6);
            canvas.translate(0.0f, f7);
            float f10 = this.LJLJJI + f7;
            float f11 = this.LJLJI;
            Paint paint4 = this.LJLIL;
            o.LJI(paint4);
            canvas.drawRect(0 - f7, 0.0f, f10, f11, paint4);
            canvas.restoreToCount(save4);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.LJLIL;
        if (paint != null) {
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJI, this.LJLJJLL, this.LJLJL, Shader.TileMode.CLAMP));
        }
        this.LJLJJI = getWidth();
        this.LJLJJL = getHeight();
    }
}
