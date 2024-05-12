package X;

import com.ss.android.ugc.aweme.ml.api.ISmartHARService;
import com.ss.android.ugc.aweme.ml.har.SmartHARServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J4P {
    public static final ISmartHARService LIZ;

    static {
        ISmartHARService iSmartHARService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartHARService.class, false);
        if (LIZ2 != null) {
            iSmartHARService = (ISmartHARService) LIZ2;
        } else {
            if (C58096Mr6.S2 == null) {
                synchronized (ISmartHARService.class) {
                    if (C58096Mr6.S2 == null) {
                        C58096Mr6.S2 = new SmartHARServiceImpl();
                    }
                }
            }
            iSmartHARService = C58096Mr6.S2;
        }
        o.LJIIIIZZ(iSmartHARService, "get().getService(ISmartHARService::class.java)");
        LIZ = iSmartHARService;
    }
}
