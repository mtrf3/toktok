package X;

import android.graphics.Paint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.07f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C023107f {
    public static C13700gI LIZ(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C13700gI(C022907d.LIZIZ(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        C13690gH c13690gH = new C13690gH(textPaint);
        if (i >= 23) {
            c13690gH.LIZ = C022607a.LIZ(textView);
            c13690gH.LIZIZ = C022607a.LIZLLL(textView);
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = false;
            if (C07Z.LIZIZ(textView) == 1) {
                z = true;
            }
            switch (C07Z.LIZJ(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    }
            }
        }
        return new C13700gI(textPaint, textDirectionHeuristic, c13690gH.LIZ, c13690gH.LIZIZ);
    }

    public static ActionMode.Callback LJIIIIZZ(ActionMode.Callback callback) {
        if ((callback instanceof ActionModeCallbackC023007e) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionModeCallbackC023007e) callback).LJLIL;
        }
        return callback;
    }

    public static void LIZJ(AppCompatTextView appCompatTextView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C022807c.LJII(appCompatTextView, i);
        } else {
            if (!(appCompatTextView instanceof C07K)) {
                return;
            }
            appCompatTextView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void LIZLLL(TextView textView, int i) {
        int i2;
        TMC.LJIIIIZZ(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C022907d.LIZJ(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C07Y.LIZ(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void LJ(TextView textView, int i) {
        int i2;
        TMC.LJIIIIZZ(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C07Y.LIZ(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void LJFF(TextView textView, int i) {
        TMC.LJIIIIZZ(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void LJI(TextView textView, C13730gL c13730gL) {
        if (Build.VERSION.SDK_INT >= 29) {
            Spannable spannable = c13730gL.LJLIL;
            if (!(spannable instanceof PrecomputedText)) {
                spannable = null;
            }
            textView.setText(spannable);
            return;
        }
        if (LIZ(textView).LIZ(c13730gL.LJLILLLLZI)) {
            textView.setText(c13730gL);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static void LJII(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static ActionMode.Callback LJIIIZ(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC023007e) || callback == null) {
            return callback;
        }
        return new ActionModeCallbackC023007e(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            C022807c.LJFF(textView, i, i2, i3, i4);
        } else {
            if (!(textView instanceof C07K)) {
                return;
            }
            ((C07K) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }
}
