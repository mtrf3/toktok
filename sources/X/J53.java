package X;

import com.ss.android.ugc.aweme.ml.ab.SmartSceneReportConfig;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import defpackage.i0;
import java.util.List;
import ujb.s;

/* loaded from: classes9.dex */
public final class J53 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static float LIZJ;
    public static float LIZLLL;
    public static List<String> LJ;

    public static boolean LIZ(String str) {
        if (!LIZ) {
            List<String> list = null;
            SmartSceneReportConfig smartSceneReportConfig = (SmartSceneReportConfig) i0.LJ(false, "ml_scene_report_config", 31744, SmartSceneReportConfig.class, null);
            if (smartSceneReportConfig != null) {
                LIZIZ = smartSceneReportConfig.getEnable();
                LIZJ = smartSceneReportConfig.getInitRate();
                LIZLLL = smartSceneReportConfig.getRunRate();
                String ignoreScene = smartSceneReportConfig.getIgnoreScene();
                if (ignoreScene != null) {
                    list = s.LJLJJL(ignoreScene, new String[]{","}, 0, 6);
                }
                LJ = list;
            }
            MLCommonService.Companion.getClass();
            LIZ = true;
        }
        if (!LIZIZ) {
            return false;
        }
        List<String> list2 = LJ;
        if (list2 == null || !ORZ.LJLJJI(str, list2)) {
            return true;
        }
        MLCommonService.Companion.getClass();
        return false;
    }
}
