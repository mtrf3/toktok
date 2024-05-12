package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.DispatchQueue;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.09H, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C09H implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.LJLIL) {
            case 0:
                DispatchQueue.m50dispatchAndEnqueue$lambda2$lambda1((DispatchQueue) this.LJLILLLLZI, (Runnable) this.LJLJI);
                return;
            case 1:
                Throwable th = (Throwable) this.LJLILLLLZI;
                W5O w5o = (W5O) this.LJLJI;
                Context LIZLLL = C15380j0.LIZLLL();
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                if (!z) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errorDesc", th.toString());
                    jSONObject.put("url", w5o.LIZIZ);
                    jSONObject.put("userId", ((IHostUser) CN1.LIZ(IHostUser.class)).getCurUserId());
                    jSONObject.put("networkType", C16880lQ.LLJILJILJ(LIZLLL));
                    C0K2.LIZJ("hotsoon_image_load_log", "image_error", jSONObject);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
                if (interfaceC31203CMl != null) {
                    interfaceC31203CMl.LJII(1, jSONObject);
                }
                HashMap LIZ = C45243HpH.LIZ("url", w5o.LIZIZ.toString(), "error_msg", th.toString());
                if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar(O5Y.LJJL("ttlive_image_load_status"))) {
                    C0K2.LJIILJJIL(1, 0L, O5Y.LJJL("ttlive_image_load_status"), LIZ);
                }
                C0K2.LJIILJJIL(1, 0L, O5Y.LJJLI("ttlive_image_load_status"), LIZ);
                return;
            case 2:
                AnonymousClass745 anonymousClass745 = (AnonymousClass745) this.LJLILLLLZI;
                View view = (View) this.LJLJI;
                C181937Cb c181937Cb = anonymousClass745.LLILLIZIL;
                if (c181937Cb != null) {
                    C12460eI.LIZJ(view, c181937Cb);
                    C13930gf.LIZLLL(false);
                    return;
                }
                return;
            default:
                ((FeedRecommendFragment) this.LJLILLLLZI).Ql((Boolean) this.LJLJI);
                return;
        }
    }

    public /* synthetic */ C09H(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
