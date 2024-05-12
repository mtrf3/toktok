package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BTX extends BTV<C28826BTa> {
    public static final BTX LIZIZ = new BTX();
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("webcast_webview", "webcast_lynxview", "webcast_webview_popup", "webcast_lynxview_popup");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return LIZJ;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        android.net.Uri uri = c28826BTa.LIZ;
        if (uri == null) {
            return false;
        }
        ILiveSparkService iLiveSparkService = (ILiveSparkService) CN1.LIZ(ILiveSparkService.class);
        if (iLiveSparkService != null) {
            iLiveSparkService.gi0();
        }
        String LIZ = C29706BlG.LIZ(uri);
        if (LIZ == null) {
            return false;
        }
        if (!o.LJ(UriProtector.getQueryParameter(uri, "use_live_sheet"), "1")) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
            ((IHybridContainerService) LIZ2).Vs0(context, LIZ, null);
            return true;
        }
        C60904NvI.LIZIZ(context, LIZ);
        return true;
    }
}
