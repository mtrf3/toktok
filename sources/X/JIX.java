package X;

import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JIX {
    public java.util.Map<Integer, String> LIZ;

    public JIX() {
        Method[] declaredMethods = JIX.class.getDeclaredMethods();
        o.LJIIIIZZ(declaredMethods, "ExchangePanelTitle::class.java.declaredMethods");
        for (Method method : declaredMethods) {
            o.LJIIIIZZ(method, "ExchangePanelTitle::class.java.declaredMethods");
            C0NB.LIZIZ("exp_test", method.getName());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l39);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_ex…US_oldUserBannerV2_title)");
        linkedHashMap.put(2, LJIILJJIL);
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.l3a);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_ex…US_oldUserBannerV3_title)");
        linkedHashMap.put(3, LJIILJJIL2);
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.l34);
        o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_ex…US_newUserBannerV2_title)");
        linkedHashMap.put(4, LJIILJJIL3);
        this.LIZ = linkedHashMap;
    }
}
