package com.ss.android.ugc.aweme.draft.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DraftFileDeleteResult extends F9E {
    public final DraftFileDeleteException deleteException;
    public final long deleteFileDuration;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftFileDeleteResult() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftFileDeleteResult copy$default(DraftFileDeleteResult draftFileDeleteResult, long j, DraftFileDeleteException draftFileDeleteException, int i, Object obj) {
        if ((i & 1) != 0) {
            j = draftFileDeleteResult.deleteFileDuration;
        }
        if ((i & 2) != 0) {
            draftFileDeleteException = draftFileDeleteResult.deleteException;
        }
        return draftFileDeleteResult.copy(j, draftFileDeleteException);
    }

    public final DraftFileDeleteResult copy(long j, DraftFileDeleteException deleteException) {
        o.LJIIIZ(deleteException, "deleteException");
        return new DraftFileDeleteResult(j, deleteException);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.deleteFileDuration), this.deleteException};
    }

    public final boolean isSuc() {
        return this.deleteException.isSuc();
    }

    public final DraftFileDeleteException getDeleteException() {
        return this.deleteException;
    }

    public final long getDeleteFileDuration() {
        return this.deleteFileDuration;
    }

    public DraftFileDeleteResult(long j, DraftFileDeleteException deleteException) {
        o.LJIIIZ(deleteException, "deleteException");
        this.deleteFileDuration = j;
        this.deleteException = deleteException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DraftFileDeleteResult(long j, DraftFileDeleteException draftFileDeleteException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new DraftFileDeleteException(0, null, 3, 0 == true ? 1 : 0) : draftFileDeleteException);
    }
}
