package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.List;

/* renamed from: X.Lii, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55028Lii extends AbstractC51036K1g<Aweme, FeedItemList> {
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
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        if (r10 != 0) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.feed.model.FeedItemList, T] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.ss.android.ugc.aweme.feed.model.FeedItemList, T] */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55028Lii.handleData(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC55029Lij((String) objArr[1], (String) objArr[2], ((FeedItemList) this.mData).cursor), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC55029Lij((String) objArr[1], (String) objArr[2], 0L), 0);
    }
}
