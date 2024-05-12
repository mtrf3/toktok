package X;

import Y.ARunnableS38S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5hQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141805hQ extends View implements ValueAnimator.AnimatorUpdateListener {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public final float LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final Paint LJLJLLL;
    public boolean LJLL;
    public final ObjectAnimator LJLLI;

    public final float getAnimProgress() {
        return this.LJLJJL;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i = this.LJLIL;
        int i2 = this.LJLJI;
        if (i != i2 && this.LJLILLLLZI != this.LJLJJI) {
            if (this.LJLJJL < 1.0f) {
                if (canvas != null) {
                    float f = 2;
                    canvas.drawText(String.valueOf(i2), this.LJLJJLL, (this.LJLJLJ * this.LJLJJL) + (((height / 2) - (this.LJLJLLL.descent() / f)) - (this.LJLJLLL.ascent() / f)), this.LJLJLLL);
                    float f2 = 2;
                    canvas.drawText(String.valueOf(this.LJLJJI), this.LJLJL, (this.LJLJLJ * this.LJLJJL) + (((height / 2) - (this.LJLJLLL.descent() / f2)) - (this.LJLJLLL.ascent() / f2)), this.LJLJLLL);
                } else {
                    return;
                }
            } else if (canvas == null) {
                return;
            }
            float f3 = 2;
            canvas.drawText(String.valueOf(this.LJLIL), this.LJLJJLL, (((height / 2) - (this.LJLJLLL.descent() / f3)) - (this.LJLJLLL.ascent() / f3)) - ((1 - this.LJLJJL) * this.LJLJLJ), this.LJLJLLL);
            float f4 = 2;
            canvas.drawText(String.valueOf(this.LJLILLLLZI), this.LJLJL, (((height / 2) - (this.LJLJLLL.descent() / f4)) - (this.LJLJLLL.ascent() / f4)) - ((1 - this.LJLJJL) * this.LJLJLJ), this.LJLJLLL);
            return;
        }
        if (this.LJLILLLLZI != this.LJLJJI) {
            if (canvas != null) {
                float f5 = 2;
                canvas.drawText(String.valueOf(i), this.LJLJJLL, ((height / 2) - (this.LJLJLLL.descent() / f5)) - (this.LJLJLLL.ascent() / f5), this.LJLJLLL);
            }
            if (this.LJLJJL < 1.0f) {
                if (canvas == null) {
                    return;
                }
                float f6 = 2;
                canvas.drawText(String.valueOf(this.LJLJJI), this.LJLJL, (this.LJLJLJ * this.LJLJJL) + (((height / 2) - (this.LJLJLLL.descent() / f6)) - (this.LJLJLLL.ascent() / f6)), this.LJLJLLL);
            } else if (canvas == null) {
                return;
            }
            float f7 = 2;
            canvas.drawText(String.valueOf(this.LJLILLLLZI), this.LJLJL, (((height / 2) - (this.LJLJLLL.descent() / f7)) - (this.LJLJLLL.ascent() / f7)) - ((1 - this.LJLJJL) * this.LJLJLJ), this.LJLJLLL);
            return;
        }
        if (canvas == null) {
            return;
        }
        float f8 = 2;
        canvas.drawText(String.valueOf(i), this.LJLJJLL, ((height / 2) - (this.LJLJLLL.descent() / f8)) - (this.LJLJLLL.ascent() / f8), this.LJLJLLL);
        float f9 = 2;
        canvas.drawText(String.valueOf(this.LJLILLLLZI), this.LJLJL, ((height / 2) - (this.LJLJLLL.descent() / f9)) - (this.LJLJLLL.ascent() / f9), this.LJLJLLL);
    }

    public final void setAnimProgress(float f) {
        this.LJLJJL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141805hQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        a1.LJFF(context, "context");
        this.LJLJI = 1;
        this.LJLJJI = 1;
        this.LJLJJL = 1.0f;
        this.LJLJLJ = 71.0f;
        Paint paint = new Paint();
        this.LJLJLLL = paint;
        this.LJLL = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animProgress", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        this.LJLLI = ofFloat;
        float LIZJ = KL2.LIZJ(getContext(), 37.0f);
        this.LJLJLJ = LIZJ;
        paint.setTextSize(LIZJ);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTypeface(C8HI.LIZJ().LIZLLL("bold"));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        Integer LJI = C79045V0n.LJI(R.attr.ef, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        paint.setShadowLayer(2.0f, -0.5f, 0.5f, i);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 65));
        this.LJLJJLL = paint.measureText(CardStruct.IStatusCode.DEFAULT) * 0.5f;
        this.LJLJL = paint.measureText(CardStruct.IStatusCode.DEFAULT) * 1.5f;
    }

    public final void LIZ(int i, int i2) {
        if (i == this.LJLJI && i2 == this.LJLJJI) {
            if (i != this.LJLIL || i2 != this.LJLILLLLZI) {
                this.LJLIL = i;
                this.LJLILLLLZI = i2;
            } else {
                return;
            }
        } else if (this.LJLL) {
            this.LJLJI = i;
            this.LJLIL = i;
            this.LJLJJI = i2;
            this.LJLILLLLZI = i2;
            this.LJLL = false;
        } else {
            this.LJLJI = this.LJLIL;
            this.LJLIL = i;
            this.LJLJJI = this.LJLILLLLZI;
            this.LJLILLLLZI = i2;
        }
        post(new ARunnableS38S0100000_2(this, 79));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension((int) (this.LJLJLLL.measureText(CardStruct.IStatusCode.DEFAULT) * 2), (int) (this.LJLJLLL.getFontMetrics().bottom - this.LJLJLLL.getFontMetrics().top));
                return;
            }
        } else if (mode != Integer.MIN_VALUE) {
            if (mode2 != Integer.MIN_VALUE) {
                return;
            }
            setMeasuredDimension(size, (int) (this.LJLJLLL.measureText(CardStruct.IStatusCode.DEFAULT) * 2));
            return;
        }
        setMeasuredDimension((int) (this.LJLJLLL.measureText(CardStruct.IStatusCode.DEFAULT) * 2), size2);
    }
}
