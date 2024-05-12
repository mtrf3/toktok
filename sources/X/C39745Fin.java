package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import defpackage.q;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Fin, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39745Fin {
    public static final Pattern LJ = PatternProtector.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern LJFF = PatternProtector.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public static C39745Fin LIZIZ(String str) {
        Matcher matcher = LJ.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = LJFF.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
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
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            StringBuilder LIZLLL = C06540Nm.LIZLLL("Multiple charsets defined: \"", str2, "\" and: \"", group3, "\" for: \"");
                            throw new IllegalArgumentException(q.LIZIZ(LIZLLL, str, '\"', LIZLLL));
                        }
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Parameter is not formatted correctly: \"");
                    LIZ.append(str.substring(end));
                    LIZ.append("\" for: \"");
                    throw new IllegalArgumentException(q.LIZIZ(LIZ, str, '\"', LIZ));
                }
            }
            return new C39745Fin(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException(C0F0.LIZLLL("No subtype found for: \"", str, '\"'));
    }

    public static C39745Fin LIZJ(String str) {
        try {
            return LIZIZ(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final Charset LIZ(Charset charset) {
        try {
            String str = this.LIZLLL;
            if (str != null) {
                return Charset.forName(str);
            }
            return charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C39745Fin) && ((C39745Fin) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }

    public C39745Fin(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
