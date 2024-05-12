package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92153jX {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZ(String str, Integer num, Integer num2, String str2, Context context) {
        if (str2.length() == 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (num == null) {
            num = C79045V0n.LJI(R.attr.gv, context);
        }
        if (num != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, str2.length(), 17);
        }
        if (str != null && str.length() != 0) {
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            int LJJLIIIJL = s.LJJLIIIJL(lowerCase, lowerCase2, 0, false, 6);
            if (LJJLIIIJL != -1 && (num2 != null || (num2 = C79045V0n.LJI(R.attr.go, context)) != null)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(num2.intValue()), LJJLIIIJL, str.length() + LJJLIIIJL, 17);
            }
        }
        return spannableStringBuilder;
    }
}
