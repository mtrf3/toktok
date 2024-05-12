package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PDP {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";

    public final void LIZ(int i, int i2, String str, String str2) {
        String str3;
        if (i != -1) {
            if (i != 0) {
                if (i != 1000) {
                    if (i != 1001) {
                        if (i != 1100) {
                            if (i != 1200) {
                                if (i != 1202) {
                                    if (i != 1203) {
                                        switch (i) {
                                            case 2010:
                                                str3 = "speech_sdk_voiceclone_get_task";
                                                break;
                                            case 2011:
                                                str3 = "speech_sdk_voiceclone_check_env";
                                                break;
                                            case 2012:
                                                str3 = "speech_sdk_voiceclone_record_voice";
                                                break;
                                            case 2013:
                                                str3 = "speech_sdk_voiceclone_query_status";
                                                break;
                                            case 2014:
                                                str3 = "speech_sdk_voiceclone_submit_task";
                                                break;
                                            case 2015:
                                                str3 = "speech_sdk_voiceclone_delete_data";
                                                break;
                                            default:
                                                str3 = "";
                                                break;
                                        }
                                    } else {
                                        str3 = "speech_sdk_update_wakeup_words_params";
                                    }
                                } else {
                                    str3 = "speech_sdk_trigger_wakeup_query";
                                }
                            } else {
                                str3 = "speech_sdk_trigger_wakeup";
                            }
                        } else {
                            str3 = "speech_sdk_finish_talking";
                        }
                    } else {
                        str3 = "speech_sdk_stop_engine";
                    }
                } else {
                    str3 = "speech_sdk_start_engine";
                }
            } else {
                str3 = "speech_sdk_init_engine";
            }
        } else {
            str3 = "speech_sdk_destroy_engine";
        }
        if (str3.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("engine_name", str);
            jSONObject.put("error_code", i2);
            jSONObject.put("host_aid", this.LIZ);
            jSONObject.put("timestamp", Long.toString(System.currentTimeMillis()));
            if (str2 != null && !str2.isEmpty()) {
                jSONObject.put("directive_data", str2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SDKMonitorUtils.LIZIZ("4060").LJIIJ(str3, jSONObject, null, null);
    }

    public final void LIZIZ(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str6.isEmpty() || str7.isEmpty()) {
            return;
        }
        SDKMonitorUtils.LIZLLL("4060", Collections.singletonList(str6));
        SDKMonitorUtils.LJ("4060", Collections.singletonList(str7));
        this.LIZ = str2;
        this.LIZIZ = str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", this.LIZIZ);
            jSONObject.put("host_aid", this.LIZ);
            jSONObject.put("sdk_version", str3);
            jSONObject.put("app_version", str4);
            jSONObject.put("update_version_code", str5);
            jSONObject.put("channel", str8);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        SDKMonitorUtils.LIZJ(C16880lQ.LLLLL(context), "4060", jSONObject, new PDQ(this));
    }
}
