package X;

import android.content.Context;
import android.text.SpannableString;
import android.widget.TextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118514kx {
    public TuxSheet LIZ;

    public static void LIZ(Context context, TextView textView, int i) {
        int LJIILL = C17N.LJIILL(17.0d);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LIZIZ = LJIILL;
        c2068389v.LIZJ = LJIILL;
        c2068389v.LJ = Integer.valueOf(R.attr.d4);
        C8FR LIZIZ = c2068389v.LIZIZ(2, context);
        SpannableString spannableString = new SpannableString(textView.getText());
        CharSequence text = textView.getText();
        o.LJIIIIZZ(text, "textView.text");
        int LJJLIIIJL = s.LJJLIIIJL(text, "%s", 0, false, 6);
        if (LJJLIIIJL == -1) {
            return;
        }
        spannableString.setSpan(LIZIZ, LJJLIIIJL, LJJLIIIJL + 2, 33);
        textView.setText(spannableString);
    }
}
