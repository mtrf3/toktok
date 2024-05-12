package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151465x0 extends View {
    public static final int LJLLL = Color.argb(128, 0, 0, 0);
    public int LJLIL;
    public Rect LJLILLLLZI;
    public Rect LJLJI;
    public OSZ<Integer, Integer> LJLJJI;
    public OSZ<Integer, Integer> LJLJJL;
    public final Paint LJLJJLL;
    public final PorterDuffXfermode LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final float LJLL;
    public int LJLLI;
    public ValueAnimator LJLLILLLL;
    public boolean LJLLJ;

    public static /* synthetic */ void getCurrentRatioMode$annotations() {
    }

    private final int getHalfStrokeWidth() {
        return ((Number) this.LJLJLLL.getValue()).intValue();
    }

    private final Rect getTransparentRect() {
        ValueAnimator valueAnimator = this.LJLLILLLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return this.LJLJI;
        }
        return LIZ(this.LJLIL);
    }

    public final int getCropAreaWidth() {
        if (this.LJLLI <= 0) {
            this.LJLLI = getMeasuredWidth() - ((int) KL2.LIZJ(getContext(), 32.0f));
        }
        return this.LJLLI;
    }

    public final float getStrokeWidth() {
        return ((Number) this.LJLJLJ.getValue()).floatValue();
    }

    public final Rect getAnimRect() {
        return this.LJLJI;
    }

    public final Rect getCropAreaRect() {
        return this.LJLILLLLZI;
    }

    public final int getCurrentRatioMode() {
        return this.LJLIL;
    }

    public final Rect LIZ(int i) {
        if (this.LJLJJL == null) {
            LIZIZ(this.LJLJJI.getFirst().intValue(), this.LJLJJI.getSecond().intValue());
        }
        OSZ<Integer, Integer> osz = this.LJLJJL;
        if (osz != null) {
            int intValue = osz.getFirst().intValue();
            int intValue2 = osz.getSecond().intValue();
            float LIZIZ = C151045wK.LIZIZ(i);
            float f = intValue2;
            float f2 = intValue;
            if (f / f2 > LIZIZ) {
                intValue2 = (int) (f2 * LIZIZ);
            } else {
                intValue = (int) (f / LIZIZ);
            }
            int measuredWidth = (getMeasuredWidth() - intValue) / 2;
            int measuredHeight = (getMeasuredHeight() - intValue2) / 2;
            Rect rect = new Rect(measuredWidth, measuredHeight, intValue + measuredWidth, intValue2 + measuredHeight);
            this.LJLILLLLZI = rect;
            return rect;
        }
        return new Rect();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawColor(LJLLL);
            Rect transparentRect = getTransparentRect();
            this.LJLJJLL.setXfermode(this.LJLJL);
            this.LJLJJLL.setStyle(Paint.Style.FILL);
            canvas.drawRect(transparentRect, this.LJLJJLL);
            this.LJLJJLL.setXfermode(null);
            this.LJLJJLL.setColor(-1);
            this.LJLJJLL.setStyle(Paint.Style.STROKE);
            this.LJLJJLL.setStrokeWidth(getStrokeWidth());
            canvas.drawRect(new Rect(transparentRect.left + getHalfStrokeWidth(), transparentRect.top + getHalfStrokeWidth(), transparentRect.right - getHalfStrokeWidth(), transparentRect.bottom - getHalfStrokeWidth()), this.LJLJJLL);
            this.LJLJJLL.setStrokeWidth(this.LJLL);
            Paint paint = this.LJLJJLL;
            if (!this.LJLLJ) {
                return;
            }
            float f = 3;
            float width = transparentRect.width() / f;
            float f2 = transparentRect.left + width;
            canvas.drawLine(f2, transparentRect.top, f2, transparentRect.bottom, paint);
            float f3 = f2 + width;
            canvas.drawLine(f3, transparentRect.top, f3, transparentRect.bottom, paint);
            float height = transparentRect.height() / f;
            float f4 = transparentRect.top + height;
            canvas.drawLine(transparentRect.left, f4, transparentRect.right, f4, paint);
            float f5 = f4 + height;
            canvas.drawLine(transparentRect.left, f5, transparentRect.right, f5, paint);
        }
    }

    public final void setAnimRect(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LJLJI = rect;
    }

    public final void setCanShowAuxiliaryLines(boolean z) {
        if (z != this.LJLLJ) {
            this.LJLLJ = z;
            invalidate();
        }
    }

    public final void setCropAreaRect(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LJLILLLLZI = rect;
    }

    public final void setCurrentRatioMode(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151465x0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new Rect();
        this.LJLJI = new Rect();
        this.LJLJJI = new OSZ<>(0, 0);
        this.LJLJJLL = new Paint();
        this.LJLJL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS152S0100000_2(context, 770));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 769));
        this.LJLL = C32151Nz.LJIIZILJ(Double.valueOf(0.5d));
        setLayerType(1, null);
    }

    public final void LIZIZ(int i, int i2) {
        int cropAreaWidth;
        int i3;
        if (getMeasuredHeight() <= 0) {
            this.LJLJJI = new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        float f = i2;
        float f2 = i;
        if (f / f2 > getMeasuredHeight() / getCropAreaWidth()) {
            i3 = getMeasuredHeight();
            cropAreaWidth = (int) ((i3 / f) * f2);
        } else {
            cropAreaWidth = getCropAreaWidth();
            i3 = (int) ((cropAreaWidth / f2) * f);
        }
        this.LJLJJL = new OSZ<>(Integer.valueOf(cropAreaWidth), Integer.valueOf(i3));
    }
}
