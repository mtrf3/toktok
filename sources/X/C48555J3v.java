package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService;
import com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J3v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48555J3v {
    public static final ISmartRegressCalculateService LIZ;

    static {
        ISmartRegressCalculateService iSmartRegressCalculateService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartRegressCalculateService.class, false);
        if (LIZ2 != null) {
            iSmartRegressCalculateService = (ISmartRegressCalculateService) LIZ2;
        } else {
            if (C58096Mr6.e3 == null) {
                synchronized (ISmartRegressCalculateService.class) {
                    if (C58096Mr6.e3 == null) {
                        C58096Mr6.e3 = new SmartRegressCalculateServiceImpl();
                    }
                }
            }
            iSmartRegressCalculateService = C58096Mr6.e3;
        }
        o.LJIIIIZZ(iSmartRegressCalculateService, "get().getService(ISmartR…ulateService::class.java)");
        LIZ = iSmartRegressCalculateService;
    }
}
