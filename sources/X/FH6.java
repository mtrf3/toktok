package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.google.gson.Gson;
import com.google.gson.m;
import com.google.gson.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FH6 {
    public static void LIZIZ(m mVar) {
        m LIZ;
        java.util.Map<String, ConfigItem> configMap;
        for (Map.Entry entry : ((HashMap) KUZ.LIZ).entrySet()) {
            String str = (String) entry.getKey();
            try {
                LIZ((ConfigItem) entry.getValue(), str, mVar);
            } catch (Throwable th) {
                FII.LIZJ(th, "  , key: ", str);
            }
        }
        java.util.Map<BaseConfigPlugin, Boolean> map = C38725FHt.LIZ().LIZ;
        java.util.Map<String, ConfigItem> map2 = KUZ.LIZ;
        for (Map.Entry entry2 : ((ConcurrentHashMap) map).entrySet()) {
            if (!((Boolean) entry2.getValue()).booleanValue() && (configMap = ((BaseConfigPlugin) entry2.getKey()).getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry3 : configMap.entrySet()) {
                    String key = entry3.getKey();
                    if (map2 == null || !((HashMap) map2).containsKey(key)) {
                        try {
                            LIZ(entry3.getValue(), key, mVar);
                        } catch (Throwable th2) {
                            FII.LIZJ(th2, "  , key: ", key);
                        }
                    }
                }
            }
        }
        m LIZJ = mVar.LIZJ();
        Iterator<String> it = LIZJ.LJJIZ().iterator();
        java.util.Map<String, ConfigItem> map3 = KUZ.LIZ;
        while (it.hasNext()) {
            String next = it.next();
            if (map3 != null && ((HashMap) map3).containsKey(next)) {
                it.remove();
            }
        }
        FH3 fh3 = FH3.LIZLLL;
        fh3.getClass();
        try {
            LIZ = fh3.LIZ();
            if (LIZ == null) {
                if (fh3.LIZIZ == null) {
                    fh3.LIZIZ = new Gson();
                }
                LIZ = (m) fh3.LIZIZ.LJI(fh3.LIZ.getString("key_unregistered_libra_config", "{}"), m.class);
            }
        } catch (Exception unused) {
        }
        try {
            for (String str2 : LIZJ.LJJIZ()) {
                try {
                    m LJJIJIL = LIZJ.LJJIJIL(str2);
                    if (LJJIJIL != null) {
                        p LJJIJL = LJJIJIL.LJJIJL("deleted");
                        if (LJJIJL != null && LJJIJL.LJIILJJIL() == 1) {
                            LIZ.LJJJ(str2);
                            FHB.LJ.LJIIJ("libra_config_center_saved", true);
                            return;
                        }
                        LIZ.LJJII(str2, LJJIJIL);
                    }
                } catch (Exception e) {
                    C78983UzD.LJIJ(e, str2);
                }
            }
            FHB.LJ.LJIIJ("libra_config_center_saved", true);
            return;
        } catch (Throwable th3) {
            PEH.LIZJ(th3);
            return;
        }
        fh3.LIZJ(LIZ);
    }

    public static void LIZ(ConfigItem configItem, String str, m mVar) {
        m LJJIJIL = mVar.LJJIJIL(str);
        if (LJJIJIL == null) {
            return;
        }
        p LJJIJL = LJJIJIL.LJJIJL("deleted");
        if (LJJIJL != null && LJJIJL.LJIILJJIL() == 1) {
            FHB.LJ.LJIIIIZZ(str);
            return;
        }
        switch (C38707FHb.LIZ[configItem.type.ordinal()]) {
            case 1:
                FHA.LIZIZ(mVar, str);
                return;
            case 2:
                FHA.LJFF(mVar, str);
                return;
            case 3:
                FHA.LJI(mVar, str);
                return;
            case 4:
                FHA.LIZLLL(mVar, str);
                return;
            case 5:
                FHA.LJ(mVar, str);
                return;
            case 6:
                FHA.LJIIIIZZ(mVar, str);
                return;
            case 7:
                FHA.LJII(mVar, str);
                return;
            default:
                FHA.LIZJ(mVar, str);
                return;
        }
    }
}
