package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J4i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48568J4i {
    public static final ISmartDataCenterApiService LIZ;

    static {
        ISmartDataCenterApiService iSmartDataCenterApiService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartDataCenterApiService.class, false);
        if (LIZ2 != null) {
            iSmartDataCenterApiService = (ISmartDataCenterApiService) LIZ2;
        } else {
            if (C58096Mr6.b3 == null) {
                synchronized (ISmartDataCenterApiService.class) {
                    if (C58096Mr6.b3 == null) {
                        C58096Mr6.b3 = new SmartDataCenterApiServiceImpl();
                    }
                }
            }
            iSmartDataCenterApiService = C58096Mr6.b3;
        }
        o.LJIIIIZZ(iSmartDataCenterApiService, "get().getService(ISmartD…erApiService::class.java)");
        LIZ = iSmartDataCenterApiService;
    }
}
