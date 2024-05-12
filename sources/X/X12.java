package X;

import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class X12 {
    public static final java.util.Map<String, Class> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        hashMap.put("facing", Integer.class);
        hashMap.put("device_support_wide_angle_mode", Integer.class);
        hashMap.put("device_support_antishake_mode", Integer.class);
        hashMap.put("device_support_ai_night_video", Integer.class);
        hashMap.put("support_light_soft", Boolean.class);
        hashMap.put("support_wide_angle", Boolean.class);
        hashMap.put("support_telephoto", Boolean.class);
        hashMap.put("support_body_beauty", Boolean.class);
        hashMap.put("support_anti_shake", Boolean.class);
        hashMap.put("support_fps_480", Boolean.class);
        hashMap.put("support_fps_120", Boolean.class);
        hashMap.put("support_fps_60", Boolean.class);
        hashMap.put("support_preview_sizes", ArrayList.class);
        hashMap.put("support_picture_sizes", ArrayList.class);
        hashMap.put("camera_preview_size", TEFrameSizei.class);
        hashMap.put("camera_focus_parameters", TEFocusParameters.class);
        hashMap.put("camera_torch_supported", Boolean.class);
        hashMap.put("support_video_sizes", ArrayList.class);
        hashMap.put("camera_support_fps_range", ArrayList.class);
        hashMap.put("device_should_use_shader_zoom", Boolean.class);
        hashMap.put("device_support_multicamera_zoom", Boolean.class);
    }
}
