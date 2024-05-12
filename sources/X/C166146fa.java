package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166146fa {
    public static void LJFF() {
        long j;
        int i;
        if (C166156fb.LIZIZ) {
            return;
        }
        C166156fb.LIZIZ = true;
        java.util.Map<String, String> map = C166156fb.LIZ;
        if (map.isEmpty()) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(map);
        FMX.LJIIL("voice_conversion_effect", c188727au.LIZ);
        C198517qh c198517qh = new C198517qh();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str = (String) linkedHashMap.get("total_duration");
        if (str != null) {
            j = CastLongProtector.parseLong(str);
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
        if (str2 != null) {
            i = CastIntegerProtector.parseInt(str2);
        } else {
            i = 0;
        }
        c198517qh.LIZ.put("error_code", Integer.valueOf(i));
        FUA.LIZJ("creative_tool_tt_voice_conversion", c198517qh.LJ());
        linkedHashMap.clear();
    }

    public static void LIZ(int i, String str) {
        C166156fb.LIZ.put(str, String.valueOf(i));
    }

    public static void LIZIZ(long j, String str) {
        C166156fb.LIZ.put(str, String.valueOf(j));
    }

    public static void LIZJ(String str, double d) {
        C166156fb.LIZ.put(str, String.valueOf(d));
    }

    public static void LIZLLL(String str, String value) {
        o.LJIIIZ(value, "value");
        C166156fb.LIZ.put(str, value);
    }

    public static void LJ(int i, long j, double d, int i2, int i3, int i4, String str, String str2, String str3) {
        if (i != 10) {
            if (i != 20) {
                if (i != 40) {
                    if (i != 70) {
                        return;
                    }
                    LIZIZ(j, "download_duration");
                    LIZ(i2, "download_max_file_length");
                    LIZ(i4, "error_code");
                    LIZLLL("error_msg", str);
                    if (str3 == null) {
                        return;
                    }
                    LIZLLL("error_sample", str3);
                    return;
                }
                LIZIZ(j, "fetch_duration");
                LIZJ("changed_cache_rate", d);
                LIZ(i4, "error_code");
                LIZLLL("error_msg", str);
                LIZLLL("logid", str2);
                return;
            }
            LIZIZ(j, "upload_duration");
            LIZJ("upload_cache_rate", d);
            LIZ(i2, "upload_max_file_length");
            LIZ(i4, "error_code");
            LIZLLL("error_msg", str);
            return;
        }
        LIZIZ(j, "export_duration");
        LIZJ("extract_audio_cache_rate", d);
        LIZ(i2, "extract_max_file_length");
        LIZ(i3, "process_track");
        LIZ(i4, "error_code");
        LIZLLL("error_msg", str);
    }
}
