package com.ss.videoarch.strategy.strategy.networkStrategy;

import X.C16880lQ;
import X.C79326VBi;
import X.C79345VCb;
import X.C79346VCc;
import android.text.TextUtils;
import com.ss.videoarch.strategy.NativeObject;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class NetworkProber extends NativeObject {
    public static volatile NetworkProber LIZ;

    private native long nativeAddUdpProbeTask(int i, String str, int i2, String str2, int i3, int i4, int i5);

    private native String nativeGetUdpProbeInfo(String str, int i);

    private native int nativeGetUdpProbeResult(String str);

    private native int nativeNetworkReachableProbe(String str, String str2, int i);

    private native void nativeSetProbeInverval(int i);

    private native long nativeUdpActionByCommand(int i, String str, int i2, String str2);

    public static NetworkProber LIZJ() {
        if (LIZ == null) {
            synchronized (NetworkProber.class) {
                if (LIZ == null) {
                    LIZ = new NetworkProber();
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ() {
        String str;
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUDPProbe <= 1) {
            NetworkProber LIZJ = LIZJ();
            LIZJ.getClass();
            if (!C79326VBi.LIZ()) {
                return;
            }
            LIZJ.nativeSetProbeInverval(-1);
            return;
        }
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = C79346VCc.LIZLLL().LJIIL.LIZLLL.mUDPProbeInfos;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                C79345VCb c79345VCb = new C79345VCb();
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    if (optJSONObject.has("domain")) {
                        c79345VCb.LIZ = optJSONObject.optString("domain");
                    }
                    if (optJSONObject.has("port")) {
                        c79345VCb.LIZIZ = optJSONObject.optInt("port");
                    }
                    if (optJSONObject.has("number")) {
                        c79345VCb.LIZJ = optJSONObject.optInt("number");
                    }
                    if (optJSONObject.has("rtt")) {
                        c79345VCb.LIZLLL = optJSONObject.optInt("rtt");
                    }
                    if (optJSONObject.has("succ")) {
                        c79345VCb.LJ = optJSONObject.optInt("succ");
                    }
                }
                hashSet.add(c79345VCb);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C79345VCb c79345VCb2 = (C79345VCb) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("host", c79345VCb2.LIZ);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            JSONObject LJ = DnsOptimizer.LJFF().LJ(jSONObject, null);
            String str2 = "";
            if (LJ == null || !LJ.has("Ip")) {
                str = "";
            } else {
                str = LJ.optString("Ip");
            }
            NetworkProber LIZJ2 = LIZJ();
            if (!str.contains(":")) {
                str2 = str;
            }
            int i2 = c79345VCb2.LIZIZ;
            String str3 = c79345VCb2.LIZ;
            int i3 = c79345VCb2.LIZJ;
            int i4 = c79345VCb2.LIZLLL;
            int i5 = c79345VCb2.LJ;
            LIZJ2.getClass();
            if (C79326VBi.LIZ()) {
                LIZJ2.nativeAddUdpProbeTask(1, str2, i2, str3, i3, i4, i5);
            }
        }
        NetworkProber LIZJ3 = LIZJ();
        int i6 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mUDPProbeInterval;
        LIZJ3.getClass();
        if (!C79326VBi.LIZ()) {
            return;
        }
        LIZJ3.nativeSetProbeInverval(i6);
    }

    public final JSONArray LIZ(int i, String str) {
        JSONArray jSONArray = null;
        if (TextUtils.isEmpty(str) || !C79326VBi.LIZ()) {
            return null;
        }
        try {
            jSONArray = new JSONArray(nativeGetUdpProbeInfo(str, i));
            return jSONArray;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return jSONArray;
        }
    }

    public final long LIZLLL(int i, int i2, String str, String str2) {
        if (!C79326VBi.LIZ()) {
            return -1L;
        }
        if (i != 0) {
            if (i != 1 && i != 2) {
                return -1L;
            }
            return nativeUdpActionByCommand(i, str, i2, str2);
        }
        return nativeNetworkReachableProbe(str, "tcp", i2);
    }
}
