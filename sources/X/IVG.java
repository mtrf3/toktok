package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class IVG implements InterfaceC46832IZo {
    @Override // X.InterfaceC46832IZo
    public void onEvent(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (C46982IcE.LIZIZ().isDebug() || IUB.LIZIZ().playEventLogEnabled()) {
                        IUA.LIZ.LIZ().recordMiscLog(C46982IcE.LIZ, "video_playq", JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                    }
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
                    C46982IcE.LIZJ().onEvent(str, JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }
}
