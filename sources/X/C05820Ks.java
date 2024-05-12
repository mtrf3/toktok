package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05820Ks extends View {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final float LJLJI;
    public final int LJLJJI;
    public int LJLJJL;
    public final int LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final boolean LJLJLLL;
    public final RectF LJLL;
    public int LJLLI;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLLILLLL;
    public final boolean LJLLJ;

    public final int getNominalTone() {
        return this.LJLLI - ((this.LJLJJLL / 2) + 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int LIZ;
        super.onDraw(canvas);
        if (this.LJLJLLL) {
            int width = getWidth();
            int i3 = this.LJLJJLL;
            i = (width - (this.LJLJJI * i3)) / (i3 + 1);
        } else {
            int width2 = getWidth();
            int i4 = this.LJLJJLL;
            i = (width2 - (this.LJLJJI * i4)) / (i4 - 1);
        }
        this.LJLJJL = i;
        int i5 = this.LJLJJLL;
        if (1 <= i5) {
            int i6 = 1;
            while (true) {
                if (this.LJLJLLL) {
                    if (i6 == 1) {
                        LIZ = this.LJLJJL;
                    } else {
                        int i7 = this.LJLJJL;
                        LIZ = C0EH.LIZ(this.LJLJJI, i7, i6 - 1, i7);
                    }
                    f = LIZ;
                } else {
                    f = (i6 - 1) * (this.LJLJJI + this.LJLJJL);
                }
                RectF rectF = this.LJLL;
                rectF.left = f;
                rectF.right = f + this.LJLJJI;
                if (this.LJLLJ) {
                    rectF.top = (getHeight() - this.LJLJI) - ((this.LJLJJLL - i6) * this.LJLJLJ);
                } else {
                    rectF.top = (getHeight() - this.LJLJI) - ((i6 - 1) * this.LJLJLJ);
                }
                this.LJLL.bottom = getHeight();
                if (this.LJLLJ) {
                    i2 = (this.LJLJJLL - this.LJLLI) + 1;
                } else {
                    i2 = this.LJLLI;
                }
                if (i6 == i2) {
                    if (canvas != null) {
                        RectF rectF2 = this.LJLL;
                        float f2 = this.LJLJL;
                        canvas.drawRoundRect(rectF2, f2, f2, this.LJLIL);
                    }
                } else if (canvas != null) {
                    RectF rectF3 = this.LJLL;
                    float f3 = this.LJLJL;
                    canvas.drawRoundRect(rectF3, f3, f3, this.LJLILLLLZI);
                }
                if (i6 != i5) {
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    public final void setHighLightColor(int i) {
        this.LJLIL.setColor(i);
        invalidate();
    }

    public final void setOnToneChangeListener(InterfaceC88472Yns<? super Integer, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLILLLL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05820Ks(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int LIZIZ;
        int LIZIZ2;
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LJLILLLLZI = paint2;
        this.LJLL = new RectF();
        this.LJLLJ = C0YH.LIZ(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wm, R.attr.xv, R.attr.afs, R.attr.b0k, R.attr.b14, R.attr.b28, R.attr.bfa, R.attr.bju});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.ToneProcessView)");
        Context context2 = getContext();
        if (context2 == null) {
            LIZIZ = 0;
        } else {
            LIZIZ = C259910h.LIZIZ(R.attr.dj, context2);
        }
        paint.setColor(obtainStyledAttributes.getColor(2, LIZIZ));
        Context context3 = getContext();
        if (context3 == null) {
            LIZIZ2 = 0;
        } else {
            LIZIZ2 = C259910h.LIZIZ(R.attr.d1, context3);
        }
        paint2.setColor(obtainStyledAttributes.getColor(5, LIZIZ2));
        int integer = obtainStyledAttributes.getInteger(7, 9);
        this.LJLJJLL = integer;
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(6, C15380j0.LIZ(8.0f));
        this.LJLJL = obtainStyledAttributes.getDimensionPixelSize(1, C15380j0.LIZ(4.0f));
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, C15380j0.LIZ(8.0f));
        this.LJLJI = dimensionPixelSize;
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, C15380j0.LIZ(24.0f));
        this.LJLJLLL = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.LJLLI = (integer / 2) + 1;
        this.LJLJLJ = (dimensionPixelSize2 - dimensionPixelSize) / (integer - 1);
    }
}
