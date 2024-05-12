package X;

import java.util.HashMap;

/* renamed from: X.Wxx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84001Wxx {
    public static final java.util.Map<String, Class> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        hashMap.put("enable_body_beauty", Boolean.class);
        hashMap.put("enable_light_soft", Boolean.class);
        hashMap.put("enable_anti_shake", Boolean.class);
        hashMap.put("video_path", String.class);
        hashMap.put("body_beauty_level", Integer.class);
        hashMap.put("enable_dim_light_quality", Boolean.class);
        hashMap.put("enable_ai_night_video", Boolean.class);
        hashMap.put("enable_video_stabilization", Boolean.class);
        hashMap.put("enable_super_Stabilization", Boolean.class);
        hashMap.put("enable_video_hdr", Boolean.class);
        hashMap.put("video_fps", int[].class);
        hashMap.put("aperture", Float.class);
        hashMap.put("flash_mode", Integer.class);
        hashMap.put("face_detect", Integer.class);
        hashMap.put("exposure_compensation", Integer.class);
    }

    public static boolean LIZ(Object obj, String str) {
        java.util.Map<String, Class> map = LIZ;
        if (((HashMap) map).containsKey(str) && (obj == null || obj.getClass() == ((HashMap) map).get(str))) {
            return true;
        }
        return false;
    }
}
