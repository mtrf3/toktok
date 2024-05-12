package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5GE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GE extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final RectF LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    private final Paint getPaint() {
        return (Paint) this.LJLIL.getValue();
    }

    public final void LIZ(float f) {
        if (this.LJLJJL) {
            float width = (1 - f) * this.LJLILLLLZI.width();
            RectF rectF = this.LJLILLLLZI;
            float f2 = width / 2;
            rectF.left += f2;
            rectF.right -= f2;
            if (rectF.width() <= this.LJLILLLLZI.height()) {
                float width2 = this.LJLILLLLZI.width();
                this.LJLJI = width2;
                RectF rectF2 = this.LJLILLLLZI;
                rectF2.bottom = rectF2.top + width2;
                this.LJLJJL = false;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            RectF rectF = this.LJLILLLLZI;
            float f = this.LJLJI;
            canvas.drawRoundRect(rectF, f, f, getPaint());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5GE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(C5GF.LJLIL);
        this.LJLILLLLZI = new RectF();
        this.LJLJJL = true;
        this.LJLJJLL = ColorProtector.parseColor("#4CFF6482");
        this.LJLJL = ColorProtector.parseColor("#4CE43CFF");
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abf, R.attr.b6h, R.attr.bed});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…e.BattleBorderBackground)");
        this.LJLJJLL = obtainStyledAttributes.getColor(2, this.LJLJJLL);
        this.LJLJL = obtainStyledAttributes.getColor(0, this.LJLJL);
        float dimension = obtainStyledAttributes.getDimension(1, 13.0f);
        this.LJLJJI = dimension;
        this.LJLJI = dimension;
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{this.LJLJJLL, this.LJLJL}, (float[]) null, Shader.TileMode.CLAMP));
        this.LJLILLLLZI.set(0.0f, 0.0f, f, i2);
    }
}
