package X;

import android.text.TextUtils;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.Ip3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47777Ip3 implements InterfaceC47869IqX {
    public final WeakReference<TTVideoEngineImpl> LIZ;

    @Override // X.InterfaceC47869IqX
    public final void onCancelled() {
        C78253UnR.LJI("TTVideoEngine", "dns cancelled");
    }

    public C47777Ip3(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }

    @Override // X.InterfaceC47869IqX
    public final void LIZ(C47789IpF c47789IpF) {
        if (c47789IpF != null) {
            return;
        }
        X1D.LIZ().append("fetcher should retry, error:");
        throw new NullPointerException("toString");
    }

    @Override // X.InterfaceC47869IqX
    public final void LIZIZ(JSONObject jSONObject, C47789IpF c47789IpF) {
        String str;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            return;
        }
        if (tTVideoEngineImpl.LJJIIZ) {
            TTVideoEngineLog.w("TTVideoEngine", "MyDNSCompletionListener should stop");
            return;
        }
        if (c47789IpF != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dns failed:");
            LIZ.append(c47789IpF.toString());
            C78253UnR.LIZLLL("TTVideoEngine", X1D.LIZIZ(LIZ));
            tTVideoEngineImpl.LLLIIIIL(c47789IpF);
            return;
        }
        if (jSONObject != null) {
            str = jSONObject.optString(C63832P3k.LIZ);
            long optLong = jSONObject.optLong("time");
            String optString = jSONObject.optString("dns_type");
            C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
            if (c47750Ioc != null) {
                C47751Iod c47751Iod = c47750Ioc.LIZIZ;
                if (c47751Iod != null) {
                    c47751Iod.LLJILJILJ = optLong;
                    if (c47750Ioc.LJIIJJI && c47751Iod.LLLFFI == 0) {
                        c47750Ioc.LJIIIZ(-1005, true);
                    }
                }
                tTVideoEngineImpl.e.LJJJJIZL(86, optString);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            tTVideoEngineImpl.LLLIIIIL(new C47789IpF("", -9997, 0, "DNS result empty"));
            C78253UnR.LIZLLL("TTVideoEngine", "dns parse empty");
        } else if (tTVideoEngineImpl.b5.LIZ(false)) {
            tTVideoEngineImpl.b5.LIZLLL(300, 0, 0, str);
        } else {
            tTVideoEngineImpl.LJJIZ(str);
        }
    }
}
