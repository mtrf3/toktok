package X;

import com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService;
import com.ss.android.ugc.aweme.websocket.bridge.WsMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MLP implements IWsMonitorService {
    public static final MLP LIZIZ = new MLP();
    public final /* synthetic */ IWsMonitorService LIZ;

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZ(EnumC112394b5 scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ.LIZ(scene);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZIZ(EnumC112394b5 scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ.LIZIZ(scene);
    }

    public MLP() {
        IWsMonitorService iWsMonitorService;
        Object LIZ = C58096Mr6.LIZ(IWsMonitorService.class, false);
        if (LIZ != null) {
            iWsMonitorService = (IWsMonitorService) LIZ;
        } else {
            if (C58096Mr6.f85n8 == null) {
                synchronized (IWsMonitorService.class) {
                    if (C58096Mr6.f85n8 == null) {
                        C58096Mr6.f85n8 = new WsMonitor();
                    }
                }
            }
            iWsMonitorService = C58096Mr6.f85n8;
        }
        this.LIZ = iWsMonitorService;
    }
}
