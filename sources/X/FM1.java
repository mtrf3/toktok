package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FM1 implements QJH {
    public final /* synthetic */ FMC LIZ;

    @Override // X.QJH
    public final void LIZIZ() {
    }

    @Override // X.QJH
    public final boolean LIZJ() {
        return this.LIZ.LIZ();
    }

    @Override // X.QJH
    public final boolean LIZ() {
        Object service = ServiceManager.get().getService(IEtDebugService.class);
        o.LJIIIIZZ(service, "get().getService(IEtDebugService::class.java)");
        ((IEtDebugService) service).LIZIZ();
        FFL.LJIIIZ().getClass();
        return FFL.LJ(31744, "enable_applog_content_encrypt", true, true);
    }

    public FM1(FMC fmc) {
        this.LIZ = fmc;
    }
}
