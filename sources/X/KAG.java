package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes9.dex */
public final class KAG {
    public static String LIZ(boolean z) {
        String str;
        if (z) {
            str = "ec_search_middle_feedback_products";
        } else {
            str = "ec_search_middle_feedback_words";
        }
        Keva repo = Keva.getRepo("ecommerce_search_repo");
        JSONArray jSONArray = new JSONArray();
        String[] stringArray = repo.getStringArray(str, new String[0]);
        o.LJIIIIZZ(stringArray, "repo.getStringArray(kevaKey, arrayOf())");
        for (String str2 : stringArray) {
            str2.toString();
            jSONArray.put(str2);
        }
        String encode = android.net.Uri.encode(jSONArray.toString());
        o.LJIIIIZZ(encode, "encode(feedbackJsonArray.toString())");
        return encode;
    }
}
