package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.bytedance.android.live.design.text.LiveTypefaceSpan;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23010vJ {
    public static final SparseIntArray LIZ;
    public static final SparseIntArray LIZIZ;
    public static final SparseIntArray LIZJ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LIZ = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        LIZIZ = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        LIZJ = sparseIntArray3;
        sparseIntArray.put(0, R.style.oe);
        sparseIntArray.put(1, R.style.oh);
        sparseIntArray.put(2, R.style.ok);
        sparseIntArray.put(3, R.style.on);
        sparseIntArray.put(4, R.style.oq);
        sparseIntArray.put(5, R.style.ot);
        sparseIntArray.put(6, R.style.ow);
        sparseIntArray.put(7, R.style.oz);
        sparseIntArray.put(8, R.style.p2);
        sparseIntArray2.put(0, R.dimen.aic);
        sparseIntArray2.put(1, R.dimen.aid);
        sparseIntArray2.put(2, R.dimen.aie);
        sparseIntArray2.put(3, R.dimen.aif);
        sparseIntArray2.put(4, R.dimen.aig);
        sparseIntArray2.put(5, R.dimen.aih);
        sparseIntArray2.put(6, R.dimen.aii);
        sparseIntArray2.put(7, R.dimen.aij);
        sparseIntArray2.put(8, R.dimen.aik);
        sparseIntArray3.put(0, R.dimen.ai4);
        sparseIntArray3.put(1, R.dimen.ai5);
        sparseIntArray3.put(2, R.dimen.ai6);
        sparseIntArray3.put(3, R.dimen.ai7);
        sparseIntArray3.put(4, R.dimen.ai8);
        sparseIntArray3.put(5, R.dimen.ai9);
        sparseIntArray3.put(6, R.dimen.ai_);
        sparseIntArray3.put(7, R.dimen.aia);
        sparseIntArray3.put(8, R.dimen.aib);
    }

    public static Typeface LIZ(int i) {
        String str;
        C49616Jdc LIZIZ2 = C49616Jdc.LIZIZ();
        if (i == 700) {
            str = "bold";
        } else if (i == 600) {
            str = "medium";
        } else {
            str = "regular";
        }
        return LIZIZ2.LIZLLL(str);
    }

    public static void LJ(int i, TextView textView) {
        int i2;
        if (textView != null) {
            float textSize = textView.getTextSize();
            C259810g c259810g = C259710f.LIZ;
            if (i == 700) {
                i2 = 2;
            } else if (i == 600) {
                i2 = 7;
            } else {
                i2 = 1;
            }
            Typeface LJI = c259810g.LJI(textSize, i2, false);
            if (LJI == null) {
                LJI = LIZ(i);
            }
            textView.setTypeface(LJI);
        }
    }

    public static void LIZLLL(C47121t6 c47121t6, int i, int i2) {
        if (c47121t6 != null) {
            Typeface typeface = c47121t6.getTypeface();
            C023107f.LJII(c47121t6, LIZ.get(i));
            c47121t6.setTypeface(typeface);
            C023107f.LJFF(c47121t6, c47121t6.getContext().getResources().getDimensionPixelSize(LIZJ.get(i)));
        }
        LJ(i2, c47121t6);
    }

    public static void LIZIZ(Context context, Paint paint, int i, int i2) {
        int i3;
        if (context != null && paint != null) {
            C259810g c259810g = C259710f.LIZ;
            c259810g.getClass();
            paint.setTextSize(c259810g.LJ(context.getResources().getDimensionPixelSize(LIZIZ.get(i))));
            float textSize = paint.getTextSize();
            if (i2 == 700) {
                i3 = 2;
            } else if (i2 == 600) {
                i3 = 7;
            } else {
                i3 = 1;
            }
            Typeface LJI = c259810g.LJI(textSize, i3, false);
            if (LJI == null) {
                LJI = LIZ(i2);
            }
            paint.setTypeface(LJI);
        }
    }

    public static void LJFF(Spannable spannable, int i, int i2, int i3, int i4) {
        if (spannable != null) {
            Typeface LIZ2 = LIZ(i4);
            boolean z = true;
            if (i4 != 700) {
                z = false;
            }
            spannable.setSpan(new LiveTypefaceSpan(LIZ2, z), i, i2, i3);
        }
    }

    public static void LJI(Context context, Spannable spannable, int i, int i2, int i3, int i4) {
        if (context != null && spannable != null) {
            C259710f.LIZ.getClass();
            spannable.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(LIZIZ.get(i4))), i, i2, i3);
        }
    }

    public static void LIZJ(Context context, Spannable spannable, int i, int i2, int i3, int i4, int i5) {
        LJI(context, spannable, i, i2, i3, i4);
        LJFF(spannable, i, i2, i3, i5);
    }
}
