package com.ss.android.ugc.aweme.legoImp.task.publishtest;

import X.AbstractC73672Svk;
import X.C0RN;
import X.C19N;
import X.C35007DoZ;
import X.C35019Dol;
import X.C36870EdW;
import X.C58096Mr6;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.O3U;
import X.PJZ;
import Y.AfS55S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.publishtest.PublishTestSupportSetting$PublishTestSupportConfig;
import defpackage.e1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PublishTestSupportTask implements EE1 {
    public IPublishDrillService LJLIL;

    @Override // X.EEY
    public final String key() {
        return "PublishTestSupportTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(final Context context) {
        IPublishDrillService publishDrillServiceImpl;
        IPublishDrillService iPublishDrillService;
        IPublishDrillService iPublishDrillService2;
        String str;
        IPublishDrillService iPublishDrillService3;
        Object LIZ = C58096Mr6.LIZ(IPublishDrillService.class, false);
        if (LIZ != null) {
            publishDrillServiceImpl = (IPublishDrillService) LIZ;
        } else {
            publishDrillServiceImpl = new PublishDrillServiceImpl();
        }
        this.LJLIL = publishDrillServiceImpl;
        PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig = (PublishTestSupportSetting$PublishTestSupportConfig) SettingsManager.LIZLLL().LJIIIIZZ("publish_support_test2", PublishTestSupportSetting$PublishTestSupportConfig.class, null);
        IPublishDrillService iPublishDrillService4 = this.LJLIL;
        if (iPublishDrillService4 != null) {
            iPublishDrillService4.LIZ(context, publishTestSupportSetting$PublishTestSupportConfig);
        }
        C35019Dol.LIZ();
        C35007DoZ.LIZIZ.LIZ().getBoolean("trigger_launch_protect_drill_crash", false);
        FFL.LJIIIZ().getClass();
        Object LJIJ = FFL.LJIJ(true, "publish_support_test_config_center", 31744, PublishTestSupportSetting$PublishTestSupportConfig.class, null);
        IPublishDrillService iPublishDrillService5 = this.LJLIL;
        if (iPublishDrillService5 != null && (LJIJ instanceof PublishTestSupportSetting$PublishTestSupportConfig)) {
            iPublishDrillService5.LIZ(context, (PublishTestSupportSetting$PublishTestSupportConfig) LJIJ);
        }
        if (e1.LIZ(31744, "libra_publish_test", true, false)) {
            PJZ.LIZLLL("LOG_TYPE_PUBLISH_FUSED_TEST", "PUBLISH_FUSED_TEST_EXCEPTION", new RuntimeException("PUBLISH_FUSED_TEST_EXCEPTION"));
        }
        try {
            String LIZJ = O3U.LIZJ("5f9b53de0fe2c2204e38dad97cd75bf6", "only");
            if (LIZJ != null) {
                try {
                    str = C36870EdW.LIZ(new FileInputStream(new File(LIZJ.concat("/gecko_publish_test.json"))));
                } catch (FileNotFoundException unused) {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && (iPublishDrillService3 = this.LJLIL) != null) {
                    iPublishDrillService3.LIZIZ(context, str);
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            Object invoke = Class.forName("com.ss.android.ugc.aweme.publish_test.PluginPublishTest").getMethod("report", Context.class).invoke(null, context);
            if (invoke != null && (invoke instanceof String) && (iPublishDrillService2 = this.LJLIL) != null) {
                iPublishDrillService2.LIZIZ(context, (String) invoke);
            }
        } catch (Throwable unused3) {
        }
        HotFixTest.init();
        String configJson = HotFixTest.getConfigJson();
        if (!TextUtils.isEmpty(configJson) && (iPublishDrillService = this.LJLIL) != null) {
            iPublishDrillService.LIZIZ(context, configJson);
        }
        if (C19N.LJ("safe_cushion_test", false)) {
            try {
                GsonProtectorUtils.toJson(new Gson(), Activity.class);
            } catch (Throwable th) {
                PJZ.LIZLLL("LOG_TYPE_PUBLISH_FUSED_TEST", "PUBLISH_FUSED_TEST_EXCEPTION", th);
            }
        }
        AbstractC73672Svk.LJJIJIL("").LJIIL(30L, TimeUnit.SECONDS).LJJJJZI(new AfS55S0200000_6(this, context, 5));
        PitayaCoreFactory.getCore(String.valueOf(EF7.LJIIIZ)).registerApplogRunEventCallback("tiktok_drill_test", new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.legoImp.task.publishtest.PublishTestSupportTask.1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                JSONObject params;
                IPublishDrillService iPublishDrillService6;
                if (!z || pTYTaskData == null || (params = pTYTaskData.getParams()) == null) {
                    return;
                }
                String jSONObject = params.toString();
                if (TextUtils.isEmpty(jSONObject) || (iPublishDrillService6 = PublishTestSupportTask.this.LJLIL) == null) {
                    return;
                }
                iPublishDrillService6.LIZIZ(context, jSONObject);
            }
        });
    }
}
