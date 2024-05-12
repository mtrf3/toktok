package X;

import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IlA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47536IlA implements InterfaceC47537IlB {
    public final WeakReference<C47736IoO> LIZ;

    public C47536IlA(C47736IoO c47736IoO) {
        this.LIZ = new WeakReference<>(c47736IoO);
    }

    @Override // X.InterfaceC47537IlB
    public final void LIZ(String str) {
        JSONObject LIZIZ;
        JSONObject optJSONObject;
        if (this.LIZ.get() != null && (LIZIZ = C47538IlC.LIZ.LIZ.LJ.get(str).LIZIZ()) != null) {
            C47147Iet.LIZ.LJ().setSettingsInfo(str, LIZIZ.toString());
            C47534Il8 c47534Il8 = C47533Il7.LIZ;
            String jSONObject = LIZIZ.toString();
            c47534Il8.getClass();
            if (!TextUtils.isEmpty(str) && str.equals("vod")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateLabelBySettings key: ");
                LIZ.append(str);
                LIZ.append("value: ");
                LIZ.append(jSONObject);
                TTVideoEngineLog.d("PortraitEngine", X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(jSONObject)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONObject);
                        if (jSONObject2.has("portrait_engine") && (optJSONObject = jSONObject2.optJSONObject("portrait_engine")) != null) {
                            if (optJSONObject.has("clinet_quality_speed")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("clinet_quality_speed")), "clinet_quality_speed");
                            }
                            if (optJSONObject.has("clinet_quality_stability")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("clinet_quality_stability")), "clinet_quality_stability");
                            }
                            if (optJSONObject.has("rebuf_label")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("rebuf_label")), "rebuf_label");
                            }
                            if (optJSONObject.has("ff_label")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("ff_label")), "ff_label");
                            }
                            if (optJSONObject.has("seek_label")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("seek_label")), "seek_label");
                            }
                            if (optJSONObject.has("watch_duration")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("watch_duration")), "watch_duration");
                            }
                            if (optJSONObject.has("first_frame")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("first_frame")), "first_frame");
                            }
                            if (optJSONObject.has("rebuffering")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("rebuffering")), "rebuffering");
                            }
                            if (optJSONObject.has("user_enter_full_screen")) {
                                c47534Il8.LIZ(Integer.valueOf(optJSONObject.optInt("user_enter_full_screen")), "user_enter_full_screen");
                            }
                            if (optJSONObject.has("scene_count_per_100vv")) {
                                c47534Il8.LIZ(Double.valueOf(optJSONObject.optDouble("scene_count_per_100vv")), "scene_count_per_100vv");
                            }
                            if (optJSONObject.has("user_quality_sensitivity")) {
                                c47534Il8.LIZ(Double.valueOf(optJSONObject.optDouble("user_quality_sensitivity")), "user_quality_sensitivity");
                            }
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (!str.equals("vod")) {
                str.equals("mdl");
            }
        }
    }
}
