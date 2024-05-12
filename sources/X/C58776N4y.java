package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.N4y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58776N4y {
    public static void LIZ(String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        JSONObject jSONObject2;
        String valueOf;
        long longValue;
        JSONObject jSONObject3;
        String str3 = str;
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            if (TextUtils.equals(str3, "background_ad")) {
                str3 = "background_ads";
            } else {
                str3 = "topic_ads";
            }
        }
        if (TextUtils.equals("click", str2)) {
            NN2.LIZLLL(awemeRawAd);
        }
        if (TextUtils.equals(str3, "background_ad") && (TextUtils.equals(str2, "click") || TextUtils.equals(str2, "othershow") || TextUtils.equals(str2, "replay"))) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString)) {
                    jSONObject3 = new JSONObject();
                } else {
                    jSONObject3 = new JSONObject(optString);
                }
                jSONObject3.put("is_lynx", 0);
                jSONObject.put("ad_extra_data", jSONObject3.toString());
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        if (C78977Uz7.LJJJLIIL(awemeRawAd)) {
            try {
                String optString2 = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString2)) {
                    jSONObject2 = new JSONObject();
                } else {
                    jSONObject2 = new JSONObject(optString2);
                }
                jSONObject2.put("anchor_id", awemeRawAd.getSplashInfo().anchorId);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException e2) {
                C78983UzD.LJIIZILJ(e2);
            }
        }
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            valueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            valueOf = String.valueOf(creativeId);
        }
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            longValue = 0;
        } else {
            longValue = groupId.longValue();
        }
        C58657N0j.LIZ(longValue, str3, str2, valueOf, jSONObject);
    }
}
