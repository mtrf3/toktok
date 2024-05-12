package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.poi_api.service.PoiServiceEmptyImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.KLg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51556KLg {
    public static final C51556KLg LIZ = new C51556KLg();

    static {
        new PoiServiceEmptyImpl();
    }

    public static IPoiService LIZ() {
        IPoiService poiServiceEmptyImpl;
        Object LIZ2;
        try {
            poiServiceEmptyImpl = (IPoiService) ServiceManager.get().getService(C51557KLh.LIZ);
            if (poiServiceEmptyImpl instanceof PoiServiceEmptyImpl) {
                try {
                    LIZ2 = Class.forName("com.ss.android.ugc.aweme.poi.service.PoiServiceImpl");
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
                    ServiceManager.get().bind(C51557KLh.LIZ, new C51555KLf(cls)).asSingleton();
                }
                poiServiceEmptyImpl = (IPoiService) ServiceManager.get().getService(C51557KLh.LIZ);
            }
        } catch (Throwable unused) {
            poiServiceEmptyImpl = new PoiServiceEmptyImpl();
        }
        o.LJIIIIZZ(poiServiceEmptyImpl, "{\n            try {\n    …)\n            }\n        }");
        return poiServiceEmptyImpl;
    }
}
