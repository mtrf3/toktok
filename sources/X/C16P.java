package X;

import Y.IDAListenerS35S0200000;
import Y.IDUListenerS170S0200000;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.16P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16P extends Drawable implements Animatable {
    public static final Interpolator LJLJL = new LinearInterpolator();
    public static final C30901Je LJLJLJ = new C30901Je();
    public static final int[] LJLJLLL = {-16777216};
    public final C16O LJLIL;
    public float LJLILLLLZI;
    public final Resources LJLJI;
    public Animator LJLJJI;
    public float LJLJJL;
    public boolean LJLJJLL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLIL.LJIJI;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.LJLJJI.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.LJLJJI.cancel();
        C16O c16o = this.LJLIL;
        float f = c16o.LJ;
        c16o.LJIIJ = f;
        float f2 = c16o.LJFF;
        c16o.LJIIJJI = f2;
        c16o.LJIIL = c16o.LJI;
        if (f2 != f) {
            this.LJLJJLL = true;
            this.LJLJJI.setDuration(666L);
            this.LJLJJI.start();
            return;
        }
        c16o.LIZ(0);
        C16O c16o2 = this.LJLIL;
        c16o2.LJIIJ = 0.0f;
        c16o2.LJIIJJI = 0.0f;
        c16o2.LJIIL = 0.0f;
        c16o2.LJ = 0.0f;
        c16o2.LJFF = 0.0f;
        c16o2.LJI = 0.0f;
        this.LJLJJI.setDuration(1332L);
        this.LJLJJI.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LJLJJI.cancel();
        this.LJLILLLLZI = 0.0f;
        C16O c16o = this.LJLIL;
        if (c16o.LJIILIIL) {
            c16o.LJIILIIL = false;
        }
        c16o.LIZ(0);
        C16O c16o2 = this.LJLIL;
        c16o2.LJIIJ = 0.0f;
        c16o2.LJIIJJI = 0.0f;
        c16o2.LJIIL = 0.0f;
        c16o2.LJ = 0.0f;
        c16o2.LJFF = 0.0f;
        c16o2.LJI = 0.0f;
        invalidateSelf();
    }

    public C16P(Context context) {
        context.getClass();
        this.LJLJI = context.getResources();
        C16O c16o = new C16O();
        this.LJLIL = c16o;
        c16o.LJIIIIZZ = LJLJLLL;
        c16o.LIZ(0);
        c16o.LJII = 2.5f;
        c16o.LIZIZ.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new IDUListenerS170S0200000(c16o, this, 5));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LJLJL);
        ofFloat.addListener(new IDAListenerS35S0200000(c16o, this, 1));
        this.LJLJJI = ofFloat;
    }

    public final void LIZJ(int i) {
        if (i == 0) {
            LIZIZ(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            LIZIZ(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.LJLILLLLZI, bounds.exactCenterX(), bounds.exactCenterY());
        C16O c16o = this.LJLIL;
        RectF rectF = c16o.LIZ;
        float f = c16o.LJIILLIIL;
        float f2 = (c16o.LJII / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c16o.LJIIZILJ * c16o.LJIILL) / 2.0f, c16o.LJII / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = c16o.LJ;
        float f4 = c16o.LJI;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((c16o.LJFF + f4) * 360.0f) - f5;
        c16o.LIZIZ.setColor(c16o.LJIJJ);
        c16o.LIZIZ.setAlpha(c16o.LJIJI);
        float f7 = c16o.LJII / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c16o.LIZLLL);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, c16o.LIZIZ);
        if (c16o.LJIILIIL) {
            Path path = c16o.LJIILJJIL;
            if (path == null) {
                Path path2 = new Path();
                c16o.LJIILJJIL = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (c16o.LJIIZILJ * c16o.LJIILL) / 2.0f;
            c16o.LJIILJJIL.moveTo(0.0f, 0.0f);
            c16o.LJIILJJIL.lineTo(c16o.LJIIZILJ * c16o.LJIILL, 0.0f);
            Path path3 = c16o.LJIILJJIL;
            float f10 = c16o.LJIIZILJ;
            float f11 = c16o.LJIILL;
            path3.lineTo((f10 * f11) / 2.0f, c16o.LJIJ * f11);
            c16o.LJIILJJIL.offset((rectF.centerX() + min) - f9, (c16o.LJII / 2.0f) + rectF.centerY());
            c16o.LJIILJJIL.close();
            c16o.LIZJ.setColor(c16o.LJIJJ);
            c16o.LIZJ.setAlpha(c16o.LJIJI);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c16o.LJIILJJIL, c16o.LIZJ);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLIL.LJIJI = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJLIL.LIZIZ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public static void LIZLLL(float f, C16O c16o) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c16o.LJIIIIZZ;
            int i = c16o.LJIIIZ;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            c16o.LJIJJ = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r8) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r7) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r6) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r4))));
            return;
        }
        c16o.LJIJJ = c16o.LJIIIIZZ[c16o.LJIIIZ];
    }

    public final void LIZ(float f, C16O c16o, boolean z) {
        float f2;
        float interpolation;
        if (this.LJLJJLL) {
            LIZLLL(f, c16o);
            float floor = (float) (Math.floor(c16o.LJIIL / 0.8f) + 1.0d);
            float f3 = c16o.LJIIJ;
            float f4 = c16o.LJIIJJI;
            c16o.LJ = (((f4 - 0.01f) - f3) * f) + f3;
            c16o.LJFF = f4;
            float f5 = c16o.LJIIL;
            c16o.LJI = C06420Na.LIZIZ(floor, f5, f, f5);
            return;
        }
        if (f == 1.0f && !z) {
            return;
        }
        float f6 = c16o.LJIIL;
        if (f < 0.5f) {
            interpolation = c16o.LJIIJ;
            f2 = (LJLJLJ.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
        } else {
            f2 = c16o.LJIIJ + 0.79f;
            interpolation = f2 - (((1.0f - LJLJLJ.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
        }
        float f7 = (0.20999998f * f) + f6;
        float f8 = (f + this.LJLJJL) * 216.0f;
        c16o.LJ = interpolation;
        c16o.LJFF = f2;
        c16o.LJI = f7;
        this.LJLILLLLZI = f8;
    }

    public final void LIZIZ(float f, float f2, float f3, float f4) {
        C16O c16o = this.LJLIL;
        float f5 = this.LJLJI.getDisplayMetrics().density;
        float f6 = f2 * f5;
        c16o.LJII = f6;
        c16o.LIZIZ.setStrokeWidth(f6);
        c16o.LJIILLIIL = f * f5;
        c16o.LIZ(0);
        c16o.LJIIZILJ = (int) (f3 * f5);
        c16o.LJIJ = (int) (f4 * f5);
    }
}
