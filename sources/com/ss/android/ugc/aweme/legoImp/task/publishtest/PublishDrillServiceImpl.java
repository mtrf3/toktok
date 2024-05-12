package com.ss.android.ugc.aweme.legoImp.task.publishtest;

import X.C16880lQ;
import X.EPL;
import X.PJZ;
import Y.ARunnableS7S0301000_6;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.experiment.publishtest.PublishTestSupportSetting$PublishTestSupportConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PublishDrillServiceImpl implements IPublishDrillService {
    public volatile Map<String, String> LIZ;

    public static String LIZLLL(String str) {
        if ("paths_in_crash_ext".equals(str)) {
            return EPL.LIZLLL.toString();
        }
        if ("drill_publish_data".equals(str)) {
            return String.valueOf(System.currentTimeMillis());
        }
        return C16880lQ.LLLZ("unsupport tag %s", new Object[]{str});
    }

    public final Map<String, String> LIZJ(PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig) {
        if (this.LIZ != null) {
            return this.LIZ;
        }
        this.LIZ = new HashMap();
        String str = publishTestSupportSetting$PublishTestSupportConfig.customerDataTags;
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                ((HashMap) this.LIZ).put(str2, LIZLLL(str2));
            }
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService
    public final void LIZ(Context context, PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig) {
        String str;
        try {
            Object[] objArr = new Object[1];
            if (publishTestSupportSetting$PublishTestSupportConfig != null) {
                str = publishTestSupportSetting$PublishTestSupportConfig.toString();
            } else {
                str = "null";
            }
            objArr[0] = str;
            C16880lQ.LLLZ("PublishTestSupportSetting config %s ", objArr);
            if (publishTestSupportSetting$PublishTestSupportConfig != null && publishTestSupportSetting$PublishTestSupportConfig.testTriggerDelay >= 0) {
                new PthreadThread(new ARunnableS7S0301000_6(1, this, publishTestSupportSetting$PublishTestSupportConfig, context, 2), "PublishDrillServiceImpl").start();
            }
        } catch (Throwable th) {
            PJZ.LIZLLL("LOG_TYPE_PUBLISH_DRILL_TEST", "drill_inner_error", th);
        }
    }

    @Override // com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService
    public final void LIZIZ(Context context, String str) {
        if (str != null) {
            e eVar = new e();
            eVar.LJIILL = true;
            LIZ(context, (PublishTestSupportSetting$PublishTestSupportConfig) GsonProtectorUtils.fromJson(eVar.LIZ(), str, PublishTestSupportSetting$PublishTestSupportConfig.class));
        }
    }

    public final void LJ(Context context, PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig) {
        Object LIZLLL;
        if (!TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.drillPath) && !TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.appLogEvent)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                jSONObject.put("event_v3_reserved_field_time_stamp", System.currentTimeMillis());
                jSONObject.put("drill_path", publishTestSupportSetting$PublishTestSupportConfig.drillPath);
                if (!TextUtils.isEmpty(publishTestSupportSetting$PublishTestSupportConfig.appLogWithDataTags)) {
                    Map<String, String> LIZJ = LIZJ(publishTestSupportSetting$PublishTestSupportConfig);
                    HashMap hashMap = new HashMap();
                    for (String str : publishTestSupportSetting$PublishTestSupportConfig.appLogWithDataTags.split(",")) {
                        HashMap hashMap2 = (HashMap) LIZJ;
                        if (hashMap2.containsKey(str)) {
                            LIZLLL = hashMap2.get(str);
                        } else {
                            LIZLLL = LIZLLL(str);
                        }
                        hashMap.put(str, LIZLLL);
                    }
                    jSONObject.put("custom_data", new JSONObject(hashMap).toString());
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            AppLog.onEvent(context, "event_v3", publishTestSupportSetting$PublishTestSupportConfig.appLogEvent, (String) null, 0L, 0L, jSONObject);
        }
    }
}
