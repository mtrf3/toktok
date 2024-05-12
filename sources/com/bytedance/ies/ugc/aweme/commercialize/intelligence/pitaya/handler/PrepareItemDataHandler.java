package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.handler;

import X.C141335gf;
import X.C3C5;
import X.C76800UCe;
import X.C78983UzD;
import X.EF7;
import X.YHH;
import X.YHM;
import X.YHN;
import X.YHP;
import X.YHS;
import X.YHV;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CandidateAdData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class PrepareItemDataHandler extends YHP {
    public final String LIZ = EF7.LJII();
    public final String LIZIZ = String.valueOf(EF7.LJIIIZ);

    public final JSONObject LIZIZ(YHH yhh) {
        Object LIZ;
        Set<Map.Entry<String, j>> entrySet;
        List<YHV> list = yhh.LIZJ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("function_name", yhh.LIZIZ);
        jSONObject.put("client_version", this.LIZ);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (YHV yhv : list) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("feed_status", yhv.getFeedStatus());
            YHS.LIZ.getClass();
            Gson gson = YHS.LIZIZ;
            jSONObject3.put("feed_data", new JSONObject(GsonProtectorUtils.toJson(gson, yhv.getRankData())));
            jSONObject3.put("feed_action_data", new JSONObject(GsonProtectorUtils.toJson(gson, yhv.getFeedActionData())));
            jSONArray.put(jSONObject3);
        }
        jSONObject2.put("recent_feed_list", jSONArray);
        try {
            LIZ = new JSONObject(yhh.LJ.LIZJ);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            LIZ = new JSONObject();
        }
        jSONObject2.put("ab_params", LIZ);
        jSONObject2.put("trigger_source", yhh.LJ.LIZ);
        jSONObject2.put("trigger_scene", yhh.LIZ.LIZJ);
        jSONObject2.put("sati_param_for_pitaya", yhh.LJ.LIZIZ);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("last_req_time", yhh.LIZLLL.LIZ);
        jSONObject4.put("last_async_req_time", yhh.LIZLLL.LIZIZ);
        jSONObject4.put("sati_param_for_pitaya", yhh.LIZLLL.LIZJ);
        jSONObject4.put("drop_extra_ad_cnt", yhh.LIZLLL.LJ);
        JSONArray jSONArray2 = new JSONArray();
        for (CandidateAdData candidateAdData : yhh.LIZLLL.LIZLLL) {
            YHS.LIZ.getClass();
            jSONArray2.put(new JSONObject(GsonProtectorUtils.toJson(YHS.LIZIZ, candidateAdData)));
        }
        jSONObject4.put("extra_ad_list", jSONArray2);
        jSONObject2.put("extra_ad_request_json", jSONObject4);
        m mVar = yhh.LJ.LIZLLL;
        if (mVar != null && (entrySet = mVar.entrySet()) != null) {
            for (Map.Entry<String, j> entry : entrySet) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("param_json", jSONObject2);
        return jSONObject;
    }

    @Override // X.YHP
    public final void LIZ(final YHN chain, final YHM yhm) {
        JSONObject jSONObject;
        o.LJIIIZ(chain, "chain");
        final YHH yhh = chain.LIZ;
        IPitayaCore core = PitayaCoreFactory.getCore(this.LIZIZ);
        String str = yhh.LIZ.LIZ;
        try {
            jSONObject = LIZIZ(yhh);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
            jSONObject = null;
        }
        core.runTask(str, new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, 0.0f, 7, null), new PTYTaskResultCallback() { // from class: com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.handler.PrepareItemDataHandler$internalHandle$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                JSONObject params;
                Object LIZ;
                if (pTYError != null && pTYError.getCode() != 0) {
                    YHM yhm2 = YHM.this;
                    if (yhm2 != null) {
                        int code = pTYError.getCode();
                        String summary = pTYError.getSummary();
                        if (summary == null) {
                            summary = "";
                        }
                        yhm2.LIZ(code, summary, chain);
                        return;
                    }
                    return;
                }
                YHH yhh2 = yhh;
                this.getClass();
                m mVar = new m();
                if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
                    try {
                        new com.google.gson.o();
                        mVar.LJJII("rst", com.google.gson.o.LIZ(params.toString()));
                        LIZ = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    C3C5.m6boximpl(LIZ);
                }
                if (pTYError != null) {
                    mVar.LJJIIZ("err_info", pTYError.toString());
                }
                yhh2.getClass();
                yhh2.LJFF = mVar;
                chain.LIZIZ(YHM.this);
            }
        });
    }
}
