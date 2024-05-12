package X;

import android.os.FileObserver;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2R {
    public static final List<Class<? extends IHybridResourceLoader>> LIZ = new ArrayList();
    public static final List<Class<? extends IHybridResourceLoader>> LIZIZ = new ArrayList();
    public static final java.util.Map<O31, O2L> LIZJ = new LinkedHashMap();

    public static void LIZ(C61261O2n c61261O2n, O2Z o2z, O1M o1m) {
        String str;
        if (c61261O2n.LIZ.LJIIIZ == O29.GECKO && o2z.LJIJ != null && o1m.LJIILJJIL) {
            String cacheKey = C38517F9t.LIZ(o1m);
            C61250O2c c61250O2c = C61271O2x.LIZ;
            O26 resInfo = c61261O2n.LIZ;
            c61250O2c.getClass();
            o.LJIIJ(cacheKey, "cacheKey");
            o.LJIIJ(resInfo, "resInfo");
            if (cacheKey.length() != 0 && (str = resInfo.LJII) != null && str.length() != 0) {
                try {
                    FileObserverC61249O2b fileObserverC61249O2b = new FileObserverC61249O2b(c61250O2c, cacheKey, resInfo.LJII);
                    c61250O2c.LIZIZ.put(cacheKey, resInfo);
                    FileObserver fileObserver = c61250O2c.LIZJ.get(cacheKey);
                    if (fileObserver != null) {
                        fileObserver.stopWatching();
                    }
                    fileObserverC61249O2b.startWatching();
                    c61250O2c.LIZJ.put(cacheKey, fileObserverC61249O2b);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
