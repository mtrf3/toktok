package X;

import com.ss.android.ugc.aweme.app.launch.SystemServiceApiImpl;
import com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi;

/* loaded from: classes7.dex */
public final class F69 implements ISystemServiceApi {
    public static final F69 LIZIZ = new F69();
    public final /* synthetic */ ISystemServiceApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi
    public final InterfaceC40004Fmy LIZ() {
        return this.LIZ.LIZ();
    }

    public F69() {
        ISystemServiceApi iSystemServiceApi;
        Object LIZ = C58096Mr6.LIZ(ISystemServiceApi.class, false);
        if (LIZ != null) {
            iSystemServiceApi = (ISystemServiceApi) LIZ;
        } else {
            if (C58096Mr6.LLIIZ == null) {
                synchronized (ISystemServiceApi.class) {
                    if (C58096Mr6.LLIIZ == null) {
                        C58096Mr6.LLIIZ = new SystemServiceApiImpl();
                    }
                }
            }
            iSystemServiceApi = C58096Mr6.LLIIZ;
        }
        this.LIZ = iSystemServiceApi;
    }
}
