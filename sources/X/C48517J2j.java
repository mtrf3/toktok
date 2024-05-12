package X;

import X.C47322Ihi;
import X.C47333Iht;
import X.C48517J2j;
import X.C72242sW;
import X.EF7;
import X.InterfaceC48516J2i;
import X.J3Y;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import defpackage.i0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.J2j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48517J2j extends AbstractC48521J2n {
    public final String LIZJ;
    public final String LIZLLL;
    public long LJ;
    public int LJFF;

    @Override // X.AbstractC48521J2n
    public final void LJ() {
    }

    @Override // X.AbstractC48521J2n
    public final C47333Iht LJI(C47322Ihi c47322Ihi) {
        return null;
    }

    @Override // X.AbstractC48521J2n
    public final boolean LJII() {
        return false;
    }

    @Override // X.AbstractC48521J2n
    public final boolean LIZIZ() {
        if (!TextUtils.isEmpty(this.LIZLLL) && !C78880UxY.LJJI(this.LIZIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC48521J2n
    public final boolean LIZJ() {
        if (!LIZIZ()) {
            return false;
        }
        PitayaExperiment.LIZ.getClass();
        if (PitayaExperiment.LIZIZ.enable != 1 || !PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ)).isReady()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC48521J2n
    public final boolean LIZLLL() {
        return LIZJ();
    }

    public static JSONObject LJIIIIZZ(C47322Ihi c47322Ihi) {
        if (c47322Ihi == null) {
            return new JSONObject();
        }
        Object obj = c47322Ihi.LJI;
        if (!(obj instanceof JSONObject) || obj == null) {
            obj = new JSONObject();
        }
        java.util.Map<String, Object> map = c47322Ihi.LIZJ;
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                ((JSONObject) obj).put((String) entry.getKey(), JSONObject.wrap(entry.getValue()));
            }
        }
        float[] fArr = c47322Ihi.LJ;
        if (fArr != null) {
            JSONArray jSONArray = new JSONArray();
            for (float f : fArr) {
                jSONArray.put(Float.valueOf(f));
            }
            ((JSONObject) obj).put("inputParams", fArr);
        }
        return (JSONObject) obj;
    }

    @Override // X.AbstractC48521J2n
    public final void LIZ(C35750E1i c35750E1i) {
        Integer num;
        if (o.LJ("fillMonitorData", "fillMonitorData")) {
            Object LIZ = c35750E1i.LIZ("monitorType");
            JSONObject jSONObject = null;
            if (LIZ instanceof Integer) {
                num = (Integer) LIZ;
            } else {
                num = null;
            }
            Object LIZ2 = c35750E1i.LIZ("json");
            if (LIZ2 instanceof JSONObject) {
                jSONObject = (JSONObject) LIZ2;
            }
            if (num != null && jSONObject != null && num.intValue() == 2) {
                jSONObject.put("sdk_duration", this.LJ);
                jSONObject.put("sdk_success", this.LJFF);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48517J2j(String name, C47663InD c47663InD) {
        super(name, c47663InD);
        o.LJIIIZ(name, "name");
        this.LIZJ = i0.LJFF("ml#", name);
        this.LIZLLL = C78880UxY.LJJLL(c47663InD);
    }

    @Override // X.AbstractC48521J2n
    public final void LJFF(final C47322Ihi c47322Ihi, final C48522J2o c48522J2o) {
        J3U.LIZIZ(new Runnable() { // from class: com.ss.android.ugc.aweme.ml.infra.pitaya_sdk.SmartPitayaSdkEngineRunner$runAsync$1
            public final void LIZ() {
                C48517J2j c48517J2j;
                String str;
                long j;
                final C47333Iht c47333Iht = new C47333Iht((Object) null);
                try {
                    try {
                        c48517J2j = C48517J2j.this;
                        c48517J2j.LJ = -1L;
                        str = c48517J2j.LIZLLL;
                    } catch (Exception unused) {
                        c47333Iht.LJ = -6;
                        InterfaceC48516J2i interfaceC48516J2i = c48522J2o;
                        if (interfaceC48516J2i != null) {
                            interfaceC48516J2i.LIZ(c47333Iht);
                        }
                    }
                    if (str == null) {
                        c47333Iht.LJ = -1;
                        InterfaceC48516J2i interfaceC48516J2i2 = c48522J2o;
                        if (interfaceC48516J2i2 != null) {
                            interfaceC48516J2i2.LIZ(c47333Iht);
                        }
                    } else if (!c48517J2j.LIZJ()) {
                        c47333Iht.LJ = -2;
                        InterfaceC48516J2i interfaceC48516J2i3 = c48522J2o;
                        if (interfaceC48516J2i3 != null) {
                            interfaceC48516J2i3.LIZ(c47333Iht);
                        }
                    } else {
                        final C72242sW c72242sW = new C72242sW();
                        if (J3Y.LIZ) {
                            j = System.currentTimeMillis();
                        } else {
                            j = 0;
                        }
                        c72242sW.element = j;
                        C48517J2j c48517J2j2 = C48517J2j.this;
                        C47322Ihi c47322Ihi2 = c47322Ihi;
                        c48517J2j2.getClass();
                        PTYTaskData pTYTaskData = new PTYTaskData(C48517J2j.LJIIIIZZ(c47322Ihi2));
                        final long currentTimeMillis = System.currentTimeMillis();
                        IPitayaCore core = PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ));
                        final C48517J2j c48517J2j3 = C48517J2j.this;
                        final InterfaceC48516J2i interfaceC48516J2i4 = c48522J2o;
                        core.runTask(str, pTYTaskData, new PTYTaskConfig(false, null, 0.0f, 7, null), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.infra.pitaya_sdk.SmartPitayaSdkEngineRunner$runAsync$1.1
                            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData2, PTYPackageInfo pTYPackageInfo) {
                                int i;
                                JSONObject jSONObject;
                                C48517J2j.this.LJ = System.currentTimeMillis() - currentTimeMillis;
                                JSONObject jSONObject2 = null;
                                if (J3Y.LIZ) {
                                    long currentTimeMillis2 = System.currentTimeMillis() - c72242sW.element;
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("pitaya sdk run, onTaskResult cost:");
                                    LIZ.append(currentTimeMillis2);
                                    LIZ.append(" success:");
                                    LIZ.append(z);
                                    LIZ.append(" errorCode:");
                                    LIZ.append(pTYError);
                                    LIZ.append(" resultJson:");
                                    if (pTYTaskData2 != null) {
                                        jSONObject = pTYTaskData2.getParams();
                                    } else {
                                        jSONObject = null;
                                    }
                                    LIZ.append(jSONObject);
                                    X1D.LIZIZ(LIZ);
                                }
                                C48517J2j c48517J2j4 = C48517J2j.this;
                                if (pTYError != null) {
                                    i = pTYError.getCode();
                                } else {
                                    i = -4;
                                }
                                c48517J2j4.LJFF = i;
                                if (z && pTYTaskData2 != null && pTYTaskData2.getParams() != null) {
                                    C48517J2j c48517J2j5 = C48517J2j.this;
                                    C47333Iht c47333Iht2 = c47333Iht;
                                    if (pTYTaskData2 != null) {
                                        jSONObject2 = pTYTaskData2.getParams();
                                    }
                                    InterfaceC48516J2i interfaceC48516J2i5 = interfaceC48516J2i4;
                                    c48517J2j5.getClass();
                                    if (jSONObject2 != null) {
                                        if (jSONObject2.has("label")) {
                                            c47333Iht2.LIZ = jSONObject2.optString("label");
                                        }
                                        if (jSONObject2.has("score_map")) {
                                            JSONObject optJSONObject = jSONObject2.optJSONObject("score_map");
                                            HashMap hashMap = new HashMap();
                                            Iterator<String> keys = optJSONObject.keys();
                                            o.LJIIIIZZ(keys, "scoreMap.keys()");
                                            while (keys.hasNext()) {
                                                String key = keys.next();
                                                o.LJIIIIZZ(key, "key");
                                                hashMap.put(key, Float.valueOf((float) optJSONObject.optDouble(key, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)));
                                            }
                                            c47333Iht2.LIZIZ = hashMap;
                                        }
                                        if (jSONObject2.has("result") && (jSONObject2.opt("result") instanceof Number)) {
                                            c47333Iht2.LIZJ = Float.valueOf((float) jSONObject2.optDouble("result", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
                                        }
                                        Map map = c47333Iht2.LIZLLL;
                                        if (map == null) {
                                            map = new HashMap();
                                            c47333Iht2.LIZLLL = map;
                                        }
                                        Iterator<String> keys2 = jSONObject2.keys();
                                        o.LJIIIIZZ(keys2, "outputs.keys()");
                                        while (keys2.hasNext()) {
                                            String key2 = keys2.next();
                                            o.LJIIIIZZ(key2, "key");
                                            map.put(key2, jSONObject2.opt(key2));
                                        }
                                        c47333Iht2.LJ = 0;
                                        if (interfaceC48516J2i5 != null) {
                                            interfaceC48516J2i5.LIZ(c47333Iht2);
                                            return;
                                        }
                                        return;
                                    }
                                    c47333Iht2.LJ = -5;
                                    if (interfaceC48516J2i5 != null) {
                                        interfaceC48516J2i5.LIZ(c47333Iht2);
                                        return;
                                    }
                                    return;
                                }
                                C47333Iht c47333Iht3 = c47333Iht;
                                c47333Iht3.LJ = -4;
                                InterfaceC48516J2i interfaceC48516J2i6 = interfaceC48516J2i4;
                                if (interfaceC48516J2i6 != null) {
                                    interfaceC48516J2i6.LIZ(c47333Iht3);
                                }
                            }
                        });
                        C48517J2j.this.LJFF = c47333Iht.LJ;
                        InterfaceC48516J2i interfaceC48516J2i5 = c48522J2o;
                        if (interfaceC48516J2i5 != null) {
                            interfaceC48516J2i5.LIZ(c47333Iht);
                        }
                    }
                } finally {
                    C48517J2j.this.LJFF = c47333Iht.LJ;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
