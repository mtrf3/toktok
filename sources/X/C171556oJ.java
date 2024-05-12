package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.6oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171556oJ extends ReplacementSpan {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public Paint LJLLJ;
    public Paint LJLLL;
    public WeakReference<Drawable> LJLLLL;
    public float LJLLLLLL;

    public final Drawable LIZ() {
        Drawable LIZIZ;
        WeakReference<Drawable> weakReference = this.LJLLLL;
        if (weakReference == null || (LIZIZ = weakReference.get()) == null) {
            LIZIZ = C04270Et.LIZIZ(this.LJLIL, this.LJLJJI);
            if (LIZIZ == null) {
                LIZIZ = new ColorDrawable();
            }
            this.LJLLLL = new WeakReference<>(LIZIZ);
        }
        return LIZIZ;
    }

    public final void LIZIZ() {
        if (!TextUtils.isEmpty(this.LJLILLLLZI) && this.LJLLL == null) {
            this.LJLLL = new TextPaint();
            try {
                if (TextUtils.isEmpty(this.LJLJI)) {
                    Paint paint = this.LJLLL;
                    o.LJI(paint);
                    paint.setColor(this.LJLJL);
                } else {
                    Paint paint2 = this.LJLLL;
                    o.LJI(paint2);
                    paint2.setColor(Color.parseColor(this.LJLJI));
                }
            } catch (Exception unused) {
                Paint paint3 = this.LJLLL;
                o.LJI(paint3);
                paint3.setColor(this.LJLJL);
            }
            Paint paint4 = this.LJLLL;
            o.LJI(paint4);
            paint4.setTextSize(this.LJLLILLLL);
            Paint paint5 = this.LJLLL;
            o.LJI(paint5);
            paint5.setAntiAlias(true);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        return (int) this.LJLJLJ;
    }

    public C171556oJ(Context context, String str, String str2, int i, String str3, String str4, int i2, int i3) {
        float intrinsicWidth;
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        this.LJLIL = LLLLL;
        this.LJLJL = ColorProtector.parseColor("#FACE15");
        float applyDimension = TypedValue.applyDimension(1, 1.0f, LLLLL.getResources().getDisplayMetrics());
        this.LJLLI = applyDimension;
        this.LJLLILLLL = i2 * applyDimension;
        this.LJLJLLL = i3 * applyDimension;
        this.LJLL = 2 * applyDimension;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        if (TextUtils.isEmpty(str)) {
            intrinsicWidth = 0.0f;
        } else {
            LIZIZ();
            Rect rect = new Rect();
            Paint paint = this.LJLLL;
            o.LJI(paint);
            o.LJI(str);
            paint.getTextBounds(str, 0, str.length(), rect);
            intrinsicWidth = LIZ().getIntrinsicWidth() + (4 * applyDimension * 3) + rect.width();
        }
        this.LJLJLJ = intrinsicWidth;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String str;
        BitmapDrawable bitmapDrawable;
        int i6;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        if (!TextUtils.isEmpty(this.LJLJJLL) && this.LJLLJ == null) {
            Paint paint2 = new Paint();
            this.LJLLJ = paint2;
            try {
                paint2.setColor(Color.parseColor(this.LJLJJLL));
            } catch (Exception unused) {
                Paint paint3 = this.LJLLJ;
                o.LJI(paint3);
                paint3.setColor(-1);
            }
            Paint paint4 = this.LJLLJ;
            o.LJI(paint4);
            paint4.setStyle(Paint.Style.FILL);
            Paint paint5 = this.LJLLJ;
            o.LJI(paint5);
            paint5.setAntiAlias(true);
        }
        LIZIZ();
        Paint paint6 = this.LJLLL;
        if (paint6 != null && this.LJLLJ != null) {
            Paint.FontMetrics fontMetrics = paint6.getFontMetrics();
            float f2 = i4;
            float f3 = fontMetrics.ascent + f2;
            float f4 = f2 + fontMetrics.descent;
            float min = Math.min(Math.min(f3, canvas.getHeight() - f4), (this.LJLJLLL - (f4 - f3)) * 0.5f);
            float f5 = 1 * this.LJLLI;
            RectF rectF = new RectF(f, (f3 - min) - f5, this.LJLJLJ + f, (f4 + min) - f5);
            float f6 = this.LJLL;
            Paint paint7 = this.LJLLJ;
            if (paint7 != null) {
                canvas.drawRoundRect(rectF, f6, f6, paint7);
            }
        }
        float f7 = i4;
        if (this.LJLLL != null && (str = this.LJLILLLLZI) != null) {
            float intrinsicWidth = (6 * this.LJLLI) + f + LIZ().getIntrinsicWidth();
            float f8 = f7 - (1 * this.LJLLI);
            Paint paint8 = this.LJLLL;
            if (paint8 != null) {
                canvas.drawText(str, intrinsicWidth, f8, paint8);
            }
        }
        Drawable LIZ = LIZ();
        if (!(LIZ instanceof BitmapDrawable) || (bitmapDrawable = (BitmapDrawable) LIZ) == null) {
            return;
        }
        Bitmap bitmap = bitmapDrawable.getBitmap();
        Paint paint9 = new Paint();
        try {
            if (TextUtils.isEmpty(this.LJLJJL)) {
                i6 = this.LJLJL;
            } else {
                i6 = Color.parseColor(this.LJLJJL);
            }
        } catch (Exception unused2) {
            i6 = this.LJLJL;
        }
        paint9.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_ATOP));
        paint9.setAntiAlias(true);
        canvas.drawBitmap(bitmap, KL2.LIZJ(this.LJLIL, 4.0f) + f, KL2.LIZJ(this.LJLIL, 1.0f) + (i4 - bitmapDrawable.getMinimumHeight()) + this.LJLLLLLL, paint9);
    }
}
