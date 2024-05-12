package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.videoarch.live.LiveIOWrapper;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAP {
    public final Context LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJJLI;
    public JSONObject LJJI;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LJIIL = 1048576;
    public int LJIILIIL = -1;
    public int LJIJ = 1000;
    public int LJIJI = 4;
    public int LJIJJ = -1;
    public int LJIL = 0;
    public String LJJ = "";

    public VAP(Context context) {
        this.LIZJ = context;
    }

    public final JSONObject LJI(JSONObject jSONObject) {
        JSONObject jSONObject2 = this.LJJI;
        if (jSONObject2 != null && jSONObject2.has("httpx")) {
            try {
                JSONObject optJSONObject = this.LJJI.optJSONObject("httpx");
                if (optJSONObject != null && (this.LJIILJJIL != 1 || C48013Isr.LIZLLL(this.LIZJ) == 1)) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = optJSONObject.get(next);
                        if (obj instanceof JSONObject) {
                            obj = optJSONObject.optString(next);
                        }
                        jSONObject.put(next, obj);
                    }
                    String absolutePath = C16880lQ.LLIIJLIL(this.LIZJ).getAbsolutePath();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(absolutePath);
                    LIZ.append("/pullstreamso.scfg");
                    jSONObject.put("HttpScfgPath", X1D.LIZIZ(LIZ));
                }
                return jSONObject;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONObject;
    }

    public final void LJII(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.LJJI = jSONObject;
        if (jSONObject.has("LiveIOConfig") && (optJSONObject = jSONObject.optJSONObject("LiveIOConfig")) != null) {
            this.LIZLLL = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableLiveIO", Integer.valueOf(this.LIZLLL))).intValue();
            int intValue = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableP2P", Integer.valueOf(this.LJ))).intValue();
            this.LJ = intValue;
            this.LJFF = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableP2PQuic", Integer.valueOf(intValue))).intValue();
            this.LJIILL = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableP2pUp", Integer.valueOf(this.LJIILL))).intValue();
            this.LJI = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableHttpPrepare", Integer.valueOf(this.LJI))).intValue();
            this.LJII = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableHttpReadBlock", Integer.valueOf(this.LJII))).intValue();
            this.LJIIIZ = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableHttpKeepOriginAgent", Integer.valueOf(this.LJIIIZ))).intValue();
            this.LJIIJ = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableHttpKeepRedirectIP", Integer.valueOf(this.LJIIJ))).intValue();
            this.LJIIJJI = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableLiveIOTimeoutInternal", Integer.valueOf(this.LJIIJJI))).intValue();
            this.LJIILIIL = ((Integer) C78847Ux1.LJJIII(optJSONObject, "HttpReadBlockDelay", Integer.valueOf(this.LJIILIIL))).intValue();
            this.LJIIL = ((Integer) C78847Ux1.LJJIII(optJSONObject, "LiveIOReadBuffer", Integer.valueOf(this.LJIIL))).intValue();
            this.LJIILLIIL = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableLiveIORace", Integer.valueOf(this.LJIILLIIL))).intValue();
            this.LJIIZILJ = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableLiveIORaceIPV6First", Integer.valueOf(this.LJIIZILJ))).intValue();
            this.LJIJI = ((Integer) C78847Ux1.LJJIII(optJSONObject, "RaceMaxNodeSize", Integer.valueOf(this.LJIJI))).intValue();
            this.LJIJ = ((Integer) C78847Ux1.LJJIII(optJSONObject, "Ipv6DegradeDelay", Integer.valueOf(this.LJIJ))).intValue();
            this.LJIJJ = ((Integer) C78847Ux1.LJJIII(optJSONObject, "Ipv6Expversion", Integer.valueOf(this.LJIJJ))).intValue();
            this.LJIJJLI = ((Integer) C78847Ux1.LJJIII(optJSONObject, "KeepOriginHostOnlyInFreeFlow", Integer.valueOf(this.LJIJJLI))).intValue();
            this.LJIIIIZZ = ((Integer) C78847Ux1.LJJIII(optJSONObject, "EnableHttpKeepOriginHost", Integer.valueOf(this.LJIIIIZZ))).intValue();
        }
    }

    public final JSONObject LJIIIIZZ(JSONObject jSONObject) {
        try {
            jSONObject.put("ipv4_race_node_size", this.LIZ).put("ipv6_race_node_size", this.LIZIZ).put("ipv6_exp_version", this.LJIJJ).put("node_race_enable", this.LJIILLIIL).put("node_race_disable_reason", this.LJIL).put("node_race_first", this.LJIIZILJ).put("node_reace_degrade_delay", this.LJIJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public static List LIZIZ(int i, String str) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("protocolType", i);
            jSONObject.put("host", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return (List) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 24, arrayList, jSONObject);
    }

    public static VAG LJ(VAG vag, String str) {
        if (vag == null) {
            return null;
        }
        vag.LLILZLL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1141);
        vag.LLJILJIL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1105);
        vag.LLJJIJIL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1139);
        vag.LLJI = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1107);
        vag.LLJIJIL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1106);
        vag.LLILLL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1111);
        vag.LLJJJJLIIL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1116);
        vag.LLJJL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1117);
        vag.LLJJLIIIJLLLLLLLZ = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1118);
        vag.LLJL = (int) LiveIOWrapper.getInstance().getLongValueByStr(str, 1119);
        return vag;
    }

    public final JSONObject LIZ(String str, JSONObject jSONObject) {
        try {
            int i = 1;
            if (this.LJIILLIIL == 1 && this.LJIL == 0) {
                JSONArray LJFF = LJFF(0, str);
                if (LJFF.length() != 0) {
                    jSONObject.put("trans_enable_race", this.LJIILLIIL);
                    jSONObject.put("trans_ipv6_list", LJFF.toString());
                    jSONObject.put("trans_ipv4_list", LJFF(1, str).toString());
                    jSONObject.put("trans_ipv6_race_first", this.LJIIZILJ);
                    jSONObject.put("trans_race_max_node", this.LJIJI);
                    jSONObject.put("trans_ipv6_degrad_delay", this.LJIJ);
                    jSONObject.put("trans_ipv6_degrade_delay", this.LJIJ);
                } else {
                    jSONObject.put("trans_enable_race", 0);
                    this.LJIL = 2;
                }
            }
            jSONObject.put("is_enable_p2p_quic", this.LJFF);
            LJI(jSONObject);
            try {
                if (this.LJIJJLI == 1) {
                    if (this.LJIIIIZZ != 1 || this.LJIILJJIL != 1) {
                        i = 0;
                    }
                    jSONObject.put("http_keep_origin_host", i);
                } else {
                    jSONObject.put("http_keep_origin_host", this.LJIIIIZZ);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return jSONObject;
    }

    public final JSONArray LJFF(int i, String str) {
        ArrayList arrayList = new ArrayList(LIZIZ(i, str));
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jSONArray.put(ListProtector.get(arrayList, i2));
        }
        if (1 == i) {
            this.LIZ = jSONArray.length();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ipv4 node size: ");
            UFE.LIZLLL(LIZ, this.LIZ, LIZ);
        } else if (i == 0) {
            int length = jSONArray.length();
            this.LIZIZ = length;
            String str2 = this.LJJ;
            if (str2 != null && length == 0 && str2.startsWith("[")) {
                jSONArray.put(this.LJJ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ipv6 node size: ");
            UFE.LIZLLL(LIZ2, this.LIZIZ, LIZ2);
        }
        return jSONArray;
    }

    public static String LIZJ(int i, String str, String str2) {
        String stringValueByStr = LiveIOWrapper.getInstance().getStringValueByStr(str, i);
        if (!TextUtils.isEmpty(stringValueByStr)) {
            return stringValueByStr;
        }
        return str2;
    }

    public static VAG LIZLLL(VAG vag, String str, int i) {
        VAG vag2 = null;
        if (vag == null) {
            return null;
        }
        VAG LJ = LJ(vag, str);
        if (LJ != null) {
            LJ.LLILIL = LIZJ(1110, str, LJ.LLILIL);
            LJ.LLJJ = LIZJ(1138, str, LJ.LLJJ);
            LJ.LLILZ = LIZJ(1140, str, LJ.LLILZ);
            LJ.LLILL = LIZJ(1112, str, LJ.LLILL);
            LJ.LLJLIL = LIZJ(1120, str, LJ.LLJLIL);
            LJ.LLJLILLLLZIIL = LIZJ(1121, str, LJ.LLJLILLLLZIIL);
            LJ.LLJLL = LIZJ(1122, str, LJ.LLJLL);
            vag2 = LJ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("liveio tt_quic_sdk_version: ");
        LIZ.append(vag2.LLILIL);
        LIZ.append(", quic_connection_id: ");
        LIZ.append(vag2.LLJJ);
        LIZ.append(", h2NegotiateProtocol: ");
        LIZ.append(vag2.LLILZ);
        LIZ.append(", h2RaceResult: ");
        LIZ.append(vag2.LLILZLL);
        LIZ.append(", h2Reused: ");
        LIZ.append(vag2.LLJJIJIL);
        LIZ.append(", quicOpenResult: ");
        LIZ.append(vag2.LLJILJIL);
        LIZ.append(", quicConfigCached: ");
        LIZ.append(vag2.LLJI);
        LIZ.append(", quicCHLOCount:");
        LIZ.append(vag2.LLJIJIL);
        LIZ.append(", rej count: ");
        LIZ.append(vag2.LLILLL);
        LIZ.append(", quicRejReasons: ");
        C64504PTg.LIZLLL(LIZ, vag2.LLILL, LIZ);
        return vag2;
    }
}
