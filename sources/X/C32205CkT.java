package X;

import Y.AUListenerS94S0100000_5;
import Y.IDAListenerS73S0100000_4;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.CkT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32205CkT extends View {
    public final Paint LJLIL;
    public final Path LJLILLLLZI;
    public final Path LJLJI;
    public final RectF LJLJJI;
    public ValueAnimator LJLJJL;
    public Animator.AnimatorListener LJLJJLL;
    public final int[] LJLJL;
    public float[] LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public int LJLLLL;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLJJL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        this.LJLJJL = null;
    }

    public final boolean getAutoPlay() {
        return this.LJLJLLL;
    }

    public final int getDuration() {
        return this.LJLLILLLL;
    }

    public final int getOffset() {
        return this.LJLLLL;
    }

    public final float[] getPositionArray() {
        return this.LJLJLJ;
    }

    public final int getRadius() {
        return this.LJLLJ;
    }

    public final int getRepeatCount() {
        return this.LJLL;
    }

    public final float getSlope() {
        return this.LJLLL;
    }

    public final int getSpeed() {
        return this.LJLLI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ValueAnimator valueAnimator = this.LJLJJL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLJI.reset();
            this.LJLJJI.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.LJLJI;
            RectF rectF = this.LJLJJI;
            int i = this.LJLLJ;
            path.addRoundRect(rectF, i, i, Path.Direction.CW);
            if (canvas != null) {
                canvas.clipPath(this.LJLJI);
                canvas.drawPath(this.LJLILLLLZI, this.LJLIL);
            }
        }
    }

    public final void setAnimatorListener(Animator.AnimatorListener listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL = listener;
    }

    public final void setAutoPlay(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setDuration(int i) {
        this.LJLLILLLL = i;
    }

    public final void setOffset(int i) {
        this.LJLLLL = i;
    }

    public final void setPositionArray(float[] fArr) {
        o.LJIIIZ(fArr, "<set-?>");
        this.LJLJLJ = fArr;
    }

    public final void setRadius(int i) {
        this.LJLLJ = i;
    }

    public final void setRepeatCount(int i) {
        this.LJLL = i;
    }

    public final void setSlope(float f) {
        this.LJLLL = f;
    }

    public final void setSpeed(int i) {
        this.LJLLI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32205CkT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new Paint();
        this.LJLILLLLZI = new Path();
        this.LJLJI = new Path();
        this.LJLJJI = new RectF();
        this.LJLJL = new int[]{0, -1, 0};
        this.LJLJLJ = new float[]{0.0f, 0.5f, 1.0f};
        this.LJLLI = -1;
        this.LJLLILLLL = 3000;
        this.LJLLL = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wn, R.attr.a51, R.attr.aaj, R.attr.b35, R.attr.b55, R.attr.b6h, R.attr.b7n, R.attr.bbo, R.attr.bbx});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.SweepLightView)");
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 1);
        String LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 4);
        if (LLLZLZ != null && LLLZLZ2 != null) {
            List LJLJJI = s.LJLJJI(LLLZLZ, new char[]{','}, false, 6);
            List LJLJJI2 = s.LJLJJI(LLLZLZ2, new char[]{','}, false, 6);
            if (LJLJJI.size() == LJLJJI2.size()) {
                this.LJLJL = new int[LJLJJI.size()];
                this.LJLJLJ = new float[LJLJJI2.size()];
                Iterator it = LJLJJI.iterator();
                int i = 0;
                while (it.hasNext()) {
                    this.LJLJL[i] = ColorProtector.parseColor((String) it.next());
                    i++;
                }
                Iterator it2 = LJLJJI2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    int i3 = i2 + 1;
                    try {
                        this.LJLJLJ[i2] = CastFloatProtector.parseFloat((String) it2.next());
                    } catch (Exception unused) {
                        this.LJLJLJ[i2] = 0.0f;
                    }
                    i2 = i3;
                }
            }
        }
        this.LJLJLLL = obtainStyledAttributes.getBoolean(0, false);
        this.LJLL = obtainStyledAttributes.getInt(6, 0);
        this.LJLLI = (int) obtainStyledAttributes.getDimension(8, -1.0f);
        this.LJLLILLLL = obtainStyledAttributes.getInt(2, 3000);
        this.LJLLJ = (int) obtainStyledAttributes.getDimension(5, 0.0f);
        this.LJLLL = obtainStyledAttributes.getFloat(7, 0.0f);
        this.LJLLLL = (int) obtainStyledAttributes.getDimension(3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        long j;
        ValueAnimator valueAnimator;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.LJLILLLLZI.moveTo(0.0f, 0.0f);
        float f = size;
        this.LJLILLLLZI.lineTo(f, 0.0f);
        float f2 = size2;
        this.LJLILLLLZI.lineTo(f, f2);
        this.LJLILLLLZI.lineTo(0.0f, f2);
        this.LJLILLLLZI.close();
        int i3 = this.LJLLLL;
        ValueAnimator ofInt = ValueAnimator.ofInt(-i3, size + i3);
        ofInt.setRepeatCount(this.LJLL);
        int i4 = this.LJLLI;
        if (i4 > 0) {
            j = (f / i4) * ((float) 1000);
        } else {
            j = this.LJLLILLLL;
        }
        ofInt.setDuration(j);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new AUListenerS94S0100000_5(this, 4));
        ofInt.addListener(new IDAListenerS73S0100000_4(this, 2));
        if (this.LJLJLLL && (valueAnimator = this.LJLJJL) != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            }
            valueAnimator.start();
        }
        this.LJLJJL = ofInt;
    }
}
