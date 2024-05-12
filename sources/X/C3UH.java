package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3UH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UH {
    public static final java.util.Map<String, Integer> LIZ = new LinkedHashMap();
    public static C45440HsS LIZIZ;

    public static void LIZ() {
        for (Map.Entry entry : ((LinkedHashMap) LIZ).entrySet()) {
            String str = (String) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            java.util.Map<String, Integer> map = LIZ;
            map.put(str, Integer.valueOf(intValue + 1));
            Integer num = (Integer) ((LinkedHashMap) map).get(str);
            if (num != null && num.intValue() >= 12) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("doMsgTimeOutEvent, target uri is ");
                LIZ2.append(str);
                LIZLLL(X1D.LIZIZ(LIZ2));
                AVExternalServiceImpl.LIZ().publishService().onSaveLocalTimeoutEvent(str);
                map.remove(str);
            }
        }
    }

    public static void LIZIZ() {
        java.util.Map<String, Integer> map = LIZ;
        if (map.isEmpty()) {
            LIZLLL("check2cancelModerationQuery, empty list cancel push&loop");
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).unRegisterModerationResultPush();
            C45440HsS c45440HsS = LIZIZ;
            if (c45440HsS != null) {
                c45440HsS.LIZ();
            }
            LIZIZ = null;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("check2cancelModerationQuery, current list is ");
        LIZ2.append(map);
        LIZLLL(X1D.LIZIZ(LIZ2));
    }

    public static void LIZJ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("doMsgTransmission, data is ");
        LIZ2.append(str);
        LIZLLL(X1D.LIZIZ(LIZ2));
        AVExternalServiceImpl.LIZ().publishService().saveLocalByUniqueURI(str);
    }

    public static void LIZLLL(String str) {
        I9A.LIZJ("PubilshVideoModeration", str);
    }
}
