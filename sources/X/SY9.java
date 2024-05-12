package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SY9 extends Drawable {
    public Drawable LIZ;
    public Drawable LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public final C62822Ol8 LJFF;
    public int LJI;
    public int LJII;
    public ColorStateList LJIIIIZZ;
    public final C71907SJz LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public Integer LJIILJJIL;
    public CharSequence LJIILL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public final int LIZ() {
        int i = this.LJIIL;
        if (i <= 0) {
            return getBounds().height();
        }
        return i;
    }

    public final int LIZIZ() {
        int i = this.LJIIJJI;
        if (i <= 0) {
            return getBounds().width();
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (Build.VERSION.SDK_INT <= 23) {
            return this.LJIIIZ;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.LJIIIIZZ != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJII;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJI;
    }

    public final void LIZJ(boolean z) {
        Drawable drawable;
        Drawable.ConstantState constantState;
        Drawable newDrawable;
        this.LJIILIIL = z;
        if (z) {
            this.LIZJ = C7MY.LIZIZ(1);
            Drawable drawable2 = this.LIZ;
            if (drawable2 instanceof AbstractC39455Fe7) {
                drawable = (Drawable) drawable2.getClass().newInstance();
            } else if (drawable2 != null && (constantState = drawable2.getConstantState()) != null && (newDrawable = constantState.newDrawable()) != null) {
                drawable = newDrawable.mutate();
            } else {
                drawable = null;
            }
            this.LIZIZ = drawable;
            if (drawable != null) {
                drawable.setAlpha(30);
            }
            Drawable drawable3 = this.LIZIZ;
            if (drawable3 != null) {
                drawable3.setColorFilter(null);
            }
        } else {
            this.LIZIZ = null;
        }
        invalidateSelf();
    }

    public final void LIZLLL(int i) {
        this.LJIIL = i;
        this.LJII = i;
        invalidateSelf();
    }

    public final void LJ(int i) {
        this.LJIILJJIL = Integer.valueOf(i);
        LJII(this.LIZ, i);
        invalidateSelf();
    }

    public final void LJI(int i) {
        this.LJIIJJI = i;
        this.LJI = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Xfermode xfermode;
        o.LJIIIZ(canvas, "canvas");
        Drawable drawable = this.LIZ;
        if (drawable == null) {
            return;
        }
        int width = getBounds().width();
        int height = getBounds().height();
        ColorStateList colorStateList = this.LJIIIIZZ;
        boolean z = false;
        if (colorStateList != null) {
            LJII(this.LIZ, colorStateList.getColorForState(getState(), 0));
        }
        if (this.LIZLLL && this.LJ) {
            z = true;
            canvas.save();
            canvas.translate(width, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        if (LIZIZ() <= 0 || LIZ() <= 0) {
            drawable.setBounds(getBounds().left, getBounds().top, getBounds().left + width, getBounds().top + height);
        } else {
            drawable.setBounds(((width - LIZIZ()) / 2) + getBounds().left, ((height - LIZ()) / 2) + getBounds().top, ((LIZIZ() + width) / 2) + getBounds().left, ((LIZ() + height) / 2) + getBounds().top);
        }
        if (this.LJIILIIL) {
            Rect bounds = drawable.getBounds();
            o.LJIIIIZZ(bounds, "src.bounds");
            Drawable drawable2 = this.LIZIZ;
            if (drawable2 != null) {
                int i = bounds.left;
                int i2 = bounds.top;
                int i3 = this.LIZJ;
                drawable2.setBounds(i, i2 + i3, bounds.right, bounds.bottom + i3);
            }
            Drawable drawable3 = this.LIZIZ;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
        if (this.LJIIJ) {
            xfermode = (Xfermode) this.LJFF.getValue();
        } else {
            xfermode = null;
        }
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getPaint().setXfermode(xfermode);
        } else if (drawable instanceof AbstractC39455Fe7) {
            AbstractC39455Fe7 abstractC39455Fe7 = (AbstractC39455Fe7) drawable;
            Iterator<Paint> it = abstractC39455Fe7.LIZ.iterator();
            while (it.hasNext()) {
                it.next().setXfermode(xfermode);
            }
            abstractC39455Fe7.invalidateSelf();
        }
        drawable.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] state) {
        o.LJIIIZ(state, "state");
        if (this.LJIIIIZZ != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.LIZIZ;
        if (drawable2 == null) {
            return;
        }
        drawable2.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SY9(android.content.Context r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r3.<init>()
            X.SY8 r0 = X.SY8.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r3.LJFF = r0
            r0 = -1
            r3.LJI = r0
            r3.LJII = r0
            r3.LJIIJJI = r0
            r3.LJIIL = r0
            java.util.HashMap<java.lang.Integer, X.DuM> r1 = X.C33233D2n.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r0)
            X.DuM r1 = (X.C35366DuM) r1
            r2 = 0
            if (r1 != 0) goto L34
        L28:
            r1 = r2
        L29:
            boolean r0 = X.C26338AVi.LIZJ(r4)
            r3.LJ = r0
            if (r1 != 0) goto L58
            if (r5 <= 0) goto L57
            goto L4d
        L34:
            boolean r0 = r1.LIZ
            r3.LIZLLL = r0
            X.Pko<?> r0 = r1.LIZIZ
            if (r0 == 0) goto L4b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.Object r1 = r0.newInstance()
        L44:
            boolean r0 = r1 instanceof android.graphics.drawable.Drawable
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            goto L29
        L4b:
            r1 = r2
            goto L44
        L4d:
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r4, r5)     // Catch: java.lang.Exception -> L57
            if (r0 == 0) goto L57
            android.graphics.drawable.Drawable r2 = r0.mutate()     // Catch: java.lang.Exception -> L57
        L57:
            r1 = r2
        L58:
            r3.LIZ = r1
            X.SJz r0 = new X.SJz
            r0.<init>(r3)
            r3.LJIIIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SY9.<init>(android.content.Context, int):void");
    }

    public static void LJII(Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, Color.red(i), 0.0f, 0.0f, 0.0f, 0.0f, Color.green(i), 0.0f, 0.0f, 0.0f, 0.0f, Color.blue(i), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        drawable.setAlpha(Color.alpha(i));
    }

    public final void LJFF(int i, Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        Integer LJI = C79045V0n.LJI(i, ctx);
        if (LJI != null) {
            LJ(LJI.intValue());
        }
    }
}
