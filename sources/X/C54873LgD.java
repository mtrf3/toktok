package X;

import Y.IDhS105S0100000_12;
import com.ss.android.ugc.aweme.api.NearbyFeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.LgD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54873LgD implements InterfaceC54879LgJ {
    @Override // X.InterfaceC54879LgJ
    public final FeedItemList LJIILL(C54874LgE c54874LgE) {
        String LIZJ = a.LJIIZILJ().LIZJ();
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIZ("nearby");
        FeedItemList LIZJ2 = NearbyFeedApi.LIZIZ.fetchNearbyFeedList(c54874LgE.LJFF, c54874LgE.LIZIZ, c54874LgE.LIZJ, c54874LgE.LIZLLL, c54874LgE.LJ, c54874LgE.LJI, LIZJ, "", c54874LgE.LJIIIIZZ, c54874LgE.LJIIIZ, c54874LgE.LJIIJ, c54874LgE.LJIIJJI).get().LIZJ(new IDhS105S0100000_12(Integer.valueOf(c54874LgE.LIZLLL), 6));
        o.LJIIIIZZ(LIZJ2, "nearbyPbConvert2Json(res…t.get(), params.pullType)");
        return LIZJ2;
    }
}
