package X;

import android.app.Application;
import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import kotlin.jvm.internal.o;

/* renamed from: X.Oa7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62139Oa7 implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ SurfaceHolder LIZIZ;
    public final /* synthetic */ IAVCameraService.IAVCameraReadyCallback<IQRCodeScanner> LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        this.LIZJ.finish(null);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        XFW xfw = XFV.LJFF;
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        xfw.LIZ(application).LIZ();
        this.LIZJ.finish(new C83758Wu2(this.LIZ, this.LIZIZ));
    }

    public C62139Oa7(Context context, SurfaceHolder surfaceHolder, IAVCameraService.IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback) {
        this.LIZ = context;
        this.LIZIZ = surfaceHolder;
        this.LIZJ = iAVCameraReadyCallback;
    }
}
