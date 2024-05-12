package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes15.dex */
public final class VS6 {
    public static final Pattern LIZ = PatternProtector.compile("(\\[)([^\\[\\]]+)(])");
    public static boolean LIZIZ;

    public static CharSequence LIZ(VNU vnu, CharSequence charSequence, int i) {
        VS5 LIZ2 = VS4.LIZ();
        Matcher matcher = LIZ.matcher(charSequence);
        SpannableString spannableString = new SpannableString(charSequence);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            Drawable LIZ3 = LIZ2.LIZ(vnu, group);
            if (LIZ3 != null) {
                LIZ3.setBounds(0, 0, (int) ((i * ((LIZ3.getIntrinsicWidth() + 0.0f) / LIZ3.getIntrinsicHeight())) + 0.5f), i);
                spannableString.setSpan(new C6X4(LIZ3, Integer.valueOf(end - start), group), start, end, 33);
            }
        }
        return spannableString;
    }
}
