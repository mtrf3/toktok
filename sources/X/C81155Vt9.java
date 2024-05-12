package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.i0;

/* renamed from: X.Vt9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81155Vt9 extends View {
    public T5S LJLIL;
    public final Paint.FontMetrics LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public final long LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public int LJLJLLL;
    public long LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public final boolean LJLLJ;
    public final C81157VtB LJLLL;

    public final void LIZ() {
        if (this.LJLJLLL == 1) {
            return;
        }
        if (this.LJLLJ) {
            C57252MdU.LIZ(this.LJLLL);
        }
        this.LJLJLLL = 1;
        invalidate();
    }

    public final void LIZIZ() {
        C81157VtB c81157VtB;
        AbstractChoreographerFrameCallbackC57253MdV abstractChoreographerFrameCallbackC57253MdV;
        if (this.LJLJLLL == 0) {
            return;
        }
        if (this.LJLLJ && (c81157VtB = this.LJLLL) != null && (abstractChoreographerFrameCallbackC57253MdV = (AbstractChoreographerFrameCallbackC57253MdV) C57252MdU.LIZ.getValue()) != null) {
            abstractChoreographerFrameCallbackC57253MdV.LIZ(c81157VtB);
        }
        int i = this.LJLJLLL;
        if (i == 1) {
            this.LJLJLLL = 0;
            invalidate();
        } else if (i == 2) {
            this.LJLJL = 0.0f;
            this.LJLL = 0L;
            this.LJLJLLL = 0;
            invalidate();
        }
    }

    public final void LIZJ() {
        if (this.LJLJLLL == 2) {
            return;
        }
        if (this.LJLLJ) {
            C57252MdU.LIZ(this.LJLLL);
        }
        this.LJLJLLL = 2;
        this.LJLJL = 0.0f;
        this.LJLL = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJLLL == 0) {
            LIZJ();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.LJLJI)) {
            float f = 0.0f;
            if (this.LJLJLJ == 0.0f) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.LJLL;
            if (j > 0) {
                float f2 = ((float) ((uptimeMillis - j) * this.LJLJJL)) / 1000.0f;
                float f3 = this.LJLJL;
                if (this.LJLLI) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
                this.LJLJL = ((f2 * i3) + f3) % this.LJLJLJ;
            }
            if (this.LJLJLLL == 0) {
                this.LJLL = uptimeMillis;
            }
            float f4 = -this.LJLILLLLZI.top;
            if (this.LJLJJI) {
                float height = getHeight();
                Paint.FontMetrics fontMetrics = this.LJLILLLLZI;
                f4 = ((height - fontMetrics.descent) - fontMetrics.ascent) / 2.0f;
            }
            while (true) {
                float measuredWidth = getMeasuredWidth();
                float f5 = this.LJLJL;
                boolean z = this.LJLLI;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                if (f >= (i * f5) + measuredWidth) {
                    break;
                }
                String str = this.LJLJI;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                canvas.drawText(str, (i2 * f) + f5, f4, this.LJLIL);
                f += this.LJLJLJ;
            }
            if (this.LJLJLLL != 0 || this.LJLLJ) {
                return;
            }
            postInvalidateDelayed(this.LJLJJLL);
        }
    }

    public void setIsTextInCenterVertical(boolean z) {
        this.LJLJJI = z;
        invalidate();
    }

    public void setSpeed(int i) {
        this.LJLJJL = i;
    }

    public void setText(String str) {
        this.LJLJI = i0.LJFF(str, "    ");
        C37179EiV.LIZJ(false).execute(new ARunnableS50S0100000_14(this, 62));
        this.LJLLI = C13670gF.LIZJ().LIZLLL(this.LJLJI);
    }

    public void setTextColor(int i) {
        T5S t5s = this.LJLIL;
        if (t5s != null) {
            t5s.setColor(i);
        }
    }

    public void setTextShadow(int i) {
        T5S t5s = this.LJLIL;
        if (t5s != null) {
            t5s.setShadowLayer(1.0f, 1.0f, 1.0f, i);
        }
    }

    public void setTuxFont(int i) {
        T5S t5s = this.LJLIL;
        if (t5s != null) {
            t5s.LIZ(i);
            this.LJLIL.getFontMetrics(this.LJLILLLLZI);
        }
    }

    public void setText(int i) {
        setText(getResources().getString(i));
    }

    public C81155Vt9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
        this.LJLILLLLZI = fontMetrics;
        this.LJLJJI = false;
        this.LJLJJL = 25;
        this.LJLJJLL = 16L;
        this.LJLLILLLL = 0;
        this.LJLLJ = C91E.LIZ();
        this.LJLLL = new C81157VtB(this);
        T5S t5s = new T5S();
        this.LJLIL = t5s;
        t5s.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6r, R.attr.bbx, R.attr.bv9, R.attr.bv_, R.attr.bva});
        this.LJLJJL = obtainStyledAttributes.getDimensionPixelSize(1, this.LJLJJL);
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(3, 0);
        int i2 = obtainStyledAttributes.getInt(0, 1);
        if (i2 == 1 || i2 != 2) {
            i = 41;
        } else {
            i = 51;
        }
        obtainStyledAttributes.recycle();
        this.LJLIL.LIZ(i);
        this.LJLIL.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.LJLIL.setColor(color);
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("regular");
        if (LIZLLL != null) {
            this.LJLIL.setTypeface(LIZLLL);
        }
        this.LJLIL.getFontMetrics(fontMetrics);
        this.LJLJLLL = 2;
        this.LJLLILLLL = context.getResources().getDimensionPixelSize(R.dimen.kg);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) this.LJLJLJ;
        Paint.FontMetrics fontMetrics = this.LJLILLLLZI;
        int i4 = (int) (fontMetrics.bottom - fontMetrics.top);
        if (View.MeasureSpec.getSize(i) <= i3) {
            i3 = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(i3, i4);
    }
}
