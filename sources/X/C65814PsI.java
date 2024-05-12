package X;

import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkSyncAllowList;

/* renamed from: X.PsI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65814PsI {
    public static volatile C65814PsI LIZ;

    public static C65814PsI LIZ() {
        if (LIZ == null) {
            synchronized (C65814PsI.class) {
                if (LIZ == null) {
                    LIZ = new C65814PsI();
                }
            }
        }
        return LIZ;
    }

    public static Object LIZIZ(Class cls) {
        if (LiveNetworkSyncAllowList.INSTANCE.getCurrentValue()) {
            LIZ().getClass();
            return ((INetworkService) CN1.LIZ(INetworkService.class)).Du0(cls);
        }
        return Q7L.LIZIZ(cls);
    }

    public static Object LIZJ(Class cls) {
        return ((INetworkService) CN1.LIZ(INetworkService.class)).getService(cls);
    }
}
