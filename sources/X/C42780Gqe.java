package X;

import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.resp.AnchorSearchResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42780Gqe extends AbstractC51036K1g<AnchorCell, AnchorSearchResponse> {
    public final int LJLIL;
    public final List<AnchorCell> LJLILLLLZI = new ArrayList();
    public int LJLJI;
    public boolean LJLJJI;

    @Override // X.AbstractC51036K1g
    public final List<AnchorCell> getItems() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        return this.LJLJJI;
    }

    public C42780Gqe(int i) {
        this.LJLIL = i;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final void handleData(Object obj) {
        AnchorSearchResponse anchorSearchResponse = (AnchorSearchResponse) obj;
        if (anchorSearchResponse != null) {
            if (this.mListQueryType == 1) {
                ((ArrayList) this.LJLILLLLZI).clear();
            }
            List<AnchorCell> list = anchorSearchResponse.cells;
            if (list == null || list.isEmpty()) {
                this.LJLJJI = false;
                ((ArrayList) this.LJLILLLLZI).clear();
                return;
            }
            this.LJLJJI = anchorSearchResponse.enableLoadMore;
            List<AnchorCell> list2 = this.LJLILLLLZI;
            List<AnchorCell> list3 = anchorSearchResponse.cells;
            o.LJI(list3);
            ((ArrayList) list2).addAll(list3);
            this.LJLJI++;
        }
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        int i = this.LJLJI;
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC42723Gpj(this, (String) obj, i), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC42723Gpj(this, (String) obj, 0), 0);
    }
}
