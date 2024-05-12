package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public final class YQK {
    public static final java.util.Map<Integer, YQS> LIZLLL;
    public List<C87364YQm> LIZ;
    public InterfaceC87375YQx LIZIZ;
    public boolean LIZJ;

    static {
        HashMap hashMap = new HashMap();
        LIZLLL = hashMap;
        hashMap.put(8, YQS.DEPTH_OUTPUT);
        hashMap.put(1, YQS.MANUAL_3A);
        hashMap.put(11, YQS.LOGICAL_MULTI_CAMERA);
    }

    public final void LIZ() {
        String str;
        String str2;
        InterfaceC87375YQx interfaceC87375YQx = this.LIZIZ;
        List<C87364YQm> list = this.LIZ;
        interfaceC87375YQx.getClass();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C87364YQm c87364YQm = (C87364YQm) it.next();
            switch (YQP.LIZIZ[c87364YQm.LIZ.ordinal()]) {
                case 1:
                    str = "te_record_camera_depth_capacity";
                    break;
                case 2:
                    str = "te_record_camera_support_preview_size";
                    break;
                case 3:
                    str = "te_record_camera_support_picture_size";
                    break;
                case 4:
                    str = "te_record_camera_support_fps_range";
                    break;
                case 5:
                    str = "te_record_camera_manual_3a_capability";
                    break;
                case 6:
                    str = "te_record_camera_high_speed_video_fps_range";
                    break;
                case 7:
                    str = "te_record_camera_support_apertures";
                    break;
                case 8:
                    str = "te_record_camera_logical_multi_camera_capacity";
                    break;
                case 9:
                    str = "te_record_camera_support_extensions";
                    break;
                case 10:
                    str = "te_record_camera_front_back_multicam_combos";
                    break;
                default:
                    C63922P6w.LJ("TECameraCapabilityKBUpload", "key is null, capability is incorrect!");
                    continue;
            }
            int i = YQP.LIZ[c87364YQm.LIZIZ.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            C87367YQp.LIZIZ(str, (String) c87364YQm.LIZJ);
                        }
                    } else {
                        if (((Boolean) c87364YQm.LIZJ).booleanValue()) {
                            str2 = "true";
                        } else {
                            str2 = "false";
                        }
                        C87367YQp.LIZIZ(str, str2);
                    }
                } else {
                    double doubleValue = ((Double) c87364YQm.LIZJ).doubleValue();
                    if (C87367YQp.LIZ != null) {
                        C87367YQp.LIZ.perfDouble(str, doubleValue);
                    }
                }
            } else {
                C87367YQp.LIZ(str, ((Long) c87364YQm.LIZJ).longValue());
            }
        }
        ((ArrayList) this.LIZ).clear();
    }
}
