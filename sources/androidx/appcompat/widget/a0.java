package androidx.appcompat.widget;

import X.AbstractC06680Oa;
import X.AnonymousClass033;
import X.C012102z;
import X.C03R;
import X.KMP;
import Y.IDRunnableS0S0201000;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.a0;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a0 {
    public final TextView LIZ;
    public C012102z LIZIZ;
    public C012102z LIZJ;
    public C012102z LIZLLL;
    public C012102z LJ;
    public C012102z LJFF;
    public C012102z LJI;
    public C012102z LJII;
    public final c0 LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ = -1;
    public Typeface LJIIJJI;
    public boolean LJIIL;

    public final void LIZIZ() {
        if (this.LIZIZ != null || this.LIZJ != null || this.LIZLLL != null || this.LJ != null) {
            Drawable[] compoundDrawables = this.LIZ.getCompoundDrawables();
            LIZ(compoundDrawables[0], this.LIZIZ);
            LIZ(compoundDrawables[1], this.LIZJ);
            LIZ(compoundDrawables[2], this.LIZLLL);
            LIZ(compoundDrawables[3], this.LJ);
        }
        if (this.LJFF != null || this.LJI != null) {
            Drawable[] compoundDrawablesRelative = this.LIZ.getCompoundDrawablesRelative();
            LIZ(compoundDrawablesRelative[0], this.LJFF);
            LIZ(compoundDrawablesRelative[2], this.LJI);
        }
    }

    public a0(TextView textView) {
        this.LIZ = textView;
        this.LJIIIIZZ = new c0(textView);
    }

    public final void LJII(int i) {
        c0 c0Var = this.LJIIIIZZ;
        if (c0Var.LJII()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = c0Var.LJIIIZ.getResources().getDisplayMetrics();
                    c0Var.LJIIIIZZ(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c0Var.LJFF()) {
                        c0Var.LIZ();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(KMP.LJ("Unknown auto-size text type: ", i));
            }
            c0Var.LIZ = 0;
            c0Var.LIZLLL = -1.0f;
            c0Var.LJ = -1.0f;
            c0Var.LIZJ = -1.0f;
            c0Var.LJFF = new int[0];
            c0Var.LIZIZ = false;
        }
    }

    public final void LIZ(Drawable drawable, C012102z c012102z) {
        if (drawable != null && c012102z != null) {
            C03R.LJ(drawable, c012102z, this.LIZ.getDrawableState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.LIZLLL(android.util.AttributeSet, int):void");
    }

    public final void LJ(int i, Context context) {
        String LJIIIZ;
        ColorStateList LIZIZ;
        ColorStateList LIZIZ2;
        ColorStateList LIZIZ3;
        AnonymousClass033 anonymousClass033 = new AnonymousClass033(context, context.obtainStyledAttributes(i, new int[]{R.attr.textSize, R.attr.typeface, R.attr.textStyle, R.attr.textColor, R.attr.textColorHint, R.attr.textColorLink, R.attr.shadowColor, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRadius, R.attr.fontFamily, R.attr.textFontWeight, com.zhiliaoapp.musically.R.attr.ae9, com.zhiliaoapp.musically.R.attr.aei, com.zhiliaoapp.musically.R.attr.bhl, com.zhiliaoapp.musically.R.attr.bih}));
        if (anonymousClass033.LJIIJJI(14)) {
            this.LIZ.setAllCaps(anonymousClass033.LIZ(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (anonymousClass033.LJIIJJI(3) && (LIZIZ3 = anonymousClass033.LIZIZ(3)) != null) {
                this.LIZ.setTextColor(LIZIZ3);
            }
            if (anonymousClass033.LJIIJJI(5) && (LIZIZ2 = anonymousClass033.LIZIZ(5)) != null) {
                this.LIZ.setLinkTextColor(LIZIZ2);
            }
            if (anonymousClass033.LJIIJJI(4) && (LIZIZ = anonymousClass033.LIZIZ(4)) != null) {
                this.LIZ.setHintTextColor(LIZIZ);
            }
        }
        if (anonymousClass033.LJIIJJI(0) && anonymousClass033.LIZLLL(0, -1) == 0) {
            this.LIZ.setTextSize(0, 0.0f);
        }
        LJIIIIZZ(context, anonymousClass033);
        if (i2 >= 26 && anonymousClass033.LJIIJJI(13) && (LJIIIZ = anonymousClass033.LJIIIZ(13)) != null) {
            this.LIZ.setFontVariationSettings(LJIIIZ);
        }
        anonymousClass033.LJIILJJIL();
        Typeface typeface = this.LJIIJJI;
        if (typeface != null) {
            this.LIZ.setTypeface(typeface, this.LJIIIZ);
        }
    }

    public final void LJI(int[] iArr, int i) {
        c0 c0Var = this.LJIIIIZZ;
        if (c0Var.LJII()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0Var.LJIIIZ.getResources().getDisplayMetrics();
                    do {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                        i2++;
                    } while (i2 < length);
                }
                c0Var.LJFF = c0.LIZIZ(iArr2);
                if (!c0Var.LJI()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0Var.LJI = false;
            }
            if (c0Var.LJFF()) {
                c0Var.LIZ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.19A] */
    public final void LJIIIIZZ(Context context, AnonymousClass033 anonymousClass033) {
        String LJIIIZ;
        boolean z;
        boolean z2;
        this.LJIIIZ = anonymousClass033.LJII(2, this.LJIIIZ);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int LJII = anonymousClass033.LJII(11, -1);
            this.LJIIJ = LJII;
            if (LJII != -1) {
                this.LJIIIZ &= 2;
            }
        }
        int i2 = 10;
        if (anonymousClass033.LJIIJJI(10) || anonymousClass033.LJIIJJI(12)) {
            this.LJIIJJI = null;
            if (anonymousClass033.LJIIJJI(12)) {
                i2 = 12;
            }
            final int i3 = this.LJIIJ;
            final int i4 = this.LJIIIZ;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.LIZ);
                try {
                    Typeface LJI = anonymousClass033.LJI(i2, this.LJIIIZ, new AbstractC06680Oa() { // from class: X.19A
                        @Override // X.AbstractC06680Oa
                        public final void LIZJ(int i5) {
                        }

                        @Override // X.AbstractC06680Oa
                        public final void LIZLLL(Typeface typeface) {
                            int i5;
                            boolean z4;
                            if (Build.VERSION.SDK_INT >= 28 && (i5 = i3) != -1) {
                                if ((i4 & 2) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                typeface = Typeface.create(typeface, i5, z4);
                            }
                            a0 a0Var = a0.this;
                            WeakReference weakReference2 = weakReference;
                            if (a0Var.LJIIL) {
                                a0Var.LJIIJJI = typeface;
                                TextView textView = (TextView) weakReference2.get();
                                if (textView != null) {
                                    if (C16330kX.LIZIZ(textView)) {
                                        textView.post(new IDRunnableS0S0201000(a0Var.LJIIIZ, textView, typeface, 2));
                                    } else {
                                        textView.setTypeface(typeface, a0Var.LJIIIZ);
                                    }
                                }
                            }
                        }
                    });
                    if (LJI != null) {
                        if (i >= 28 && this.LJIIJ != -1) {
                            Typeface create = Typeface.create(LJI, 0);
                            int i5 = this.LJIIJ;
                            if ((this.LJIIIZ & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.LJIIJJI = Typeface.create(create, i5, z2);
                        } else {
                            this.LJIIJJI = LJI;
                        }
                    }
                    if (this.LJIIJJI == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJIIL = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.LJIIJJI == null && (LJIIIZ = anonymousClass033.LJIIIZ(i2)) != null) {
                if (Build.VERSION.SDK_INT >= 28 && this.LJIIJ != -1) {
                    Typeface create2 = Typeface.create(LJIIIZ, 0);
                    int i6 = this.LJIIJ;
                    if ((this.LJIIIZ & 2) != 0) {
                        z3 = true;
                    }
                    this.LJIIJJI = Typeface.create(create2, i6, z3);
                    return;
                }
                this.LJIIJJI = Typeface.create(LJIIIZ, this.LJIIIZ);
                return;
            }
            return;
        }
        if (anonymousClass033.LJIIJJI(1)) {
            this.LJIIL = false;
            int LJII2 = anonymousClass033.LJII(1, 1);
            if (LJII2 != 1) {
                if (LJII2 != 2) {
                    if (LJII2 != 3) {
                        return;
                    }
                    this.LJIIJJI = Typeface.MONOSPACE;
                    return;
                }
                this.LJIIJJI = Typeface.SERIF;
                return;
            }
            this.LJIIJJI = Typeface.SANS_SERIF;
        }
    }

    public static C012102z LIZJ(Context context, C03R c03r, int i) {
        ColorStateList LJIIIZ;
        synchronized (c03r) {
            LJIIIZ = c03r.LIZ.LJIIIZ(i, context);
        }
        if (LJIIIZ != null) {
            C012102z c012102z = new C012102z();
            c012102z.LIZLLL = true;
            c012102z.LIZ = LJIIIZ;
            return c012102z;
        }
        return null;
    }

    public final void LJFF(int i, int i2, int i3, int i4) {
        c0 c0Var = this.LJIIIIZZ;
        if (c0Var.LJII()) {
            DisplayMetrics displayMetrics = c0Var.LJIIIZ.getResources().getDisplayMetrics();
            c0Var.LJIIIIZZ(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0Var.LJFF()) {
                c0Var.LIZ();
            }
        }
    }
}
