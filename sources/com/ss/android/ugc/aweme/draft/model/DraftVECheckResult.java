package com.ss.android.ugc.aweme.draft.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DraftVECheckResult {
    public final int errorCode;
    public final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftVECheckResult() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftVECheckResult copy$default(DraftVECheckResult draftVECheckResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftVECheckResult.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = draftVECheckResult.path;
        }
        return draftVECheckResult.copy(i, str);
    }

    public final DraftVECheckResult copy(int i, String str) {
        return new DraftVECheckResult(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftVECheckResult)) {
            return false;
        }
        DraftVECheckResult draftVECheckResult = (DraftVECheckResult) obj;
        return this.errorCode == draftVECheckResult.errorCode && o.LJ(this.path, draftVECheckResult.path);
    }

    public int hashCode() {
        int i = this.errorCode * 31;
        String str = this.path;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftVECheckResult(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", path=");
        return q.LIZIZ(LIZ, this.path, ')', LIZ);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getPath() {
        return this.path;
    }

    public DraftVECheckResult(int i, String str) {
        this.errorCode = i;
        this.path = str;
    }

    public /* synthetic */ DraftVECheckResult(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
