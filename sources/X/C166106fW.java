package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6fW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166106fW {
    public static void LIZIZ(C166396fz c166396fz) {
        for (C166116fX c166116fX : c166396fz.LIZLLL) {
            if (!c166116fX.LJII) {
                LIZ(!c166116fX.LJIIIIZZ ? 1 : 0, "is_compensation_upload");
                LIZ(c166116fX.LJIIIZ, "origin_file_length");
                LIZ(c166116fX.LJIIJ, "upload_file_length");
                LIZ(c166116fX.LJIIJJI, "error_code");
                String value = c166116fX.LJIIL;
                o.LJIIIZ(value, "value");
                java.util.Map<String, String> map = C166096fV.LIZ;
                map.put("error_msg", value);
                LIZ(c166116fX.LJIILIIL, "pipeline_error_stage");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIIZZ(map);
                FMX.LJIIL("voice_conversion_effect_file_pre", c188727au.LIZ);
            }
        }
        ((LinkedHashMap) C166096fV.LIZ).clear();
    }

    public static void LIZ(int i, String str) {
        C166096fV.LIZ.put(str, String.valueOf(i));
    }
}
