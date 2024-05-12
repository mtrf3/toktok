package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.j;
import com.google.gson.m;
import java.io.IOException;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EUL {
    public static final EUL LIZ = new EUL();
    public static final m LIZIZ;

    static {
        m mVar = new m();
        mVar.LJJIIJ("is_test_offline", 0);
        mVar.LJJIIZ("country_list", "IT, GB, FR, ES, DE");
        LIZIZ = mVar;
    }

    public static boolean LIZ(String country) {
        o.LJIIIZ(country, "country");
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            m mVar = LIZIZ;
            m mVar2 = (m) LIZLLL.LJIIIIZZ("search_suggest_widget_config", m.class, mVar);
            if (mVar2 != null) {
                mVar = mVar2;
            }
            j LJJIJ = mVar.LJJIJ("country_list");
            if (LJJIJ == null) {
                return false;
            }
            String jVar = LJJIJ.toString();
            o.LJIIIIZZ(jVar, "result.toString()");
            return s.LJJJLZIJ(jVar, country, false);
        } catch (IOException unused) {
            return false;
        }
    }
}
