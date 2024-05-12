package X;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.common.util.NetworkUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Xow, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85990Xow {
    public static volatile List<String> LIZJ;
    public static final C85990Xow LIZ = new C85990Xow();
    public static volatile String LIZIZ = "";
    public static final List<String> LIZLLL = C47261Igj.LJJIJIL("JP", "HK", "ID", "MO", "TW", "KR", "VN", "TH", "PH", "MY", "SG", "KH", "LA", "MM", "CN");

    static {
        SettingsManager.LIZLLL().LJIIIZ(C85976Xoi.LJLIL);
        HashSet hashSet = new HashSet();
        hashSet.add("EG");
        hashSet.add("SD");
        hashSet.add("DZ");
        C19U.LJ(hashSet, "MA", "IQ", "SA", "YE");
        C19U.LJ(hashSet, "SY", "TD", "TN", "SO");
        C19U.LJ(hashSet, "LY", "JO", "ER", "AE");
        C19U.LJ(hashSet, "LB", "MR", "KW", "OM");
        C19U.LJ(hashSet, "QA", "DJ", "BH", "KM");
    }

    public static final String LIZ() {
        String str = X9V.LIZLLL;
        if (!TextUtils.isEmpty(str)) {
            o.LJI(str);
            String upperCase = str.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return upperCase;
        }
        if (!TextUtils.isEmpty(LIZIZ)) {
            return LIZIZ;
        }
        LIZ.getClass();
        LJIILL();
        return LIZIZ;
    }

    public static final String LJ() {
        String str;
        String str2 = X9V.LIZ;
        if (!TextUtils.isEmpty(str2)) {
            o.LJI(str2);
            String upperCase = str2.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return upperCase;
        }
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "phone");
            o.LJII(LLILL, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            C39405FdJ.LJFF.getClass();
            str = C39571Ffz.LJ((TelephonyManager) LLILL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            String upperCase2 = str.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return upperCase2;
        }
        return str;
    }

    public static final String LJFF() {
        String str = X9V.LIZIZ;
        if (!TextUtils.isEmpty(str)) {
            o.LJI(str);
            String upperCase = str.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return upperCase;
        }
        C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
        Locale locale = Resources.getSystem().getConfiguration().locale;
        o.LJIIIIZZ(locale, "getSystem().configuration.locale");
        c39567Ffv.getClass();
        return C39567Ffv.LIZIZ(locale);
    }

    public static boolean LJIIIIZZ() {
        return C47261Igj.LJJIJIL("AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IS", "IE", "IT", "LV", "LI", "LT", "LU", "MT", "NL", "NO", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "CH", "GB", "US").contains(LIZ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (((java.util.ArrayList) r0).size() <= 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIZ() {
        /*
            X.Xow r0 = X.C85990Xow.LIZ
            r0.getClass()
            java.util.List<java.lang.String> r0 = X.C85990Xow.LIZJ
            r1 = 1
            if (r0 == 0) goto L25
            java.util.List<java.lang.String> r0 = X.C85990Xow.LIZJ
            kotlin.jvm.internal.o.LJI(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 < r1) goto L25
            java.util.List<java.lang.String> r1 = X.C85990Xow.LIZJ
        L19:
            kotlin.jvm.internal.o.LJI(r1)
            java.lang.String r0 = LIZ()
            boolean r0 = r1.contains(r0)
            return r0
        L25:
            java.lang.Class<X.Xow> r4 = X.C85990Xow.class
            monitor-enter(r4)
            java.util.List<java.lang.String> r0 = X.C85990Xow.LIZJ     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto L39
            java.util.List<java.lang.String> r0 = X.C85990Xow.LIZJ     // Catch: java.lang.Throwable -> Lce
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> Lce
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lce
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lce
            if (r0 > 0) goto Lc9
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lce
            r0.<init>()     // Catch: java.lang.Throwable -> Lce
            X.C85990Xow.LIZJ = r0     // Catch: java.lang.Throwable -> Lce
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "tt_regions"
            java.lang.String r0 = ""
            r2.getClass()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = com.bytedance.ies.abmock.SettingsManager.LJI(r1, r0)     // Catch: java.lang.Throwable -> Lce
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 != 0) goto Lbe
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "tt_regions"
            java.lang.String r0 = ""
            r2.getClass()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = com.bytedance.ies.abmock.SettingsManager.LJI(r1, r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "getInstance().getStringV…okRegionList::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Throwable -> Lce
            X.OJD r1 = new X.OJD     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = ","
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lce
            r3 = 0
            java.util.List r2 = r1.split(r2, r3)     // Catch: java.lang.Throwable -> Lce
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lce
            if (r0 != 0) goto La1
            int r0 = r2.size()     // Catch: java.lang.Throwable -> Lce
            java.util.ListIterator r1 = r2.listIterator(r0)     // Catch: java.lang.Throwable -> Lce
        L83:
            boolean r0 = r1.hasPrevious()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto La1
            java.lang.Object r0 = r1.previous()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lce
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lce
            if (r0 != 0) goto L96
            goto L83
        L96:
            int r0 = r1.nextIndex()     // Catch: java.lang.Throwable -> Lce
            int r0 = r0 + 1
            java.util.List r1 = X.ORZ.LLILLL(r2, r0)     // Catch: java.lang.Throwable -> Lce
            goto La3
        La1:
            X.OQg r1 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> Lce
        La3:
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lce
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> Lce
            int r0 = r1.length     // Catch: java.lang.Throwable -> Lce
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> Lce
            java.util.List r1 = X.C47261Igj.LJJIJIIJI(r0)     // Catch: java.lang.Throwable -> Lce
            java.util.List<java.lang.String> r0 = X.C85990Xow.LIZJ     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lc9
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Lce
            r0.addAll(r1)     // Catch: java.lang.Throwable -> Lce
            goto Lc9
        Lbe:
            java.util.List<java.lang.String> r1 = X.C85990Xow.LIZJ     // Catch: java.lang.Throwable -> Lce
            if (r1 == 0) goto Lc9
            java.util.List<java.lang.String> r0 = X.C85990Xow.LIZLLL     // Catch: java.lang.Throwable -> Lce
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lce
            r1.addAll(r0)     // Catch: java.lang.Throwable -> Lce
        Lc9:
            monitor-exit(r4)
            java.util.List<java.lang.String> r1 = X.C85990Xow.LIZJ
            goto L19
        Lce:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85990Xow.LJIIIZ():boolean");
    }

    public static final boolean LJIIJ() {
        if (Locale.JAPAN.getCountry() != null) {
            C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
            Locale JAPAN = Locale.JAPAN;
            o.LJIIIIZZ(JAPAN, "JAPAN");
            c39567Ffv.getClass();
            if (ujb.o.LJJJJIZL(C39567Ffv.LIZIZ(JAPAN), LIZIZ(), true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIJJI() {
        if (Locale.KOREA.getCountry() != null) {
            C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
            Locale KOREA = Locale.KOREA;
            o.LJIIIIZZ(KOREA, "KOREA");
            c39567Ffv.getClass();
            if (ujb.o.LJJJJIZL(C39567Ffv.LIZIZ(KOREA), LIZIZ(), true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILIIL() {
        if (Locale.UK.getCountry() != null) {
            C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
            Locale UK = Locale.UK;
            o.LJIIIIZZ(UK, "UK");
            c39567Ffv.getClass();
            if (ujb.o.LJJJJIZL(C39567Ffv.LIZIZ(UK), LJ(), true) || ujb.o.LJJJJIZL(Locale.UK.getCountry(), LIZIZ(), true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILJJIL() {
        Locale locale = Locale.US;
        if (locale.getCountry() != null) {
            C39399FdD.LIZIZ.getClass();
            if (ujb.o.LJJJJIZL(C39567Ffv.LIZIZ(locale), LJ(), true) || ujb.o.LJJJJIZL(locale.getCountry(), LIZIZ(), true)) {
                return true;
            }
        }
        return false;
    }

    public static void LJIILL() {
        synchronized (C85990Xow.class) {
            if (TextUtils.isEmpty(LIZIZ)) {
                SettingsManager.LIZLLL().getClass();
                String LJI = SettingsManager.LJI("priority_region", "");
                o.LJIIIIZZ(LJI, "getInstance().getStringV…egionSetting::class.java)");
                LIZIZ = LJI;
            }
            if (TextUtils.isEmpty(LIZIZ)) {
                LIZ.getClass();
                LIZIZ = LIZLLL();
            }
        }
    }

    public static final String LIZIZ() {
        String LJ = LJ();
        if (TextUtils.isEmpty(LJ)) {
            LJ = LJFF();
            if (TextUtils.isEmpty(LJ)) {
                LJ = LIZJ();
            }
        }
        if (TextUtils.isEmpty(LJ)) {
            LJ = "";
        }
        String upperCase = LJ.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static final String LIZJ() {
        if (!TextUtils.isEmpty(C39392Fd6.LIZIZ("key_current_region", LJFF()))) {
            String LIZIZ2 = C39392Fd6.LIZIZ("key_current_region", LJFF());
            o.LJI(LIZIZ2);
            return LIZIZ2;
        }
        return LJFF();
    }

    public static String LIZLLL() {
        String LJ = LJ();
        if (TextUtils.isEmpty(LJ)) {
            String networkOperatorCode = NetworkUtils.getNetworkOperatorCode(EF7.LIZIZ());
            String str = X9V.LIZJ;
            if (!TextUtils.isEmpty(str)) {
                networkOperatorCode = str;
            }
            try {
                if (!TextUtils.isEmpty(networkOperatorCode) && !o.LJ(networkOperatorCode, "unkown")) {
                    o.LJI(networkOperatorCode);
                    if (networkOperatorCode.length() >= 3) {
                        java.util.Map<Integer, String> map = C86795Y4p.LIZ;
                        String substring = networkOperatorCode.substring(0, 3);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        LJ = String.valueOf(map.get(Integer.valueOf(CastIntegerProtector.parseInt(substring))));
                    }
                }
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (TextUtils.isEmpty(LJ)) {
                LJ = LJFF();
                if (TextUtils.isEmpty(LJ)) {
                    LJ = LIZJ();
                }
            }
        }
        if (TextUtils.isEmpty(LJ)) {
            LJ = "";
        }
        String upperCase = LJ.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static boolean LJIIL() {
        if (ujb.o.LJJJJIZL("RU", LJ(), true) || ujb.o.LJJJJIZL("RU", LIZIZ(), true)) {
            return true;
        }
        return false;
    }

    public static boolean LJI(Context context) {
        String str = "";
        if (context != null) {
            str = C39392Fd6.LIZ(context).getString("pref_language_key", "");
        }
        if (TextUtils.isEmpty(str)) {
            str = Locale.getDefault().getLanguage();
        }
        return o.LJ("ar", str);
    }

    public static boolean LJII(String code) {
        o.LJIIIZ(code, "code");
        if (TextUtils.isEmpty(code)) {
            return false;
        }
        List LJJIJIL = C47261Igj.LJJIJIL("AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB");
        String upperCase = code.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return LJJIJIL.contains(upperCase);
    }
}
