package com.ss.android.ugc.aweme.draft.model;

import X.C169696lJ;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftDBSaveException {
    public final int errorCode;
    public final Throwable throwable;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftDBSaveException() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftDBSaveException copy$default(DraftDBSaveException draftDBSaveException, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftDBSaveException.errorCode;
        }
        if ((i2 & 2) != 0) {
            th = draftDBSaveException.throwable;
        }
        return draftDBSaveException.copy(i, th);
    }

    public final DraftDBSaveException copy(int i, Throwable th) {
        return new DraftDBSaveException(i, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftDBSaveException)) {
            return false;
        }
        DraftDBSaveException draftDBSaveException = (DraftDBSaveException) obj;
        return this.errorCode == draftDBSaveException.errorCode && o.LJ(this.throwable, draftDBSaveException.throwable);
    }

    public int hashCode() {
        int i = this.errorCode * 31;
        Throwable th = this.throwable;
        return i + (th == null ? 0 : th.hashCode());
    }

    public final boolean isSuc() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftDBSaveException(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", throwable=");
        return C169696lJ.LIZLLL(LIZ, this.throwable, ')', LIZ);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public DraftDBSaveException(int i, Throwable th) {
        this.errorCode = i;
        this.throwable = th;
    }

    public /* synthetic */ DraftDBSaveException(int i, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : th);
    }
}
