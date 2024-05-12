package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.KNt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51621KNt extends AbstractC51036K1g<Aweme, FeedsResponse> {
    public static final /* synthetic */ int LJLJJI = 0;
    public final String LJLIL;
    public final InterfaceC51622KNu LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        return ((FeedsResponse) this.mData).list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((FeedsResponse) t).hasMore) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(List<? extends Object> indexList) {
        o.LJIIIZ(indexList, "indexList");
        if (((FeedsResponse) this.mData).list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : indexList) {
            List<Aweme> list = ((FeedsResponse) this.mData).list;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
            arrayList.add(ListProtector.get(list, ((Integer) obj).intValue()));
        }
        ((FeedsResponse) this.mData).list.removeAll(arrayList);
    }

    public final void LJIIJJI(boolean z) {
        InterfaceC51622KNu interfaceC51622KNu = this.LJLILLLLZI;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page", this.LJLJI + 1);
        jSONObject2.put("react_id", this.LJLIL);
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "load_feeds_more");
        interfaceC51622KNu.LIZ(jSONObject);
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIIJJI(false);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIIJJI(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C51621KNt(FeedsResponse feedsResponse, String str, InterfaceC51622KNu interfaceC51622KNu) {
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC51622KNu;
        this.mData = feedsResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(List<? extends Aweme> feeds, int i, boolean z, boolean z2) {
        o.LJIIIZ(feeds, "feeds");
        if (feeds.isEmpty()) {
            this.mIsLoading = false;
            List<C8BT> list = this.mNotifyListeners;
            if (list != null) {
                for (C8BT c8bt : list) {
                    if (c8bt != null) {
                        c8bt.onFailed(new Exception());
                    }
                }
                return;
            }
            return;
        }
        this.LJLJI = i;
        FeedsResponse data = getData();
        if (data != null) {
            this.mIsNewDataEmpty = data.list.isEmpty();
            FeedsResponse feedsResponse = (FeedsResponse) this.mData;
            feedsResponse.hasMore = z;
            if (z2) {
                feedsResponse.list.addAll(0, feeds);
            } else {
                feedsResponse.list.addAll(feeds);
            }
        }
        this.mIsLoading = false;
        List<C8BT> list2 = this.mNotifyListeners;
        if (list2 != null) {
            for (C8BT c8bt2 : list2) {
                if (c8bt2 != null) {
                    c8bt2.onSuccess();
                }
            }
        }
    }
}
