package com.ss.android.ugc.aweme.draft.model;

import X.C61878OQg;
import X.F9E;
import X.ORZ;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftFileCheckResults extends F9E {
    public final List<DraftFileCheckResult> blockCreativeList;
    public final List<DraftFileCheckResult> notBlockCreativeList;

    public DraftFileCheckResults() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftFileCheckResults copy$default(DraftFileCheckResults draftFileCheckResults, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = draftFileCheckResults.blockCreativeList;
        }
        if ((i & 2) != 0) {
            list2 = draftFileCheckResults.notBlockCreativeList;
        }
        return draftFileCheckResults.copy(list, list2);
    }

    public final DraftFileCheckResults copy(List<DraftFileCheckResult> blockCreativeList, List<DraftFileCheckResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        return new DraftFileCheckResults(blockCreativeList, notBlockCreativeList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.blockCreativeList, this.notBlockCreativeList};
    }

    public final boolean isSuc() {
        return this.blockCreativeList.isEmpty();
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        return ((DraftFileCheckResult) ORZ.LJLLJ(this.blockCreativeList)).getErrorCode();
    }

    public final List<DraftFileCheckResult> getBlockCreativeList() {
        return this.blockCreativeList;
    }

    public final List<DraftFileCheckResult> getNotBlockCreativeList() {
        return this.notBlockCreativeList;
    }

    public DraftFileCheckResults(List<DraftFileCheckResult> blockCreativeList, List<DraftFileCheckResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        this.blockCreativeList = blockCreativeList;
        this.notBlockCreativeList = notBlockCreativeList;
    }

    public DraftFileCheckResults(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
