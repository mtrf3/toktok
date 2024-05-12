package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FIe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38736FIe implements InterfaceC61465OAj {
    public final IAwemeConfigCenterApi LIZ = AwemeConfigCenter.AwemeConfigCenterImpl.LIZIZ();

    @Override // X.InterfaceC61465OAj
    public final void LIZ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && this.LIZ.isInitialized()) {
            if (str.equals("geckosdk_update_aggr_stats")) {
                try {
                    jSONObject.put("idc", U49.LIZLLL);
                } catch (JSONException unused) {
                }
            }
            FD6.LIZ(new C38737FIf(str, jSONObject));
        }
    }
}
