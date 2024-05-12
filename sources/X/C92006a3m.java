package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.a3m, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92006a3m {
    public static BNPLEntryData LIZ;

    public static SpannableStringBuilder LIZ(ActivityC45651qj activityC45651qj, String str, int i, InterfaceC88472Yns interfaceC88472Yns) {
        StringBuilder sb = new StringBuilder(str);
        OJD ojd = new OJD("\\[([^\\]]*)\\]\\(([^\\)]*)\\)");
        HashMap hashMap = new HashMap();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ojd.replace(sb, new IDqS418S0100000_31(hashMap, (HashMap<String, String>) 91)));
        try {
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(i, activityC45651qj);
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(i, activityC45651qj);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            String lowerCase = spannableStringBuilder2.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                C92262a7u c92262a7u = new C92262a7u(LJIIIIZZ, LJIIIIZZ2, interfaceC88472Yns, str2, activityC45651qj, entry);
                Locale locale2 = Locale.getDefault();
                o.LJIIIIZZ(locale2, "getDefault()");
                String lowerCase2 = str2.toLowerCase(locale2);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                int LJJLIIIJL = s.LJJLIIIJL(lowerCase, lowerCase2, 0, false, 6);
                spannableStringBuilder.setSpan(c92262a7u, LJJLIIIJL + 1, (lowerCase2.length() + LJJLIIIJL) - 1, 34);
                spannableStringBuilder.setSpan(new T5U(12, true), LJJLIIIJL, (lowerCase2.length() + LJJLIIIJL) - 1, 34);
            }
            for (InterfaceC59973NgH interfaceC59973NgH : OJD.findAll$default(new OJD("[\\[\\]]"), spannableStringBuilder, 0, 2, null)) {
                spannableStringBuilder.replace(interfaceC59973NgH.LIZIZ().LJLIL, interfaceC59973NgH.LIZIZ().LJLILLLLZI + 1, (CharSequence) "");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return new SpannableStringBuilder(spannableStringBuilder);
    }
}
