package X;

import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6lB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169616lB {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String str, List list) {
        int i;
        int i2;
        Integer num;
        int i3 = 0;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(str)).entrySet()) {
                String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                Object value = entry.getValue();
                if ((value instanceof Integer) && (num = (Integer) value) != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                linkedHashMap.put(lowerCase, Integer.valueOf(i2));
            }
            Iterator it = ((ArrayList) list).iterator();
            i3 = 0;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                Integer num2 = (Integer) linkedHashMap.get(lowerCase2);
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                i3 += i;
            }
        } catch (Exception unused) {
        }
        return i3;
    }

    public static List LIZJ(String metricsStr, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        JSONObject optJSONObject;
        o.LJIIIZ(metricsStr, "metricsStr");
        ArrayList arrayList = new ArrayList();
        if (metricsStr.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    JSONObject optJSONObject2 = new JSONObject(metricsStr).optJSONObject("blackResult");
                    if (optJSONObject2 != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("audio_params");
                        if (optJSONObject3 != null) {
                            z3 = o.LJ(optJSONObject3.opt("num_channel"), 1);
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            arrayList.add("Mono");
                        }
                        JSONObject optJSONObject4 = optJSONObject2.optJSONObject("clipping");
                        if (optJSONObject4 != null) {
                            if (optJSONObject4.optDouble("rate") > jSONObject.optDouble("clipping_rate") || optJSONObject4.optDouble("peak_rate_left") > jSONObject.optDouble("peak_rate_left")) {
                                arrayList.add("Clipping");
                            } else if (optJSONObject3 != null && optJSONObject3.optInt("num_channel") > 1 && optJSONObject4.optDouble("peak_rate_right") > jSONObject.optDouble("peak_rate_right")) {
                                arrayList.add("Clipping");
                            }
                        }
                        JSONObject optJSONObject5 = optJSONObject2.optJSONObject("cutoff_frequency");
                        if (optJSONObject5 != null) {
                            if (optJSONObject5.optDouble("rel_left") < jSONObject.optDouble("cutoff_frequency_left") && optJSONObject5.optDouble("rel_left_conf") > jSONObject.optDouble("cutoff_frequency_left_conf") && optJSONObject5.optDouble("band_std_left") < jSONObject.optDouble("band_std_left")) {
                                arrayList.add("CutOffFrequency");
                            } else if (optJSONObject3 != null && optJSONObject3.optInt("num_channel") > 1 && optJSONObject5.optDouble("rel_right") < jSONObject.optDouble("cutoff_frequency_right") && optJSONObject5.optDouble("rel_right_conf") > jSONObject.optDouble("cutoff_frequency_right_conf") && optJSONObject5.optDouble("band_std_right") < jSONObject.optDouble("band_std_right")) {
                                arrayList.add("CutOffFrequency");
                            }
                        }
                        JSONObject optJSONObject6 = optJSONObject2.optJSONObject("rms_stats");
                        if (optJSONObject6 != null) {
                            if (optJSONObject6.optDouble("dc_offset_left") > jSONObject.optDouble("dc_offset_left")) {
                                arrayList.add("DCOffset");
                            } else if (optJSONObject3 != null && optJSONObject3.optInt("num_channel") > 1 && optJSONObject6.optDouble("dc_offset_right") > jSONObject.optDouble("dc_offset_right")) {
                                arrayList.add("DCOffset");
                            }
                        }
                        JSONObject optJSONObject7 = optJSONObject2.optJSONObject("rms_stats");
                        if (optJSONObject7 != null) {
                            if (optJSONObject7.optDouble("left_total") > jSONObject.optDouble("rms_left_upper") || optJSONObject7.optDouble("left_total") < jSONObject.optDouble("rms_left_lower") || optJSONObject7.optDouble("peak") > jSONObject.optDouble("rms_peak")) {
                                arrayList.add("RMS");
                            } else if (optJSONObject3 != null && optJSONObject3.optInt("num_channel") > 1 && (optJSONObject7.optDouble("right_total") > jSONObject.optDouble("rms_right_upper") || optJSONObject7.optDouble("right_total") < jSONObject.optDouble("rms_right_lower") || Math.abs(optJSONObject7.optDouble("left_right_diff")) <= jSONObject.optDouble("rms_diff"))) {
                                arrayList.add("RMS");
                            }
                        }
                        if (optJSONObject3 != null && optJSONObject3.optInt("num_channel") == 2 && (optJSONObject = optJSONObject2.optJSONObject("phase_check")) != null) {
                            if (optJSONObject.optBoolean("has_phase_issue")) {
                                arrayList.add("Phase");
                            } else if (optJSONObject3.optInt("num_channel") > 1 && Math.abs(optJSONObject.optDouble("rms_downmix_diff")) < jSONObject.optDouble("rms_downmix_diff")) {
                                arrayList.add("Phase");
                            }
                        }
                        JSONObject optJSONObject8 = optJSONObject2.optJSONObject("loudness");
                        if (optJSONObject8 != null && optJSONObject8.optDouble("integrated_loudness") > jSONObject.optDouble("integrated_loudness")) {
                            arrayList.add("Loudness");
                        }
                    } else {
                        return arrayList;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public static Object LIZIZ(String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (str != null && str2 != null) {
            VEUtils.detectAudioMetrics(str, str2, str3, new YO6() { // from class: X.6lC
                @Override // X.YO6
                public final void LIZ(String str4, int i) {
                    if (i != -1) {
                        if (i != 2) {
                            return;
                        }
                        InterfaceC67352kd<String> interfaceC67352kd2 = c84654XKg;
                        if (str4 == null) {
                            str4 = "";
                        }
                        C3C5.m7constructorimpl(str4);
                        interfaceC67352kd2.resumeWith(str4);
                        return;
                    }
                    InterfaceC67352kd<String> interfaceC67352kd3 = c84654XKg;
                    if (str4 == null) {
                        str4 = "";
                    }
                    C3C5.m7constructorimpl(str4);
                    interfaceC67352kd3.resumeWith(str4);
                }
            });
        } else {
            C3C5.m7constructorimpl("");
            c84654XKg.resumeWith("");
        }
        return c84654XKg.LIZ();
    }
}
