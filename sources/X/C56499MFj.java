package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.o;

/* renamed from: X.MFj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56499MFj implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ C67627QgR LIZ;
    public final /* synthetic */ IExternalService LIZIZ;
    public final /* synthetic */ Bundle LIZJ;

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

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        Context context = (Context) this.LIZ.LJLLLLLL.getValue();
        if (context != null) {
            IExternalService iExternalService = this.LIZIZ;
            iExternalService.draftService().openDraftActivity(context, this.LIZJ);
        }
    }

    public C56499MFj(C67627QgR c67627QgR, IExternalService iExternalService, Bundle bundle) {
        this.LIZ = c67627QgR;
        this.LIZIZ = iExternalService;
        this.LIZJ = bundle;
    }
}
