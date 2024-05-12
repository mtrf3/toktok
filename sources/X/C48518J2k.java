package X;

import X.C48518J2k;
import X.C48591J5f;
import X.C72242sW;
import X.J51;
import X.J52;
import X.J5Q;
import X.J5R;
import X.J5S;
import X.J5T;
import X.J5V;
import X.J5W;
import android.os.SystemClock;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.J2k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48518J2k extends J5U {
    public final String LIZJ;

    @Override // X.J5U
    public final void LIZJ() {
    }

    @Override // X.J5U
    public final void LIZLLL() {
    }

    public C48518J2k(String str) {
        this.LIZJ = str;
    }

    @Override // X.J5U
    public final void LIZIZ(C11030bz c11030bz) {
        float[] fArr = (float[]) c11030bz.LIZ;
        final C72242sW c72242sW = new C72242sW();
        c72242sW.element = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (float f : fArr) {
            jSONArray.put(Float.valueOf(f));
        }
        jSONObject.put("inputParams", jSONArray);
        PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ)).runTask(this.LIZJ, new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, 0.0f, 7, null), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.ohr.OHRPitayaEngine$predict$2
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                int i;
                J52 j52;
                JSONObject optJSONObject;
                int i2;
                JSONObject params;
                Float f2;
                Float f3;
                J5S lastSlideSpeedFeature;
                long uptimeMillis = SystemClock.uptimeMillis() - C72242sW.this.element;
                if (pTYTaskData != null) {
                    pTYTaskData.getParams();
                }
                Float f4 = null;
                if (J5V.LIZ != 0) {
                    SmartOHRService smartOHRService = C48591J5f.LIZ;
                    if (smartOHRService != null && (lastSlideSpeedFeature = smartOHRService.getLastSlideSpeedFeature()) != null) {
                        f4 = Float.valueOf(lastSlideSpeedFeature.LJLIL);
                        f2 = Float.valueOf(lastSlideSpeedFeature.LJLILLLLZI);
                        f3 = Float.valueOf(lastSlideSpeedFeature.LJLJI);
                    } else {
                        f2 = null;
                        f3 = null;
                    }
                    PitayaFeatureCenterService.Companion.getClass();
                    J5T.LIZ.onSlideSpeedUpdate(f4, f2, f3);
                }
                if (!z || pTYTaskData == null || pTYTaskData.getParams() == null) {
                    return;
                }
                if (pTYError != null) {
                    i = pTYError.getCode();
                } else {
                    i = 0;
                }
                String module = this.LIZJ;
                o.LJIIIZ(module, "module");
                if (J51.LIZ && (j52 = J51.LIZJ) != null) {
                    j52.LJFF = i;
                    j52.LIZLLL = uptimeMillis;
                }
                this.getClass();
                JSONObject jSONObject2 = new JSONObject();
                if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
                    jSONObject2.put("rst", params).toString();
                }
                String jSONObject3 = jSONObject2.toString();
                o.LJIIIIZZ(jSONObject3, "info.toString()");
                C48518J2k c48518J2k = this;
                c48518J2k.getClass();
                SystemClock.uptimeMillis();
                if (i == 0) {
                    try {
                        JSONObject optJSONObject2 = new JSONObject(jSONObject3).optJSONObject("rst");
                        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("score_map")) != null) {
                            J5Q j5q = new J5Q(0);
                            Iterator<String> keys = optJSONObject.keys();
                            o.LJIIIIZZ(keys, "map.keys()");
                            while (keys.hasNext()) {
                                String k = keys.next();
                                if (o.LJ(k, "left")) {
                                    i2 = 1;
                                } else if (o.LJ(k, "right")) {
                                    i2 = 2;
                                } else {
                                    i2 = 0;
                                }
                                double optDouble = optJSONObject.optDouble(k);
                                o.LJIIIIZZ(k, "k");
                                j5q.LIZ(new J5R((float) optDouble, k, i2));
                            }
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            J5R j5r = j5q.LIZIZ;
                            J51.LIZ(j5r.LJLJI, 0, j5r.LJLIL, uptimeMillis2);
                            J5W j5w = c48518J2k.LIZIZ;
                            if (j5w == null) {
                                return;
                            }
                            j5w.LIZ(j5q);
                            return;
                        }
                        return;
                    } catch (JSONException unused) {
                        J51.LIZ(0.0f, -1, 0, SystemClock.uptimeMillis());
                        return;
                    }
                }
                J51.LIZ(0.0f, -1, 0, SystemClock.uptimeMillis());
            }
        });
    }
}
