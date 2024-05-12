package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E6S {
    public static String LIZ(C38798FKo c38798FKo, String str) {
        if (c38798FKo != null && !TextUtils.isEmpty(c38798FKo.LIZ)) {
            try {
                JSONObject jSONObject = new JSONObject(c38798FKo.LIZ);
                if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("enable_feed_video_meta_json_opt", false)) {
                    return jSONObject.optString(str);
                }
                return JSONObjectProtectorUtils.getString(jSONObject, str);
            } catch (JSONException e) {
                if (!DV2.LIZ) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return null;
    }
}
