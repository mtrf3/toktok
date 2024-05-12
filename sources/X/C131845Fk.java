package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131845Fk extends FrameLayout {
    public final int[] LJLIL;
    public final float[] LJLILLLLZI;
    public Paint LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131845Fk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new int[]{-1, 0};
        this.LJLILLLLZI = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.LJLJI = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.LJLJI;
        o.LJI(paint2);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b54, R.attr.bxo});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…able.EdgeTransparentView)");
        this.LJLJJI = obtainStyledAttributes.getInt(0, 0);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "getContext()");
        this.LJLJJL = obtainStyledAttributes.getDimension(1, C74275TDb.LIZIZ(context2, 20.0f));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(child, "child");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, child, j);
        int i = this.LJLJJI;
        if (i == 0 || (i & 1) != 0) {
            float f = this.LJLJJLL;
            float f2 = this.LJLJJL;
            Paint paint = this.LJLJI;
            o.LJI(paint);
            canvas.drawRect(0.0f, -3.0f, f, f2, paint);
        }
        int i2 = this.LJLJJI;
        if (i2 == 0 || (i2 & 2) != 0) {
            int save = canvas.save();
            float f3 = 2;
            canvas.rotate(180.0f, this.LJLJJLL / f3, this.LJLJL / f3);
            float f4 = this.LJLJJLL;
            float f5 = this.LJLJJL;
            Paint paint2 = this.LJLJI;
            o.LJI(paint2);
            canvas.drawRect(0.0f, -3.0f, f4, f5, paint2);
            canvas.restoreToCount(save);
        }
        int i3 = (this.LJLJL - this.LJLJJLL) / 2;
        int i4 = this.LJLJJI;
        if (i4 == 0 || (i4 & 4) != 0) {
            int save2 = canvas.save();
            float f6 = 2;
            canvas.rotate(90.0f, this.LJLJJLL / f6, this.LJLJL / f6);
            float f7 = i3;
            canvas.translate(0.0f, f7);
            float f8 = this.LJLJJL;
            Paint paint3 = this.LJLJI;
            o.LJI(paint3);
            canvas.drawRect(-f7, -3.0f, this.LJLJJLL + f7, f8, paint3);
            canvas.restoreToCount(save2);
        }
        int i5 = this.LJLJJI;
        if (i5 == 0 || (i5 & 8) != 0) {
            int save3 = canvas.save();
            float f9 = 2;
            canvas.rotate(270.0f, this.LJLJJLL / f9, this.LJLJL / f9);
            float f10 = i3;
            canvas.translate(0.0f, f10);
            float f11 = this.LJLJJL;
            Paint paint4 = this.LJLJI;
            o.LJI(paint4);
            canvas.drawRect(-f10, -3.0f, this.LJLJJLL + f10, f11, paint4);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.LJLJI;
        o.LJI(paint);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJJL, this.LJLIL, this.LJLILLLLZI, Shader.TileMode.CLAMP));
        this.LJLJJLL = getWidth();
        this.LJLJL = getHeight();
    }
}
