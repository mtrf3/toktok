package X;

import Y.ACallableS7S2100000_1;
import com.ss.android.ugc.aweme.detail.api.FeedPaginationControl;
import com.ss.android.ugc.aweme.detail.api.UpvoteFeedListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81553Hz extends AbstractC51036K1g<Aweme, UpvoteFeedListResponse> {
    public static final List<String> LJLJI = new ArrayList();
    public final FeedPaginationControl LJLIL = new FeedPaginationControl(0, 8, null, 4, 0 == true ? 1 : 0);
    public final List<Aweme> LJLILLLLZI = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isDataEmpty() {
        T t = this.mData;
        if ((t == 0 || !((UpvoteFeedListResponse) t).pagination.getHasMore()) && C79004UzY.LJJIFFI(this.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((UpvoteFeedListResponse) t).pagination.getHasMore()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        return this.LJLILLLLZI;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length >= 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0022, code lost:
    
        if (r0.getHasMore() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r13 != null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81553Hz.handleData(java.lang.Object):void");
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = params[2];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS7S2100000_1(this, (String) obj, (String) obj2, 0), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        o.LJIIIZ(params, "params");
        ((ArrayList) LJLJI).clear();
        Object obj = params[1];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = params[2];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS7S2100000_1(this, (String) obj, (String) obj2, 0), 0);
    }
}
