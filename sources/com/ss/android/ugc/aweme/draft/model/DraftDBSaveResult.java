package com.ss.android.ugc.aweme.draft.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftDBSaveResult extends F9E {
    public final transient long dbSaveDuration;
    public final DraftDBSaveException saveException;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftDBSaveResult() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftDBSaveResult copy$default(DraftDBSaveResult draftDBSaveResult, long j, DraftDBSaveException draftDBSaveException, int i, Object obj) {
        if ((i & 1) != 0) {
            j = draftDBSaveResult.dbSaveDuration;
        }
        if ((i & 2) != 0) {
            draftDBSaveException = draftDBSaveResult.saveException;
        }
        return draftDBSaveResult.copy(j, draftDBSaveException);
    }

    public final DraftDBSaveResult copy(long j, DraftDBSaveException saveException) {
        o.LJIIIZ(saveException, "saveException");
        return new DraftDBSaveResult(j, saveException);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.dbSaveDuration), this.saveException};
    }

    public final boolean isSuc() {
        return this.saveException.isSuc();
    }

    public final long getDbSaveDuration() {
        return this.dbSaveDuration;
    }

    public final DraftDBSaveException getSaveException() {
        return this.saveException;
    }

    public DraftDBSaveResult(long j, DraftDBSaveException saveException) {
        o.LJIIIZ(saveException, "saveException");
        this.dbSaveDuration = j;
        this.saveException = saveException;
    }

    public /* synthetic */ DraftDBSaveResult(long j, DraftDBSaveException draftDBSaveException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new DraftDBSaveException(0, null, 3, null) : draftDBSaveException);
    }
}
