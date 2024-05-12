package com.ss.android.ugc.aweme.draft.model;

import X.C61878OQg;
import X.F9E;
import X.ORZ;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DraftFileRestoreResults extends F9E {
    public final List<DraftFileRestoreResult> blockCreativeList;
    public final transient long fileRestoreDuration;
    public final List<DraftFileRestoreResult> notBlockCreativeList;

    public DraftFileRestoreResults() {
        this(0L, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftFileRestoreResults copy$default(DraftFileRestoreResults draftFileRestoreResults, long j, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = draftFileRestoreResults.fileRestoreDuration;
        }
        if ((i & 2) != 0) {
            list = draftFileRestoreResults.blockCreativeList;
        }
        if ((i & 4) != 0) {
            list2 = draftFileRestoreResults.notBlockCreativeList;
        }
        return draftFileRestoreResults.copy(j, list, list2);
    }

    public final DraftFileRestoreResults copy(long j, List<DraftFileRestoreResult> blockCreativeList, List<DraftFileRestoreResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        return new DraftFileRestoreResults(j, blockCreativeList, notBlockCreativeList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.fileRestoreDuration), this.blockCreativeList, this.notBlockCreativeList};
    }

    public final boolean isSuc() {
        return this.blockCreativeList.isEmpty();
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        return ((DraftFileRestoreResult) ORZ.LJLLJ(this.blockCreativeList)).getRestoreException().getErrorCode();
    }

    public final List<DraftFileRestoreResult> getBlockCreativeList() {
        return this.blockCreativeList;
    }

    public final long getFileRestoreDuration() {
        return this.fileRestoreDuration;
    }

    public final List<DraftFileRestoreResult> getNotBlockCreativeList() {
        return this.notBlockCreativeList;
    }

    public DraftFileRestoreResults(long j, List<DraftFileRestoreResult> blockCreativeList, List<DraftFileRestoreResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        this.fileRestoreDuration = j;
        this.blockCreativeList = blockCreativeList;
        this.notBlockCreativeList = notBlockCreativeList;
    }

    public DraftFileRestoreResults(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
