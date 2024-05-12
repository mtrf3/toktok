package X;

import Y.ACallableS43S0000000_8;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* loaded from: classes8.dex */
public final class HMC extends AbstractC51036K1g<Challenge, ChallengeList> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Challenge> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((ChallengeList) t).items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((ChallengeList) t).hasMore) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.ss.android.ugc.aweme.challenge.model.ChallengeList] */
    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        ?? r6 = (ChallengeList) obj;
        if (r6 == 0 || C79004UzY.LJJIFFI(r6.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            int i = this.mListQueryType;
            if (i != 1) {
                if (i != 4) {
                    return;
                }
                ((ChallengeList) this.mData).items.addAll(r6.items);
                ChallengeList challengeList = (ChallengeList) this.mData;
                challengeList.maxCursor = Math.min(challengeList.maxCursor, r6.maxCursor);
                ChallengeList challengeList2 = (ChallengeList) this.mData;
                challengeList2.hasMore = challengeList2.hasMore;
                return;
            }
            this.mData = r6;
            return;
        }
        T t = this.mData;
        if (t == 0) {
            return;
        }
        ((ChallengeList) t).hasMore = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        long j;
        if (!C38457F7l.LIZIZ.LIZJ()) {
            long j2 = 0;
            if (isDataEmpty()) {
                j = 0;
            } else {
                j = ((ChallengeList) this.mData).maxCursor;
            }
            if (!isDataEmpty()) {
                j2 = ((ChallengeList) this.mData).minCursor;
            }
            FGR.LIZIZ().LIZ(this.mHandler, new HDN(j, j2), 0);
        }
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        if (C38457F7l.LIZIZ.LIZJ()) {
            FGR.LIZIZ().LIZ(this.mHandler, new ACallableS43S0000000_8(1), 0);
        } else {
            FGR.LIZIZ().LIZ(this.mHandler, new HDN(0L, 0L), 0);
        }
    }
}
