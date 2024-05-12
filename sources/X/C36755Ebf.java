package X;

import java.util.List;
import java.util.Locale;
import java.util.SortedMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ebf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36755Ebf {
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final SortedMap<String, String> LIZLLL;
    public final SortedMap<String, AbstractC36750Eba> LJ;
    public final SortedMap<String, AbstractC36750Eba> LJFF;
    public final long LJI;
    public final boolean LJII;
    public final java.util.Map<String, String> LJIIIIZZ;

    public C36755Ebf() {
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hashCode: ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append("url: ");
        C1DI.LIZIZ(LIZ, this.LIZ, ", ", "method: ");
        C1DI.LIZIZ(LIZ, this.LIZIZ, ", ", "expireTimeout: ");
        LIZ.append(this.LJI);
        return X1D.LIZIZ(LIZ);
    }

    public C36755Ebf(JSONObject jSONObject) {
        SortedMap<String, String> sortedMap;
        SortedMap<String, AbstractC36750Eba> sortedMap2;
        SortedMap<String, AbstractC36750Eba> sortedMap3;
        SortedMap<String, String> sortedMap4;
        String optString = jSONObject.optString("url");
        o.LJFF(optString, "obj.optString(\"url\")");
        String optString2 = jSONObject.optString("method", "GET");
        o.LJFF(optString2, "obj.optString(\"method\", \"GET\")");
        Locale locale = Locale.ROOT;
        o.LJFF(locale, "Locale.ROOT");
        String lowerCase = optString2.toLowerCase(locale);
        o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        JSONObject optJSONObject = jSONObject.optJSONObject("headers");
        if (optJSONObject != null) {
            sortedMap = C36748EbY.LIZLLL(optJSONObject);
        } else {
            sortedMap = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
        if (optJSONObject2 != null) {
            sortedMap2 = C36748EbY.LJ(optJSONObject2);
        } else {
            sortedMap2 = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
        if (optJSONObject3 != null) {
            sortedMap3 = C36748EbY.LJ(optJSONObject3);
        } else {
            sortedMap3 = null;
        }
        long optLong = jSONObject.optLong("expire", -1L) * 1000;
        optLong = optLong < 0 ? 30000L : optLong;
        boolean optBoolean = jSONObject.optBoolean("needCommonParams", false);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("extras");
        if (optJSONObject4 != null) {
            sortedMap4 = C36748EbY.LIZLLL(optJSONObject4);
        } else {
            sortedMap4 = null;
        }
        this.LIZ = optString;
        this.LIZIZ = lowerCase;
        this.LIZJ = null;
        this.LIZLLL = sortedMap;
        this.LJ = sortedMap2;
        this.LJFF = sortedMap3;
        this.LJI = optLong;
        this.LJII = optBoolean;
        this.LJIIIIZZ = sortedMap4;
    }
}
