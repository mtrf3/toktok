package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207768Dk extends View {
    public final int LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public ValueAnimator LJLJJLL;
    public float LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final RectF LJLJLLL;
    public float LJLL;

    private final Paint getPaint() {
        return (Paint) this.LJLJLJ.getValue();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLJJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        getPaint().setColor(this.LJLIL);
        float f = 255;
        getPaint().setAlpha((int) (this.LJLILLLLZI * f));
        canvas.drawArc(this.LJLJLLL, 0.0f, 360.0f, false, getPaint());
        getPaint().setColor(this.LJLJI);
        getPaint().setAlpha((int) (this.LJLJJI * f));
        canvas.drawArc(this.LJLJLLL, -90.0f, this.LJLJL * 360.0f, false, getPaint());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207768Dk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = 1.0f;
        this.LJLJJI = 1.0f;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1705));
        this.LJLJLLL = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b87, R.attr.b88, R.attr.b89, R.attr.b8_, R.attr.b8a}, 0, 0);
        this.LJLIL = obtainStyledAttributes.getColor(0, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getFloat(1, 1.0f);
        this.LJLJI = obtainStyledAttributes.getColor(2, 0);
        this.LJLJJI = obtainStyledAttributes.getFloat(3, 1.0f);
        this.LJLJJL = obtainStyledAttributes.getDimension(4, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.LJLJLLL;
        float f = this.LJLJJL;
        rectF.left = f / 2.0f;
        rectF.top = (f / 2.0f) + 0.0f;
        rectF.right = i - (f / 2.0f);
        rectF.bottom = i2 - (f / 2.0f);
    }
}
