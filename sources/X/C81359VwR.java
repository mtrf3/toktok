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

/* renamed from: X.VwR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81359VwR extends Drawable implements Animatable {
    public static final Interpolator LJLLI = new LinearInterpolator();
    public static final C30901Je LJLLILLLL = new C30901Je();
    public static final int[] LJLLJ = {-16777216};
    public final ArrayList<Animation> LJLIL = new ArrayList<>();
    public final C81361VwT LJLILLLLZI;
    public float LJLJI;
    public final Resources LJLJJI;
    public final View LJLJJL;
    public C81363VwV LJLJJLL;
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
        C81361VwT c81361VwT = this.LJLILLLLZI;
        float f = c81361VwT.LJ;
        c81361VwT.LJIIJJI = f;
        float f2 = c81361VwT.LJFF;
        c81361VwT.LJIIL = f2;
        c81361VwT.LJIILIIL = c81361VwT.LJI;
        if (f2 != f) {
            this.LJLL = true;
            this.LJLJJLL.setDuration(666L);
            this.LJLJJL.startAnimation(this.LJLJJLL);
            return;
        }
        c81361VwT.LIZIZ(0);
        C81361VwT c81361VwT2 = this.LJLILLLLZI;
        c81361VwT2.LJIIJJI = 0.0f;
        c81361VwT2.LJIIL = 0.0f;
        c81361VwT2.LJIILIIL = 0.0f;
        c81361VwT2.LJ = 0.0f;
        c81361VwT2.LIZ();
        c81361VwT2.LJFF = 0.0f;
        c81361VwT2.LIZ();
        c81361VwT2.LJI = 0.0f;
        c81361VwT2.LIZ();
        this.LJLJJLL.setDuration(1332L);
        this.LJLJJL.startAnimation(this.LJLJJLL);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.LJLJJL.clearAnimation();
        this.LJLJI = 0.0f;
        invalidateSelf();
        C81361VwT c81361VwT = this.LJLILLLLZI;
        if (c81361VwT.LJIILJJIL) {
            c81361VwT.LJIILJJIL = false;
            c81361VwT.LIZ();
        }
        this.LJLILLLLZI.LIZIZ(0);
        C81361VwT c81361VwT2 = this.LJLILLLLZI;
        c81361VwT2.LJIIJJI = 0.0f;
        c81361VwT2.LJIIL = 0.0f;
        c81361VwT2.LJIILIIL = 0.0f;
        c81361VwT2.LJ = 0.0f;
        c81361VwT2.LIZ();
        c81361VwT2.LJFF = 0.0f;
        c81361VwT2.LIZ();
        c81361VwT2.LJI = 0.0f;
        c81361VwT2.LIZ();
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
        C81361VwT c81361VwT = this.LJLILLLLZI;
        RectF rectF = c81361VwT.LIZ;
        rectF.set(bounds);
        float f = c81361VwT.LJIIIIZZ;
        rectF.inset(f, f);
        float f2 = c81361VwT.LJ;
        float f3 = c81361VwT.LJI;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c81361VwT.LJFF + f3) * 360.0f) - f4;
        c81361VwT.LIZIZ.setColor(c81361VwT.LJJ);
        canvas.drawArc(rectF, f4, f5, false, c81361VwT.LIZIZ);
        if (c81361VwT.LJIILJJIL) {
            Path path = c81361VwT.LJIILL;
            if (path == null) {
                Path path2 = new Path();
                c81361VwT.LJIILL = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float f6 = (((int) c81361VwT.LJIIIIZZ) / 2) * c81361VwT.LJIILLIIL;
            float cos = (float) ((Math.cos(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) * c81361VwT.LJIIZILJ) + bounds.exactCenterX());
            float sin = (float) ((Math.sin(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) * c81361VwT.LJIIZILJ) + bounds.exactCenterY());
            c81361VwT.LJIILL.moveTo(0.0f, 0.0f);
            c81361VwT.LJIILL.lineTo(c81361VwT.LJIJ * c81361VwT.LJIILLIIL, 0.0f);
            Path path3 = c81361VwT.LJIILL;
            float f7 = c81361VwT.LJIJ;
            float f8 = c81361VwT.LJIILLIIL;
            path3.lineTo((f7 * f8) / 2.0f, c81361VwT.LJIJI * f8);
            c81361VwT.LJIILL.offset(cos - f6, sin);
            c81361VwT.LJIILL.close();
            c81361VwT.LIZJ.setColor(c81361VwT.LJJ);
            canvas.rotate((f4 + f5) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(c81361VwT.LJIILL, c81361VwT.LIZJ);
        }
        if (c81361VwT.LJIJJ < 255) {
            c81361VwT.LJIJJLI.setColor(c81361VwT.LJIL);
            c81361VwT.LJIJJLI.setAlpha(255 - c81361VwT.LJIJJ);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2, c81361VwT.LJIJJLI);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLILLLLZI.LJIJJ = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C81361VwT c81361VwT = this.LJLILLLLZI;
        c81361VwT.LIZIZ.setColorFilter(colorFilter);
        c81361VwT.LIZ();
    }

    public C81359VwR(Context context, View view) {
        C81358VwQ c81358VwQ = new C81358VwQ(this);
        this.LJLJJL = view;
        this.LJLJJI = context.getResources();
        C81361VwT c81361VwT = new C81361VwT(c81358VwQ);
        this.LJLILLLLZI = c81361VwT;
        c81361VwT.LJIIIZ = LJLLJ;
        c81361VwT.LIZIZ(0);
        LIZJ(1);
        C81363VwV c81363VwV = new C81363VwV(this, c81361VwT);
        c81363VwV.setRepeatCount(-1);
        c81363VwV.setRepeatMode(1);
        c81363VwV.setInterpolator(LJLLI);
        c81363VwV.setAnimationListener(new IDAListenerS146S0200000_14(this, c81361VwT, 0));
        this.LJLJJLL = c81363VwV;
    }

    public static void LIZIZ(float f, C81361VwT c81361VwT) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c81361VwT.LJIIIZ;
            int i = c81361VwT.LJIIJ;
            int i2 = iArr[i];
            int i3 = iArr[(i + 1) % iArr.length];
            c81361VwT.LJJ = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r8) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r7) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r6) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r4))));
        }
    }

    public final void LIZ(double d, double d2, double d3, double d4, float f, float f2) {
        double ceil;
        C81361VwT c81361VwT = this.LJLILLLLZI;
        float f3 = this.LJLJJI.getDisplayMetrics().density;
        double d5 = f3;
        this.LJLJLJ = d * d5;
        this.LJLJLLL = d2 * d5;
        float f4 = ((float) d4) * f3;
        c81361VwT.LJII = f4;
        c81361VwT.LIZIZ.setStrokeWidth(f4);
        c81361VwT.LIZ();
        c81361VwT.LJIIZILJ = d3 * d5;
        c81361VwT.LIZIZ(0);
        c81361VwT.LJIJ = (int) (f * f3);
        c81361VwT.LJIJI = (int) (f2 * f3);
        float min = Math.min((int) this.LJLJLJ, (int) this.LJLJLLL);
        double d6 = c81361VwT.LJIIZILJ;
        if (d6 <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || min < 0.0f) {
            ceil = Math.ceil(c81361VwT.LJII / 2.0f);
        } else {
            ceil = (min / 2.0f) - d6;
        }
        c81361VwT.LJIIIIZZ = (float) ceil;
    }
}
