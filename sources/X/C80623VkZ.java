package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* renamed from: X.VkZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80623VkZ extends AbstractC80624Vka {
    public final Paint LLIFFJFJJ;
    public final Paint LLII;
    public final Bitmap LLIIII;
    public WeakReference<Bitmap> LLIIIILZ;

    public final boolean LJI() {
        if ((!this.LJLILLLLZI && !this.LJLJI && this.LJLJJI <= 0.0f) || this.LLIIII == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC80624Vka, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.LLIIII;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return super.getIntrinsicHeight();
    }

    @Override // X.AbstractC80624Vka, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.LLIIII;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return super.getIntrinsicWidth();
    }

    @Override // X.AbstractC80624Vka, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C81939WDv.LIZIZ();
        if (!LJI()) {
            super.draw(canvas);
            C81939WDv.LIZIZ();
            return;
        }
        LJ();
        LIZLLL();
        WeakReference<Bitmap> weakReference = this.LLIIIILZ;
        if (weakReference == null || weakReference.get() != this.LLIIII) {
            this.LLIIIILZ = new WeakReference<>(this.LLIIII);
            this.LLIFFJFJJ.setFilterBitmap(true);
            Paint paint = this.LLIFFJFJJ;
            Bitmap bitmap = this.LLIIII;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.LJLJJLL = true;
        }
        if (this.LJLJJLL) {
            this.LLIFFJFJJ.getShader().setLocalMatrix(this.LLFF);
            this.LJLJJLL = false;
        }
        int save = canvas.save();
        canvas.concat(this.LL);
        canvas.drawPath(this.LJLJJL, this.LLIFFJFJJ);
        float f = this.LJLJJI;
        if (f > 0.0f) {
            this.LLII.setStrokeWidth(f);
            this.LLII.setColor(C80603VkF.LIZIZ(this.LJLJL, this.LLIFFJFJJ.getAlpha()));
            canvas.drawPath(this.LJLJLJ, this.LLII);
        }
        canvas.restoreToCount(save);
        C81939WDv.LIZIZ();
    }

    @Override // X.AbstractC80624Vka, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.LLIFFJFJJ.getAlpha()) {
            this.LLIFFJFJJ.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // X.AbstractC80624Vka, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.LLIFFJFJJ.setColorFilter(colorFilter);
    }

    public C80623VkZ(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.LLIFFJFJJ = paint2;
        Paint paint3 = new Paint(1);
        this.LLII = paint3;
        this.LLIIII = bitmap;
        if (Build.VERSION.SDK_INT >= 24 && (this.LJLIL instanceof BitmapDrawable) && bitmap != null) {
            int density = bitmap.getDensity();
            int i = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (density == i) {
                ((BitmapDrawable) this.LJLIL).setTargetDensity(i);
            }
        }
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }
}
