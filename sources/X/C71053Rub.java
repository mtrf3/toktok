package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* renamed from: X.Rub, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71053Rub {
    public static PayRiskControlParam LIZ() {
        String str;
        String str2;
        JSONObject jSONObject = C82950Wh0.LIZ;
        if (jSONObject != null) {
            str = jSONObject.optString("device_fingerprint_id");
        } else {
            str = null;
        }
        JSONObject jSONObject2 = C82950Wh0.LIZ;
        if (jSONObject2 != null) {
            str2 = jSONObject2.optString("gp_device_fingerprint_id");
        } else {
            str2 = null;
        }
        return new PayRiskControlParam(null, null, null, null, null, null, null, null, null, null, null, str, str2, null, null, null, null, null, CardStruct.IStatusCode.DEFAULT, null, null, 1828863, null);
    }
}
