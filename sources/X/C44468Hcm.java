package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Hcm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44468Hcm implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ WaterMarkServiceImpl LIZ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    public C44468Hcm(WaterMarkServiceImpl waterMarkServiceImpl) {
        this.LIZ = waterMarkServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        this.LIZ.getClass();
        WaterMarkServiceImpl.LIZIZ().LIZIZ();
    }
}
