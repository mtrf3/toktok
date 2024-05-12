package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TextLinkConfig;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;

/* renamed from: X.MVx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56929MVx {
    public static void LIZ(C116724i4 c116724i4, NoticeUITemplate noticeUITemplate, C56925MVt c56925MVt) {
        String str = noticeUITemplate.content;
        if (str == null) {
            str = "";
        }
        int i = 0;
        if (str.length() == 0) {
            return;
        }
        List list = noticeUITemplate.contentTextLinkConfigs;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        int size = list.size();
        Matcher matcher = PatternProtector.compile("\\[\\[text_link_(\\d)\\]\\]").matcher(str);
        while (matcher.find()) {
            if (i != matcher.start()) {
                String substring = str.substring(i, matcher.start());
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                c116724i4.LIZIZ(substring);
            }
            i = matcher.end();
            int intValue = CastIntegerProtector.valueOf(matcher.group(1)).intValue() - 1;
            if (size > intValue && ListProtector.get(list, intValue) != null) {
                TextLinkConfig textLinkConfig = (TextLinkConfig) ListProtector.get(list, intValue);
                if (c56925MVt == null) {
                    String str2 = textLinkConfig.text;
                    if (str2 != null) {
                        c116724i4.LIZIZ(str2);
                    }
                } else {
                    c56925MVt.invoke(textLinkConfig, c116724i4);
                }
            }
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            c116724i4.LIZIZ(substring2);
        }
    }
}
