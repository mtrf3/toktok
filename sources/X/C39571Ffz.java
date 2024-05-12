package X;

import android.telephony.TelephonyManager;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Ffz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39571Ffz {
    public static String LIZJ(TelephonyManager getNetworkOperatorByPnS) {
        o.LJIIJ(getNetworkOperatorByPnS, "$this$getNetworkOperatorByPnS");
        if (C39569Ffx.LIZJ) {
            return (String) C39568Ffw.LIZ(C39405FdJ.LIZJ, "TelephonyManager_getNetworkOperator", new AqS156S0100000_6(getNetworkOperatorByPnS, 92));
        }
        try {
            String LIZIZ = LIZIZ(getNetworkOperatorByPnS, C39568Ffw.LIZ);
            if (LIZIZ != null) {
                return LIZIZ;
            }
        } catch (Q0C unused) {
        }
        return "";
    }

    public static String LJ(TelephonyManager getSimCountryIsoByPnS) {
        o.LJIIJ(getSimCountryIsoByPnS, "$this$getSimCountryIsoByPnS");
        if (C39569Ffx.LIZJ) {
            return (String) C39568Ffw.LIZ(C39405FdJ.LIZJ, "TelephonyManager_getSimCountryIso", new AqS156S0100000_6(getSimCountryIsoByPnS, 93));
        }
        try {
            String LIZLLL = LIZLLL(getSimCountryIsoByPnS, C39568Ffw.LIZ);
            if (LIZLLL != null) {
                return LIZLLL;
            }
        } catch (Q0C unused) {
        }
        return "";
    }

    public static String LJI(TelephonyManager getSimOperatorByPnS) {
        o.LJIIJ(getSimOperatorByPnS, "$this$getSimOperatorByPnS");
        if (C39569Ffx.LIZJ) {
            return (String) C39568Ffw.LIZ(C39405FdJ.LIZJ, "TelephonyManager_getSimOperator", new AqS156S0100000_6(getSimOperatorByPnS, 94));
        }
        try {
            String LJFF = LJFF(getSimOperatorByPnS, C39568Ffw.LIZ);
            if (LJFF != null) {
                return LJFF;
            }
        } catch (Q0C unused) {
        }
        return "";
    }

    public static String LJIIIIZZ(TelephonyManager getSimOperatorNameByPnS) {
        o.LJIIJ(getSimOperatorNameByPnS, "$this$getSimOperatorNameByPnS");
        if (C39569Ffx.LIZJ) {
            return (String) C39568Ffw.LIZ(C39405FdJ.LIZJ, "TelephonyManager_getSimOperatorName", new AqS156S0100000_6(getSimOperatorNameByPnS, 95));
        }
        try {
            String LJII = LJII(getSimOperatorNameByPnS, C39568Ffw.LIZ);
            if (LJII != null) {
                return LJII;
            }
        } catch (Q0C unused) {
        }
        return "";
    }

    public static String LIZIZ(TelephonyManager getNetworkOperator, C78862UxG c78862UxG) {
        o.LJIIJ(getNetworkOperator, "$this$getNetworkOperator");
        OHW LIZ = LIZ(100919, c78862UxG, "TelephonyManager_getNetworkOperator");
        C78929UyL.LIZIZ(LIZ, "android/telephony/TelephonyManager", "getNetworkOperator()Ljava/lang/String;", null);
        return (String) C39207Fa7.LIZ(LIZ, new AqS172S0100000_6(getNetworkOperator, 63));
    }

    public static String LIZLLL(TelephonyManager getSimCountryIso, C78862UxG c78862UxG) {
        o.LJIIJ(getSimCountryIso, "$this$getSimCountryIso");
        OHW LIZ = LIZ(100922, c78862UxG, "TelephonyManager_getSimCountryIso");
        C78929UyL.LIZIZ(LIZ, "android/telephony/TelephonyManager", "getSimCountryIso()Ljava/lang/String;", null);
        return (String) C39207Fa7.LIZ(LIZ, new AqS172S0100000_6(getSimCountryIso, 64));
    }

    public static String LJFF(TelephonyManager getSimOperator, C78862UxG c78862UxG) {
        o.LJIIJ(getSimOperator, "$this$getSimOperator");
        OHW LIZ = LIZ(100917, c78862UxG, "TelephonyManager_getSimOperator");
        C78929UyL.LIZIZ(LIZ, "android/telephony/TelephonyManager", "getSimOperator()Ljava/lang/String;", null);
        return (String) C39207Fa7.LIZ(LIZ, new AqS172S0100000_6(getSimOperator, 65));
    }

    public static String LJII(TelephonyManager getSimOperatorName, C78862UxG c78862UxG) {
        o.LJIIJ(getSimOperatorName, "$this$getSimOperatorName");
        OHW LIZ = LIZ(100918, c78862UxG, "TelephonyManager_getSimOperatorName");
        C78929UyL.LIZIZ(LIZ, "android/telephony/TelephonyManager", "getSimOperatorName()Ljava/lang/String;", null);
        return (String) C39207Fa7.LIZ(LIZ, new AqS172S0100000_6(getSimOperatorName, 66));
    }

    public static OHW LIZ(int i, C78862UxG c78862UxG, String str) {
        return new OHW(c78862UxG, str, new String[]{"country/carrier"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", i);
    }
}
