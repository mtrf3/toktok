package X;

import Y.ARunnableS50S0100000_14;
import android.os.Handler;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.dataCenter.config.model.settingsmodel.LSStrategySDKSettings;
import com.ss.videoarch.strategy.strategy.networkStrategy.NetworkProber;
import com.ss.videoarch.strategy.strategy.networkStrategy.SettingsManager;
import com.ss.videoarch.strategy.strategy.smartStrategy.TopNHostStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79346VCc {
    public static volatile C79346VCc LJJJJJ;
    public JSONObject LIZ;
    public JSONObject LIZIZ;
    public JSONArray LIZJ;
    public String LIZLLL;
    public JSONObject LJ;
    public final java.util.Map<String, Integer> LJFF = new HashMap();
    public final java.util.Map<String, Object> LJI = new HashMap();
    public final java.util.Map<String, Object> LJII = new HashMap();
    public JSONObject LJIIIIZZ = null;
    public JSONObject LJIIIZ = null;
    public JSONObject LJIIJ = null;
    public JSONObject LJIIJJI = null;
    public final VD3 LJIIL = new VD3();
    public final C79368VCy LJIILIIL = new C79368VCy();
    public int LJIILJJIL = 0;
    public boolean LJIILL = false;
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public int LJIJI = -1;
    public boolean LJIJJ = false;
    public int LJIJJLI = -1;
    public int LJIL = -1;
    public int LJJ = -1;
    public int LJJI = -1;
    public int LJJIFFI = 300;
    public long LJJII = 0;
    public long LJJIII = 0;
    public int LJJIIJ = 0;
    public int LJJIIJZLJL = -1;
    public int LJJIIZ = -1;
    public int LJJIIZI = -1;
    public int LJJIJ = -1;
    public int LJJIJIIJI = -1;
    public int LJJIJIIJIL = -1;
    public int LJJIJIL = -1;
    public int LJJIJL = -1;
    public int LJJIJLIJ = -1;
    public int LJJIL = -1;
    public int LJJIZ = 5;
    public int LJJJ = 10000;
    public int LJJJI = -1;
    public final List<String> LJJJIL = new ArrayList();
    public final java.util.Map<String, List<String>> LJJJJ = new ConcurrentHashMap();
    public InterfaceC79328VBk LJJJJI = null;
    public Handler LJJJJIZL = null;

    public static C79346VCc LIZLLL() {
        if (LJJJJJ == null) {
            synchronized (C79346VCc.class) {
                if (LJJJJJ == null) {
                    LJJJJJ = new C79346VCc();
                }
            }
        }
        return LJJJJJ;
    }

    public final boolean LIZJ(JSONObject jSONObject) {
        List<String> list;
        this.LJIILJJIL++;
        SettingsManager.getInstance().initLSSettings(jSONObject.toString(), this);
        VD3 vd3 = this.LJIIL;
        vd3.getClass();
        if (LIZLLL().LJIIJ != null) {
            if (LIZLLL().LJIIJ.has("LSStrategySDKSettings")) {
                JSONObject optJSONObject = LIZLLL().LJIIJ.optJSONObject("LSStrategySDKSettings");
                vd3.LIZ = optJSONObject;
                vd3.LIZLLL = new LSStrategySDKSettings(optJSONObject);
            }
            if (LIZLLL().LJIIJ.has("LivePlayerSettings")) {
                vd3.LIZIZ = LIZLLL().LJIIJ.optJSONObject("LivePlayerSettings");
            }
            if (LIZLLL().LJIIJ.has("RTMPlayer")) {
                vd3.LIZJ = LIZLLL().LJIIJ.optJSONObject("RTMPlayer");
            }
        }
        PMU.LJ().LIZIZ();
        PMU LJ = PMU.LJ();
        LJ.getClass();
        if (LIZLLL().LJIIL.LIZLLL.mEnableDeviceFeatureData == 1 && !LJ.LJIILJJIL) {
            GraphicsMonitor.init();
            GraphicsMonitor.start();
            LJ.LJIILJJIL = true;
        }
        PMZ.LIZJ().LIZIZ();
        C79350VCg.LJ().LIZIZ();
        C64316PMa.LIZLLL().LIZIZ();
        C79318VBa.LIZ().initStrategyConfig();
        VBX.LIZ().initStrategyConfig();
        VBY.LIZ().initStrategyConfig();
        VBZ.LIZ().initStrategyConfig();
        VBW.LIZIZ().initStrategyConfig();
        VBW.LIZIZ().LIZJ();
        C79347VCd.LIZ().initStrategyConfig();
        C79329VBl.LIZ().initStrategyConfig();
        TopNHostStrategy.LIZJ().initStrategyConfig();
        C79319VBb.LIZ().initStrategyConfig();
        C79331VBn.LIZIZ().initStrategyConfig();
        NetworkProber.LIZJ().getClass();
        NetworkProber.LIZIZ();
        C79330VBm.LIZ().initStrategyConfig();
        C79332VBo.LIZ().initStrategyConfig();
        JSONObject jSONObject2 = this.LJIIJJI;
        if (jSONObject2 != null) {
            if (jSONObject2.has("PlayerFeatureParam")) {
                JSONObject optJSONObject2 = this.LJIIJJI.optJSONObject("PlayerFeatureParam");
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    ((HashMap) this.LJI).put(next.replaceAll("_", ""), optJSONObject2.opt(next));
                }
            }
            if (this.LJIIJJI.has("AnchorFeatureParam")) {
                JSONObject optJSONObject3 = this.LJIIJJI.optJSONObject("AnchorFeatureParam");
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    ((HashMap) this.LJII).put(next2.replaceAll("_", ""), optJSONObject3.opt(next2));
                }
            }
            PMY LJ2 = PMY.LJ();
            JSONObject jSONObject3 = this.LJIIJJI;
            LJ2.LIZJ = jSONObject3;
            if (jSONObject3 != null && LIZLLL().LJIILIIL.LJII == 1) {
                ArrayList arrayList = new ArrayList();
                C79365VCv c79365VCv = new C79365VCv();
                c79365VCv.LIZ = "UserProfile";
                c79365VCv.LIZIZ = LJ2.LIZJ.toString();
                arrayList.add(c79365VCv);
                C79353VCj.LJJL(arrayList);
            }
        }
        HashMap hashMap = new HashMap();
        if (this.LJIIJ != null && (list = this.LJJJIL) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject optJSONObject4 = this.LJIIJ.optJSONObject(str);
                JSONObject LJJLI = C79353VCj.LJJLI(C79353VCj.LJLLL, str);
                if (optJSONObject4 != null && LJJLI != null && !optJSONObject4.toString().equals(LJJLI.toString())) {
                    hashMap.put(str, optJSONObject4);
                }
            }
        }
        java.util.Map<String, List<String>> map = this.LJJJJ;
        if (map != null && ((ConcurrentHashMap) map).size() > 0) {
            for (Object obj : ((ConcurrentHashMap) this.LJJJJ).keySet()) {
                JSONObject jSONObject4 = new JSONObject();
                List<String> list2 = (List) ((ConcurrentHashMap) this.LJJJJ).get(obj);
                if (list2 != null && list2.size() > 0) {
                    for (String str2 : list2) {
                        if (hashMap.containsKey(str2)) {
                            try {
                                jSONObject4.put(str2, hashMap.get(str2));
                            } catch (JSONException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }
                    LiveStrategyManager.inst().mListenerMap.get(obj).LIZ("hot_update", jSONObject4);
                }
            }
        }
        if (LIZLLL().LJIILIIL.LJII == 1 && (LIZLLL().LJIILJJIL % LIZLLL().LJIILIIL.LJIIIIZZ == 0 || LIZLLL().LJIILJJIL == 1)) {
            ArrayList arrayList2 = new ArrayList();
            if (this.LJIIIIZZ != null) {
                C79365VCv c79365VCv2 = new C79365VCv();
                String str3 = C79353VCj.LJLLILLLL;
                c79365VCv2.LIZ = str3;
                c79365VCv2.LIZIZ = this.LJIIIIZZ.toString();
                arrayList2.add(c79365VCv2);
                ((ConcurrentHashMap) C79353VCj.LJLLLLLL).put(str3, c79365VCv2);
            }
            if (this.LJIIIZ != null) {
                C79365VCv c79365VCv3 = new C79365VCv();
                String str4 = C79353VCj.LJLLJ;
                c79365VCv3.LIZ = str4;
                c79365VCv3.LIZIZ = this.LJIIIZ.toString();
                arrayList2.add(c79365VCv3);
                ((ConcurrentHashMap) C79353VCj.LJLLLLLL).put(str4, c79365VCv3);
            }
            if (this.LJIIJ != null) {
                C79365VCv c79365VCv4 = new C79365VCv();
                String str5 = C79353VCj.LJLLL;
                c79365VCv4.LIZ = str5;
                c79365VCv4.LIZIZ = this.LJIIL.toString();
                arrayList2.add(c79365VCv4);
                ((ConcurrentHashMap) C79353VCj.LJLLLLLL).put(str5, c79365VCv4);
            }
            Handler handler = this.LJJJJIZL;
            if (handler != null) {
                handler.postDelayed(new ARunnableS50S0100000_14(arrayList2, 210), this.LJIILIIL.LJIIIZ);
            }
        }
        return true;
    }

    public final <T> T LIZ(String str, T t) {
        InterfaceC79328VBk interfaceC79328VBk = this.LJJJJI;
        if (interfaceC79328VBk != null) {
            return (T) interfaceC79328VBk.LIZ(str, t);
        }
        return t;
    }

    public final JSONObject LIZIZ(int i, String str) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("BatchSettingsParams")) {
                String optString = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, "BatchSettingsParams"), "live_stream_strategy_engine").optString(str);
                if (optString != null && optString.startsWith("\ufeff")) {
                    optString = optString.substring(1);
                }
                JSONObject jSONObject2 = new JSONObject(optString);
                if (i != 0) {
                    if (i != 3) {
                        return jSONObject2;
                    }
                    return this.LJIIL.LIZJ;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("LivePlayerSettings", this.LJIIL.LIZIZ);
                jSONObject3.put("LSStrategySDKSettings", this.LJIIL.LIZ);
                jSONObject3.put("StrategyConfig", this.LJIIIIZZ);
                return jSONObject3;
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return null;
    }
}
