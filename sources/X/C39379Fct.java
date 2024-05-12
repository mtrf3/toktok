package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Pair;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p83.a;

/* renamed from: X.Fct, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39379Fct implements InterfaceC39244Fai {
    public static final C39379Fct LIZ = new C39379Fct();

    @Override // X.InterfaceC39244Fai
    public final Pair<String, Boolean> LIZIZ() {
        String str;
        boolean z;
        try {
            C39252Faq c39252Faq = C39253Far.LIZJ;
            Context LIZIZ = EF7.LIZIZ();
            c39252Faq.getClass();
            a.C0043a LIZIZ2 = C39252Faq.LIZIZ(LIZIZ);
            if (LIZIZ2 != null) {
                str = LIZIZ2.LIZ;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (LIZIZ2 == null) {
                z = false;
            } else {
                z = LIZIZ2.LIZIZ;
            }
            return new Pair<>(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "AppLogSensitiveApiCallback_getGaid_error");
            return new Pair<>("", Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC39244Fai
    public final String getCountry() {
        C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        c39567Ffv.getClass();
        return C39567Ffv.LIZIZ(locale);
    }

    @Override // X.InterfaceC39244Fai
    public final String LIZ() {
        String networkOperatorName;
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "phone");
        o.LJII(LLILL, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) LLILL;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100920, "android/telephony/TelephonyManager", "getNetworkOperatorName", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "-1395998552110427390"));
        if (LIZJ.LIZ) {
            networkOperatorName = (String) LIZJ.LIZIZ;
        } else {
            networkOperatorName = telephonyManager.getNetworkOperatorName();
        }
        o.LJIIIIZZ(networkOperatorName, "telephonyManager.networkOperatorName");
        return networkOperatorName;
    }

    @Override // X.InterfaceC39244Fai
    public final String LIZJ() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "phone");
        o.LJII(LLILL, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        C39405FdJ.LJFF.getClass();
        return C39571Ffz.LJ((TelephonyManager) LLILL);
    }

    @Override // X.InterfaceC39244Fai
    public final String getNetworkOperator() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "phone");
        o.LJII(LLILL, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        C39405FdJ.LJFF.getClass();
        return C39571Ffz.LIZJ((TelephonyManager) LLILL);
    }
}
