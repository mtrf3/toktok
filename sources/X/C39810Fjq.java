package X;

import com.bytedance.forest.Forest;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

/* renamed from: X.Fjq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39810Fjq implements Observer {
    public static final C39810Fjq LIZ = new C39810Fjq();

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        String str;
        C39857Fkb globalConfig;
        java.util.Map map;
        if (observable instanceof C64707PaR) {
            Object obj2 = null;
            if ((obj instanceof java.util.Map) && (map = (java.util.Map) obj) != null) {
                obj2 = map.get("store_region");
            }
            if (!(obj2 instanceof String) || (str = (String) obj2) == null || (globalConfig = Forest.Companion.getGlobalConfig()) == null) {
                return;
            }
            Locale locale = Locale.ENGLISH;
            globalConfig.LIZJ = C141415gn.LIZIZ(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        }
    }
}
