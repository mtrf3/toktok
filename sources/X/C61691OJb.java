package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.i0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.OJb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61691OJb implements Cloneable {
    public static final java.util.Set<String> LJLLJ;
    public static final Pattern LJLLL;
    public static final Pattern LJLLLL;
    public static final C61693OJd LJLLLLLL;
    public static final String[] LJLZ;
    public String LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public long LJLJJL = -1;
    public final String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final String LJLLI;
    public int LJLLILLLL;

    static {
        HashSet hashSet = new HashSet();
        LJLLJ = hashSet;
        C19U.LJ(hashSet, "comment", "commenturl", "discard", "domain");
        C19U.LJ(hashSet, "expires", "httponly", "max-age", "path");
        hashSet.add("port");
        hashSet.add("secure");
        hashSet.add("version");
        LJLLL = null;
        LJLLLL = null;
        try {
            LJLLL = PatternProtector.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            LJLLLL = PatternProtector.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
        LJLLLLLL = new C61693OJd();
        LJLZ = new String[]{"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    }

    public final int hashCode() {
        int hashCode;
        String str = this.LJLJJLL;
        Locale locale = Locale.US;
        int hashCode2 = str.toLowerCase(locale).hashCode();
        String str2 = this.LJLJJI;
        int i = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.toLowerCase(locale).hashCode();
        }
        int i2 = hashCode2 + hashCode;
        String str3 = this.LJLJL;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJLL);
        LIZ.append("=");
        LIZ.append(this.LJLLI);
        return X1D.LIZIZ(LIZ);
    }

    public static List<C61691OJb> LIZJ(String str) {
        int i;
        String str2;
        String str3;
        String str4;
        C61692OJc c61692OJc = new C61692OJc(str);
        ArrayList arrayList = new ArrayList(2);
        if (c61692OJc.LIZIZ.startsWith("set-cookie2:")) {
            c61692OJc.LIZJ += 12;
            c61692OJc.LIZLLL = true;
            i = 0;
        } else {
            if (c61692OJc.LIZIZ.startsWith("set-cookie:")) {
                c61692OJc.LIZJ += 11;
            }
            i = 1;
        }
        while (true) {
            String LIZIZ = c61692OJc.LIZIZ(false);
            if (LIZIZ == null) {
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("No cookies in ");
                LIZ.append(c61692OJc.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
            if (c61692OJc.LIZJ()) {
                if (i != 0) {
                    str2 = ";";
                } else {
                    str2 = ",;";
                }
                c61692OJc.LIZLLL();
                int LIZ2 = c61692OJc.LIZ(str2);
                String substring = c61692OJc.LIZ.substring(c61692OJc.LIZJ, LIZ2);
                c61692OJc.LIZJ = LIZ2;
                C61691OJb c61691OJb = new C61691OJb(LIZIZ, substring);
                c61691OJb.LJLLILLLL = i ^ 1;
                arrayList.add(c61691OJb);
                while (true) {
                    c61692OJc.LIZLLL();
                    if (c61692OJc.LIZJ != c61692OJc.LIZ.length()) {
                        if (c61692OJc.LIZ.charAt(c61692OJc.LIZJ) == ',') {
                            c61692OJc.LIZJ++;
                            break;
                        }
                        if (c61692OJc.LIZ.charAt(c61692OJc.LIZJ) == ';') {
                            c61692OJc.LIZJ++;
                        }
                        String LIZIZ2 = c61692OJc.LIZIZ(true);
                        if (LIZIZ2 != null) {
                            if (i != 0 || "expires".equals(LIZIZ2) || "port".equals(LIZIZ2)) {
                                str3 = ";";
                            } else {
                                str3 = ";,";
                            }
                            Date date = null;
                            if (c61692OJc.LIZJ()) {
                                c61692OJc.LIZLLL();
                                int LIZ3 = c61692OJc.LIZ(str3);
                                str4 = c61692OJc.LIZ.substring(c61692OJc.LIZJ, LIZ3);
                                c61692OJc.LIZJ = LIZ3;
                            } else {
                                str4 = null;
                            }
                            if (LIZIZ2.equals("comment") && c61691OJb.LJLIL == null) {
                                c61691OJb.LJLIL = str4;
                            } else if (LIZIZ2.equals("commenturl") && c61691OJb.LJLILLLLZI == null) {
                                c61691OJb.LJLILLLLZI = str4;
                            } else if (LIZIZ2.equals("discard")) {
                                c61691OJb.LJLJI = true;
                            } else if (LIZIZ2.equals("domain") && c61691OJb.LJLJJI == null) {
                                if (!TextUtils.isEmpty(str4) && str4.charAt(0) == '.') {
                                    str4 = str4.substring(1);
                                }
                                c61691OJb.LJLJJI = str4;
                            } else if (LIZIZ2.equals("expires")) {
                                if (c61691OJb.LJLJJL == -1) {
                                    try {
                                        date = LJLLLLLL.get().parse(str4);
                                    } catch (ParseException unused) {
                                        for (String str5 : LJLZ) {
                                            try {
                                                date = new SimpleDateFormat(str5, Locale.US).parse(str4);
                                                break;
                                            } catch (ParseException unused2) {
                                            }
                                        }
                                    }
                                    if (date != null) {
                                        c61691OJb.LJLJJL = (date.getTime() - System.currentTimeMillis()) / 1000;
                                    } else {
                                        c61691OJb.LJLJJL = 0L;
                                    }
                                }
                            } else if (LIZIZ2.equals("max-age")) {
                                try {
                                    c61691OJb.LJLJJL = CastLongProtector.parseLong(str4);
                                } catch (NumberFormatException unused3) {
                                    throw new IllegalArgumentException(i0.LJFF("Invalid max-age: ", str4));
                                }
                            } else if (LIZIZ2.equals("path") && c61691OJb.LJLJL == null) {
                                c61691OJb.LJLJL = str4;
                            } else if (LIZIZ2.equals("port") && c61691OJb.LJLJLJ == null) {
                                if (str4 == null) {
                                    str4 = "";
                                }
                                c61691OJb.LJLJLJ = str4;
                            } else if (LIZIZ2.equals("secure")) {
                                c61691OJb.LJLJLLL = true;
                            } else if (LIZIZ2.equals("httponly")) {
                                c61691OJb.LJLL = true;
                            } else if (LIZIZ2.equals("version") && !c61692OJc.LIZLLL) {
                                c61691OJb.LJLLILLLL = CastIntegerProtector.parseInt(str4);
                            }
                        }
                    }
                }
            } else {
                StringBuilder LIZIZ3 = C25620zW.LIZIZ("Expected '=' after ", LIZIZ, " in ");
                LIZIZ3.append(c61692OJc.LIZ);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZIZ3));
            }
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C61691OJb)) {
            return false;
        }
        C61691OJb c61691OJb = (C61691OJb) obj;
        if (this.LJLJJLL.equalsIgnoreCase(c61691OJb.LJLJJLL) && ((str = this.LJLJJI) == null ? c61691OJb.LJLJJI == null : str.equalsIgnoreCase(c61691OJb.LJLJJI))) {
            String str2 = this.LJLJL;
            String str3 = c61691OJb.LJLJL;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public C61691OJb(String str, String str2) {
        int i;
        String trim = str.trim();
        if (trim.length() != 0 && !trim.startsWith("$")) {
            if (!((HashSet) LJLLJ).contains(trim.toLowerCase(Locale.US))) {
                while (i < trim.length()) {
                    char charAt = trim.charAt(i);
                    i = (charAt >= 0 && charAt < 127 && charAt != ';' && charAt != ',' && (!Character.isWhitespace(charAt) || charAt == ' ')) ? i + 1 : 0;
                }
                this.LJLJJLL = trim;
                this.LJLLI = str2;
                return;
            }
        }
        throw new IllegalArgumentException(i0.LJFF("Invalid name: ", str));
    }

    public static boolean LIZ(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        Locale locale = Locale.US;
        String lowerCase = str2.toLowerCase(locale);
        String lowerCase2 = str.toLowerCase(locale);
        if (lowerCase.equals(lowerCase2)) {
            if (!LIZIZ(0, lowerCase)) {
                try {
                    if (!LJLLL.matcher(lowerCase).matches()) {
                        if (LJLLLL.matcher(lowerCase).matches()) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return true;
        }
        if (!LIZIZ(0, lowerCase)) {
            return lowerCase2.equals(".local");
        }
        if (lowerCase2.length() == lowerCase.length() + 1 && lowerCase2.startsWith(".") && lowerCase2.endsWith(lowerCase) && LIZIZ(1, lowerCase2)) {
            return true;
        }
        if (lowerCase.length() <= lowerCase2.length() || !lowerCase.endsWith(lowerCase2)) {
            return false;
        }
        if ((!lowerCase2.startsWith(".") || !LIZIZ(1, lowerCase2)) && !lowerCase2.equals(".local")) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(int i, String str) {
        int indexOf = str.indexOf(46, i + 1);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(C61691OJb c61691OJb, java.net.URI uri) {
        String str = c61691OJb.LJLJLJ;
        if (str == null) {
            return true;
        }
        return Arrays.asList(str.split(",")).contains(Integer.toString(C61690OJa.getEffectivePort(uri.getScheme(), uri.getPort())));
    }
}
