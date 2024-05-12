package X;

import Y.IDhS105S0100000_12;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.topicfeed.repo.TopicFeedApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lgg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54902Lgg implements InterfaceC54903Lgh {
    @Override // X.InterfaceC54903Lgh
    public final FeedItemList LJJIIZ(C55671Lt5 c55671Lt5, int i) {
        List<Aweme> items;
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("topic");
        LIZ.append(i);
        iFeedDebugService.LJIIIZ(X1D.LIZIZ(LIZ));
        FeedItemList itemList = TopicFeedApi.LIZIZ.fetchTopicFeedList(i, 6, 1, "").get().LIZJ(new IDhS105S0100000_12(c55671Lt5, 9));
        if (itemList != null && (items = itemList.getItems()) != null) {
            IFeedDebugService iFeedDebugService2 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("topic");
            LIZ2.append(i);
            iFeedDebugService2.LIZIZ(X1D.LIZIZ(LIZ2), items);
            itemList.items = items;
        }
        o.LJIIIIZZ(itemList, "itemList");
        return itemList;
    }
}
