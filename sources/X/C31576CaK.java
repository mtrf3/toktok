package X;

import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.CaK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31576CaK extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public final Paint LJLJL;
    public final Paint LJLJLJ;
    public final Paint LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public final int LJLLILLLL;
    public boolean LJLLJ;

    public final void LIZIZ(long j) {
        float f = (float) j;
        float f2 = this.LJLJJL;
        float f3 = f + f2;
        float f4 = this.LJLJJI;
        if (f3 > f4) {
            f = f4 - f2;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LJLJJLL, f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 11));
        ofFloat.addListener(new C31575CaJ(this, f));
        ofFloat.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Paint paint = this.LJLJL;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.b2));
        if (this.LJLLJ) {
            Paint paint2 = this.LJLJLJ;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(-7829368);
            paint2.setShader(null);
        } else {
            Paint paint3 = this.LJLJLJ;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, (this.LJLJJL / this.LJLJJI) * this.LJLIL, 0.0f, getResources().getColor(R.color.abj), getResources().getColor(R.color.a4g), Shader.TileMode.REPEAT));
            paint3.setStyle(Paint.Style.FILL);
            paint3.setAntiAlias(true);
        }
        Paint paint4 = this.LJLJLLL;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(getResources().getColor(R.color.ba));
        paint4.setAntiAlias(true);
        float f = this.LJLJJL;
        float f2 = this.LJLJJI;
        float f3 = this.LJLIL;
        float f4 = (f / f2) * f3;
        float f5 = (this.LJLJJLL / f2) * f3;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, this.LJLIL, this.LJLILLLLZI);
        float f6 = this.LJLL;
        canvas.drawRoundRect(rectF, f6, f6, this.LJLJL);
        int ceil = (int) Math.ceil(f5 / this.LJLLILLLL);
        int LIZ = C5S0.LIZ(((f5 / this.LJLLILLLL) + 1) - ceil) * 2;
        for (int i = 0; i < ceil; i++) {
            Path path = new Path();
            float f7 = i;
            path.moveTo((this.LJLLI * f7) + f4, 0.0f);
            path.lineTo(((this.LJLLI * f7) + f4) - C5S0.LIZ(2.0f), this.LJLILLLLZI);
            path.lineTo(((this.LJLLI * f7) + f4) - C5S0.LIZ(5.0f), this.LJLILLLLZI);
            path.lineTo(((f7 * this.LJLLI) + f4) - C5S0.LIZ(3.0f), 0.0f);
            path.close();
            canvas.drawPath(path, this.LJLJLLL);
            int i2 = ceil - 1;
            if (i == i2) {
                RectF rectF2 = new RectF();
                float f8 = (i2 * this.LJLLI) + f4;
                rectF2.set(f8, 0.0f, LIZ + f8 + C5S0.LIZ(4.0f), this.LJLILLLLZI);
                canvas.drawArc(rectF2, -64.0f, 180.0f, true, this.LJLJLLL);
            }
        }
        RectF rectF3 = new RectF();
        rectF3.set(0.0f, 0.0f, (this.LJLJJL / this.LJLJJI) * this.LJLIL, this.LJLILLLLZI);
        float f9 = this.LJLL;
        canvas.drawRoundRect(rectF3, f9, f9, this.LJLJLJ);
    }

    public final void setLevelProgress(float f) {
        this.LJLJJL = f;
    }

    public final void setLevelProgressColor(boolean z) {
        this.LJLLJ = z;
        invalidate();
    }

    public final void setMaxProgress(float f) {
        this.LJLJJI = f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31576CaK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        int i = 0;
        this.LJLJI = getResources().getColor(R.color.b2);
        this.LJLJJI = 100.0f;
        this.LJLJL = new Paint();
        this.LJLJLJ = new Paint();
        this.LJLJLLL = new Paint();
        this.LJLL = C5S0.LIZ(4.0f);
        this.LJLLI = C5S0.LIZ(6.0f);
        this.LJLLILLLL = C5S0.LIZ(6.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.x9, R.attr.b5f, R.attr.b5z});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ble.UserLevelProgressBar)");
        int indexCount = obtainStyledAttributes.getIndexCount();
        if (indexCount >= 0) {
            while (true) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    obtainStyledAttributes.getColor(index, this.LJLJI);
                }
                if (i == indexCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        if (C16310kV.LIZLLL(this) != 1) {
            z = false;
        }
        if (mode != 1073741824) {
            size2 = 8;
        }
        this.LJLILLLLZI = size2;
        this.LJLIL = size;
        setMeasuredDimension(size, size2);
        if (z) {
            setScaleX(-1.0f);
        }
    }

    public final void LIZ(float f, float f2, InterfaceC31578CaM interfaceC31578CaM) {
        float f3 = this.LJLJJI;
        if (f2 <= f3) {
            f3 = f2;
        }
        if (f3 < f) {
            interfaceC31578CaM.LIZ();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f3);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C31574CaI(this, f, f2));
        ofFloat.addListener(new C31577CaL(interfaceC31578CaM, this, f3));
        ofFloat.start();
    }
}
