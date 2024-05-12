package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class ERZ {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZLLL() {
        long j;
        try {
            FFL.LJIIIZ().getClass();
            String LJIILJJIL = FFL.LJIILJJIL(31744, "tts_release_red_dot_duration", "", true);
            o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…chExperiment::class.java)");
            String lowerCase = LJIILJJIL.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            Pattern compile = PatternProtector.compile("[0-9]+h");
            Pattern compile2 = PatternProtector.compile("[0-9]+m(?!s)");
            Pattern compile3 = PatternProtector.compile("[0-9]+s");
            Pattern compile4 = PatternProtector.compile("[0-9]+ms");
            Matcher matcher = compile.matcher(lowerCase);
            if (matcher.find()) {
                String group = matcher.group();
                o.LJIIIIZZ(group, "matcherH.group()");
                j = LIZIZ(group) + 0;
            } else {
                j = 0;
            }
            Matcher matcher2 = compile2.matcher(lowerCase);
            if (matcher2.find()) {
                String group2 = matcher2.group();
                o.LJIIIIZZ(group2, "matcherM.group()");
                j += LIZIZ(group2);
            }
            Matcher matcher3 = compile3.matcher(lowerCase);
            if (matcher3.find()) {
                String group3 = matcher3.group();
                o.LJIIIIZZ(group3, "matcherS.group()");
                j += LIZIZ(group3);
            }
            Matcher matcher4 = compile4.matcher(lowerCase);
            if (matcher4.find()) {
                String group4 = matcher4.group();
                o.LJIIIIZZ(group4, "matcherMS.group()");
                return j + LIZIZ(group4);
            }
            return j;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static boolean LIZJ() {
        if (LIZLLL() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(long j) {
        if (!LIZJ() || j <= 0) {
            return false;
        }
        long LIZLLL = LIZLLL();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis <= j || currentTimeMillis >= j + LIZLLL) {
            return false;
        }
        return true;
    }

    public static long LIZIZ(String str) {
        if (ujb.o.LJJJJ(str, "h", false)) {
            return TimeUnit.HOURS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"h"}, 0, 6), 0)));
        }
        if (ujb.o.LJJJJ(str, "ms", false)) {
            return TimeUnit.MILLISECONDS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"ms"}, 0, 6), 0)));
        }
        if (ujb.o.LJJJJ(str, "m", false)) {
            return TimeUnit.MINUTES.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"m"}, 0, 6), 0)));
        }
        if (ujb.o.LJJJJ(str, "s", false)) {
            return TimeUnit.SECONDS.toSeconds(CastLongProtector.parseLong((String) ListProtector.get(s.LJLJJL(str, new String[]{"s"}, 0, 6), 0)));
        }
        return 0L;
    }
}
