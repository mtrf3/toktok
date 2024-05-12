package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EJc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36212EJc implements QJ8 {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;

    @Override // X.QJ8
    public final void LIZ(boolean z) {
    }

    @Override // X.QJ8
    public final void LIZIZ(String did, String iid) {
        o.LJIIIZ(did, "did");
        o.LJIIIZ(iid, "iid");
    }

    @Override // X.QJ8
    public final void LIZJ(boolean z, boolean z2) {
        int i;
        int i2;
        String str;
        long j = this.LJLIL;
        boolean z3 = this.LJLILLLLZI;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", System.currentTimeMillis() - j);
            jSONObject.put("success", z);
            WeakReference<Activity> weakReference = C18140nS.LJLJJI;
            if (weakReference != null) {
                str = C16880lQ.LJLLJ(weakReference.getClass());
            } else {
                str = null;
            }
            jSONObject.put("pageName", str);
            jSONObject.put("btm", C12460eI.LJFF());
            jSONObject.put("is_cold_start_first_launch", z3);
            AppLogNewUtils.onEventV3("didCost", jSONObject);
        } catch (JSONException unused) {
        }
        if (this.LJLILLLLZI && !this.LJLJI.element) {
            long j2 = this.LJLIL;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("from_start_to_current_duration", System.currentTimeMillis() - j2);
                int i3 = 0;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("is_success", i);
                jSONObject2.put("btm", C12460eI.LJFF());
                jSONObject2.put("is_cold_start_first_launch", 1);
                if (!TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject2.put("is_did_ready", i2);
                jSONObject2.put("network_status", NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getNetworkStatus().ordinal());
                Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
                if (LIZIZ != null) {
                    i3 = LIZIZ.intValue();
                }
                jSONObject2.put("is_hybrid_ab_recv", i3);
                jSONObject2.put("is_hybrid_ab_api_rev", C36213EJd.LIZIZ);
                jSONObject2.put("is_in_nuj_process", C36213EJd.LIZJ);
                AppLogNewUtils.onEventV3("did_request_result", jSONObject2);
            } catch (JSONException unused2) {
            }
        }
        this.LJLJI.element = true;
        C36213EJd.LIZ = null;
    }

    public C36212EJc(long j, boolean z, C34K c34k) {
        this.LJLIL = j;
        this.LJLILLLLZI = z;
        this.LJLJI = c34k;
    }
}
