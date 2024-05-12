package X;

import Y.ACallableS81S0200000_3;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8rR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224458rR extends AbstractC51036K1g<Aweme, BatchDetailList> {
    public final int LJLIL = 1;
    public int LJLILLLLZI;
    public final List<String> LJLJI;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        List<Aweme> list;
        BatchDetailList batchDetailList = (BatchDetailList) this.mData;
        if (batchDetailList == null || (list = batchDetailList.items) == null) {
            return new ArrayList();
        }
        return list;
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        if (this.LJLILLLLZI < ((ArrayList) this.LJLJI).size() - 1) {
            return true;
        }
        return false;
    }

    public C224458rR(String str) {
        this.LJLJI = ORZ.LLJILJILJ(s.LJLJJL(str, new String[]{","}, 0, 6));
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Aweme aweme) {
        return C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        List<Aweme> list;
        LogPbBean logPbBean;
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        if (batchDetailList == null || (list = batchDetailList.items) == null) {
            return;
        }
        int size = list.size();
        String str = batchDetailList.requestId;
        for (int i = 0; i < size; i++) {
            Aweme aweme = (Aweme) ListProtector.get(batchDetailList.items, i);
            aweme.setLogPbBean(batchDetailList.logPbBean);
            Aweme R1 = AwemeService.LIZ().R1(aweme);
            if (TextUtils.isEmpty(str) && (logPbBean = batchDetailList.logPbBean) != null) {
                str = logPbBean.getImprId();
            }
            IRequestIdService LJ = RequestIdService.LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(R1.getAid());
            LIZ.append(this.LJLIL);
            LJ.LIZJ(i, X1D.LIZIZ(LIZ), str);
            ListProtector.set(batchDetailList.items, i, R1);
            List<Aweme> list2 = batchDetailList.items;
            if (list2 != null) {
                C7HV.LIZIZ.LIZJ(list2, C7KB.OTHERS);
            }
        }
        T t = this.mData;
        if (t == 0) {
            super.handleData(batchDetailList);
        } else {
            List<Aweme> list3 = ((BatchDetailList) t).items;
            List<Aweme> list4 = batchDetailList.items;
            o.LJIIIIZZ(list4, "data.items");
            list3.addAll(list4);
        }
        this.LJLILLLLZI += 11;
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        sendRequest(params);
    }

    @Override // X.AbstractC51036K1g, X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        if (this.LJLILLLLZI > 0) {
            this.mListQueryType = 4;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS81S0200000_3(params, this, 0), 0);
        return true;
    }
}
