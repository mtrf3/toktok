package X;

import android.text.Spanned;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.16M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16M {
    public static void LIZ(TuxTextView tuxTextView, CharSequence charSequence) {
        boolean z;
        boolean z2;
        CharSequence text = tuxTextView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else {
                if (charSequence == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (text == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    if (charSequence == null) {
                        return;
                    }
                    String str = (String) charSequence;
                    int length = str.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (str.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            }
            tuxTextView.setText(charSequence);
        }
    }
}
