package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: X.QZs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67220QZs implements InterfaceC67221QZt {
    public static final String LIZJ;
    public static final java.util.Set<C67365QcD> LIZLLL;
    public static final C67220QZs LJ;
    public static final C67220QZs LJFF;
    public final String LIZ;
    public final String LIZIZ;

    static {
        String LJJ = C77117UOj.LJJ("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        LIZJ = LJJ;
        String LJJ2 = C77117UOj.LJJ("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String LJJ3 = C77117UOj.LJJ("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        LIZLLL = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C67365QcD("proto"), new C67365QcD("json"))));
        LJ = new C67220QZs(LJJ, null);
        LJFF = new C67220QZs(LJJ2, LJJ3);
    }

    public final byte[] LIZIZ() {
        String str = this.LIZIZ;
        if (str == null && this.LIZ == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.LIZ;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return C16880lQ.LLLZ("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public static C67220QZs LIZ(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C67220QZs(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public C67220QZs(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
