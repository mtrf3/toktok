package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.SIw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71878SIw extends AbstractC71879SIx {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC71880SIy interfaceC71880SIy = (InterfaceC71880SIy) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        String str = null;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            String requestId = interfaceC71880SIy.getRequestId();
            String redirectId = interfaceC71880SIy.getRedirectUri();
            C71762SEk onVerificationCallback = C71762SEk.LJLIL;
            o.LJIIIZ(requestId, "requestId");
            o.LJIIIZ(redirectId, "redirectId");
            o.LJIIIZ(onVerificationCallback, "onVerificationCallback");
            SJ0.LIZ = onVerificationCallback;
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://ec/transparent_singpass_handle");
            buildRoute.withParam("request_id", requestId);
            buildRoute.withParam("redirect_uri", redirectId);
            buildRoute.open();
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            if (interfaceC38263Ezz2 != null) {
                str = interfaceC38263Ezz2.LIZIZ();
            }
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC71881SIz.class, str), "");
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C31626Cb8.LIZ(c37356ElM, -1, "Android context is null", 4);
    }
}
