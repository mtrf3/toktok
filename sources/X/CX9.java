package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* loaded from: classes6.dex */
public final class CX9 extends C47141t8 {
    public float LJLJJL;
    public final Drawable LJLJJLL;
    public boolean LJLJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        float width;
        super.dispatchDraw(canvas);
        float f = this.LJLJJL;
        if (f <= 0.0f || f >= 1.0f || canvas == null || (drawable = this.LJLJJLL) == null) {
            return;
        }
        if (this.LJLJL) {
            width = getWidth() - ((getWidth() + drawable.getBounds().width()) * this.LJLJJL);
        } else {
            width = getWidth() - ((1 - this.LJLJJL) * (getWidth() + drawable.getBounds().width()));
        }
        canvas.save();
        canvas.translate(width, 0.0f);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        this.LJLJL = z;
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            C07840Sm.LIZJ(drawable, C16310kV.LIZLLL(this));
        }
    }

    public final void setSweepRatio(float f) {
        this.LJLJJL = f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CX9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        new Paint(1);
        this.LJLJJL = -1.0f;
        Drawable LIZIZ = C04270Et.LIZIZ(context, R.drawable.cpf);
        if (LIZIZ != null) {
            C07810Sj.LJ(LIZIZ, true);
        } else {
            LIZIZ = null;
        }
        this.LJLJJLL = LIZIZ;
        new GradientDrawable().setColors(new int[]{0, -1, 0});
    }

    @Override // X.C47141t8, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, (intrinsicWidth * i2) / intrinsicHeight, intrinsicHeight);
        }
    }
}
