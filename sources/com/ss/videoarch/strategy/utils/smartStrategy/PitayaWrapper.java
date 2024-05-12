package com.ss.videoarch.strategy.utils.smartStrategy;

import X.C16880lQ;
import X.C79346VCc;
import X.C79351VCh;
import X.VDC;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.feature.store.PTYFeatureProducer;
import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class PitayaWrapper {
    public static volatile PitayaWrapper LJIIJ;
    public StreamStrategyFeatureProducer LJIIIIZZ;
    public Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public String LIZIZ = "330361";
    public JSONObject LIZJ = null;
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public final long LJI = 180000;
    public int LJII = -1;
    public final PitayaBridge LJIIIZ = new PitayaBridge();

    public static PitayaWrapper LIZIZ() {
        if (LJIIJ == null) {
            synchronized (PitayaWrapper.class) {
                if (LJIIJ == null) {
                    LJIIJ = new PitayaWrapper();
                }
            }
        }
        return LJIIJ;
    }

    public final void LIZJ() {
        this.LJIIIIZZ = new StreamStrategyFeatureProducer();
        PTYFeatureStoreInstance.INSTANCE.getFeatureStore().registerFeatureProducer(this.LJIIIIZZ, new PTYNormalCallback() { // from class: com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper.6
            @Override // com.bytedance.pitaya.api.PTYNormalCallback
            public void onResult(boolean z, PTYError pTYError) {
            }
        });
    }

    public final void LIZLLL(Context context) {
        IPitayaCore core = PitayaCoreFactory.getCore(this.LIZIZ);
        String str = this.LIZIZ;
        VDC.LIZ();
        core.setup(context, new PTYSetupInfo(str, "1.4.115.4", this.LJFF, new PTYDIDCallback() { // from class: com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper.2
            @Override // com.bytedance.pitaya.api.PTYDIDCallback
            public String getDid() {
                return PitayaWrapper.this.LIZLLL;
            }
        }, new PTYUIDCallback() { // from class: com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper.3
            @Override // com.bytedance.pitaya.api.PTYUIDCallback
            public String getUid() {
                return PitayaWrapper.this.LJ;
            }
        }, null, new PTYSettingsCallback() { // from class: com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper.4
            @Override // com.bytedance.pitaya.api.PTYSettingsCallback
            public JSONObject getSettings(String str2) {
                String str3 = C79346VCc.LIZLLL().LJIIL.LIZLLL.mPitayaABSettingsParams;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        return new JSONObject().put("content", new JSONObject(str3));
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                return null;
            }
        }, 2, true, null, 2, null, false, false, null), new PTYSetupCallback() { // from class: com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper.5
            @Override // com.bytedance.pitaya.api.PTYSetupCallback
            public void onResult(boolean z, PTYError pTYError) {
                Handler handler = PitayaWrapper.this.LIZ;
                if (handler != null && z) {
                    handler.removeMessages(1028);
                    PitayaWrapper.this.LIZ.sendEmptyMessage(1028);
                }
            }
        });
    }

    /* loaded from: classes15.dex */
    public static class StreamStrategyFeatureProducer extends PTYFeatureProducer {
        public final String FEATURE_GROUP_NAME = "live_stream_strategy_feature_group";

        @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
        public String getGroupName() {
            return "live_stream_strategy_feature_group";
        }

        @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
        public float getNumericFeature(String str, JSONObject jSONObject) {
            return 0.0f;
        }

        @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
        public JSONArray getSeqFeature(String str, JSONObject jSONObject) {
            return null;
        }

        @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
        public String getStringFeature(String str, JSONObject jSONObject) {
            return null;
        }

        @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureProducer
        public JSONObject getDictFeature(String str, JSONObject jSONObject) {
            C79351VCh.LIZIZ().getClass();
            return C79351VCh.LIZ("2", "", jSONObject);
        }
    }

    public final void LIZ(final Context context, String str, JSONObject jSONObject) {
        Handler handler;
        this.LIZJ = jSONObject;
        this.LIZIZ = str;
        if (jSONObject != null) {
            if (jSONObject.has("device_id")) {
                this.LIZLLL = this.LIZJ.optString("device_id");
            }
            if (this.LIZJ.has("user_id")) {
                this.LJ = this.LIZJ.optString("user_id");
            }
            if (this.LIZJ.has("channel")) {
                this.LJFF = this.LIZJ.optString("channel");
            }
        }
        HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
        if (hostSetupWatcher.isHostSetup()) {
            LIZLLL(context);
            return;
        }
        hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper.1
            @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
            public void onHostSetup(boolean z) {
                Handler handler2;
                PitayaWrapper pitayaWrapper = PitayaWrapper.this;
                if (pitayaWrapper.LJII == 1 && (handler2 = pitayaWrapper.LIZ) != null) {
                    handler2.removeMessages(1026);
                }
                if (z) {
                    PitayaWrapper.this.LIZLLL(context);
                }
            }
        });
        if (this.LJII != 1 || (handler = this.LIZ) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(1026, this.LJI);
    }
}
