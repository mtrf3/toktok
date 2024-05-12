package com.benchmark.strategy;

import X.C09580Ze;
import X.C09590Zf;
import X.C16880lQ;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BXPitayaHandler {
    public static String Aid;
    public static boolean isPitayReady;

    public static void InitPitayaHandler() {
        Aid = String.valueOf(C09590Zf.LJIILLIIL.LIZJ);
        HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
        if (hostSetupWatcher.isHostSetup()) {
            return;
        }
        hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.benchmark.strategy.BXPitayaHandler.2
            @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
            public void onHostSetup(boolean z) {
                if (!C09590Zf.LJIILLIIL.LJIIJ.get()) {
                    return;
                }
                if (z) {
                    BXPitayaHandler.isPitayReady = PitayaCoreFactory.getCore(BXPitayaHandler.Aid).isReady();
                    C09580Ze.LIZJ().LIZ().LIZ("test_pitaya", "-10086");
                } else {
                    BXPitayaHandler.isPitayReady = false;
                }
            }
        });
    }

    public static String runPitaya(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!isPitayReady) {
            return "";
        }
        IPitayaCore core = PitayaCoreFactory.getCore(Aid);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e = e;
        }
        try {
            jSONObject.put("output1", 9.5683d);
        } catch (JSONException e2) {
            e = e2;
            jSONObject2 = jSONObject;
            C16880lQ.LLLLIIL(e);
            jSONObject = jSONObject2;
            final String[] strArr = new String[1];
            core.runTask(str, new PTYTaskData(jSONObject), new PTYTaskConfig(true, str3, -1.0f), new PTYTaskResultCallback() { // from class: com.benchmark.strategy.BXPitayaHandler.1
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                    if (z) {
                        strArr[0] = pTYTaskData.getParams().toString();
                    } else {
                        strArr[0] = "";
                    }
                }
            });
            return strArr[0];
        }
        final String[] strArr2 = new String[1];
        core.runTask(str, new PTYTaskData(jSONObject), new PTYTaskConfig(true, str3, -1.0f), new PTYTaskResultCallback() { // from class: com.benchmark.strategy.BXPitayaHandler.1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                if (z) {
                    strArr2[0] = pTYTaskData.getParams().toString();
                } else {
                    strArr2[0] = "";
                }
            }
        });
        return strArr2[0];
    }
}
