package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.internal.h;
import com.google.gson.s;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KNW {
    public static java.util.Map LIZ() {
        String str;
        Keva LIZIZ = LIZIZ();
        java.util.Map map = null;
        if (LIZIZ != null) {
            str = LIZIZ.getString("effectCardInteractionMap", "");
        } else {
            str = null;
        }
        try {
            map = (java.util.Map) GsonProtectorUtils.fromJson(C6YQ.LIZ(), str, new KNX().getType());
        } catch (s e) {
            H78.LJ(e);
        }
        if (map == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    public static Keva LIZIZ() {
        IAccountService iAccountService;
        RBY LJFF;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (iAccountService = (IAccountService) serviceManager.getService(IAccountService.class)) != null && (LJFF = iAccountService.LJFF()) != null) {
            if (LJFF.isLogin()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("effect_recommendation_card_");
                LIZ.append(LJFF.getCurUserId());
                return Keva.getRepo(X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("effect_recommendation_card_");
            LIZ2.append(AppLog.getInstallId());
            return Keva.getRepo(X1D.LIZIZ(LIZ2));
        }
        return null;
    }

    public static void LIZJ(String str) {
        if (str != null) {
            String id = h.LJIIIIZZ(str);
            java.util.Map LIZ = LIZ();
            o.LJIIIIZZ(id, "id");
            LIZ.put(id, Boolean.TRUE);
            String json = GsonProtectorUtils.toJson(C6YQ.LIZ(), LIZ);
            Keva LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.storeString("effectCardInteractionMap", json);
            }
        }
    }

    public static void LIZLLL(String str) {
        Integer valueOf;
        String[] stringArray;
        Keva LIZIZ = LIZIZ();
        List list = null;
        if (LIZIZ != null && (stringArray = LIZIZ.getStringArray("effectCardHasShownCardId", new String[0])) != null) {
            list = ORY.LJLIIIL(stringArray);
        }
        java.util.Map LIZ = LIZ();
        if (str != null) {
            String id = h.LJIIIIZZ(str);
            if (list != null && (!list.contains(id))) {
                list.add(id);
                o.LJIIIIZZ(id, "id");
                LIZ.put(id, Boolean.FALSE);
                while (list.size() > C51602KNa.LIZ().noActionTimes) {
                    LIZ.remove(ORZ.LJLLJ(list));
                    ORS.LJJLJ(list);
                }
                Keva LIZIZ2 = LIZIZ();
                if (LIZIZ2 != null) {
                    LIZIZ2.storeStringArray("effectCardHasShownCardId", (String[]) list.toArray(new String[0]));
                }
                String json = GsonProtectorUtils.toJson(C6YQ.LIZ(), LIZ);
                Keva LIZIZ3 = LIZIZ();
                if (LIZIZ3 != null) {
                    LIZIZ3.storeString("effectCardInteractionMap", json);
                }
                Keva LIZIZ4 = LIZIZ();
                if (LIZIZ4 == null || (valueOf = Integer.valueOf(LIZIZ4.getInt("effectCardHasShownCountKey", 0))) == null) {
                    return;
                }
                if (valueOf.intValue() == 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Keva LIZIZ5 = LIZIZ();
                    if (LIZIZ5 != null) {
                        LIZIZ5.storeLong("effectCardLastStartCountingTime", currentTimeMillis);
                    }
                }
                int intValue = valueOf.intValue() + 1;
                Keva LIZIZ6 = LIZIZ();
                if (LIZIZ6 == null) {
                    return;
                }
                LIZIZ6.storeInt("effectCardHasShownCountKey", intValue);
            }
        }
    }
}
