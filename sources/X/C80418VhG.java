package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: X.VhG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80418VhG extends Drawable implements InterfaceC07860So, InterfaceC80411Vh9 {
    public static final Paint LLF;
    public C80421VhJ LJLIL;
    public final AbstractC80431VhT[] LJLILLLLZI;
    public final AbstractC80431VhT[] LJLJI;
    public final BitSet LJLJJI;
    public boolean LJLJJL;
    public final Matrix LJLJJLL;
    public final Path LJLJL;
    public final Path LJLJLJ;
    public final RectF LJLJLLL;
    public final RectF LJLL;
    public final Region LJLLI;
    public final Region LJLLILLLL;
    public C80416VhE LJLLJ;
    public final Paint LJLLL;
    public final Paint LJLLLL;
    public final C80426VhO LJLLLLLL;
    public final C80433VhV LJLZ;
    public final C80419VhH LJZ;
    public PorterDuffColorFilter LJZI;
    public PorterDuffColorFilter LJZL;
    public final RectF LL;
    public boolean LLD;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.LJLJJL = true;
        super.invalidateSelf();
    }

    static {
        C16880lQ.LJLLJ(C80418VhG.class);
        LLF = new Paint(1);
    }

    public C80418VhG() {
        this(new C80416VhE());
    }

    public final RectF LJI() {
        this.LJLJLLL.set(getBounds());
        return this.LJLJLLL;
    }

    public final float LJII() {
        return this.LJLIL.LIZ.LJ.LIZ(LJI());
    }

    public final boolean LJIIIZ() {
        return this.LJLIL.LIZ.LIZLLL(LJI());
    }

    public final boolean LJIILL() {
        PorterDuffColorFilter porterDuffColorFilter = this.LJZI;
        PorterDuffColorFilter porterDuffColorFilter2 = this.LJZL;
        C80421VhJ c80421VhJ = this.LJLIL;
        this.LJZI = LIZJ(c80421VhJ.LJFF, c80421VhJ.LJI, this.LJLLL, true);
        C80421VhJ c80421VhJ2 = this.LJLIL;
        this.LJZL = LIZJ(c80421VhJ2.LJ, c80421VhJ2.LJI, this.LJLLLL, false);
        C80421VhJ c80421VhJ3 = this.LJLIL;
        if (c80421VhJ3.LJIJI) {
            this.LJLLLLLL.LIZ(c80421VhJ3.LJFF.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.LJZI) || !Objects.equals(porterDuffColorFilter2, this.LJZL)) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL() {
        C80421VhJ c80421VhJ = this.LJLIL;
        float f = c80421VhJ.LJIILIIL + c80421VhJ.LJIILJJIL;
        c80421VhJ.LJIILLIIL = (int) Math.ceil(0.75f * f);
        this.LJLIL.LJIIZILJ = (int) Math.ceil(f * 0.25f);
        LJIILL();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.LJLIL = new C80421VhJ(this.LJLIL);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.LJLLI.set(getBounds());
        LIZIZ(LJI(), this.LJLJL);
        this.LJLLILLLL.setPath(this.LJLJL, this.LJLLI);
        this.LJLLI.op(this.LJLLILLLL, Region.Op.DIFFERENCE);
        return this.LJLLI;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.LJLIL.LJFF) != null && colorStateList.isStateful()) || (((colorStateList2 = this.LJLIL.LJ) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.LJLIL.LIZLLL) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.LJLIL.LIZJ) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.LJLIL;
    }

    public C80418VhG(C80421VhJ c80421VhJ) {
        C80419VhH c80419VhH;
        this.LJLILLLLZI = new AbstractC80431VhT[4];
        this.LJLJI = new AbstractC80431VhT[4];
        this.LJLJJI = new BitSet(8);
        this.LJLJJLL = new Matrix();
        this.LJLJL = new Path();
        this.LJLJLJ = new Path();
        this.LJLJLLL = new RectF();
        this.LJLL = new RectF();
        this.LJLLI = new Region();
        this.LJLLILLLL = new Region();
        Paint paint = new Paint(1);
        this.LJLLL = paint;
        Paint paint2 = new Paint(1);
        this.LJLLLL = paint2;
        this.LJLLLLLL = new C80426VhO();
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            c80419VhH = C80435VhX.LIZ;
        } else {
            c80419VhH = new C80419VhH();
        }
        this.LJZ = c80419VhH;
        this.LL = new RectF();
        this.LLD = true;
        this.LJLIL = c80421VhJ;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = LLF;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LJIILL();
        LJIILJJIL(getState());
        this.LJLZ = new C80433VhV(this);
    }

    public final int LIZLLL(int i) {
        C80421VhJ c80421VhJ = this.LJLIL;
        float f = c80421VhJ.LJIILIIL + c80421VhJ.LJIILJJIL + c80421VhJ.LJIIL;
        V1F v1f = c80421VhJ.LIZIZ;
        if (v1f != null && v1f.LIZ && C07290Qj.LJIIL(i, 255) == v1f.LIZJ) {
            float f2 = 0.0f;
            if (v1f.LIZLLL > 0.0f && f > 0.0f) {
                f2 = Math.min(((((float) Math.log1p(f / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            }
            return C07290Qj.LJIIL(C78966Uyw.LJJIL(f2, C07290Qj.LJIIL(i, 255), v1f.LIZIZ), Color.alpha(i));
        }
        return i;
    }

    public final void LJ(Canvas canvas) {
        this.LJLJJI.cardinality();
        if (this.LJLIL.LJIIZILJ != 0) {
            canvas.drawPath(this.LJLJL, this.LJLLLLLL.LIZ);
        }
        int i = 0;
        do {
            AbstractC80431VhT abstractC80431VhT = this.LJLILLLLZI[i];
            C80426VhO c80426VhO = this.LJLLLLLL;
            int i2 = this.LJLIL.LJIILLIIL;
            Matrix matrix = AbstractC80431VhT.LIZ;
            abstractC80431VhT.LIZ(matrix, c80426VhO, i2, canvas);
            this.LJLJI[i].LIZ(matrix, this.LJLLLLLL, this.LJLIL.LJIILLIIL, canvas);
            i++;
        } while (i < 4);
        if (this.LLD) {
            C80421VhJ c80421VhJ = this.LJLIL;
            int sin = (int) (Math.sin(Math.toRadians(c80421VhJ.LJIJ)) * c80421VhJ.LJIIZILJ);
            C80421VhJ c80421VhJ2 = this.LJLIL;
            int cos = (int) (Math.cos(Math.toRadians(c80421VhJ2.LJIJ)) * c80421VhJ2.LJIIZILJ);
            canvas.translate(-sin, -cos);
            canvas.drawPath(this.LJLJL, LLF);
            canvas.translate(sin, cos);
        }
    }

    public final void LJIIIIZZ(Context context) {
        this.LJLIL.LIZIZ = new V1F(context);
        LJIILLIIL();
    }

    public final void LJIIJ(float f) {
        C80421VhJ c80421VhJ = this.LJLIL;
        if (c80421VhJ.LJIILIIL != f) {
            c80421VhJ.LJIILIIL = f;
            LJIILLIIL();
        }
    }

    public final void LJIIJJI(ColorStateList colorStateList) {
        C80421VhJ c80421VhJ = this.LJLIL;
        if (c80421VhJ.LIZJ != colorStateList) {
            c80421VhJ.LIZJ = colorStateList;
            onStateChange(getState());
        }
    }

    public final void LJIIL(float f) {
        C80421VhJ c80421VhJ = this.LJLIL;
        if (c80421VhJ.LJIIIZ != f) {
            c80421VhJ.LJIIIZ = f;
            this.LJLJJL = true;
            invalidateSelf();
        }
    }

    public final void LJIILIIL(int i) {
        this.LJLLLLLL.LIZ(-12303292);
        this.LJLIL.LJIJI = false;
        super.invalidateSelf();
    }

    public final boolean LJIILJJIL(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.LJLIL.LIZJ != null && color2 != (colorForState2 = this.LJLIL.LIZJ.getColorForState(iArr, (color2 = this.LJLLL.getColor())))) {
            this.LJLLL.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.LJLIL.LIZLLL != null && color != (colorForState = this.LJLIL.LIZLLL.getColorForState(iArr, (color = this.LJLLLL.getColor())))) {
            this.LJLLLL.setColor(colorForState);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float strokeWidth;
        float strokeWidth2;
        this.LJLLL.setColorFilter(this.LJZI);
        int alpha = this.LJLLL.getAlpha();
        Paint paint = this.LJLLL;
        int i = this.LJLIL.LJIIJJI;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.LJLLLL.setColorFilter(this.LJZL);
        this.LJLLLL.setStrokeWidth(this.LJLIL.LJIIJ);
        int alpha2 = this.LJLLLL.getAlpha();
        Paint paint2 = this.LJLLLL;
        int i2 = this.LJLIL.LJIIJJI;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        float f = 0.0f;
        if (this.LJLJJL) {
            Paint.Style style = this.LJLIL.LJIJJ;
            if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.LJLLLL.getStrokeWidth() > 0.0f) {
                strokeWidth = this.LJLLLL.getStrokeWidth() / 2.0f;
            } else {
                strokeWidth = 0.0f;
            }
            C80416VhE c80416VhE = this.LJLIL.LIZ;
            C80368VgS c80368VgS = new C80368VgS(-strokeWidth);
            c80416VhE.getClass();
            C80417VhF c80417VhF = new C80417VhF(c80416VhE);
            c80417VhF.LJ = c80368VgS.LIZ(c80416VhE.LJ);
            c80417VhF.LJFF = c80368VgS.LIZ(c80416VhE.LJFF);
            c80417VhF.LJII = c80368VgS.LIZ(c80416VhE.LJII);
            c80417VhF.LJI = c80368VgS.LIZ(c80416VhE.LJI);
            C80416VhE c80416VhE2 = new C80416VhE(c80417VhF);
            this.LJLLJ = c80416VhE2;
            C80419VhH c80419VhH = this.LJZ;
            float f2 = this.LJLIL.LJIIIZ;
            this.LJLL.set(LJI());
            Paint.Style style2 = this.LJLIL.LJIJJ;
            if ((style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && this.LJLLLL.getStrokeWidth() > 0.0f) {
                strokeWidth2 = this.LJLLLL.getStrokeWidth() / 2.0f;
            } else {
                strokeWidth2 = 0.0f;
            }
            this.LJLL.inset(strokeWidth2, strokeWidth2);
            c80419VhH.LIZ(c80416VhE2, f2, this.LJLL, null, this.LJLJLJ);
            LIZIZ(LJI(), this.LJLJL);
            this.LJLJJL = false;
        }
        C80421VhJ c80421VhJ = this.LJLIL;
        int i3 = c80421VhJ.LJIILL;
        if (i3 != 1 && c80421VhJ.LJIILLIIL > 0 && (i3 == 2 || (!LJIIIZ() && !this.LJLJL.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            C80421VhJ c80421VhJ2 = this.LJLIL;
            int sin = (int) (Math.sin(Math.toRadians(c80421VhJ2.LJIJ)) * c80421VhJ2.LJIIZILJ);
            C80421VhJ c80421VhJ3 = this.LJLIL;
            canvas.translate(sin, (int) (Math.cos(Math.toRadians(c80421VhJ3.LJIJ)) * c80421VhJ3.LJIIZILJ));
            if (!this.LLD) {
                LJ(canvas);
                canvas.restore();
            } else {
                int width = (int) (this.LL.width() - getBounds().width());
                int height = (int) (this.LL.height() - getBounds().height());
                if (width >= 0 && height >= 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(C22510uV.LIZ(this.LJLIL.LJIILLIIL, 2, (int) this.LL.width(), width), C22510uV.LIZ(this.LJLIL.LJIILLIIL, 2, (int) this.LL.height(), height), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f3 = (getBounds().left - this.LJLIL.LJIILLIIL) - width;
                    float f4 = (getBounds().top - this.LJLIL.LJIILLIIL) - height;
                    canvas2.translate(-f3, -f4);
                    LJ(canvas2);
                    canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
            }
        }
        C80421VhJ c80421VhJ4 = this.LJLIL;
        Paint.Style style3 = c80421VhJ4.LJIJJ;
        if (style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.FILL) {
            LJFF(canvas, this.LJLLL, this.LJLJL, c80421VhJ4.LIZ, LJI());
        }
        Paint.Style style4 = this.LJLIL.LJIJJ;
        if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && this.LJLLLL.getStrokeWidth() > 0.0f) {
            Paint paint3 = this.LJLLLL;
            Path path = this.LJLJLJ;
            C80416VhE c80416VhE3 = this.LJLLJ;
            this.LJLL.set(LJI());
            Paint.Style style5 = this.LJLIL.LJIJJ;
            if ((style5 == Paint.Style.FILL_AND_STROKE || style5 == Paint.Style.STROKE) && this.LJLLLL.getStrokeWidth() > 0.0f) {
                f = this.LJLLLL.getStrokeWidth() / 2.0f;
            }
            this.LJLL.inset(f, f);
            LJFF(canvas, paint3, path, c80416VhE3, this.LJLL);
        }
        this.LJLLL.setAlpha(alpha);
        this.LJLLLL.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.LJLIL.LJIILL == 2) {
            return;
        }
        if (LJIIIZ()) {
            outline.setRoundRect(getBounds(), LJII() * this.LJLIL.LJIIIZ);
            return;
        }
        LIZIZ(LJI(), this.LJLJL);
        if (this.LJLJL.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.LJLJL);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.LJLIL.LJII;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.LJLJJL = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean LJIILJJIL = LJIILJJIL(iArr);
        boolean LJIILL = LJIILL();
        if (LJIILJJIL || LJIILL) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C80421VhJ c80421VhJ = this.LJLIL;
        if (c80421VhJ.LJIIJJI != i) {
            c80421VhJ.LJIIJJI = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.LJLIL.getClass();
        super.invalidateSelf();
    }

    @Override // X.InterfaceC80411Vh9
    public final void setShapeAppearanceModel(C80416VhE c80416VhE) {
        this.LJLIL.LIZ = c80416VhE;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.LJLIL.LJFF = colorStateList;
        LJIILL();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C80421VhJ c80421VhJ = this.LJLIL;
        if (c80421VhJ.LJI != mode) {
            c80421VhJ.LJI = mode;
            LJIILL();
            super.invalidateSelf();
        }
    }

    public C80418VhG(C80416VhE c80416VhE) {
        this(new C80421VhJ(c80416VhE));
    }

    public final void LIZIZ(RectF rectF, Path path) {
        C80419VhH c80419VhH = this.LJZ;
        C80421VhJ c80421VhJ = this.LJLIL;
        c80419VhH.LIZ(c80421VhJ.LIZ, c80421VhJ.LJIIIZ, rectF, this.LJLZ, path);
        if (this.LJLIL.LJIIIIZZ != 1.0f) {
            this.LJLJJLL.reset();
            Matrix matrix = this.LJLJJLL;
            float f = this.LJLIL.LJIIIIZZ;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.LJLJJLL);
        }
        path.computeBounds(this.LL, true);
    }

    public C80418VhG(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C80416VhE.LIZIZ(context, attributeSet, i, i2).LIZ());
    }

    public final PorterDuffColorFilter LIZJ(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int LIZLLL;
        if (colorStateList == null || mode == null) {
            if (z && (LIZLLL = LIZLLL((color = paint.getColor()))) != color) {
                return new PorterDuffColorFilter(LIZLLL, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = LIZLLL(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final void LJFF(Canvas canvas, Paint paint, Path path, C80416VhE c80416VhE, RectF rectF) {
        if (c80416VhE.LIZLLL(rectF)) {
            float LIZ = c80416VhE.LJFF.LIZ(rectF) * this.LJLIL.LJIIIZ;
            canvas.drawRoundRect(rectF, LIZ, LIZ, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }
}
