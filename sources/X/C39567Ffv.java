package X;

import java.util.Locale;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Ffv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39567Ffv {
    public static String LIZIZ(Locale getCountryByPnS) {
        o.LJIIJ(getCountryByPnS, "$this$getCountryByPnS");
        if (C39569Ffx.LIZ) {
            return (String) C39568Ffw.LIZ(C39399FdD.LIZ, Integer.valueOf(getCountryByPnS.hashCode()), new AqS156S0100000_6(getCountryByPnS, 96));
        }
        try {
            String LIZ = LIZ(getCountryByPnS, C39568Ffw.LIZ);
            if (LIZ != null) {
                return LIZ;
            }
        } catch (Q0C unused) {
        }
        return "";
    }

    public static String LIZ(Locale getCountry, C78862UxG c78862UxG) {
        o.LJIIJ(getCountry, "$this$getCountry");
        OHW ohw = new OHW(c78862UxG, "locale_getCountry", new String[]{"country/carrier"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 0);
        C78929UyL.LIZIZ(ohw, "java/util/Locale", "getCountry()Ljava/lang/String;", null);
        return (String) C39207Fa7.LIZ(ohw, new AqS172S0100000_6(getCountry, 67));
    }
}
