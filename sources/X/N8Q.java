package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N8Q extends QQE<C68922R3e> {
    public final /* synthetic */ String LIZ;

    public N8Q(String str) {
        this.LIZ = str;
    }

    @Override // X.QQE
    public final void onResponse(C68922R3e c68922R3e) {
        boolean z;
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        JSONArray names;
        String str3;
        C68922R3e c68922R3e2 = c68922R3e;
        if (c68922R3e2 != null && c68922R3e2.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            NAW.LIZ.put(this.LIZ, Boolean.TRUE);
            JSONObject jSONObject2 = c68922R3e2.LJIILJJIL;
            if (jSONObject2 != null) {
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("3");
                if (optJSONObject2 != null) {
                    str3 = optJSONObject2.toString();
                } else {
                    str3 = null;
                }
                NAW.LJIILIIL(str3);
                jSONObject2.toString();
            }
        }
        HashMap hashMap = new HashMap();
        String str4 = "";
        if (c68922R3e2 == null || (jSONObject = c68922R3e2.LJIILJJIL) == null || (optJSONObject = jSONObject.optJSONObject("3")) == null || (names = optJSONObject.names()) == null || (str = names.toString()) == null) {
            str = "";
        }
        hashMap.put("autofill_fields", str);
        if (c68922R3e2 != null && c68922R3e2.LIZIZ) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_success", str2);
        hashMap.put("scenario", "2");
        if (c68922R3e2 != null) {
            if (c68922R3e2.LIZIZ) {
                str4 = "-1";
            } else {
                String num = Integer.valueOf(c68922R3e2.LIZLLL).toString();
                if (num != null) {
                    str4 = num;
                }
            }
        }
        hashMap.put("error_code", str4);
        FMX.LJIIL("autofill_info_acquire", hashMap);
    }
}
