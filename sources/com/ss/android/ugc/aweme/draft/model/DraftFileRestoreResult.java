package com.ss.android.ugc.aweme.draft.model;

import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DraftFileRestoreResult {
    public final boolean blockCreative;
    public final int fileType;
    public final int priority;
    public final DraftFileRestoreException restoreException;
    public final Integer toastStringRes;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftFileRestoreResult() {
        this(0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftFileRestoreResult copy$default(DraftFileRestoreResult draftFileRestoreResult, int i, int i2, Integer num, boolean z, DraftFileRestoreException draftFileRestoreException, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = draftFileRestoreResult.fileType;
        }
        if ((i3 & 2) != 0) {
            i2 = draftFileRestoreResult.priority;
        }
        if ((i3 & 4) != 0) {
            num = draftFileRestoreResult.toastStringRes;
        }
        if ((i3 & 8) != 0) {
            z = draftFileRestoreResult.blockCreative;
        }
        if ((i3 & 16) != 0) {
            draftFileRestoreException = draftFileRestoreResult.restoreException;
        }
        return draftFileRestoreResult.copy(i, i2, num, z, draftFileRestoreException);
    }

    public final DraftFileRestoreResult copy(int i, int i2, Integer num, boolean z, DraftFileRestoreException restoreException) {
        o.LJIIIZ(restoreException, "restoreException");
        return new DraftFileRestoreResult(i, i2, num, z, restoreException);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileRestoreResult)) {
            return false;
        }
        DraftFileRestoreResult draftFileRestoreResult = (DraftFileRestoreResult) obj;
        return this.fileType == draftFileRestoreResult.fileType && this.priority == draftFileRestoreResult.priority && o.LJ(this.toastStringRes, draftFileRestoreResult.toastStringRes) && this.blockCreative == draftFileRestoreResult.blockCreative && o.LJ(this.restoreException, draftFileRestoreResult.restoreException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((this.fileType * 31) + this.priority) * 31;
        Integer num = this.toastStringRes;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.blockCreative;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.restoreException.hashCode() + ((hashCode + i2) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftFileRestoreResult(fileType=");
        LIZ.append(this.fileType);
        LIZ.append(", priority=");
        LIZ.append(this.priority);
        LIZ.append(", toastStringRes=");
        LIZ.append(this.toastStringRes);
        LIZ.append(", blockCreative=");
        LIZ.append(this.blockCreative);
        LIZ.append(", restoreException=");
        LIZ.append(this.restoreException);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean isSuc() {
        return this.restoreException.isSuc();
    }

    public final boolean getBlockCreative() {
        return this.blockCreative;
    }

    public final int getFileType() {
        return this.fileType;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final DraftFileRestoreException getRestoreException() {
        return this.restoreException;
    }

    public final Integer getToastStringRes() {
        return this.toastStringRes;
    }

    public DraftFileRestoreResult(int i, int i2, Integer num, boolean z, DraftFileRestoreException restoreException) {
        o.LJIIIZ(restoreException, "restoreException");
        this.fileType = i;
        this.priority = i2;
        this.toastStringRes = num;
        this.blockCreative = z;
        this.restoreException = restoreException;
    }

    public /* synthetic */ DraftFileRestoreResult(int i, int i2, Integer num, boolean z, DraftFileRestoreException draftFileRestoreException, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? new DraftFileRestoreException(0, null, 3, null) : draftFileRestoreException);
    }
}
