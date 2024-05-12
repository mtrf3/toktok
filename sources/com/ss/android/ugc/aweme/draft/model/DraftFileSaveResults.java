package com.ss.android.ugc.aweme.draft.model;

import X.C61878OQg;
import X.F9E;
import X.ORZ;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DraftFileSaveResults extends F9E {
    public final List<DraftFileSaveResult> blockCreativeList;
    public final transient long fileSaveDuration;
    public final List<DraftFileSaveResult> notBlockCreativeList;

    public DraftFileSaveResults() {
        this(0L, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftFileSaveResults copy$default(DraftFileSaveResults draftFileSaveResults, long j, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = draftFileSaveResults.fileSaveDuration;
        }
        if ((i & 2) != 0) {
            list = draftFileSaveResults.blockCreativeList;
        }
        if ((i & 4) != 0) {
            list2 = draftFileSaveResults.notBlockCreativeList;
        }
        return draftFileSaveResults.copy(j, list, list2);
    }

    public final DraftFileSaveResults copy(long j, List<DraftFileSaveResult> blockCreativeList, List<DraftFileSaveResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        return new DraftFileSaveResults(j, blockCreativeList, notBlockCreativeList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.fileSaveDuration), this.blockCreativeList, this.notBlockCreativeList};
    }

    public final boolean isSuc() {
        return this.blockCreativeList.isEmpty();
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        return ((DraftFileSaveResult) ORZ.LJLLJ(this.blockCreativeList)).getSaveException().getErrorCode();
    }

    public final List<DraftFileSaveResult> getBlockCreativeList() {
        return this.blockCreativeList;
    }

    public final long getFileSaveDuration() {
        return this.fileSaveDuration;
    }

    public final List<DraftFileSaveResult> getNotBlockCreativeList() {
        return this.notBlockCreativeList;
    }

    public DraftFileSaveResults(long j, List<DraftFileSaveResult> blockCreativeList, List<DraftFileSaveResult> notBlockCreativeList) {
        o.LJIIIZ(blockCreativeList, "blockCreativeList");
        o.LJIIIZ(notBlockCreativeList, "notBlockCreativeList");
        this.fileSaveDuration = j;
        this.blockCreativeList = blockCreativeList;
        this.notBlockCreativeList = notBlockCreativeList;
    }

    public DraftFileSaveResults(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
