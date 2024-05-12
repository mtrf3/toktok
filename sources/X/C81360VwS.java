package X;

import Y.IDAListenerS146S0200000_14;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.VwS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81360VwS extends Drawable implements Animatable {
    public static final Interpolator LJLLI = new LinearInterpolator();
    public static final C30901Je LJLLILLLL = new C30901Je();
    public static final int[] LJLLJ = {-16777216};
    public final ArrayList<Animation> LJLIL = new ArrayList<>();
    public final C81362VwU LJLILLLLZI;
    public float LJLJI;
    public final Resources LJLJJI;
    public final View LJLJJL;
    public C81364VwW LJLJJLL;
    public float LJLJL;
    public double LJLJLJ;
    public double LJLJLLL;
    public boolean LJLL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJLILLLLZI.LJIJJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.LJLJLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.LJLJLJ;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.LJLIL;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = (Animation) ListProtector.get(arrayList, i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.LJLJJLL.reset();
        C81362VwU c81362VwU = this.LJLILLLLZI;
        float f = c81362VwU.LJ;
        c81362VwU.LJIIJJI = f;
        float f2 = c81362VwU.LJFF;
        c81362VwU.LJIIL = f2;
        c81362VwU.LJIILIIL = c81362VwU.LJI;
        if (f2 != f) {
            this.LJLL = true;
            this.LJLJJLL.setDuration(666L);
            this.LJLJJL.startAnimation(this.LJLJJLL);
            return;
        }
        c81362VwU.LIZIZ(0);
        C81362VwU c81362VwU2 = this.LJLILLLLZI;
        c81362VwU2.LJIIJJI = 0.0f;
        c81362VwU2.LJIIL = 0.0f;
        c81362VwU2.LJIILIIL = 0.0f;
        c81362VwU2.LJ = 0.0f;
        c81362VwU2.LIZ();
        c81362VwU2.LJFF = 0.0f;
        c81362VwU2.LIZ();
        c81362VwU2.LJI = 0.0f;
        c81362VwU2.LIZ();
        this.LJLJJLL.setDuration(1332L);
        this.LJLJJL.startAnimation(this.LJLJJLL);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LJLJJL.clearAnimation();
        this.LJLJI = 0.0f;
        invalidateSelf();
        C81362VwU c81362VwU = this.LJLILLLLZI;
        if (c81362VwU.LJIILJJIL) {
            c81362VwU.LJIILJJIL = false;
            c81362VwU.LIZ();
        }
        this.LJLILLLLZI.LIZIZ(0);
        C81362VwU c81362VwU2 = this.LJLILLLLZI;
        c81362VwU2.LJIIJJI = 0.0f;
        c81362VwU2.LJIIL = 0.0f;
        c81362VwU2.LJIILIIL = 0.0f;
        c81362VwU2.LJ = 0.0f;
        c81362VwU2.LIZ();
        c81362VwU2.LJFF = 0.0f;
        c81362VwU2.LIZ();
        c81362VwU2.LJI = 0.0f;
        c81362VwU2.LIZ();
    }

    public final void LIZJ(int i) {
        if (i == 0) {
            LIZ(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            LIZ(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.LJLJI, bounds.exactCenterX(), bounds.exactCenterY());
        C81362VwU c81362VwU = this.LJLILLLLZI;
        RectF rectF = c81362VwU.LIZ;
        rectF.set(bounds);
        float f = c81362VwU.LJIIIIZZ;
        rectF.inset(f, f);
        float f2 = c81362VwU.LJ;
        float f3 = c81362VwU.LJI;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c81362VwU.LJFF + f3) * 360.0f) - f4;
        c81362VwU.LIZIZ.setColor(c81362VwU.LJJ);
        canvas.drawArc(rectF, f4, f5, false, c81362VwU.LIZIZ);
        if (c81362VwU.LJIILJJIL) {
            Path path = c81362VwU.LJIILL;
            if (path == null) {
                Path path2 = new Path();
                c81362VwU.LJIILL = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float f6 = (((int) c81362VwU.LJIIIIZZ) / 2) * c81362VwU.LJIILLIIL;
            float cos = (float) ((Math.cos(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) * c81362VwU.LJIIZILJ) + bounds.exactCenterX());
            float sin = (float) ((Math.sin(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) * c81362VwU.LJIIZILJ) + bounds.exactCenterY());
            c81362VwU.LJIILL.moveTo(0.0f, 0.0f);
            c81362VwU.LJIILL.lineTo(c81362VwU.LJIJ * c81362VwU.LJIILLIIL, 0.0f);
            Path path3 = c81362VwU.LJIILL;
            float f7 = c81362VwU.LJIJ;
            float f8 = c81362VwU.LJIILLIIL;
            path3.lineTo((f7 * f8) / 2.0f, c81362VwU.LJIJI * f8);
            c81362VwU.LJIILL.offset(cos - f6, sin);
            c81362VwU.LJIILL.close();
            c81362VwU.LIZJ.setColor(c81362VwU.LJJ);
            canvas.rotate((f4 + f5) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(c81362VwU.LJIILL, c81362VwU.LIZJ);
        }
        if (c81362VwU.LJIJJ < 255) {
            c81362VwU.LJIJJLI.setColor(c81362VwU.LJIL);
            c81362VwU.LJIJJLI.setAlpha(255 - c81362VwU.LJIJJ);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2, c81362VwU.LJIJJLI);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLILLLLZI.LJIJJ = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C81362VwU c81362VwU = this.LJLILLLLZI;
        c81362VwU.LIZIZ.setColorFilter(colorFilter);
        c81362VwU.LIZ();
    }

    public C81360VwS(Context context, View view) {
        C81365VwX c81365VwX = new C81365VwX(this);
        this.LJLJJL = view;
        this.LJLJJI = context.getResources();
        C81362VwU c81362VwU = new C81362VwU(c81365VwX);
        this.LJLILLLLZI = c81362VwU;
        c81362VwU.LJIIIZ = LJLLJ;
        c81362VwU.LIZIZ(0);
        LIZJ(1);
        C81364VwW c81364VwW = new C81364VwW(this, c81362VwU);
        c81364VwW.setRepeatCount(-1);
        c81364VwW.setRepeatMode(1);
        c81364VwW.setInterpolator(LJLLI);
        c81364VwW.setAnimationListener(new IDAListenerS146S0200000_14(this, c81362VwU, 2));
        this.LJLJJLL = c81364VwW;
    }

    public static void LIZIZ(float f, C81362VwU c81362VwU) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c81362VwU.LJIIIZ;
            int i = c81362VwU.LJIIJ;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            c81362VwU.LJJ = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r8) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r7) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r6) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r4))));
        }
    }

    public final void LIZ(double d, double d2, double d3, double d4, float f, float f2) {
        double ceil;
        C81362VwU c81362VwU = this.LJLILLLLZI;
        float f3 = this.LJLJJI.getDisplayMetrics().density;
        double d5 = f3;
        this.LJLJLJ = d * d5;
        this.LJLJLLL = d2 * d5;
        float f4 = ((float) d4) * f3;
        c81362VwU.LJII = f4;
        c81362VwU.LIZIZ.setStrokeWidth(f4);
        c81362VwU.LIZ();
        c81362VwU.LJIIZILJ = d3 * d5;
        c81362VwU.LIZIZ(0);
        c81362VwU.LJIJ = (int) (f * f3);
        c81362VwU.LJIJI = (int) (f2 * f3);
        float min = Math.min((int) this.LJLJLJ, (int) this.LJLJLLL);
        double d6 = c81362VwU.LJIIZILJ;
        if (d6 <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || min < 0.0f) {
            ceil = Math.ceil(c81362VwU.LJII / 2.0f);
        } else {
            ceil = (min / 2.0f) - d6;
        }
        c81362VwU.LJIIIIZZ = (float) ceil;
    }
}
