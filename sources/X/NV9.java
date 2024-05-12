package X;

import android.content.Context;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;

/* loaded from: classes11.dex */
public final class NV9 {
    public static PreRenderWebViewBusiness LIZ(InterfaceC59488NWi interfaceC59488NWi) {
        Context context;
        C59314NPq crossPlatformParams;
        C59273NOb c59273NOb;
        NTL crossPlatformBusiness;
        if (interfaceC59488NWi != null) {
            context = interfaceC59488NWi.getContext();
        } else {
            context = null;
        }
        if ((context instanceof CrossPlatformActivity) || interfaceC59488NWi == null || (crossPlatformParams = interfaceC59488NWi.getCrossPlatformParams()) == null || (c59273NOb = crossPlatformParams.LIZIZ) == null || c59273NOb.LJJ != 7 || (crossPlatformBusiness = interfaceC59488NWi.getCrossPlatformBusiness()) == null) {
            return null;
        }
        return (PreRenderWebViewBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(PreRenderWebViewBusiness.class);
    }

    public static String LIZIZ(int i) {
        String str = PreRenderWebViewBusiness.LJI.get(Integer.valueOf(i));
        if (str == null) {
            return "others";
        }
        return str;
    }
}
