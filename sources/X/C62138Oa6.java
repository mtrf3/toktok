package X;

import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import kotlin.jvm.internal.o;

/* renamed from: X.Oa6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62138Oa6 implements IAVCameraService {
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVCameraService
    public final void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraService.IAVCameraReadyCallback<IQRCodeScanner> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(surfaceHolder, "surfaceHolder");
        o.LJIIIZ(callback, "callback");
        AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("scaner", new C62139Oa7(context, surfaceHolder, callback));
    }
}
