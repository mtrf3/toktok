package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxApi;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hql, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45335Hql<T> implements InterfaceC139745e6 {
    public final /* synthetic */ C45330Hqg LJLIL;

    public C45335Hql(C45330Hqg c45330Hqg) {
        this.LJLIL = c45330Hqg;
    }

    @Override // X.InterfaceC139745e6
    public final Object get() {
        String baseUrl = ((Host) ListProtector.get(EffectPlatformFactory.LIZ().getHosts(), 0)).getItemName();
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        o.LJIIIIZZ(baseUrl, "baseUrl");
        if (!s.LJJL(baseUrl, '/')) {
            baseUrl = C42398GkU.LIZIZ(baseUrl, '/');
        }
        o.LJIIIIZZ(baseUrl, "if (baseUrl.endsWith('/'… baseUrl else \"$baseUrl/\"");
        this.LJLIL.getClass();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        return networkService.createRetrofitWithInterceptors(baseUrl, true, FilterBoxApi.class, C61878OQg.INSTANCE);
    }
}
