package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS57S0201000_8;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.K3u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51102K3u {
    public static final void LIZJ(TextView textView, Spannable spannable) {
        o.LJIIIZ(textView, "<this>");
        textView.setText(spannable, TextView.BufferType.SPANNABLE);
    }

    public static final String LIZIZ(int i, int i2, CharSequence charSequence) {
        o.LJIIIZ(charSequence, "<this>");
        if (i < 0 || i2 > charSequence.length() || i > i2) {
            return "";
        }
        return charSequence.subSequence(i, i2).toString();
    }

    public static void LIZLLL(TextView textView, String str, SY9 sy9) {
        boolean z;
        Boolean bool;
        boolean z2 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String charSequence = s.LJZI(str).toString();
            if (charSequence == null || charSequence.length() == 0) {
                bool = Boolean.FALSE;
            } else {
                OJD ojd = (OJD) C89445Z8n.LIZIZ.getValue();
                bool = null;
                if (ojd != null) {
                    if (OJD.find$default(ojd, charSequence, 0, 2, null) == null) {
                        z2 = false;
                    }
                    bool = Boolean.valueOf(z2);
                }
            }
            if (!o.LJ(bool, Boolean.FALSE) && !sy9.getBounds().isEmpty()) {
                AqS57S0201000_8 aqS57S0201000_8 = new AqS57S0201000_8(textView, sy9, 2, 0);
                if (C16330kX.LIZJ(textView)) {
                    SpannableStringBuilder LIZ = LIZ(textView.getContext(), str, sy9, 2);
                    LIZJ(textView, LIZ);
                    aqS57S0201000_8.invoke(LIZ);
                    return;
                } else {
                    SpannableStringBuilder LIZ2 = LIZ(textView.getContext(), str, sy9, 2);
                    JVD.LIZIZ(textView, new AqS155S0200000_8(aqS57S0201000_8, LIZ2, 14));
                    LIZJ(textView, LIZ2);
                    return;
                }
            }
        }
        LIZJ(textView, LIZ(textView.getContext(), str, sy9, 2));
    }

    public static final SpannableStringBuilder LIZ(Context context, String str, SY9 sy9, int i) {
        String str2;
        int LJJIIZ;
        if (str == null || (str2 = s.LJZI(str).toString()) == null) {
            str2 = "";
        }
        boolean z = false;
        if (str == null || str.length() == 0 || sy9.getBounds().isEmpty()) {
            return new SpannableStringBuilder();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) "  ");
        int length = (str2.length() + 2) - 1;
        if (context != null && C26338AVi.LIZJ(context)) {
            z = true;
        }
        T59 t59 = new T59(sy9);
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            LJJIIZ = -O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
        } else {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
        }
        t59.LJLIL = LJJIIZ;
        spannableStringBuilder.setSpan(t59, length - 1, length, 18);
        return spannableStringBuilder;
    }
}
