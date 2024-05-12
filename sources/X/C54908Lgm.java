package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.stemfeed.repo.StemFeedApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lgm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54908Lgm implements InterfaceC54910Lgo {
    @Override // X.InterfaceC54910Lgo
    public final FeedItemList LJIJI(C55671Lt5 c55671Lt5) {
        List<Aweme> items;
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIZ("stem");
        FeedItemList itemList = StemFeedApi.LIZIZ.fetchStemFeedList(6, 1, "").get().LIZJ(new C72107SRr(1, c55671Lt5));
        if (itemList != null && (items = itemList.getItems()) != null) {
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LIZIZ("stem", items);
            itemList.items = items;
        }
        o.LJIIIIZZ(itemList, "itemList");
        return itemList;
    }
}
