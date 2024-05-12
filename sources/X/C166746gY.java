package X;

import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6gY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166746gY {
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();
    public static volatile boolean LIZIZ;

    public static void LJI() {
        long j;
        int i;
        Integer LJJIL;
        Long LJJIZ;
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        java.util.Map<String, String> map = LIZ;
        if (map.isEmpty()) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(map);
        FMX.LJIIL("speech_to_song_effect", c188727au.LIZ);
        C198517qh c198517qh = new C198517qh();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str = (String) linkedHashMap.get("total_duration");
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        c198517qh.LIZ.put("duration", Long.valueOf(j));
        Object obj = linkedHashMap.get("pipeline_error_stage");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        c198517qh.LIZ.put("error_stage", obj);
        Object obj3 = linkedHashMap.get("error_msg");
        if (obj3 != null) {
            obj2 = obj3;
        }
        c198517qh.LIZ.put("error_detail", obj2);
        String str2 = (String) linkedHashMap.get("error_code");
        if (str2 != null && (LJJIL = C38350F3i.LJJIL(str2)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        c198517qh.LIZ.put("error_code", Integer.valueOf(i));
        FUA.LIZJ("creative_tool_tt_speech_to_song", c198517qh.LJ());
        linkedHashMap.clear();
    }

    public static void LIZ(float f, String str) {
        LIZ.put(str, String.valueOf(f));
    }

    public static void LIZIZ(int i, String str) {
        LIZ.put(str, String.valueOf(i));
    }

    public static void LIZJ(long j, String str) {
        LIZ.put(str, String.valueOf(j));
    }

    public static void LIZLLL(String str, double d) {
        LIZ.put(str, String.valueOf(d));
    }

    public static void LJ(int i, long j, C166936gr c166936gr, int i2, String str, String str2) {
        if (i != 10) {
            if (i != 20) {
                if (i != 40) {
                    if (i != 70) {
                        return;
                    }
                    LIZJ(j, "download_duration");
                    LIZJ(c166936gr.LJFF, "download_max_file_length");
                    LIZIZ(i2, "error_code");
                    if (str != null) {
                        LIZ.put("error_msg", str);
                    }
                    if (str2 == null) {
                        return;
                    }
                    LIZ.put("error_sample", str2);
                    return;
                }
                LIZJ(j, "fetch_duration");
                LIZ(c166936gr.LIZ / c166936gr.LIZLLL, "changed_cache_rate");
                LIZIZ(i2, "error_code");
                if (str == null) {
                    return;
                }
                LIZ.put("error_msg", str);
                return;
            }
            LIZJ(j, "upload_duration");
            LIZ(c166936gr.LIZIZ / c166936gr.LIZLLL, "upload_cache_rate");
            LIZJ(c166936gr.LJ, "upload_max_file_length");
            LIZIZ(i2, "error_code");
            if (str == null) {
                return;
            }
            LIZ.put("error_msg", str);
            return;
        }
        LIZJ(j, "export_duration");
        LIZ(c166936gr.LIZJ / c166936gr.LIZLLL, "extract_audio_cache_rate");
        LIZIZ(i2, "error_code");
        if (str == null) {
            return;
        }
        LIZ.put("error_msg", str);
    }

    public static void LJFF(String bizType, StsRequestModel requestModel, int i, long j, int i2, String str) {
        String effectId;
        o.LJIIIZ(bizType, "bizType");
        o.LJIIIZ(requestModel, "requestModel");
        java.util.Map<String, String> map = LIZ;
        ((LinkedHashMap) map).clear();
        LIZIZ = false;
        List<Effect> templateIds = requestModel.getTemplateIds();
        EffectTemplate effectTemplate = null;
        if (templateIds != null) {
            effectTemplate = (EffectTemplate) ORZ.LJLLLL(templateIds);
        }
        map.put("bizType", bizType);
        if (effectTemplate != null) {
            String name = effectTemplate.getName();
            if (name != null) {
                map.put("template_name", name);
            }
            if (effectTemplate != null && (effectId = effectTemplate.getEffectId()) != null) {
                map.put("template_id", effectId);
            }
        }
        LIZIZ(i2, "error_code");
        map.put("error_msg", str);
        LIZIZ(-3, "pipeline_state_code");
        LIZIZ(1, "pipeline_error_stage");
        LIZLLL("extract_audio_cache_rate", 1.0d);
        LIZLLL("upload_cache_rate", 1.0d);
        LIZLLL("changed_cache_rate", 1.0d);
        LIZJ(0L, "export_duration");
        LIZJ(0L, "upload_duration");
        LIZJ(0L, "fetch_duration");
        LIZJ(0L, "download_duration");
        LIZJ(System.currentTimeMillis() - j, "total_duration");
        LIZIZ(-1, "upload_max_file_length");
        LIZIZ(-1, "download_max_file_length");
        LIZ(i / 1000.0f, "video_duration");
        LJI();
    }
}
