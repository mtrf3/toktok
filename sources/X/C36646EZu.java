package X;

import android.util.Pair;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.actionai.jni.UnorderedMapStrStr;
import com.ss.android.ugc.aweme.actionai.net.ActionAINetworkClient;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EZu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36646EZu {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C36655Ea3.LJLIL);

    public static void LIZ(JSONArray jSONArray) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(FO5.LIZ());
        LIZ2.append("/tiktok/action-ai/api/user_management/user_event_count");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        linkedHashMap.put("user_id", curUserId);
        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        o.LJIIIIZZ(curSecUserId, "userService().curSecUserId");
        linkedHashMap.put("sec_uid", curSecUserId);
        Pair LIZ3 = EZW.LIZ(LIZIZ, linkedHashMap);
        String baseUrl = (String) LIZ3.first;
        String str = (String) LIZ3.second;
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_key_list", jSONArray);
        PVJ LIZJ = PVP.LIZJ(C39745Fin.LIZJ("application/json; charset=utf-8"), jSONObject.toString());
        ActionAINetworkClient actionAINetworkClient = ActionAINetworkClient.LIZ;
        o.LJIIIIZZ(baseUrl, "baseUrl");
        C36643EZr c36643EZr = new C36643EZr();
        actionAINetworkClient.getClass();
        ActionAINetworkClient.LIZLLL(baseUrl, str, LIZJ, linkedHashMap, unorderedMapStrStr, c36643EZr);
    }

    public static void LIZIZ(InterfaceC37320Ekm interfaceC37320Ekm, C36648EZw param, Class cls) {
        o.LJIIIZ(param, "param");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(FO5.LIZ());
        LIZ2.append("/tiktok/action-ai/api/cloud_action_proxy/search_abilities");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair LIZ3 = EZW.LIZ(LIZIZ, linkedHashMap);
        String baseUrl = (String) LIZ3.first;
        String str = (String) LIZ3.second;
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", param.LIZ.getValue());
        C36647EZv c36647EZv = param.LIZIZ;
        c36647EZv.getClass();
        JSONObject jSONObject2 = new JSONObject();
        if (c36647EZv.LIZLLL != null) {
            jSONObject2.put("feature_bits", new JSONArray((Collection) c36647EZv.LIZLLL).toString());
        }
        jSONObject2.put("user_key_prompt", c36647EZv.LIZ);
        jSONObject2.put("top_k", c36647EZv.LIZIZ);
        jSONObject2.put("zip_uri", c36647EZv.LIZJ);
        jSONObject2.put("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        jSONObject2.put("sec_uid", ((RBX) HG3.LJIILL()).getCurSecUserId());
        SettingsManager.LIZLLL().getClass();
        jSONObject2.put("llm_type", SettingsManager.LJ("action_ai_bot_search_llm_type", 0));
        jSONObject2.put("sdk_version", LIZ.getValue());
        String jSONObject3 = jSONObject2.toString();
        o.LJIIIIZZ(jSONObject3, "JSONObject().apply {\n   …\n            }.toString()");
        jSONObject.put("parameters", jSONObject3);
        String jSONObject4 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject4, "JSONObject().apply {\n   …\n            }.toString()");
        PVJ LIZJ = PVP.LIZJ(C39745Fin.LIZJ("application/json; charset=utf-8"), jSONObject4);
        ActionAINetworkClient actionAINetworkClient = ActionAINetworkClient.LIZ;
        o.LJIIIIZZ(baseUrl, "baseUrl");
        C37316Eki c37316Eki = new C37316Eki(interfaceC37320Ekm, param, cls);
        actionAINetworkClient.getClass();
        ActionAINetworkClient.LIZLLL(baseUrl, str, LIZJ, linkedHashMap, unorderedMapStrStr, c37316Eki);
    }
}
