package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J45 {
    public static final ISmartCommonPreloadService LIZ;

    static {
        ISmartCommonPreloadService iSmartCommonPreloadService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartCommonPreloadService.class, false);
        if (LIZ2 != null) {
            iSmartCommonPreloadService = (ISmartCommonPreloadService) LIZ2;
        } else {
            if (C58096Mr6.a3 == null) {
                synchronized (ISmartCommonPreloadService.class) {
                    if (C58096Mr6.a3 == null) {
                        C58096Mr6.a3 = new SmartCommonPreloadServiceImpl();
                    }
                }
            }
            iSmartCommonPreloadService = C58096Mr6.a3;
        }
        o.LJIIIIZZ(iSmartCommonPreloadService, "get().getService(ISmartC…eloadService::class.java)");
        LIZ = iSmartCommonPreloadService;
    }
}
