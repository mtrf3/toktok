package X;

import com.ss.android.ugc.aweme.personalized.ReportHybridABApi;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.o;

/* renamed from: X.E5p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35861E5p<T, R> implements InterfaceC48038ItG {
    public static final C35861E5p<T, R> LJLIL = new C35861E5p<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String str;
        Boolean isSuccess = (Boolean) obj;
        o.LJIIIZ(isSuccess, "isSuccess");
        IPluginService.PluginData LIZ = C35865E5t.LIZ();
        if (LIZ != null) {
            str = LIZ.abExposeVid;
        } else {
            str = null;
        }
        if (isSuccess.booleanValue() && str != null && C78857UxB.LJJJIL(str)) {
            C188727au c188727au = new C188727au();
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            c188727au.LIZLLL(LIZLLL.booleanValue() ? 1 : 0, "is_cold_start_first_launch");
            FMX.LJIIL("did_vid_info_upload", c188727au.LIZ);
            return ((ReportHybridABApi) C35865E5t.LIZ.getValue()).reportHybridAB(new ReportHybridABApi.ReportHybridABRequest(C47261Igj.LJJIJ(new ReportHybridABApi.HybridABExperimentInfo(1, str))));
        }
        return AbstractC73672Svk.LJJIJIL(new ReportHybridABApi.ReportHybridABResponse(null, -110119120, "did or vid is null"));
    }
}
