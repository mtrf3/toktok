package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Hcl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44467Hcl implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ WaterMarkBuilder LIZ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        WaterMarkListener waterMarkListener = this.LIZ.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(-114);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    public C44467Hcl(WaterMarkBuilder waterMarkBuilder) {
        this.LIZ = waterMarkBuilder;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        ((C44487Hd5) C44471Hcp.LIZ.getValue()).waterMark(this.LIZ);
    }
}
