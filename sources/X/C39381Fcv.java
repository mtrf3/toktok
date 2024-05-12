package X;

import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountService;
import defpackage.i0;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Fcv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39381Fcv {
    public static final C39381Fcv LIZ = new C39381Fcv();

    public static String LIZIZ() {
        String str;
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "phone");
            o.LJII(LLILL, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            C39405FdJ.LJFF.getClass();
            str = C39571Ffz.LJ((TelephonyManager) LLILL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static C66516Q8q LIZ(String str) {
        C66516Q8q LIZJ;
        C66516Q8q LIZJ2;
        if (!TextUtils.isEmpty(str)) {
            String LIZJ3 = C31461Li.LIZJ("priority_region", "", "getInstance().getStringV…egionSetting::class.java)");
            Locale locale = Locale.ROOT;
            String upperCase = LIZJ3.toUpperCase(locale);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String storeRegion = AccountService.LJIJ().LJIILL();
            if (((Boolean) C87742Yc6.LIZIZ.getValue()).booleanValue()) {
                if (upperCase.length() == 0) {
                    return LIZJ(str, LIZIZ(), true);
                }
                return LIZJ(str, upperCase, true);
            }
            if (((Boolean) C87742Yc6.LIZJ.getValue()).booleanValue()) {
                o.LJIIIIZZ(storeRegion, "storeRegion");
                if (storeRegion.length() == 0) {
                    return LIZJ(str, LIZIZ(), true);
                }
                return LIZJ(str, storeRegion, false);
            }
            if (((Boolean) C87742Yc6.LIZLLL.getValue()).booleanValue()) {
                if (upperCase.length() == 0) {
                    LIZJ2 = LIZJ(str, LIZIZ(), true);
                } else {
                    LIZJ2 = LIZJ(str, upperCase, true);
                }
                if (LIZJ2 != null) {
                    return LIZJ2;
                }
                o.LJIIIIZZ(storeRegion, "storeRegion");
                if (storeRegion.length() == 0) {
                    return LIZJ2;
                }
                return LIZJ(str, storeRegion, true);
            }
            if (((Boolean) C87742Yc6.LJ.getValue()).booleanValue()) {
                o.LJIIIIZZ(storeRegion, "storeRegion");
                if (storeRegion.length() == 0) {
                    LIZJ = LIZJ(str, LIZIZ(), true);
                } else {
                    LIZJ = LIZJ(str, storeRegion, true);
                }
                if (LIZJ != null || upperCase.length() == 0) {
                    return LIZJ;
                }
                return LIZJ(str, upperCase, true);
            }
            if (!TextUtils.isEmpty(str)) {
                C66516Q8q LIZJ4 = LIZJ(str, LIZIZ(), true);
                if (LIZJ4 != null) {
                    return LIZJ4;
                }
                C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
                Locale locale2 = Resources.getSystem().getConfiguration().locale;
                o.LJIIIIZZ(locale2, "getSystem().configuration.locale");
                c39567Ffv.getClass();
                String upperCase2 = C39567Ffv.LIZIZ(locale2).toUpperCase(locale);
                o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return LIZJ(str, upperCase2, false);
            }
        }
        return null;
    }

    public static C66516Q8q LIZJ(String str, String str2, boolean z) {
        String str3;
        String LIZIZ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C66513Q8n.LIZJ().LJIIL(str, str2);
        } catch (Exception e) {
            if (e instanceof C63860P4m) {
                str3 = "NumberParseException";
            } else {
                str3 = "Exception";
            }
            if (e.getMessage() == null) {
                LIZIZ = i0.LJFF(str3, " Message is null");
            } else {
                StringBuilder LJFF = C72972SkS.LJFF(str3, ':');
                LJFF.append(e.getMessage());
                LIZIZ = X1D.LIZIZ(LJFF);
            }
            if (z) {
                C73802v2.LIZ(207, LIZIZ, str, str2, "", str2);
            } else {
                C73802v2.LIZ(207, LIZIZ, str, "", str2, str2);
            }
            return null;
        }
    }
}
