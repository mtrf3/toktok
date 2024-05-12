package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.C0NB;
import X.C38131Exr;
import X.CN1;
import X.UGZ;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class OpenVideoFullScreenMethod extends AbstractC38123Exj<JSONObject, JSONObject> {
    @Override // X.AbstractC38123Exj
    public void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public void invoke(JSONObject params, C38131Exr context) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        JSONObject jSONObject = new JSONObject();
        int optInt = params.optInt("current_position");
        boolean optBoolean = params.optBoolean("is_mute");
        boolean optBoolean2 = params.optBoolean("is_pause");
        String videoUrl = params.optString("video_url");
        params.optString("from_page");
        boolean optBoolean3 = params.optBoolean("is_auto_play", true);
        int optInt2 = params.optInt("video_len");
        o.LJIIIIZZ(videoUrl, "videoUrl");
        if (videoUrl.length() == 0) {
            finishWithFailure();
        }
        try {
            IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
            if (iHostSubscription == null) {
                finishWithFailure();
            }
            iHostSubscription.gW(context.LIZ, videoUrl, optInt2, optBoolean3, optInt, optBoolean, optBoolean2, new UGZ());
        } catch (Exception e) {
            C0NB.LJI("openVideoFullScreenMethod", e);
        }
        jSONObject.put("code", 1);
        finishWithResult(jSONObject);
    }
}
