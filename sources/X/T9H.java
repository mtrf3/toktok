package X;

import Y.ACallableS82S0101000_11;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import java.util.List;

/* loaded from: classes13.dex */
public final class T9H extends AbstractC51036K1g<User, BlackList> {
    public int LJLIL;
    public final int LJLILLLLZI = 0;
    public int LJLJI;

    @Override // X.AbstractC51036K1g
    public final boolean needCheckEmptyForQueryType() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<User> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((BlackList) t).blockList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((BlackList) t).hasMore) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r5 != 0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.setting.model.BlackList] */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.setting.model.BlackList r5 = (com.ss.android.ugc.aweme.setting.model.BlackList) r5
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L18
            int r1 = r4.LJLIL
            int r0 = r5.total
            if (r1 >= r0) goto L18
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r5.blockList
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto L7d
            boolean r0 = r5.hasMore
            if (r0 != 0) goto L7d
        L18:
            r0 = 1
        L19:
            r4.mIsNewDataEmpty = r0
            int r1 = r4.mListQueryType
            if (r1 == r3) goto L74
            r0 = 4
            if (r1 == r0) goto L23
        L22:
            return
        L23:
            if (r5 == 0) goto L68
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r5.blockList
            boolean r0 = X.C79004UzY.LJJIFFI(r0)
            if (r0 == 0) goto L68
            boolean r0 = r5.hasMore
            if (r0 == 0) goto L68
            int r0 = r4.LJLJI
            int r0 = r0 + 1
            r4.LJLJI = r0
        L37:
            T r1 = r4.mData
            com.ss.android.ugc.aweme.setting.model.BlackList r1 = (com.ss.android.ugc.aweme.setting.model.BlackList) r1
            int r0 = r5.hotsoonFilteredCount
            r1.hotsoonFilteredCount = r0
            int r0 = r5.hotsoonHasMore
            r1.hotsoonHasMore = r0
            java.lang.String r0 = r5.hotsoonText
            r1.hotsoonText = r0
        L47:
            boolean r0 = r4.mIsNewDataEmpty
            if (r0 != 0) goto L6d
            int r1 = r4.LJLJI
            r0 = 3
            if (r1 >= r0) goto L6d
            T r0 = r4.mData
            com.ss.android.ugc.aweme.setting.model.BlackList r0 = (com.ss.android.ugc.aweme.setting.model.BlackList) r0
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r0.blockList
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r5.blockList
            r1.addAll(r0)
            T r1 = r4.mData
            com.ss.android.ugc.aweme.setting.model.BlackList r1 = (com.ss.android.ugc.aweme.setting.model.BlackList) r1
            boolean r0 = r5.hasMore
            r1.hasMore = r0
            int r0 = r5.index
            r4.LJLIL = r0
            goto L22
        L68:
            r4.LJLJI = r2
            if (r5 == 0) goto L47
            goto L37
        L6d:
            T r0 = r4.mData
            com.ss.android.ugc.aweme.setting.model.BlackList r0 = (com.ss.android.ugc.aweme.setting.model.BlackList) r0
            r0.hasMore = r2
            goto L22
        L74:
            r4.mData = r5
            if (r0 != 0) goto L22
            int r0 = r5.index
            r4.LJLIL = r0
            goto L22
        L7d:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T9H.handleData(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        int i = this.LJLIL;
        BlackList blackList = (BlackList) this.mData;
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS82S0101000_11(this, i, blackList.hotsoonFilteredCount, blackList.hotsoonHasMore, 0), 0);
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS82S0101000_11(this, 0, 0, 0, 0), 0);
    }
}
