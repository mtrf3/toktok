package com.ss.android.ugc.aweme.draft.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DraftFileSaveResult extends F9E {
    public final DraftFileSaveException saveException;
    public final int saveType;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftFileSaveResult() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftFileSaveResult copy$default(DraftFileSaveResult draftFileSaveResult, int i, DraftFileSaveException draftFileSaveException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftFileSaveResult.saveType;
        }
        if ((i2 & 2) != 0) {
            draftFileSaveException = draftFileSaveResult.saveException;
        }
        return draftFileSaveResult.copy(i, draftFileSaveException);
    }

    public final DraftFileSaveResult copy(int i, DraftFileSaveException saveException) {
        o.LJIIIZ(saveException, "saveException");
        return new DraftFileSaveResult(i, saveException);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.saveType), this.saveException};
    }

    public final boolean isSuc() {
        return this.saveException.isSuc();
    }

    public final DraftFileSaveException getSaveException() {
        return this.saveException;
    }

    public final int getSaveType() {
        return this.saveType;
    }

    public DraftFileSaveResult(int i, DraftFileSaveException saveException) {
        o.LJIIIZ(saveException, "saveException");
        this.saveType = i;
        this.saveException = saveException;
    }

    public /* synthetic */ DraftFileSaveResult(int i, DraftFileSaveException draftFileSaveException, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new DraftFileSaveException(0, null, 3, null) : draftFileSaveException);
    }
}
