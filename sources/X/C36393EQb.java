package X;

import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.gamora.recorder.navi.service.NaviVideoCreationService;

/* renamed from: X.EQb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36393EQb {
    public static final /* synthetic */ C36393EQb LIZ = new C36393EQb();

    public static NaviVideoCreationService LIZ() {
        return (NaviVideoCreationService) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofitWithInterceptors(C60903NvH.LJIIJJI().getNetworkService().getApiHost(), true, NaviVideoCreationService.class, C47261Igj.LJJIJ(new EPRequestInterceptor()));
    }
}
