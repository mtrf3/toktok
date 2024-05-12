package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class JZJ {
    public int LIZJ;
    public boolean LJII;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZLLL = "";
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;

    public final CharSequence LIZIZ(Context context) {
        int i;
        if (this.LJI < 0) {
            this.LJI = R.attr.go;
        }
        if (this.LJFF < 0) {
            this.LJFF = 13;
        }
        if (this.LJ < 0) {
            this.LJ = 33;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.LIZ.length() != 0 && this.LIZIZ.length() != 0) {
            if (this.LIZJ == 0) {
                LIZ(spannableStringBuilder, this.LIZIZ, this.LJ);
                if (this.LIZLLL.length() > 0) {
                    LIZ(spannableStringBuilder, this.LIZLLL, this.LJFF);
                }
                LIZ(spannableStringBuilder, this.LIZ, this.LJFF);
            } else {
                LIZ(spannableStringBuilder, this.LIZ, this.LJFF);
                if (this.LIZLLL.length() > 0) {
                    LIZ(spannableStringBuilder, this.LIZLLL, this.LJFF);
                }
                LIZ(spannableStringBuilder, this.LIZIZ, this.LJ);
            }
            Integer LJI = C79045V0n.LJI(this.LJI, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, spannableStringBuilder.length(), 17);
            if (this.LJII) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder.length(), 17);
            }
        }
        return spannableStringBuilder;
    }

    public final void LIZJ(int i) {
        OSZ osz;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            osz = new OSZ(33, 13);
                        } else {
                            osz = new OSZ(92, 62);
                        }
                    } else {
                        osz = new OSZ(82, 42);
                    }
                } else {
                    osz = new OSZ(72, 32);
                }
            } else {
                osz = new OSZ(52, 22);
            }
        } else {
            osz = new OSZ(33, 13);
        }
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        this.LJ = intValue;
        this.LJFF = intValue2;
    }

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new T5U(i, false), length, spannableStringBuilder.length(), 17);
    }
}
