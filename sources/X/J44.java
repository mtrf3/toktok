package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J44 {
    public static final ISmartClassifyService LIZ;

    static {
        ISmartClassifyService iSmartClassifyService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartClassifyService.class, false);
        if (LIZ2 != null) {
            iSmartClassifyService = (ISmartClassifyService) LIZ2;
        } else {
            if (C58096Mr6.Z2 == null) {
                synchronized (ISmartClassifyService.class) {
                    if (C58096Mr6.Z2 == null) {
                        C58096Mr6.Z2 = new SmartClassifyServiceImpl();
                    }
                }
            }
            iSmartClassifyService = C58096Mr6.Z2;
        }
        o.LJIIIIZZ(iSmartClassifyService, "get().getService(ISmartC…ssifyService::class.java)");
        LIZ = iSmartClassifyService;
    }
}
