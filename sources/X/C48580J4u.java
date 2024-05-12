package X;

import com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J4u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48580J4u {
    public static final ISmartDataTrackerService LIZ;

    static {
        ISmartDataTrackerService iSmartDataTrackerService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartDataTrackerService.class, false);
        if (LIZ2 != null) {
            iSmartDataTrackerService = (ISmartDataTrackerService) LIZ2;
        } else {
            if (C58096Mr6.Q2 == null) {
                synchronized (ISmartDataTrackerService.class) {
                    if (C58096Mr6.Q2 == null) {
                        C58096Mr6.Q2 = new SmartDataTrackerServiceImpl();
                    }
                }
            }
            iSmartDataTrackerService = C58096Mr6.Q2;
        }
        o.LJIIIIZZ(iSmartDataTrackerService, "get().getService(ISmartD…ackerService::class.java)");
        LIZ = iSmartDataTrackerService;
    }
}
