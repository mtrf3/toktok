package com.ss.android.ugc.aweme.draft.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftDBDeleteResult extends F9E {
    public final transient long dbDeleteDuration;
    public final DraftDBDeleteException deleteException;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftDBDeleteResult() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftDBDeleteResult copy$default(DraftDBDeleteResult draftDBDeleteResult, long j, DraftDBDeleteException draftDBDeleteException, int i, Object obj) {
        if ((i & 1) != 0) {
            j = draftDBDeleteResult.dbDeleteDuration;
        }
        if ((i & 2) != 0) {
            draftDBDeleteException = draftDBDeleteResult.deleteException;
        }
        return draftDBDeleteResult.copy(j, draftDBDeleteException);
    }

    public final DraftDBDeleteResult copy(long j, DraftDBDeleteException deleteException) {
        o.LJIIIZ(deleteException, "deleteException");
        return new DraftDBDeleteResult(j, deleteException);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.dbDeleteDuration), this.deleteException};
    }

    public final boolean isSuc() {
        return this.deleteException.isSuc();
    }

    public final long getDbDeleteDuration() {
        return this.dbDeleteDuration;
    }

    public final DraftDBDeleteException getDeleteException() {
        return this.deleteException;
    }

    public DraftDBDeleteResult(long j, DraftDBDeleteException deleteException) {
        o.LJIIIZ(deleteException, "deleteException");
        this.dbDeleteDuration = j;
        this.deleteException = deleteException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DraftDBDeleteResult(long j, DraftDBDeleteException draftDBDeleteException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new DraftDBDeleteException(0, null, 3, 0 == true ? 1 : 0) : draftDBDeleteException);
    }
}
