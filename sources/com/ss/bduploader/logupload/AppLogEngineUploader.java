package com.ss.bduploader.logupload;

import X.C16880lQ;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.bduploader.BDUploadLog;
import com.ss.bduploader.BDUploadUtil;
import com.ss.bduploader.UploadEventManager;
import com.ss.bduploader.net.BDUploadThreadPool;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AppLogEngineUploader implements VideoEventEngineUploader {

    /* loaded from: classes7.dex */
    public static class Holder {
        public static final AppLogEngineUploader instance = new AppLogEngineUploader();
    }

    public AppLogEngineUploader() {
    }

    public static AppLogEngineUploader getInstance() {
        return Holder.instance;
    }

    public static void logPrint(final JSONObject jSONObject) {
        BDUploadThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.bduploader.logupload.AppLogEngineUploader.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_bduploader_logupload_AppLogEngineUploader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_bduploader_logupload_AppLogEngineUploader$1__run$___twin___() {
                if (jSONObject == null) {
                    return;
                }
                BDUploadLog.i("ttmn", "++++++++++++++++");
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        if (next != null) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("++++:");
                            LIZ.append(next);
                            LIZ.append(":");
                            LIZ.append(jSONObject.get(next));
                            BDUploadLog.i("ttmn", X1D.LIZIZ(LIZ));
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                BDUploadLog.i("ttmn", "++++++++++++++++++++");
            }

            public static void com_ss_bduploader_logupload_AppLogEngineUploader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_bduploader_logupload_AppLogEngineUploader$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.bduploader.logupload.VideoEventEngineUploader
    public void onEventV3(String str, JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            logPrint(jSONObject);
            if (BDUploadUtil.eventEngineUploader != null) {
                setJsonValue(jSONObject, "upload_log_type", "2");
                BDUploadUtil.eventEngineUploader.onEventV3(str, jSONObject);
                return;
            }
            setJsonValue(jSONObject, "upload_log_type", "1");
            try {
                Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class).invoke(null, str, jSONObject);
            } catch (Exception e) {
                setJsonValue(jSONObject, "upload_log_type", CardStruct.IStatusCode.DEFAULT);
                UploadEventManager.instance.putEvent(jSONObject);
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    private JSONObject setJsonValue(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }
}
