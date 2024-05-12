package X;

import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IWB {
    public static final ISmartFeedPreloadService LIZ;

    static {
        ISmartFeedPreloadService iSmartFeedPreloadService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartFeedPreloadService.class, false);
        if (LIZ2 != null) {
            iSmartFeedPreloadService = (ISmartFeedPreloadService) LIZ2;
        } else {
            if (C58096Mr6.W2 == null) {
                synchronized (ISmartFeedPreloadService.class) {
                    if (C58096Mr6.W2 == null) {
                        C58096Mr6.W2 = new SmartFeedPreloadServiceImpl();
                    }
                }
            }
            iSmartFeedPreloadService = C58096Mr6.W2;
        }
        o.LJIIIIZZ(iSmartFeedPreloadService, "get().getService(ISmartF…eloadService::class.java)");
        LIZ = iSmartFeedPreloadService;
    }
}
