package X;

import com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.feature.pitaya.PitayaFeatureCenterServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J5T {
    public static final IPitayaFeatureCenterService LIZ;

    static {
        IPitayaFeatureCenterService iPitayaFeatureCenterService;
        Object LIZ2 = C58096Mr6.LIZ(IPitayaFeatureCenterService.class, false);
        if (LIZ2 != null) {
            iPitayaFeatureCenterService = (IPitayaFeatureCenterService) LIZ2;
        } else {
            if (C58096Mr6.R2 == null) {
                synchronized (IPitayaFeatureCenterService.class) {
                    if (C58096Mr6.R2 == null) {
                        C58096Mr6.R2 = new PitayaFeatureCenterServiceImpl();
                    }
                }
            }
            iPitayaFeatureCenterService = C58096Mr6.R2;
        }
        o.LJIIIIZZ(iPitayaFeatureCenterService, "get().getService(IPitaya…enterService::class.java)");
        LIZ = iPitayaFeatureCenterService;
    }
}
