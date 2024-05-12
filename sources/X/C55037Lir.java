package X;

import X.AbstractC51036K1g;
import Y.ACallableS112S0100000_9;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: X.Lir, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55037Lir<T extends AbstractC51036K1g<?, ?>> extends C51031K1b<T> {
    @Override // X.C8BR
    public final void LJJII() {
        C55693LtR c55693LtR;
        C73318Sq2 c73318Sq2;
        T t = this.LJLIL;
        if ((t instanceof C55693LtR) && (c55693LtR = (C55693LtR) t) != null && (c73318Sq2 = c55693LtR.LJLLJ) != null) {
            c73318Sq2.LIZLLL();
            c55693LtR.LJLLJ = null;
        }
        super.LJJII();
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        Integer num;
        FeedItemList feedItemList;
        C55693LtR c55693LtR;
        T t = this.LJLIL;
        if (t == 0 || this.LJLILLLLZI == 0) {
            return;
        }
        FeedItemList feedItemList2 = null;
        String str = null;
        if ((t instanceof C55693LtR) && (c55693LtR = (C55693LtR) t) != null) {
            num = Integer.valueOf(c55693LtR.LJLIL);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 4) {
                Object data = this.LJLIL.getData();
                if ((data instanceof FeedItemList) && (feedItemList = (FeedItemList) data) != null) {
                    BaseResponse baseResponse = new BaseResponse();
                    baseResponse.status_code = feedItemList.status_code;
                    baseResponse.status_msg = feedItemList.status_msg;
                    BaseResponse.ServerTimeExtra serverTimeExtra = new BaseResponse.ServerTimeExtra();
                    LogPbBean logPbBean = feedItemList.logPb;
                    if (logPbBean != null) {
                        str = logPbBean.getImprId();
                    }
                    serverTimeExtra.logid = str;
                    baseResponse.extra = serverTimeExtra;
                    M8L.LIZJ("/aweme/v1/aweme/listcollection/", "net", baseResponse);
                }
            } else if (num.intValue() == 0 && ((Boolean) C53035Krf.LIZIZ.getValue()).booleanValue()) {
                Object data2 = this.LJLIL.getData();
                if (data2 instanceof FeedItemList) {
                    feedItemList2 = (FeedItemList) data2;
                }
                C10K.LIZJ(new ACallableS112S0100000_9(feedItemList2, 8));
            }
        }
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) this.LJLIL;
        int i = abstractC51036K1g.mListQueryType;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) this.LJLILLLLZI;
                List items = abstractC51036K1g.getItems();
                if (!((AbstractC51036K1g) this.LJLIL).isHasMore() || ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                    z = false;
                }
                interfaceC223218pR.j0(items, z);
                return;
            }
            ((InterfaceC223218pR) this.LJLILLLLZI).jh(abstractC51036K1g.getItems(), !((AbstractC51036K1g) this.LJLIL).isNewDataEmpty());
            return;
        }
        ((InterfaceC223218pR) this.LJLILLLLZI).J5(abstractC51036K1g.getItems(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        C55693LtR c55693LtR;
        super.onFailed(exc);
        T t = this.LJLIL;
        if ((t instanceof C55693LtR) && (c55693LtR = (C55693LtR) t) != null && c55693LtR.LJLIL == 4) {
            Object data = t.getData();
            if ((data instanceof FeedItemList) && data != null) {
                M8L.LIZIZ("/aweme/v1/aweme/listcollection/", exc);
            }
        }
    }
}
