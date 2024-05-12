package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: X.VeD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80229VeD {
    public final ColorStateList LIZ;
    public final ColorStateList LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final boolean LJIIIIZZ;
    public final float LJIIIZ;
    public float LJIIJ;
    public final int LJIIJJI;
    public boolean LJIIL;
    public Typeface LJIILIIL;

    public final void LIZ() {
        String str;
        if (this.LJIILIIL == null && (str = this.LIZJ) != null) {
            this.LJIILIIL = Typeface.create(str, this.LIZLLL);
        }
        if (this.LJIILIIL == null) {
            int i = this.LJ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.LJIILIIL = Typeface.DEFAULT;
                    } else {
                        this.LJIILIIL = Typeface.MONOSPACE;
                    }
                } else {
                    this.LJIILIIL = Typeface.SERIF;
                }
            } else {
                this.LJIILIIL = Typeface.SANS_SERIF;
            }
            this.LJIILIIL = Typeface.create(this.LJIILIIL, this.LIZLLL);
        }
    }

    public C80229VeD(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, com.zhiliaoapp.musically.R.attr.ae9, com.zhiliaoapp.musically.R.attr.aei, com.zhiliaoapp.musically.R.attr.bhl, com.zhiliaoapp.musically.R.attr.bih});
        this.LJIIJ = obtainStyledAttributes.getDimension(0, 0.0f);
        this.LIZ = C80285Vf7.LIZ(context, obtainStyledAttributes, 3);
        C80285Vf7.LIZ(context, obtainStyledAttributes, 4);
        C80285Vf7.LIZ(context, obtainStyledAttributes, 5);
        this.LIZLLL = obtainStyledAttributes.getInt(2, 0);
        this.LJ = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.LJIIJJI = obtainStyledAttributes.getResourceId(i2, 0);
        this.LIZJ = C16880lQ.LLLZLZ(obtainStyledAttributes, i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.LIZIZ = C80285Vf7.LIZ(context, obtainStyledAttributes, 6);
        this.LJFF = obtainStyledAttributes.getFloat(7, 0.0f);
        this.LJI = obtainStyledAttributes.getFloat(8, 0.0f);
        this.LJII = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, new int[]{R.attr.letterSpacing, R.attr.lineHeight, com.zhiliaoapp.musically.R.attr.aog});
        this.LJIIIIZZ = obtainStyledAttributes2.hasValue(0);
        this.LJIIIZ = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void LIZIZ(Context context, QXX qxx) {
        LIZ();
        int i = this.LJIIJJI;
        if (i == 0) {
            this.LJIIL = true;
        }
        if (this.LJIIL) {
            qxx.LLLFF(this.LJIILIIL, true);
            return;
        }
        try {
            C80230VeE c80230VeE = new C80230VeE(this, qxx);
            if (context.isRestricted()) {
                c80230VeE.LIZ(-4);
            } else {
                C06690Ob.LIZJ(context, i, new TypedValue(), 0, c80230VeE, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.LJIIL = true;
            qxx.LLLF(1);
        } catch (Exception unused2) {
            this.LJIIL = true;
            qxx.LLLF(-3);
        }
    }

    public final void LIZLLL(TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.LIZLLL;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.LJIIJ);
        if (this.LJIIIIZZ) {
            textPaint.setLetterSpacing(this.LJIIIZ);
        }
    }

    public final void LIZJ(Context context, TextPaint textPaint, QXX qxx) {
        int i;
        int i2;
        LIZ();
        LIZLLL(textPaint, this.LJIILIIL);
        LIZIZ(context, new C80231VeF(this, textPaint, qxx));
        ColorStateList colorStateList = this.LIZ;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.LJII;
        float f2 = this.LJFF;
        float f3 = this.LJI;
        ColorStateList colorStateList2 = this.LIZIZ;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }
}
