package com.ss.android.ugc.aweme.ml.impl;

import X.C38552FBc;
import X.C38555FBf;
import X.C47135Ieh;
import X.C47394Iis;
import X.C47395Iit;
import X.EF7;
import X.FMX;
import X.FR7;
import X.IEX;
import X.WM7;
import X.X1D;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.ml.ab.SmartCDNRankMLModel;
import com.ss.android.ugc.aweme.ml.ab.SmartCDNStrategyConfig;
import com.ss.android.ugc.aweme.ml.api.SmartCDNRankService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SmartCDNRankServiceImpl implements SmartCDNRankService {
    public static final /* synthetic */ int LIZJ = 0;
    public List<C47394Iis> LIZIZ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.ml.api.SmartCDNRankService
    public final C38552FBc acquireCdnScores() {
        boolean z;
        SmartCDNRankMLModel LIZ = IEX.LIZ();
        if (LIZ != null && LIZ.getEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        String LIZIZ = FR7.LIZIZ("smart_cdn_rank_result");
        if (LIZIZ.length() == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(LIZIZ);
            JSONArray rank_wifi = JSONObjectProtectorUtils.getJSONArray(jSONObject, "rank_wifi");
            JSONArray rank_other = JSONObjectProtectorUtils.getJSONArray(jSONObject, "rank_other");
            o.LJIIIIZZ(rank_wifi, "rank_wifi");
            List LIZ2 = LIZ(rank_wifi);
            o.LJIIIIZZ(rank_other, "rank_other");
            return new C38552FBc(LIZ2, LIZ(rank_other));
        } catch (Exception unused) {
            return null;
        }
    }

    public static List LIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
            arrayList.add(new C38555FBf(JSONObjectProtectorUtils.getInt(jSONObject, "cdn"), JSONObjectProtectorUtils.getInt(jSONObject, "score")));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartCDNRankService
    public final void appendCdnInfo(C47394Iis c47394Iis) {
        int i;
        final String str;
        SmartCDNRankMLModel LIZ;
        SmartCDNStrategyConfig strategy_config;
        SmartCDNRankMLModel LIZ2;
        List<Integer> main_cdn_list;
        SmartCDNRankMLModel LIZ3 = IEX.LIZ();
        int i2 = 0;
        if (LIZ3 == null || !LIZ3.getEnabled() || ((ArrayList) c47394Iis.LIZLLL).isEmpty()) {
            return;
        }
        SmartCDNRankMLModel LIZ4 = IEX.LIZ();
        if (LIZ4 != null) {
            i = LIZ4.getCalcuate_throttle();
        } else {
            i = 2;
        }
        ((ArrayList) this.LIZIZ).add(c47394Iis);
        if (((ArrayList) this.LIZIZ).size() >= i) {
            SmartCDNRankMLModel LIZ5 = IEX.LIZ();
            if (LIZ5 != null && (str = LIZ5.packageUrl) != null && (LIZ = IEX.LIZ()) != null && (strategy_config = LIZ.getStrategy_config()) != null && (LIZ2 = IEX.LIZ()) != null && (main_cdn_list = LIZ2.getMain_cdn_list()) != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONObject2.put("cdn_qos", jSONArray);
                Iterator it = ((ArrayList) this.LIZIZ).iterator();
                while (it.hasNext()) {
                    C47394Iis c47394Iis2 = (C47394Iis) it.next();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("network_type", c47394Iis2.LIZ);
                    jSONObject3.put("ff_duration", c47394Iis2.LIZIZ);
                    jSONObject3.put("block_count", i2);
                    jSONObject3.put("block_duration", 0L);
                    jSONObject3.put("video_duration", c47394Iis2.LIZJ);
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = ((ArrayList) c47394Iis2.LIZLLL).iterator();
                    while (it2.hasNext()) {
                        C47395Iit c47395Iit = (C47395Iit) it2.next();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("cdn_code", c47395Iit.LIZ);
                        jSONObject4.put("size", c47395Iit.LIZIZ);
                        jSONObject4.put("dur", c47395Iit.LIZJ);
                        jSONArray2.put(jSONObject4);
                    }
                    jSONObject3.put("download_info", jSONArray2);
                    jSONArray.put(jSONObject3);
                    i2 = 0;
                }
                jSONObject.put("raw_data", jSONObject2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator<Integer> it3 = main_cdn_list.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(it3.next().intValue());
                }
                jSONObject.put("main_cdn_list", jSONArray3);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("name", strategy_config.getName());
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("n_records", strategy_config.getN_records());
                jSONObject6.put("exploration_ratio", Float.valueOf(strategy_config.getExploration_ratio()));
                jSONObject6.put("n_samples", strategy_config.getN_samples());
                jSONObject6.put("mu", strategy_config.getMu());
                jSONObject6.put("sigma", strategy_config.getSigma());
                jSONObject6.put("score_norm_ratio", Float.valueOf(strategy_config.getScore_norm_ratio()));
                jSONObject6.put("score_min_threshold", strategy_config.getScore_min_threshold());
                jSONObject6.put("score_max_threshold", strategy_config.getScore_max_threshold());
                jSONObject5.put("parameter", jSONObject6);
                jSONObject.put("strategy_config", jSONObject5);
                final long uptimeMillis = SystemClock.uptimeMillis();
                PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ)).runTask(str, new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, 3600.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.impl.SmartCDNRankServiceImpl$calculateCdnScores$1
                    @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                    public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                        int i3;
                        int i4;
                        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("cdn rank execute result: duration=");
                        LIZ6.append(uptimeMillis2);
                        LIZ6.append(" resultCode=");
                        LIZ6.append(pTYError);
                        LIZ6.append(" output=");
                        JSONObject jSONObject7 = null;
                        if (pTYTaskData != null) {
                            jSONObject7 = pTYTaskData.getParams();
                        }
                        LIZ6.append(jSONObject7);
                        X1D.LIZIZ(LIZ6);
                        if (!z || pTYTaskData == null || pTYTaskData.getParams() == null) {
                            SmartCDNRankServiceImpl smartCDNRankServiceImpl = this;
                            if (pTYError != null) {
                                i3 = pTYError.getCode();
                            } else {
                                i3 = -1;
                            }
                            String str2 = str;
                            smartCDNRankServiceImpl.getClass();
                            SmartCDNRankServiceImpl.LIZIZ(-1, uptimeMillis2, str2, i3, null);
                            this.getClass();
                            return;
                        }
                        JSONObject params = pTYTaskData.getParams();
                        o.LJI(params);
                        String jSONObject8 = params.toString();
                        o.LJIIIIZZ(jSONObject8, "outputDataPTY.params!!.toString()");
                        SmartCDNRankServiceImpl smartCDNRankServiceImpl2 = this;
                        if (pTYError != null) {
                            i4 = pTYError.getCode();
                        } else {
                            i4 = 0;
                        }
                        String str3 = str;
                        smartCDNRankServiceImpl2.getClass();
                        SmartCDNRankServiceImpl.LIZIZ(0, uptimeMillis2, str3, i4, jSONObject8);
                        this.getClass();
                        if (jSONObject8.length() > 0) {
                            FR7.LIZJ("smart_cdn_rank_result", jSONObject8);
                        }
                    }
                });
            }
            this.LIZIZ = new ArrayList();
        }
    }

    public static void LIZIZ(int i, long j, String str, int i2, String str2) {
        JSONObject LJ = C47135Ieh.LJ(WM7.SCENE_SERVICE, "cdn_rank", "model_name", str);
        LJ.put("duration", j);
        LJ.put("success", i);
        LJ.put("sdk_success", i2);
        if (str2 != null) {
            LJ.put("s_result", str2);
        }
        FMX.LJIILJJIL("ml_scene_run", LJ);
    }
}
