package X;

import android.content.Context;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3ls */
/* loaded from: classes2.dex */
public final class C93603ls {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ void LIZIZ(TextView textView, String str, String str2) {
        Context context = textView.getContext();
        o.LJIIIIZZ(context, "textView.context");
        LIZ(textView, str, str2, AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
    }

    public static void LIZ(TextView textView, String str, String keyword, int i) {
        o.LJIIIZ(textView, "textView");
        o.LJIIIZ(keyword, "keyword");
        if (keyword.length() == 0 || str == null || str.length() == 0) {
            textView.setText(str);
            return;
        }
        String lowerCase = str.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        String lowerCase2 = keyword.toLowerCase();
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase()");
        int LJJLIIIJL = s.LJJLIIIJL(lowerCase, lowerCase2, 0, false, 6);
        if (LJJLIIIJL < 0) {
            textView.setText(str);
            return;
        }
        int length = keyword.length() + LJJLIIIJL;
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        String substring = str.substring(LJJLIIIJL, length);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        textView.setText(C93593lr.LIZ(i, 0, str, substring));
    }
}
