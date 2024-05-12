package X;

import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.STw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72164STw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC72154STm key, EnumC72156STo status, Long l, String str, String str2, String str3, int i) {
        JSONObject jSONObject = null;
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        o.LJIIIZ(key, "key");
        o.LJIIIZ(status, "status");
        C188727au c188727au = new C188727au();
        String name = key.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c188727au.LJI("key", lowerCase);
        c188727au.LJI("aigc_type", str);
        c188727au.LJFF(l, "duration");
        c188727au.LJI("error_code", str2);
        c188727au.LIZLLL(status.getValue(), "status");
        if (str3 != null) {
            c188727au.LJI("error_desc", str3);
        }
        FMX.LJIIL("aigc_performance", c188727au.LIZ);
        try {
            JSONObject jSONObject2 = new JSONObject();
            String lowerCase2 = key.name().toLowerCase(locale);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put("key", lowerCase2);
            jSONObject2.put("aigc_type", str);
            jSONObject2.put("duration", l);
            jSONObject2.put("error_code", str2);
            if (str3 != null) {
                jSONObject2.put("error_desc", str3);
            }
            jSONObject = jSONObject2;
        } catch (NullPointerException unused) {
            if (0 == 0) {
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[AIGCPerformance] - aweme_aigc_performance extra : ");
        LIZ2.append(jSONObject);
        LIZ2.append(" status: ");
        LIZ2.append(status.name());
        H78.LJI(X1D.LIZIZ(LIZ2));
        C43882HKc.LIZLLL(status.getValue(), "aweme_aigc_performance", jSONObject, true);
    }
}
