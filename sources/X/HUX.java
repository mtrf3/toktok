package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.router.RecordPermissionInterceptor;
import com.ss.android.ugc.aweme.services.IExternalService;

/* loaded from: classes8.dex */
public final class HUX implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ Class<? extends Activity> LIZIZ;
    public final /* synthetic */ RecordPermissionInterceptor LIZJ;
    public final /* synthetic */ RouteIntent LIZLLL;

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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r0 == null) goto L24;
     */
    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(com.ss.android.ugc.aweme.services.AsyncAVService r8, long r9) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HUX.onLoad(com.ss.android.ugc.aweme.services.AsyncAVService, long):void");
    }

    public HUX(Context context, Class<? extends Activity> cls, RecordPermissionInterceptor recordPermissionInterceptor, RouteIntent routeIntent) {
        this.LIZ = context;
        this.LIZIZ = cls;
        this.LIZJ = recordPermissionInterceptor;
        this.LIZLLL = routeIntent;
    }
}
