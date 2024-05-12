package X;

import android.text.TextPaint;
import android.util.SparseIntArray;
import kotlin.jvm.internal.o;

/* renamed from: X.KSe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51736KSe {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C51737KSf.LJLIL);

    public static void LIZ(C56970MXm textView, int i, int i2, int i3) {
        o.LJIIIZ(textView, "textView");
        CharSequence text = textView.getText();
        TextPaint paint = textView.getPaint();
        Integer valueOf = Integer.valueOf(textView.getLayoutParams().width);
        if (valueOf.intValue() > 0) {
            i3 = valueOf.intValue();
        }
        int paddingRight = (i3 - textView.getPaddingRight()) - textView.getPaddingLeft();
        if (i <= i2) {
            while (true) {
                paint.setTextSize(KL2.LIZJ(textView.getContext(), i2));
                if (paint.measureText(text.toString()) < paddingRight) {
                    C023107f.LJII(textView, ((SparseIntArray) LIZ.getValue()).get(i2));
                    return;
                } else if (i2 == i) {
                    break;
                } else {
                    i2--;
                }
            }
        }
        C023107f.LJII(textView, ((SparseIntArray) LIZ.getValue()).get(i));
    }
}
