package com.ss.android.ugc.aweme.draft.model;

import X.C61878OQg;
import X.F9E;
import X.ORZ;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftSavePreProcessResults extends F9E {
    public final List<DraftSavePreProcessResult> blockCreativeList;
    public final List<DraftSavePreProcessResult> notBlockCreativeList;
    public final transient long preProcessDuration;

    public DraftSavePreProcessResults() {
        this(0L, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftSavePreProcessResults copy$default(DraftSavePreProcessResults draftSavePreProcessResults, long j, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = draftSavePreProcessResults.preProcessDuration;
        }
        if ((i & 2) != 0) {
            list = draftSavePreProcessResults.blockCreativeList;
        }
        if ((i & 4) != 0) {
            list2 = draftSavePreProcessResults.notBlockCreativeList;
        }
        return draftSavePreProcessResults.copy(j, list, list2);
    }

    public final DraftSavePreProcessResults copy(long j, List<DraftSavePreProcessResult> blockCreativeList, List<DraftSavePreProcessResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        return new DraftSavePreProcessResults(j, blockCreativeList, notBlockCreativeList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.preProcessDuration), this.blockCreativeList, this.notBlockCreativeList};
    }

    public final boolean isSuc() {
        return this.blockCreativeList.isEmpty();
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        return ((DraftSavePreProcessResult) ORZ.LJLLJ(this.blockCreativeList)).getPreProcessException().getErrorCode();
    }

    public final List<DraftSavePreProcessResult> getBlockCreativeList() {
        return this.blockCreativeList;
    }

    public final List<DraftSavePreProcessResult> getNotBlockCreativeList() {
        return this.notBlockCreativeList;
    }

    public final long getPreProcessDuration() {
        return this.preProcessDuration;
    }

    public DraftSavePreProcessResults(long j, List<DraftSavePreProcessResult> blockCreativeList, List<DraftSavePreProcessResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        this.preProcessDuration = j;
        this.blockCreativeList = blockCreativeList;
        this.notBlockCreativeList = notBlockCreativeList;
    }

    public DraftSavePreProcessResults(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
