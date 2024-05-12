package X;

import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.ss.android.ugc.aweme.pitaya.PitayaBundleImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.aPF, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final /* synthetic */ class C93337aPF implements PTYSetupCallback {
    public final /* synthetic */ PitayaBundleImpl LJLIL;

    public /* synthetic */ C93337aPF(PitayaBundleImpl pitayaBundleImpl) {
        this.LJLIL = pitayaBundleImpl;
    }

    @Override // com.bytedance.pitaya.api.PTYSetupCallback
    public final void onResult(boolean z, PTYError pTYError) {
        PitayaBundleImpl pitayaBundleImpl = this.LJLIL;
        if (z) {
            pitayaBundleImpl.LIZIZ = true;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", currentTimeMillis - C56662Kg.LIZ().LJIIJ);
                jSONObject.put("timestamp", currentTimeMillis);
                FMX.LJIILJJIL("pitaya2_available", jSONObject);
                pitayaBundleImpl.LIZJ.put("err_info", "no bitmap input");
                return;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        pitayaBundleImpl.getClass();
    }
}
