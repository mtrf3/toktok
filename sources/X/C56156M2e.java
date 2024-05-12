package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* renamed from: X.M2e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56156M2e {
    public static boolean LIZ() {
        boolean isSystemPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSystemPrecise(EF7.LIZIZ());
        boolean isInAppPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise();
        if (isSystemPrecise && isInAppPrecise) {
            return true;
        }
        return false;
    }
}
