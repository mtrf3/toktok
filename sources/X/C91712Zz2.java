package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Zz2, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91712Zz2 {
    public static final Pattern LJIIJJI = PatternProtector.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public final String LIZ;
    public final String LJFF;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIJ;
    public final String LIZIZ = null;
    public final String LIZJ = null;
    public final List<String> LIZLLL = new ArrayList();
    public final java.util.Map<String, C91711Zz1> LJ = new LinkedHashMap();
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 4));
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 3));

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LIZJ;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public C91712Zz2(String str) {
        boolean z;
        this.LIZ = str;
        int i = 0;
        if (str != null) {
            android.net.Uri parse = UriProtector.parse(str);
            int i2 = 1;
            if (parse.getQuery() != null) {
                z = true;
            } else {
                z = false;
            }
            this.LJII = z;
            StringBuilder sb = new StringBuilder("^");
            if (!LJIIJJI.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern fillInPattern = PatternProtector.compile("\\{(.+?)\\}");
            if (z) {
                Matcher matcher = PatternProtector.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    o.LJIIIIZZ(fillInPattern, "fillInPattern");
                    this.LJIIJ = LIZ(substring, sb, fillInPattern);
                }
                for (String paramName : UriProtector.getQueryParameterNames(parse)) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = UriProtector.getQueryParameter(parse, paramName);
                    if (queryParameter != null) {
                        Matcher matcher2 = fillInPattern.matcher(queryParameter);
                        C91711Zz1 c91711Zz1 = new C91711Zz1();
                        while (matcher2.find()) {
                            String group = matcher2.group(i2);
                            if (group != null) {
                                ((ArrayList) c91711Zz1.LIZIZ).add(group);
                                String substring2 = queryParameter.substring(i, matcher2.start());
                                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb2.append(Pattern.quote(substring2));
                                sb2.append("(.+?)?");
                                i = matcher2.end();
                                i2 = 1;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                        if (i < queryParameter.length()) {
                            String substring3 = queryParameter.substring(i);
                            o.LJIIIIZZ(substring3, "this as java.lang.String).substring(startIndex)");
                            sb2.append(Pattern.quote(substring3));
                        }
                        String sb3 = sb2.toString();
                        o.LJIIIIZZ(sb3, "argRegex.toString()");
                        c91711Zz1.LIZ = ujb.o.LJJJJZ(sb3, ".*", "\\E.*\\Q", false);
                        java.util.Map<String, C91711Zz1> map = this.LJ;
                        o.LJIIIIZZ(paramName, "paramName");
                        map.put(paramName, c91711Zz1);
                        i = 0;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            } else {
                o.LJIIIIZZ(fillInPattern, "fillInPattern");
                this.LJIIJ = LIZ(str, sb, fillInPattern);
            }
            String sb4 = sb.toString();
            o.LJIIIIZZ(sb4, "uriRegex.toString()");
            this.LJFF = ujb.o.LJJJJZ(sb4, ".*", "\\E.*\\Q", false);
        }
        if (this.LIZJ != null) {
            if (PatternProtector.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.LIZJ).matches()) {
                C91710Zz0 c91710Zz0 = new C91710Zz0(this.LIZJ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("^(");
                LIZ.append(c91710Zz0.LJLIL);
                LIZ.append("|[*]+)/(");
                LIZ.append(c91710Zz0.LJLILLLLZI);
                LIZ.append("|[*]+)$");
                this.LJIIIIZZ = ujb.o.LJJJJZ(X1D.LIZIZ(LIZ), "*|[*]", "[\\s\\S]", false);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("The given mimeType ");
            LIZ2.append((Object) this.LIZJ);
            LIZ2.append(" does not match to required \"type/subtype\" format");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C91712Zz2)) {
            return false;
        }
        C91712Zz2 c91712Zz2 = (C91712Zz2) obj;
        if (!o.LJ(this.LIZ, c91712Zz2.LIZ) || !o.LJ(this.LIZIZ, c91712Zz2.LIZIZ) || !o.LJ(this.LIZJ, c91712Zz2.LIZJ)) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !s.LJJJLZIJ(str, ".*", false);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                ((ArrayList) this.LIZLLL).add(group);
                String substring = str.substring(i, matcher.start());
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    public static boolean LIZIZ(Bundle bundle, String key, String str, C91698Zyo c91698Zyo) {
        if (c91698Zyo != null) {
            AbstractC91689Zyf<Object> abstractC91689Zyf = c91698Zyo.LIZ;
            try {
                abstractC91689Zyf.getClass();
                o.LJIIIZ(key, "key");
                abstractC91689Zyf.LIZLLL(bundle, key, abstractC91689Zyf.LIZJ(str));
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        }
        bundle.putString(key, str);
        return false;
    }
}
