package X;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.86h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2059186h {
    public static final void LIZ(TextView textView, CharSequence charSequence) {
        if ((textView instanceof AppCompatTextView) && ((Number) C2060586v.LIZ.getValue()).intValue() == 1) {
            if (charSequence == null) {
                charSequence = "";
            }
            ((AppCompatTextView) textView).setTextFuture(C13730gL.LIZ(charSequence, C023107f.LIZ(textView), C38995FSd.LIZIZ()));
            return;
        }
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }
}
