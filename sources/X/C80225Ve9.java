package X;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* renamed from: X.Ve9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80225Ve9 {
    public final View LIZ;
    public boolean LIZIZ;
    public float LIZJ;
    public final Rect LIZLLL;
    public final Rect LJ;
    public final RectF LJFF;
    public ColorStateList LJIIJ;
    public ColorStateList LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public Typeface LJIJ;
    public Typeface LJIJI;
    public Typeface LJIJJ;
    public C80227VeB LJIJJLI;
    public C80227VeB LJIL;
    public CharSequence LJJ;
    public CharSequence LJJI;
    public boolean LJJIFFI;
    public Bitmap LJJII;
    public float LJJIII;
    public float LJJIIJ;
    public int[] LJJIIJZLJL;
    public boolean LJJIIZ;
    public final TextPaint LJJIIZI;
    public final TextPaint LJJIJ;
    public TimeInterpolator LJJIJIIJI;
    public TimeInterpolator LJJIJIIJIL;
    public float LJJIJIL;
    public float LJJIJL;
    public float LJJIJLIJ;
    public ColorStateList LJJIL;
    public float LJJIZ;
    public float LJJJ;
    public float LJJJI;
    public ColorStateList LJJJIL;
    public float LJJJJ;
    public float LJJJJI;
    public StaticLayout LJJJJIZL;
    public float LJJJJJ;
    public float LJJJJJL;
    public float LJJJJL;
    public CharSequence LJJJJLI;
    public int LJI = 16;
    public int LJII = 16;
    public float LJIIIIZZ = 15.0f;
    public float LJIIIZ = 15.0f;
    public int LJJJJLL = 1;

    public final float LIZIZ() {
        if (this.LJJ == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.LJJIJ;
        textPaint.setTextSize(this.LJIIIZ);
        textPaint.setTypeface(this.LJIJ);
        textPaint.setLetterSpacing(this.LJJJJ);
        TextPaint textPaint2 = this.LJJIJ;
        CharSequence charSequence = this.LJJ;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public final float LJFF() {
        TextPaint textPaint = this.LJJIJ;
        textPaint.setTextSize(this.LJIIIZ);
        textPaint.setTypeface(this.LJIJ);
        textPaint.setLetterSpacing(this.LJJJJ);
        return -this.LJJIJ.ascent();
    }

    public final void LJIIIIZZ() {
        boolean z;
        if (this.LJ.width() > 0 && this.LJ.height() > 0 && this.LIZLLL.width() > 0 && this.LIZLLL.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
    }

    public final void LJIIIZ() {
        float f;
        float f2;
        float f3;
        float f4;
        StaticLayout staticLayout;
        if (this.LIZ.getHeight() > 0 && this.LIZ.getWidth() > 0) {
            float f5 = this.LJJIIJ;
            LIZLLL(this.LJIIIZ);
            CharSequence charSequence = this.LJJI;
            if (charSequence != null && (staticLayout = this.LJJJJIZL) != null) {
                this.LJJJJLI = TextUtils.ellipsize(charSequence, this.LJJIIZI, staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.LJJJJLI;
            if (charSequence2 != null) {
                f = this.LJJIIZI.measureText(charSequence2, 0, charSequence2.length());
            } else {
                f = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.LJII, this.LJJIFFI ? 1 : 0);
            int i = absoluteGravity & 112;
            if (i != 48) {
                if (i != 80) {
                    this.LJIILIIL = this.LJ.centerY() - ((this.LJJIIZI.descent() - this.LJJIIZI.ascent()) / 2.0f);
                } else {
                    this.LJIILIIL = this.LJJIIZI.ascent() + this.LJ.bottom;
                }
            } else {
                this.LJIILIIL = this.LJ.top;
            }
            int i2 = absoluteGravity & 8388615;
            if (i2 != 1) {
                if (i2 != 5) {
                    this.LJIILL = this.LJ.left;
                } else {
                    this.LJIILL = this.LJ.right - f;
                }
            } else {
                this.LJIILL = this.LJ.centerX() - (f / 2.0f);
            }
            LIZLLL(this.LJIIIIZZ);
            StaticLayout staticLayout2 = this.LJJJJIZL;
            if (staticLayout2 != null) {
                f2 = staticLayout2.getHeight();
            } else {
                f2 = 0.0f;
            }
            CharSequence charSequence3 = this.LJJI;
            if (charSequence3 != null) {
                f3 = this.LJJIIZI.measureText(charSequence3, 0, charSequence3.length());
            } else {
                f3 = 0.0f;
            }
            StaticLayout staticLayout3 = this.LJJJJIZL;
            if (staticLayout3 != null && this.LJJJJLL > 1 && !this.LJJIFFI) {
                f3 = staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.LJJJJIZL;
            if (staticLayout4 != null) {
                f4 = staticLayout4.getLineLeft(0);
            } else {
                f4 = 0.0f;
            }
            this.LJJJJL = f4;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.LJI, this.LJJIFFI ? 1 : 0);
            int i3 = absoluteGravity2 & 112;
            if (i3 != 48) {
                if (i3 != 80) {
                    this.LJIIL = this.LIZLLL.centerY() - (f2 / 2.0f);
                } else {
                    this.LJIIL = this.LJJIIZI.descent() + (this.LIZLLL.bottom - f2);
                }
            } else {
                this.LJIIL = this.LIZLLL.top;
            }
            int i4 = absoluteGravity2 & 8388615;
            if (i4 != 1) {
                if (i4 != 5) {
                    this.LJIILJJIL = this.LIZLLL.left;
                } else {
                    this.LJIILJJIL = this.LIZLLL.right - f3;
                }
            } else {
                this.LJIILJJIL = this.LIZLLL.centerX() - (f3 / 2.0f);
            }
            Bitmap bitmap = this.LJJII;
            if (bitmap != null) {
                bitmap.recycle();
                this.LJJII = null;
            }
            LJIILJJIL(f5);
            float f6 = this.LIZJ;
            this.LJFF.left = LJII(this.LIZLLL.left, this.LJ.left, f6, this.LJJIJIIJI);
            this.LJFF.top = LJII(this.LJIIL, this.LJIILIIL, f6, this.LJJIJIIJI);
            this.LJFF.right = LJII(this.LIZLLL.right, this.LJ.right, f6, this.LJJIJIIJI);
            this.LJFF.bottom = LJII(this.LIZLLL.bottom, this.LJ.bottom, f6, this.LJJIJIIJI);
            this.LJIILLIIL = LJII(this.LJIILJJIL, this.LJIILL, f6, this.LJJIJIIJI);
            this.LJIIZILJ = LJII(this.LJIIL, this.LJIILIIL, f6, this.LJJIJIIJI);
            LJIILJJIL(LJII(this.LJIIIIZZ, this.LJIIIZ, f6, this.LJJIJIIJIL));
            C30901Je c30901Je = C80237VeL.LIZIZ;
            this.LJJJJJ = 1.0f - LJII(0.0f, 1.0f, 1.0f - f6, c30901Je);
            C16300kU.LJIIJ(this.LIZ);
            this.LJJJJJL = LJII(1.0f, 0.0f, f6, c30901Je);
            C16300kU.LJIIJ(this.LIZ);
            ColorStateList colorStateList = this.LJIIJJI;
            ColorStateList colorStateList2 = this.LJIIJ;
            if (colorStateList != colorStateList2) {
                this.LJJIIZI.setColor(LIZ(f6, LJI(colorStateList2), LJI(this.LJIIJJI)));
            } else {
                this.LJJIIZI.setColor(LJI(colorStateList));
            }
            float f7 = this.LJJJJ;
            float f8 = this.LJJJJI;
            if (f7 != f8) {
                this.LJJIIZI.setLetterSpacing(LJII(f8, f7, f6, c30901Je));
            } else {
                this.LJJIIZI.setLetterSpacing(f7);
            }
            this.LJJIIZI.setShadowLayer(LJII(this.LJJIZ, this.LJJIJIL, f6, null), LJII(this.LJJJ, this.LJJIJL, f6, null), LJII(this.LJJJI, this.LJJIJLIJ, f6, null), LIZ(f6, LJI(this.LJJJIL), LJI(this.LJJIL)));
            C16300kU.LJIIJ(this.LIZ);
        }
    }

    public C80225Ve9(View view) {
        this.LIZ = view;
        TextPaint textPaint = new TextPaint(129);
        this.LJJIIZI = textPaint;
        this.LJJIJ = new TextPaint(textPaint);
        this.LJ = new Rect();
        this.LIZLLL = new Rect();
        this.LJFF = new RectF();
    }

    public final boolean LIZJ(CharSequence charSequence) {
        C42891mH c42891mH;
        if (C16310kV.LIZLLL(this.LIZ) == 1) {
            c42891mH = C13760gO.LIZLLL;
        } else {
            c42891mH = C13760gO.LIZJ;
        }
        return c42891mH.LIZ(charSequence.length(), charSequence);
    }

    public final void LIZLLL(float f) {
        boolean z;
        float f2;
        boolean z2;
        boolean z3;
        StaticLayout staticLayout;
        if (this.LJJ == null) {
            return;
        }
        float width = this.LJ.width();
        float width2 = this.LIZLLL.width();
        int i = 1;
        if (Math.abs(f - this.LJIIIZ) < 0.001f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = this.LJIIIZ;
            this.LJJIII = 1.0f;
            Typeface typeface = this.LJIJJ;
            Typeface typeface2 = this.LJIJ;
            if (typeface != typeface2) {
                this.LJIJJ = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            f2 = this.LJIIIIZZ;
            Typeface typeface3 = this.LJIJJ;
            Typeface typeface4 = this.LJIJI;
            if (typeface3 != typeface4) {
                this.LJIJJ = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f - f2) < 0.001f) {
                this.LJJIII = 1.0f;
            } else {
                this.LJJIII = f / this.LJIIIIZZ;
            }
            float f3 = this.LJIIIZ / this.LJIIIIZZ;
            width = width2 * f3 > width ? Math.min(width / f3, width2) : width2;
        }
        if (width > 0.0f) {
            if (this.LJJIIJ != f2 || this.LJJIIZ || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJJIIJ = f2;
            this.LJJIIZ = false;
        }
        if (this.LJJI == null || z2) {
            this.LJJIIZI.setTextSize(this.LJJIIJ);
            this.LJJIIZI.setTypeface(this.LJIJJ);
            TextPaint textPaint = this.LJJIIZI;
            if (this.LJJIII != 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            textPaint.setLinearText(z3);
            boolean LIZJ = LIZJ(this.LJJ);
            this.LJJIFFI = LIZJ;
            int i2 = this.LJJJJLL;
            if (i2 > 1 && !LIZJ) {
                i = i2;
            }
            try {
                C74246TBy c74246TBy = new C74246TBy((int) width, this.LJJIIZI, this.LJJ);
                c74246TBy.LJIIIIZZ = TextUtils.TruncateAt.END;
                c74246TBy.LJII = LIZJ;
                c74246TBy.LJ = Layout.Alignment.ALIGN_NORMAL;
                c74246TBy.LJI = false;
                c74246TBy.LJFF = i;
                staticLayout = c74246TBy.LIZ();
            } catch (S9J unused) {
                staticLayout = null;
            }
            staticLayout.getClass();
            this.LJJJJIZL = staticLayout;
            this.LJJI = staticLayout.getText();
        }
    }

    public final void LJ(Canvas canvas) {
        int save = canvas.save();
        if (this.LJJI != null && this.LIZIZ) {
            float lineLeft = (this.LJJJJIZL.getLineLeft(0) + this.LJIILLIIL) - (this.LJJJJL * 2.0f);
            this.LJJIIZI.setTextSize(this.LJJIIJ);
            float f = this.LJIILLIIL;
            float f2 = this.LJIIZILJ;
            float f3 = this.LJJIII;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (this.LJJJJLL > 1 && !this.LJJIFFI) {
                int alpha = this.LJJIIZI.getAlpha();
                canvas.translate(lineLeft, f2);
                float f4 = alpha;
                this.LJJIIZI.setAlpha((int) (this.LJJJJJL * f4));
                this.LJJJJIZL.draw(canvas);
                this.LJJIIZI.setAlpha((int) (this.LJJJJJ * f4));
                int lineBaseline = this.LJJJJIZL.getLineBaseline(0);
                CharSequence charSequence = this.LJJJJLI;
                float f5 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.LJJIIZI);
                String trim = this.LJJJJLI.toString().trim();
                if (trim.endsWith("…")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                this.LJJIIZI.setAlpha(alpha);
                canvas.drawText(trim, 0, Math.min(this.LJJJJIZL.getLineEnd(0), trim.length()), 0.0f, f5, (Paint) this.LJJIIZI);
            } else {
                canvas.translate(f, f2);
                this.LJJJJIZL.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public final int LJI(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.LJJIIJZLJL;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void LJIIJ(int i) {
        C80229VeD c80229VeD = new C80229VeD(this.LIZ.getContext(), i);
        ColorStateList colorStateList = c80229VeD.LIZ;
        if (colorStateList != null) {
            this.LJIIJJI = colorStateList;
        }
        float f = c80229VeD.LJIIJ;
        if (f != 0.0f) {
            this.LJIIIZ = f;
        }
        ColorStateList colorStateList2 = c80229VeD.LIZIZ;
        if (colorStateList2 != null) {
            this.LJJIL = colorStateList2;
        }
        this.LJJIJL = c80229VeD.LJFF;
        this.LJJIJLIJ = c80229VeD.LJI;
        this.LJJIJIL = c80229VeD.LJII;
        this.LJJJJ = c80229VeD.LJIIIZ;
        C80227VeB c80227VeB = this.LJIL;
        if (c80227VeB != null) {
            c80227VeB.LJLJI = true;
        }
        C80226VeA c80226VeA = new C80226VeA(this);
        c80229VeD.LIZ();
        this.LJIL = new C80227VeB(c80226VeA, c80229VeD.LJIILIIL);
        c80229VeD.LIZIZ(this.LIZ.getContext(), this.LJIL);
        LJIIIZ();
    }

    public final void LJIIJJI(ColorStateList colorStateList) {
        if (this.LJIIJJI != colorStateList) {
            this.LJIIJJI = colorStateList;
            LJIIIZ();
        }
    }

    public final void LJIIL(int i) {
        C80229VeD c80229VeD = new C80229VeD(this.LIZ.getContext(), i);
        ColorStateList colorStateList = c80229VeD.LIZ;
        if (colorStateList != null) {
            this.LJIIJ = colorStateList;
        }
        float f = c80229VeD.LJIIJ;
        if (f != 0.0f) {
            this.LJIIIIZZ = f;
        }
        ColorStateList colorStateList2 = c80229VeD.LIZIZ;
        if (colorStateList2 != null) {
            this.LJJJIL = colorStateList2;
        }
        this.LJJJ = c80229VeD.LJFF;
        this.LJJJI = c80229VeD.LJI;
        this.LJJIZ = c80229VeD.LJII;
        this.LJJJJI = c80229VeD.LJIIIZ;
        C80227VeB c80227VeB = this.LJIJJLI;
        if (c80227VeB != null) {
            c80227VeB.LJLJI = true;
        }
        C80224Ve8 c80224Ve8 = new C80224Ve8(this);
        c80229VeD.LIZ();
        this.LJIJJLI = new C80227VeB(c80224Ve8, c80229VeD.LJIILIIL);
        c80229VeD.LIZIZ(this.LIZ.getContext(), this.LJIJJLI);
        LJIIIZ();
    }

    public final void LJIILIIL(float f) {
        float LJJIIJZLJL = C78609UtB.LJJIIJZLJL(f, 0.0f, 1.0f);
        if (LJJIIJZLJL != this.LIZJ) {
            this.LIZJ = LJJIIJZLJL;
            this.LJFF.left = LJII(this.LIZLLL.left, this.LJ.left, LJJIIJZLJL, this.LJJIJIIJI);
            this.LJFF.top = LJII(this.LJIIL, this.LJIILIIL, LJJIIJZLJL, this.LJJIJIIJI);
            this.LJFF.right = LJII(this.LIZLLL.right, this.LJ.right, LJJIIJZLJL, this.LJJIJIIJI);
            this.LJFF.bottom = LJII(this.LIZLLL.bottom, this.LJ.bottom, LJJIIJZLJL, this.LJJIJIIJI);
            this.LJIILLIIL = LJII(this.LJIILJJIL, this.LJIILL, LJJIIJZLJL, this.LJJIJIIJI);
            this.LJIIZILJ = LJII(this.LJIIL, this.LJIILIIL, LJJIIJZLJL, this.LJJIJIIJI);
            LJIILJJIL(LJII(this.LJIIIIZZ, this.LJIIIZ, LJJIIJZLJL, this.LJJIJIIJIL));
            C30901Je c30901Je = C80237VeL.LIZIZ;
            this.LJJJJJ = 1.0f - LJII(0.0f, 1.0f, 1.0f - LJJIIJZLJL, c30901Je);
            C16300kU.LJIIJ(this.LIZ);
            this.LJJJJJL = LJII(1.0f, 0.0f, LJJIIJZLJL, c30901Je);
            C16300kU.LJIIJ(this.LIZ);
            ColorStateList colorStateList = this.LJIIJJI;
            ColorStateList colorStateList2 = this.LJIIJ;
            if (colorStateList != colorStateList2) {
                this.LJJIIZI.setColor(LIZ(LJJIIJZLJL, LJI(colorStateList2), LJI(this.LJIIJJI)));
            } else {
                this.LJJIIZI.setColor(LJI(colorStateList));
            }
            float f2 = this.LJJJJ;
            float f3 = this.LJJJJI;
            if (f2 != f3) {
                this.LJJIIZI.setLetterSpacing(LJII(f3, f2, LJJIIJZLJL, c30901Je));
            } else {
                this.LJJIIZI.setLetterSpacing(f2);
            }
            this.LJJIIZI.setShadowLayer(LJII(this.LJJIZ, this.LJJIJIL, LJJIIJZLJL, null), LJII(this.LJJJ, this.LJJIJL, LJJIIJZLJL, null), LJII(this.LJJJI, this.LJJIJLIJ, LJJIIJZLJL, null), LIZ(LJJIIJZLJL, LJI(this.LJJJIL), LJI(this.LJJIL)));
            C16300kU.LJIIJ(this.LIZ);
        }
    }

    public final void LJIILJJIL(float f) {
        LIZLLL(f);
        C16300kU.LJIIJ(this.LIZ);
    }

    public final boolean LJIILL(int[] iArr) {
        ColorStateList colorStateList;
        this.LJJIIJZLJL = iArr;
        ColorStateList colorStateList2 = this.LJIIJJI;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.LJIIJ) == null || !colorStateList.isStateful())) {
            return false;
        }
        LJIIIZ();
        return true;
    }

    public static int LIZ(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float LJII(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C06420Na.LIZIZ(f2, f, f3, f);
    }
}
