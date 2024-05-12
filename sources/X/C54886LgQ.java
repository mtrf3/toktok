package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LgQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54886LgQ extends AbstractC51036K1g<Aweme, FeedItemList> {
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((FeedItemList) t).getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((FeedItemList) t).isHasMore()) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length < 8 || !(params[0] instanceof String) || !(params[1] instanceof String) || !(params[2] instanceof Long) || !(params[3] instanceof Long) || !(params[4] instanceof Integer) || !(params[5] instanceof Integer) || !(params[6] instanceof String) || !(params[7] instanceof String)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        int i;
        List<Aweme> items;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (this.mData == 0) {
            super.handleData(feedItemList);
            return;
        }
        if (feedItemList == null || feedItemList.getItems() == null) {
            return;
        }
        List<Aweme> items2 = feedItemList.getItems();
        FeedItemList feedItemList2 = (FeedItemList) this.mData;
        if (feedItemList2 != null && (items = feedItemList2.getItems()) != null) {
            i = items.size();
        } else {
            i = 0;
        }
        insertItemList(items2, i);
        List<Aweme> items3 = ((FeedItemList) this.mData).getItems();
        super.handleData(feedItemList);
        ((FeedItemList) this.mData).items = items3;
    }

    @Override // X.AbstractC51036K1g, X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        if (checkParams(params)) {
            return false;
        }
        Object obj = params[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = params[1];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = params[2];
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj3).longValue();
        Object obj4 = params[3];
        o.LJII(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue2 = ((Long) obj4).longValue();
        Object obj5 = params[4];
        o.LJII(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj5).intValue();
        Object obj6 = params[5];
        o.LJII(obj6, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj6).intValue();
        Object obj7 = params[6];
        o.LJII(obj7, "null cannot be cast to non-null type kotlin.String");
        Object obj8 = params[7];
        o.LJII(obj8, "null cannot be cast to non-null type kotlin.String");
        this.mListQueryType = intValue2;
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC54887LgR(intValue, (String) obj, longValue, (String) obj2, (String) obj7, longValue2, (String) obj8), 0);
        return true;
    }
}
