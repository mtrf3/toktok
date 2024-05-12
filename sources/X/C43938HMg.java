package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.internal.o;

/* renamed from: X.HMg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43938HMg implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ C43939HMh LIZ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        RuntimeException runtimeException = new RuntimeException("AbilityService, decompress fail");
        StringBuilder LIZ = X1D.LIZ();
        this.LIZ.getClass();
        LIZ.append("So decompress: AbilityServiceImpl");
        LIZ.append(", ");
        LIZ.append(runtimeException.getMessage());
        LIZ.append(", ");
        LIZ.append(android.util.Log.getStackTraceString(runtimeException));
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    public C43938HMg(C43939HMh c43939HMh) {
        this.LIZ = c43939HMh;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LIZIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        RuntimeException runtimeException = new RuntimeException("AbilityService, decompress success");
        StringBuilder LIZ = X1D.LIZ();
        this.LIZ.getClass();
        LIZ.append("So decompress: AbilityServiceImpl");
        LIZ.append(", ");
        LIZ.append(runtimeException.getMessage());
        LIZ.append(", ");
        LIZ.append(android.util.Log.getStackTraceString(runtimeException));
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }
}
