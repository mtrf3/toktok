package Y;

import X.AbstractC60548NpY;
import X.C07780Sg;
import X.C141335gf;
import X.C16880lQ;
import X.C36779Ec3;
import X.C36780Ec4;
import X.C36922EeM;
import X.C38150EyA;
import X.C38218EzG;
import X.C38333F2r;
import X.C3C4;
import X.C3C5;
import X.C54251LQx;
import X.C58452Rd;
import X.C5UN;
import X.C64797Pbt;
import X.C64923Pdv;
import X.C76800UCe;
import X.C79605VMb;
import X.EJ6;
import X.F1E;
import X.F1F;
import X.F3T;
import X.InterfaceC37276Ek4;
import X.ORZ;
import android.widget.Toast;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule;
import com.tiktok.zero.rating.manager.ZeroRatingApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS33S1100000_6 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS33S1100000_6 aCallableS33S1100000_6) {
        AbstractC60548NpY abstractC60548NpY;
        String str;
        try {
            F3T f3t = ((LynxBridgeModule) aCallableS33S1100000_6.l1).providerFactory;
            String str2 = null;
            if (f3t != null) {
                abstractC60548NpY = (AbstractC60548NpY) f3t.LIZJ(AbstractC60548NpY.class);
            } else {
                abstractC60548NpY = null;
            }
            C79605VMb c79605VMb = new C79605VMb("bdx_monitor_bridge_pv");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method_name", aCallableS33S1100000_6.s0);
            if (abstractC60548NpY != null) {
                str2 = abstractC60548NpY.LIZ();
            }
            jSONObject.put("_full_url", str2);
            c79605VMb.LIZLLL = jSONObject;
            c79605VMb.LIZIZ(1);
            if (abstractC60548NpY == null || (str = abstractC60548NpY.LIZIZ()) == null) {
                str = "Unknown";
            }
            c79605VMb.LIZ = str;
            c79605VMb.LJIIL = new C38218EzG();
            HybridMultiMonitor.getInstance().customReport(c79605VMb.LIZ());
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            return c76800UCe;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            return LIZ;
        }
    }

    public static final Object call$1(ACallableS33S1100000_6 aCallableS33S1100000_6) {
        C16880lQ.LLZILL(Toast.makeText(((C38150EyA) aCallableS33S1100000_6.l1).LIZ.getContext(), aCallableS33S1100000_6.s0, 1));
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS33S1100000_6 aCallableS33S1100000_6) {
        String str;
        HashMap<Integer, Integer> mergeMap = ((C54251LQx) aCallableS33S1100000_6.l1).LJLJJI;
        if (mergeMap == null || mergeMap.isEmpty()) {
            str = "is empty";
        } else {
            o.LJIIIIZZ(mergeMap, "mergeMap");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Integer> entry : mergeMap.entrySet()) {
                Integer value = entry.getValue();
                o.LJIIIIZZ(value, "it.value");
                if (value.intValue() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            str = ORZ.LLD(C5UN.LJJLJLI(linkedHashMap), ", ", "{", "}", C58452Rd.LJLIL, 24);
        }
        StringBuilder LIZIZ = C07780Sg.LIZIZ("Get notificationIndicator\r\nmergeMap ", str, "\r\ngroup = ");
        LIZIZ.append(((C54251LQx) aCallableS33S1100000_6.l1).LJLIL);
        LIZIZ.append("\r\ncount = ");
        LIZIZ.append(((C54251LQx) aCallableS33S1100000_6.l1).LJLILLLLZI);
        C36922EeM.LIZLLL(4, aCallableS33S1100000_6.s0, LIZIZ.toString());
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS33S1100000_6 aCallableS33S1100000_6) {
        InterfaceC37276Ek4<ZeroRatingApi.CarrierCommonResponse> bindingMsisdn;
        C64797Pbt<ZeroRatingApi.CarrierCommonResponse> execute;
        ZeroRatingApi zeroRatingApi = ZeroRatingApi.LIZLLL;
        String mccMnc = aCallableS33S1100000_6.s0;
        ZeroRatingApi.FetchMsisdnResponse fetchMsisdnResponse = (ZeroRatingApi.FetchMsisdnResponse) aCallableS33S1100000_6.l1;
        String str = fetchMsisdnResponse.encryptedMsisdn;
        String str2 = fetchMsisdnResponse.maskedMsisdn;
        zeroRatingApi.getClass();
        o.LJIIJ(mccMnc, "mccMnc");
        ZeroRatingApi.MsisdnBindingApi msisdnBindingApi = (ZeroRatingApi.MsisdnBindingApi) ZeroRatingApi.LIZJ.getValue();
        if (msisdnBindingApi == null || (bindingMsisdn = msisdnBindingApi.bindingMsisdn(mccMnc, str, str2)) == null || (execute = bindingMsisdn.execute()) == null) {
            return null;
        }
        return execute.LIZIZ;
    }

    public static final Object call$4(ACallableS33S1100000_6 aCallableS33S1100000_6) {
        String LIZLLL = C36780Ec4.LIZLLL(aCallableS33S1100000_6.s0);
        F1F f1f = new F1F("get", C36780Ec4.LIZLLL(aCallableS33S1100000_6.s0), null);
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) aCallableS33S1100000_6.l1).entrySet()) {
                arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
            }
            String str = C36780Ec4.LJLILLLLZI.doGet(LIZLLL, (Map<String, String>) null, arrayList).execute().LIZIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("_raw", str);
            jSONObject.put("response", new JSONObject(str));
            return new C36779Ec3(f1f, new F1E(null, jSONObject));
        } catch (C38333F2r e) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("_raw", e.getResponse());
            } catch (JSONException unused) {
            }
            int errorCode = e.getErrorCode();
            String errorMsg = e.getErrorMsg();
            String prompt = e.getPrompt();
            o.LJIIIIZZ(prompt, "apiReturnWrong.prompt");
            C36780Ec4.LJFF(jSONObject2, errorCode, errorMsg, prompt);
            return new C36779Ec3(f1f, new F1E(e, jSONObject2));
        } catch (C64923Pdv e2) {
            JSONObject jSONObject3 = new JSONObject();
            C36780Ec4.LJFF(jSONObject3, e2.getStatusCode(), e2.getMessage(), "");
            return new C36779Ec3(f1f, new F1E(e2, jSONObject3));
        } catch (Exception e3) {
            JSONObject jSONObject4 = new JSONObject();
            C36780Ec4.LJFF(jSONObject4, -408, e3.getMessage(), "");
            return new C36779Ec3(f1f, new F1E(e3, jSONObject4));
        }
    }

    public ACallableS33S1100000_6(C54251LQx c54251LQx, int i) {
        this.$t = i;
        this.l1 = c54251LQx;
        this.s0 = "MainPageFragment";
    }

    public ACallableS33S1100000_6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
