package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L82 {
    public static ConcurrentHashMap<String, Object> LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ = true;
    public static boolean LIZLLL = true;

    public static void LIZIZ(L83 errorStage, L8G errorReason) {
        o.LJIIIZ(errorStage, "errorStage");
        o.LJIIIZ(errorReason, "errorReason");
        LIZ(errorStage, null, null, errorReason);
    }

    public static void LIZJ(L83 errorStage, L84 errorTabPart, L8G errorReason) {
        o.LJIIIZ(errorStage, "errorStage");
        o.LJIIIZ(errorTabPart, "errorTabPart");
        o.LJIIIZ(errorReason, "errorReason");
        LIZ(errorStage, null, errorTabPart, errorReason);
    }

    public static void LIZ(L83 l83, L8C l8c, L84 l84, L8G errorReason) {
        o.LJIIIZ(errorReason, "errorReason");
        if (!LIZIZ && LIZ == null) {
            LIZ = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZ;
        if (concurrentHashMap != null) {
            if (l83 != null) {
                concurrentHashMap.put(L81.ERROR_STAGE.getCateGoryStr(), l83.getStageStr());
            }
            if (l8c != null) {
                concurrentHashMap.put(L81.OPERATION_TYPE.getCateGoryStr(), l8c.getTypeStr());
            }
            if (l84 != null) {
                concurrentHashMap.put(L81.ERROR_TAB_PART.getCateGoryStr(), l84.getPartStr());
            }
            concurrentHashMap.put(L81.ERROR_REASON.getCateGoryStr(), errorReason);
        }
    }
}
