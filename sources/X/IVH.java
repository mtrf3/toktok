package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.common.applog.AppLog;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes9.dex */
public class IVH implements InterfaceC46832IZo {
    @Override // X.InterfaceC46832IZo
    public void onEvent(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_recordMiscLog(EF7.LIZIZ(), "video_playq", JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    @Override // X.InterfaceC46832IZo
    public final void LIZ(String str, JSONArray jSONArray) {
        if (!TextUtils.isEmpty(str) && IXN.LIZJ.isEnablePlayerLogV2()) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    FMX.LJIILJJIL(str, JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }
}
