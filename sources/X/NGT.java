package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NGT {
    public static final NGT LIZ = new NGT();
    public static final String LIZIZ = "AdHybridContainerCreator";
    public static final java.util.Map<String, Class<?>> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, Class<?>> LIZLLL = new LinkedHashMap();

    public static List LIZ(EnumC242959gB adHybridGeckoLoadOpportunity) {
        Class<?> cls;
        Class<? extends U> asSubclass;
        NGS ngs;
        o.LJIIIZ(adHybridGeckoLoadOpportunity, "adHybridGeckoLoadOpportunity");
        try {
            ArrayList arrayList = new ArrayList();
            NGU.LIZ.getClass();
            List<String> list = (List) ((LinkedHashMap) NGU.LIZLLL).get(adHybridGeckoLoadOpportunity.name());
            if (list != null) {
                for (String str : list) {
                    java.util.Map<String, Class<?>> map = LIZLLL;
                    if (map.containsKey(str) && ((LinkedHashMap) map).get(str) != null) {
                        cls = (Class) ((LinkedHashMap) map).get(str);
                    } else {
                        cls = Class.forName(str);
                        map.put(str, cls);
                    }
                    if (cls != null && (asSubclass = cls.asSubclass(NGS.class)) != 0 && (ngs = (NGS) asSubclass.newInstance()) != null) {
                        arrayList.add(ngs);
                    }
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("createGeckoConfigList: geckoModelList=");
            LIZ2.append(arrayList);
            C58582Rq.LIZ(X1D.LIZIZ(LIZ2), LIZIZ);
            return arrayList;
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                C58582Rq.LIZ(C25620zW.LIZ("createGeckoConfigList: Exception = ", LJFF), LIZIZ);
                C78983UzD.LJIIZILJ(LJFF);
                return null;
            }
            return null;
        }
    }
}
