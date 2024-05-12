package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EUF {
    public static String LIZ() {
        j pVar;
        java.util.Map<String, ConfigItem> map = KUZ.LIZ;
        o.LJIIIIZZ(map, "getConfigMap()");
        m mVar = new m();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getKey();
            FHD.LIZLLL().getClass();
            Object LJIIJ = FHD.LJIIJ(str2, false);
            if (LJIIJ instanceof Number) {
                mVar.LJJIIJ(str, (Number) LJIIJ);
            } else if (LJIIJ instanceof Boolean) {
                mVar.LJJIII((Boolean) LJIIJ, str);
            } else if (LJIIJ instanceof String) {
                mVar.LJJIIZ(str, (String) LJIIJ);
            } else if (LJIIJ instanceof Character) {
                if (LJIIJ == null) {
                    pVar = l.LJLIL;
                } else {
                    pVar = new p(LJIIJ);
                }
                mVar.LJJII(str, pVar);
            } else if (LJIIJ instanceof j) {
                mVar.LJJII(str, (j) LJIIJ);
            } else if (LJIIJ == null) {
                mVar.LJJII(str, null);
            }
        }
        String jVar = mVar.toString();
        o.LJIIIIZZ(jVar, "jsonObject.toString()");
        return jVar;
    }
}
