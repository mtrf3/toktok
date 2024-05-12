package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.mapapi.service.PoiMapServiceEmptylmpl;
import com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M3W {
    public static final M3W LIZ = new M3W();

    public static IPoiMapService LIZ() {
        IPoiMapService poiMapServiceEmptylmpl;
        Object LIZ2;
        if (GoogleMapServiceImpl.LJFF().LIZJ()) {
            try {
                poiMapServiceEmptylmpl = (IPoiMapService) ServiceManager.get().getService(M3Y.LIZ);
                if (poiMapServiceEmptylmpl instanceof PoiMapServiceEmptylmpl) {
                    try {
                        LIZ2 = Class.forName("com.ss.android.ugc.aweme.map.service.PoiMapServiceImpl");
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    if (C3C5.m12isFailureimpl(LIZ2)) {
                        LIZ2 = null;
                    }
                    Class cls = (Class) LIZ2;
                    if (cls != null) {
                        ServiceManager.get().bind(M3Y.LIZ, new M3X(cls)).asSingleton();
                    }
                    poiMapServiceEmptylmpl = (IPoiMapService) ServiceManager.get().getService(M3Y.LIZ);
                }
            } catch (Throwable unused) {
                poiMapServiceEmptylmpl = new PoiMapServiceEmptylmpl();
            }
            o.LJIIIIZZ(poiMapServiceEmptylmpl, "{\n            try {\n    …)\n            }\n        }");
            return poiMapServiceEmptylmpl;
        }
        return new PoiMapServiceEmptylmpl();
    }
}
