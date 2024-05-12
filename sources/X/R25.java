package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.videoarch.strategy.LiveStrategyManager;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R25 implements InterfaceC28605BKn {
    public static boolean LIZ;

    @Override // X.InterfaceC28605BKn
    public final void LIZ() {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        String str5;
        try {
            if (!C21090sD.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context())) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (!LIZ) {
            if (CN1.LIZ(IHostAppContext.class) != null && !((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                str = "https://hotapi-sg.tiktokv.com";
            } else {
                str = "https://hotapi-va.tiktokv.com";
            }
            C63990P9m c63990P9m = new C63990P9m();
            c63990P9m.LIZ = str;
            c63990P9m.LIZIZ = new R23();
            PMX.LIZIZ().LIZ(new C63989P9l(c63990P9m));
            JSONObject jSONObject = new JSONObject();
            try {
                IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                Integer num2 = null;
                if (iHostAppContext != null) {
                    str2 = iHostAppContext.getServerDeviceId();
                } else {
                    str2 = null;
                }
                jSONObject.put("device_id", str2);
                jSONObject.put("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                IHostAppContext iHostAppContext2 = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext2 != null) {
                    str3 = iHostAppContext2.getChannel();
                } else {
                    str3 = null;
                }
                jSONObject.put("channel", str3);
                IHostAppContext iHostAppContext3 = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext3 != null) {
                    num = Integer.valueOf(iHostAppContext3.appId());
                } else {
                    num = null;
                }
                jSONObject.put("host_aid", num);
                IHostAppContext iHostAppContext4 = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext4 != null) {
                    str4 = iHostAppContext4.getSessionId();
                } else {
                    str4 = null;
                }
                jSONObject.put("app_session_id", str4);
                IHostAppContext iHostAppContext5 = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext5 != null) {
                    str5 = iHostAppContext5.getVersionName();
                } else {
                    str5 = null;
                }
                jSONObject.put("app_version", str5);
                IHostAppContext iHostAppContext6 = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
                if (iHostAppContext6 != null) {
                    num2 = Integer.valueOf(iHostAppContext6.getUpdateVersionCode());
                }
                jSONObject.put("update_version_code", String.valueOf(num2));
            } catch (Exception e) {
                C0NB.LJII(e);
            }
            LiveStrategyManager.inst().init(C16880lQ.LLLLL(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), jSONObject);
            LiveStrategyManager.inst().setAppInfoBundle(new R28());
            LiveStrategyManager.inst().setFunctionStartPTYInit(new R26());
            try {
                LiveStrategyManager.inst().start();
            } catch (Exception e2) {
                C0NB.LJII(e2);
            }
            LIZ = true;
        }
    }
}
