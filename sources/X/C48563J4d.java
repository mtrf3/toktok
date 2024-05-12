package X;

import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.feature.MLDataCenterServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J4d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48563J4d {
    public static final IMLDataCenterService LIZ;

    static {
        IMLDataCenterService iMLDataCenterService;
        Object LIZ2 = C58096Mr6.LIZ(IMLDataCenterService.class, false);
        if (LIZ2 != null) {
            iMLDataCenterService = (IMLDataCenterService) LIZ2;
        } else {
            if (C58096Mr6.P2 == null) {
                synchronized (IMLDataCenterService.class) {
                    if (C58096Mr6.P2 == null) {
                        C58096Mr6.P2 = new MLDataCenterServiceImpl();
                    }
                }
            }
            iMLDataCenterService = C58096Mr6.P2;
        }
        o.LJIIIIZZ(iMLDataCenterService, "get().getService(IMLDataCenterService::class.java)");
        LIZ = iMLDataCenterService;
    }
}
