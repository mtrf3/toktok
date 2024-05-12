package X;

import android.text.TextUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.YMh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87255YMh extends YMW {
    public static final C87255YMh LIZ = new C87255YMh();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("like", "like_cancel", "favourite_video", "cancel_favourite_video", "click_comment_button", "follow", "follow_cancel", "search_result_show", "search_result_click", "tiktokec_stay_product_detail", "play_time", "shoot", "feed_enter");

    @Override // X.YMW
    public final void LIZ() {
        YMV.LIZIZ(C87251YMd.LJLIL);
    }

    public static void LIZIZ(EnumC87257YMj enumC87257YMj, java.util.Map map, JSONObject jSONObject) {
        String str;
        String LJIIIZ;
        String str2;
        String str3;
        String str4;
        String optString;
        String optString2;
        if (K3T.LIZ() == 0 && K3T.LIZIZ().searchSceneNum == 0) {
            return;
        }
        String str5 = null;
        if (((jSONObject == null || (str = jSONObject.optString("search_result_id")) == null) && (map == null || (str = (String) map.get("search_result_id")) == null)) || str.length() == 0) {
            return;
        }
        if ((jSONObject == null || (LJIIIZ = jSONObject.optString("token_type")) == null) && (map == null || (LJIIIZ = C87260YMm.LJIIIZ(map)) == null)) {
            return;
        }
        if (jSONObject == null || (str2 = jSONObject.optString("list_item_id")) == null) {
            if (map != null) {
                str2 = (String) map.get("list_item_id");
            } else {
                str2 = null;
            }
        }
        if (jSONObject == null || (str3 = C87260YMm.LIZIZ(jSONObject)) == null) {
            if (map != null) {
                str3 = C87260YMm.LIZ(map);
            } else {
                str3 = null;
            }
        }
        switch (YN1.LIZ[enumC87257YMj.ordinal()]) {
            case 1:
                if (jSONObject == null || (str4 = jSONObject.optString("search_duration_inner")) == null) {
                    if (map != null) {
                        str4 = (String) map.get("search_duration_inner");
                    } else {
                        str4 = null;
                    }
                }
                if (jSONObject == null || (optString = jSONObject.optString("search_duration_outer")) == null) {
                    if (map != null) {
                        str5 = (String) map.get("search_duration_outer");
                    }
                } else {
                    str5 = optString;
                }
                C87273YMz.LIZIZ(new YN5(32, enumC87257YMj, str, str2, LJIIIZ, str4, str5, null));
                return;
            case 2:
            case 3:
                C87273YMz.LIZIZ(new YN5(60, enumC87257YMj, str, str2, null, null, null, null));
                return;
            case 4:
            case 5:
                if (C78685UuP.LJJJZ(str2) && str2 != null) {
                    str3 = str2;
                }
                C87273YMz.LIZIZ(new YN5(60, enumC87257YMj, str, str3, null, null, null, null));
                return;
            case 6:
                if (TextUtils.isEmpty(LJIIIZ) || !((HashSet) C87260YMm.LIZ.getValue()).contains(LJIIIZ)) {
                    return;
                }
                C87273YMz.LIZIZ(new YN5(56, enumC87257YMj, str, str2, LJIIIZ, null, null, null));
                return;
            case 7:
                if (TextUtils.isEmpty(LJIIIZ) || !((HashSet) C87260YMm.LIZ.getValue()).contains(LJIIIZ)) {
                    return;
                }
                C87273YMz.LIZIZ(new YN5(58, enumC87257YMj, str, null, LJIIIZ, null, null, null));
                if (!C78685UuP.LJJJZ(str2)) {
                    return;
                }
                C87273YMz.LIZIZ(new YN5(56, enumC87257YMj, str, str2, LJIIIZ, null, null, null));
                return;
            case 8:
                if (jSONObject == null || (optString2 = jSONObject.optString("product_id")) == null) {
                    if (map != null) {
                        str5 = (String) map.get("product_id");
                    }
                } else {
                    str5 = optString2;
                }
                C87273YMz.LIZIZ(new YN5(26, enumC87257YMj, str, null, LJIIIZ, null, null, str5));
                return;
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                C87273YMz.LIZIZ(new YN5(56, enumC87257YMj, str, str2, LJIIIZ, null, null, null));
                return;
            default:
                return;
        }
    }
}
