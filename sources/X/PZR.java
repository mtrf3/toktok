package X;

import java.util.Locale;
import java.util.regex.Matcher;

/* loaded from: classes12.dex */
public final class PZR {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        Object obj;
        PZU LIZIZ = LIZIZ(str);
        if (LIZIZ != null && (obj = C64656PZc.LIZ.get(LIZIZ.LIZIZ)) != null) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof java.util.Set) {
                return ((java.util.Set) obj).contains(LIZIZ.LIZJ);
            }
            return false;
        }
        return false;
    }

    public static PZU LIZIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Matcher matcher = PZU.LIZLLL.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = PZU.LJ.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 != null) {
                    if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                        group3 = C79061V1d.LJ(group3, 1, 1);
                    }
                } else {
                    group3 = matcher2.group(3);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = group3;
            }
        }
        return new PZU(str, lowerCase, lowerCase2);
    }
}
