package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nyt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61127Nyt {
    public static boolean LIZ(Aweme aweme) {
        String str;
        String optString;
        String optString2;
        if (aweme == null) {
            return false;
        }
        try {
            CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
            if (cardInsertInfo == null || (str = cardInsertInfo.getCardInsertStatus()) == null) {
                str = "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("schema") && (optString = jSONObject.optString("schema")) != null && optString.length() != 0 && !jSONObject.isNull("content_data") && (optString2 = jSONObject.optString("content_data")) != null) {
                if (optString2.length() != 0) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        CardInsertInfo cardInsertInfo;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 5) {
            return true;
        }
        return false;
    }

    public static void LIZJ(Aweme aweme, SparkContext sparkContext) {
        String str;
        CardInsertInfo cardInsertInfo;
        String str2;
        CardInsertInfo cardInsertInfo2;
        String str3 = "";
        C61125Nyr.LIZLLL = System.currentTimeMillis();
        FMX.onEventV3("disney100_card_spark_load");
        C36922EeM.LIZLLL(2, "disney100", "disney100_card_spark_load");
        String str4 = null;
        try {
            if (aweme != null && (cardInsertInfo2 = aweme.getCardInsertInfo()) != null) {
                str2 = cardInsertInfo2.getCardInsertStatus();
            } else {
                str2 = null;
            }
            str = new JSONObject(str2).optString("schema");
            o.LJIIIIZZ(str, "JSONObject(aweme?.cardIn…atus).optString(\"schema\")");
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            str = "";
        }
        try {
            if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
                str4 = cardInsertInfo.getCardInsertStatus();
            }
            String optString = new JSONObject(str4).optString("content_data");
            o.LJIIIIZZ(optString, "JSONObject(aweme?.cardIn…optString(\"content_data\")");
            str3 = optString;
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        sparkContext.LJJIJLIJ(str);
        sparkContext.LJII(Aweme.class, aweme);
        if (str3.length() != 0) {
            sparkContext.LJJ(new C61126Nys(str3));
        }
        sparkContext.LJIL(new C61078Ny6(aweme));
    }
}
