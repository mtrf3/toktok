package Y;

import X.C16880lQ;
import X.C37886Etu;
import X.C37960Ev6;
import X.C38048EwW;
import X.C38049EwX;
import X.EVN;
import X.EVO;
import X.EVR;
import X.InterfaceC36130EFy;
import X.InterfaceC38012Evw;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.liko.leakdetector.LeakDetectorInstaller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class IDHandlerS19S0100000_6 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS19S0100000_6 iDHandlerS19S0100000_6, Message message) {
        Map<String, InterfaceC38012Evw> map;
        String str;
        int i;
        Object obj = message.obj;
        if (obj instanceof C38048EwW) {
            C38049EwX c38049EwX = (C38049EwX) iDHandlerS19S0100000_6.l0;
            C38048EwW c38048EwW = (C38048EwW) obj;
            WebView webView = c38049EwX.LIZ;
            if (webView == null || c38048EwW == null || !TextUtils.equals("call", c38048EwW.LIZ) || (map = c38049EwX.LJFF) == null || ((HashMap) map).isEmpty()) {
                return;
            }
            C37960Ev6 c37960Ev6 = new C37960Ev6();
            String url = webView.getUrl();
            String str2 = c38048EwW.LJIIIIZZ;
            if (str2 == null || str2.length() == 0) {
                if (C37886Etu.LIZJ(c37960Ev6, url, webView)) {
                    str = webView.getUrl();
                    i = 1;
                } else {
                    str = "about://blank";
                    i = 2;
                }
            } else {
                str = C37886Etu.LIZ(webView, c38048EwW.LJIIIIZZ);
                i = 0;
            }
            c37960Ev6.LJIJ = webView;
            c37960Ev6.LJII = c38048EwW.LIZJ;
            c37960Ev6.LJIILL = "IESJSBridge";
            c37960Ev6.LJIIJ = c38048EwW.LJIIIIZZ;
            c37960Ev6.LJIIJJI = Integer.valueOf(i);
            c37960Ev6.LJIIIIZZ = webView.getUrl();
            c37960Ev6.LJIJJ = c38048EwW.LJI;
            c37960Ev6.LIZ();
            if (!c38049EwX.LJII && !c38049EwX.LJFF(str)) {
                String str3 = c38048EwW.LIZJ;
                List<String> list = c38049EwX.LIZLLL;
                if (list == null || !list.contains(str3)) {
                    String str4 = c38048EwW.LIZJ;
                    List<String> list2 = c38049EwX.LJ;
                    if (list2 == null || !list2.contains(str4)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", -1);
                            c38049EwX.LJII(c38048EwW, jSONObject);
                            if (!TextUtils.isEmpty(c38048EwW.LJI)) {
                                c38049EwX.LJ(c38048EwW.LJI, c38048EwW.LIZIZ, jSONObject);
                                c37960Ev6.LJIIIZ = c38048EwW.LJI;
                            } else {
                                c38049EwX.LIZLLL(c38048EwW.LIZIZ, jSONObject);
                                c37960Ev6.LJIIIZ = str;
                            }
                            c37960Ev6.LIZIZ(0, "jsb_auth_error_event", null);
                            return;
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                InterfaceC38012Evw interfaceC38012Evw = (InterfaceC38012Evw) ((HashMap) c38049EwX.LJFF).get(c38048EwW.LIZJ);
                if (interfaceC38012Evw != null) {
                    interfaceC38012Evw.call(c38048EwW, jSONObject2);
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
            c38049EwX.LJII(c38048EwW, jSONObject2);
            if (!c38048EwW.LJIIJ) {
                return;
            }
            if (!TextUtils.isEmpty(c38048EwW.LJI)) {
                c38049EwX.LJ(c38048EwW.LJI, c38048EwW.LIZIZ, jSONObject2);
            } else {
                c38049EwX.LIZLLL(c38048EwW.LIZIZ, jSONObject2);
            }
        }
    }

    public static final void handleMessage$1(IDHandlerS19S0100000_6 iDHandlerS19S0100000_6, Message message) {
        LeakDetectorInstaller leakDetectorInstaller = LeakDetectorInstaller.INSTANCE;
        if (leakDetectorInstaller.getTrySumTime() > 100000) {
            leakDetectorInstaller.setTrySumTime(0L);
        } else {
            leakDetectorInstaller.initConfig((Context) iDHandlerS19S0100000_6.l0);
        }
    }

    public static final void handleMessage$2(IDHandlerS19S0100000_6 iDHandlerS19S0100000_6, Message message) {
        LeakDetectorInstaller.INSTANCE.tryInstall((Context) iDHandlerS19S0100000_6.l0);
    }

    public static final void handleMessage$3(IDHandlerS19S0100000_6 iDHandlerS19S0100000_6, Message message) {
        InterfaceC36130EFy interfaceC36130EFy = ((EVN) iDHandlerS19S0100000_6.l0).LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handlemsg -> ");
        LIZ.append(message);
        X1D.LIZIZ(LIZ);
        interfaceC36130EFy.LIZ();
        int i = message.what;
        if (i == EVO.START.LJLIL) {
            EVN evn = (EVN) iDHandlerS19S0100000_6.l0;
            InterfaceC36130EFy interfaceC36130EFy2 = evn.LJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("real start with status = ");
            LIZ2.append(evn.LIZJ.name());
            X1D.LIZIZ(LIZ2);
            interfaceC36130EFy2.LIZ();
            evn.LJFF.removeMessages(EVO.FORCE_STOP.LJLIL);
            evn.LJFF.removeMessages(EVO.STOP.LJLIL);
            if (evn.LIZJ == EVR.STOPPED) {
                try {
                    SystemClock.elapsedRealtime();
                    JatoXL.tryCpuBoost(evn.LIZIZ);
                    JatoXL.tryGpuBoost(evn.LIZIZ);
                    JatoXL.startBlockGc(C16880lQ.LJLLILLLL(EVN.class));
                    JatoXL.boostRenderThread(evn.LIZ, -20);
                    evn.LIZJ = EVR.RUNNNING;
                    evn.LJI.LIZ();
                    return;
                } catch (Throwable unused) {
                    evn.LJI.LIZIZ();
                    return;
                }
            }
            return;
        }
        if (i == EVO.STOP.LJLIL || i == EVO.FORCE_STOP.LJLIL) {
            EVN evn2 = (EVN) iDHandlerS19S0100000_6.l0;
            InterfaceC36130EFy interfaceC36130EFy3 = evn2.LJI;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("real stop with status = ");
            LIZ3.append(evn2.LIZJ.name());
            X1D.LIZIZ(LIZ3);
            interfaceC36130EFy3.LIZ();
            if (evn2.LIZJ == EVR.RUNNNING) {
                try {
                    JatoXL.releaseBoost();
                    JatoXL.stopBlockGc(C16880lQ.LJLLILLLL(EVN.class));
                    JatoXL.boostRenderThread(evn2.LIZ, 19);
                    evn2.LJI.LIZ();
                } catch (Throwable unused2) {
                    evn2.LJI.LIZIZ();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS19S0100000_6(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
