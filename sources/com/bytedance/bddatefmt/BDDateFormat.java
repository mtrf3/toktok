package com.bytedance.bddatefmt;

import X.C00F;
import X.C16880lQ;
import X.C39399FdD;
import X.C39567Ffv;
import X.C86035Xpf;
import X.EnumC80568Vjg;
import defpackage.a1;
import defpackage.i0;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class BDDateFormat {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    static {
        new C86035Xpf();
    }

    private final native String nFormat(long j, String str, String str2);

    private final native String nFormatAbbr(int i, int i2, String str);

    private final native String nFormatRelative(int i, int i2, String str);

    public BDDateFormat() {
        this("");
    }

    public BDDateFormat(String str) {
        this.LIZ = str;
        C16880lQ.LLJJJIL("rex");
    }

    public static String LIZ(BDDateFormat bDDateFormat, Locale locale) {
        String str;
        o.LJIIIZ(locale, "locale");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (o.LJ(language, "zh") && (country == null || country.length() == 0)) {
            return i0.LJFF(language, "-Hans-CN");
        }
        bDDateFormat.getClass();
        String language2 = locale.getLanguage();
        C39399FdD.LIZIZ.getClass();
        String LIZIZ2 = C39567Ffv.LIZIZ(locale);
        if (o.LJ(language2, "zh")) {
            if (o.LJ(LIZIZ2, "TW") || o.LJ(LIZIZ2, "HK") || o.LJ(LIZIZ2, "MO")) {
                str = a1.LJ(language2, "-Hant-", LIZIZ2);
            } else if (o.LJ(LIZIZ2, "CN") || o.LJ(LIZIZ2, "SG")) {
                str = a1.LJ(language2, "-Hans-", LIZIZ2);
            }
            o.LJII(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }
        if (o.LJ(language2, "in")) {
            language2 = "id";
        } else if (o.LJ(language2, "iw")) {
            language2 = "he";
        }
        str = C00F.LIZIZ(language2, '-', LIZIZ2);
        o.LJII(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    public static /* synthetic */ String LIZJ(BDDateFormat bDDateFormat, long j) {
        Locale locale = Locale.getDefault();
        o.LJFF(locale, "Locale.getDefault()");
        return bDDateFormat.LIZIZ(j, locale);
    }

    public final synchronized String LIZIZ(long j, Locale locale) {
        o.LJIIJ(locale, "locale");
        return nFormat(j, LIZ(this, locale), this.LIZ);
    }

    public final String LIZLLL(int i, EnumC80568Vjg unit, Locale locale) {
        o.LJIIJ(unit, "unit");
        return nFormatAbbr(i, unit.ordinal(), LIZ(this, locale));
    }
}
