package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8F7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F7 extends ReplacementSpan {
    public static final /* synthetic */ int LJLLLL = 0;
    public final float LJLIL;
    public int LJLILLLLZI;
    public final float LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final Context LJLJLJ;
    public final float LJLJLLL;
    public final Paint LJLL;
    public final Paint LJLLI;
    public final Paint LJLLILLLL;
    public final RectF LJLLJ;
    public final Bitmap LJLLL;

    public final void LIZ(Canvas canvas, RectF rectF) {
        int i = this.LJLJJL;
        if (i != -1) {
            this.LJLLI.setColor(i);
        } else {
            this.LJLLI.setColor(C78609UtB.LJJJ(R.attr.dn, this.LJLJLJ));
        }
        this.LJLLI.setAntiAlias(true);
        this.LJLLI.setStyle(Paint.Style.FILL);
        float f = this.LJLIL;
        canvas.drawRoundRect(rectF, f, f, this.LJLLI);
    }

    public final void LIZIZ(Canvas canvas, float f, RectF rectF) {
        int i = this.LJLJL;
        if (i != -1) {
            this.LJLL.setColor(i);
        } else {
            this.LJLL.setColor(C78609UtB.LJJJ(R.attr.cl, this.LJLJLJ));
        }
        Paint.FontMetricsInt fontMetricsInt = this.LJLL.getFontMetricsInt();
        float f2 = rectF.bottom;
        float f3 = f2 - ((f2 - rectF.top) / 2);
        canvas.drawText(this.LJLJJLL, f, (((r1 - fontMetricsInt.ascent) / 2.0f) + f3) - fontMetricsInt.descent, this.LJLL);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(text, "text");
        return (int) ((4 * this.LJLJLLL) + this.LJLILLLLZI);
    }

    public C8F7(Context context, boolean z, int i, String str, int i2, int i3, int i4, int i5) {
        Context context2;
        float f;
        float f2;
        float f3;
        float width;
        double width2;
        this.LJLIL = 2.0f;
        this.LJLJI = 16.0f;
        this.LJLJJL = -1;
        this.LJLJL = -1;
        Paint paint = new Paint();
        this.LJLL = paint;
        this.LJLLI = new Paint();
        this.LJLLILLLL = new Paint();
        this.LJLLJ = new RectF();
        if (context != null) {
            context2 = C16880lQ.LLLLL(context);
        } else {
            context2 = null;
        }
        this.LJLJLJ = context2;
        if (context != null) {
            f = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        } else {
            f = 3.0f;
        }
        this.LJLJLLL = f;
        str = (str == null || str.length() == 0) ? "Sponsored" : str;
        this.LJLJJLL = str;
        this.LJLJJL = i;
        this.LJLJL = i2;
        if (i3 > 0) {
            f2 = i3 * f;
        } else {
            f2 = f * 16.0f;
        }
        this.LJLJI = f2;
        if (i4 > 0) {
            f3 = i4 * f;
        } else {
            f3 = 10.0f * f;
        }
        if (i5 == 1) {
            this.LJLLL = context != null ? BitmapFactory.decodeResource(context.getResources(), R.drawable.agv) : null;
        }
        this.LJLIL = 2.0f * f;
        this.LJLJJI = z;
        Rect rect = new Rect();
        paint.setTextSize(f3);
        if (new OJD(".*[a-zA-z].*").matches(str)) {
            paint.setTypeface(C49616Jdc.LIZIZ().LIZJ(1));
        }
        T5S t5s = new T5S();
        t5s.LIZ(82);
        paint.setTypeface(t5s.getTypeface());
        paint.setAntiAlias(true);
        paint.getTextBounds(str, 0, str.length(), rect);
        float f4 = 4 * f;
        Bitmap bitmap = this.LJLLL;
        if (bitmap == null && i == 0) {
            width = rect.width() + f4;
        } else if (bitmap == null) {
            width2 = (f4 * 2) + rect.width();
            this.LJLILLLLZI = (int) ((f * 0.5d) + width2);
        } else {
            float f5 = 2;
            width = (f5 * f) + (11.5f * f) + (f4 * f5) + rect.width();
        }
        width2 = width;
        this.LJLILLLLZI = (int) ((f * 0.5d) + width2);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        RectF rectF = this.LJLLJ;
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f3 = this.LJLJLLL * 0.5f;
        int i6 = fontMetricsInt.descent;
        int i7 = fontMetricsInt.ascent;
        float f4 = this.LJLJI;
        float f5 = 2;
        float f6 = (((i6 - i7) - f4) / f5) + i4 + i7;
        rectF.set(new RectF(f3 + f, f6, this.LJLILLLLZI + f + f3, f4 + f6));
        Bitmap bitmap = this.LJLLL;
        if (bitmap == null && this.LJLJJL == 0) {
            LIZIZ(canvas, f, this.LJLLJ);
            return;
        }
        if (bitmap == null) {
            LIZ(canvas, this.LJLLJ);
            LIZIZ(canvas, (4 * this.LJLJLLL) + f, this.LJLLJ);
            return;
        }
        LIZ(canvas, this.LJLLJ);
        RectF rectF2 = this.LJLLJ;
        float f7 = 4;
        float f8 = this.LJLJLLL;
        float f9 = f7 * f8;
        float f10 = f5 * f8;
        float f11 = rectF2.bottom;
        float f12 = rectF2.top;
        float f13 = (((f11 - f12) - (f10 * f5)) - (8.0f * f8)) / f5;
        float f14 = f12 + f13;
        float f15 = f11 - f13;
        boolean z = this.LJLJJI;
        float f16 = rectF2.left;
        if (z) {
            f2 = f10 + f16;
        } else {
            f2 = f16 + f9;
        }
        RectF rectF3 = new RectF(f2, f14, (f8 * 11.5f) + f2, f15);
        Bitmap bitmap2 = this.LJLLL;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, rectF3, this.LJLLILLLL);
        }
        float f17 = this.LJLJLLL;
        LIZIZ(canvas, (f5 * f17) + (11.5f * f17) + (f7 * f17) + f, this.LJLLJ);
    }
}
