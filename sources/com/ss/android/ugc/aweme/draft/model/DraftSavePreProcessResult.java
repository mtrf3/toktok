package com.ss.android.ugc.aweme.draft.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftSavePreProcessResult extends F9E {
    public final DraftSavePreProcessException preProcessException;
    public final int preProcessType;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftSavePreProcessResult() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftSavePreProcessResult copy$default(DraftSavePreProcessResult draftSavePreProcessResult, int i, DraftSavePreProcessException draftSavePreProcessException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftSavePreProcessResult.preProcessType;
        }
        if ((i2 & 2) != 0) {
            draftSavePreProcessException = draftSavePreProcessResult.preProcessException;
        }
        return draftSavePreProcessResult.copy(i, draftSavePreProcessException);
    }

    public final DraftSavePreProcessResult copy(int i, DraftSavePreProcessException preProcessException) {
        o.LJIIIZ(preProcessException, "preProcessException");
        return new DraftSavePreProcessResult(i, preProcessException);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.preProcessType), this.preProcessException};
    }

    public final boolean isSuc() {
        return this.preProcessException.isSuc();
    }

    public final DraftSavePreProcessException getPreProcessException() {
        return this.preProcessException;
    }

    public final int getPreProcessType() {
        return this.preProcessType;
    }

    public DraftSavePreProcessResult(int i, DraftSavePreProcessException preProcessException) {
        o.LJIIIZ(preProcessException, "preProcessException");
        this.preProcessType = i;
        this.preProcessException = preProcessException;
    }

    public /* synthetic */ DraftSavePreProcessResult(int i, DraftSavePreProcessException draftSavePreProcessException, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new DraftSavePreProcessException(0, null, 3, null) : draftSavePreProcessException);
    }
}
