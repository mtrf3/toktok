package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;

/* renamed from: X.81Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81Y extends LinearLayout {
    public final Paint LJLIL;
    public RectF LJLILLLLZI;
    public LinearGradient LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int[] LJLJL;
    public float[] LJLJLJ;
    public GradientDrawable.Orientation LJLJLLL;

    public final int[] getColors() {
        return this.LJLJL;
    }

    public final LinearGradient getLg() {
        return this.LJLJI;
    }

    @Override // android.widget.LinearLayout
    public final GradientDrawable.Orientation getOrientation() {
        return this.LJLJLLL;
    }

    public final float[] getPositions() {
        return this.LJLJLJ;
    }

    public final float getRadius() {
        return this.LJLJJI;
    }

    public final int getX1() {
        return this.LJLJJL;
    }

    public final int getY1() {
        return this.LJLJJLL;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient;
        super.onDraw(canvas);
        if (this.LJLJL != null && this.LJLJLJ != null && this.LJLJJL == 0 && this.LJLJJLL == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            GradientDrawable.Orientation orientation = this.LJLJLLL;
            if (orientation == GradientDrawable.Orientation.TOP_BOTTOM) {
                this.LJLJJLL = measuredHeight;
            }
            if (orientation == GradientDrawable.Orientation.LEFT_RIGHT) {
                this.LJLJJL = measuredWidth;
            }
            if (orientation == GradientDrawable.Orientation.TL_BR) {
                this.LJLJJL = measuredWidth;
                this.LJLJJLL = measuredHeight;
            }
        }
        if (canvas != null && (linearGradient = this.LJLJI) != null) {
            this.LJLIL.setShader(linearGradient);
            RectF rectF = this.LJLILLLLZI;
            if (rectF != null) {
                float f = this.LJLJJI;
                canvas.drawRoundRect(rectF, f, f, this.LJLIL);
            }
        }
    }

    public final void setColors(int[] iArr) {
        this.LJLJL = iArr;
    }

    public final void setLg(LinearGradient linearGradient) {
        this.LJLJI = linearGradient;
    }

    public final void setOrientation(GradientDrawable.Orientation orientation) {
        this.LJLJLLL = orientation;
    }

    public final void setPositions(float[] fArr) {
        this.LJLJLJ = fArr;
    }

    public final void setRadius(float f) {
        this.LJLJJI = f;
    }

    public final void setX1(int i) {
        this.LJLJJL = i;
    }

    public final void setY1(int i) {
        this.LJLJJLL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLIL = new Paint(1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 && i2 == 0) {
            return;
        }
        int[] iArr = this.LJLJL;
        float[] fArr = this.LJLJLJ;
        if (iArr == null || fArr == null) {
            return;
        }
        this.LJLILLLLZI = new RectF(0.0f, 0.0f, i, i2);
        GradientDrawable.Orientation orientation = this.LJLJLLL;
        if (orientation == GradientDrawable.Orientation.TOP_BOTTOM) {
            this.LJLJJLL = i2;
        }
        if (orientation == GradientDrawable.Orientation.LEFT_RIGHT) {
            this.LJLJJL = i;
        }
        if (orientation == GradientDrawable.Orientation.TL_BR) {
            this.LJLJJL = i;
            this.LJLJJLL = i2;
        }
        this.LJLJI = new LinearGradient(0.0f, 0.0f, this.LJLJJL, this.LJLJJLL, iArr, fArr, Shader.TileMode.CLAMP);
    }
}
