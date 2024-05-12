package com.ss.android.ugc.aweme.draft.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DraftFileCheckResult {
    public final int errorCode;
    public final String existPath;
    public final String fieldInfo;
    public final String originPath;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftFileCheckResult() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DraftFileCheckResult copy$default(DraftFileCheckResult draftFileCheckResult, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftFileCheckResult.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = draftFileCheckResult.existPath;
        }
        if ((i2 & 4) != 0) {
            str2 = draftFileCheckResult.originPath;
        }
        if ((i2 & 8) != 0) {
            str3 = draftFileCheckResult.fieldInfo;
        }
        return draftFileCheckResult.copy(i, str, str2, str3);
    }

    public final DraftFileCheckResult copy(int i, String str, String str2, String str3) {
        return new DraftFileCheckResult(i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileCheckResult)) {
            return false;
        }
        DraftFileCheckResult draftFileCheckResult = (DraftFileCheckResult) obj;
        return this.errorCode == draftFileCheckResult.errorCode && o.LJ(this.existPath, draftFileCheckResult.existPath) && o.LJ(this.originPath, draftFileCheckResult.originPath) && o.LJ(this.fieldInfo, draftFileCheckResult.fieldInfo);
    }

    public int hashCode() {
        int i = this.errorCode * 31;
        String str = this.existPath;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originPath;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fieldInfo;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isSuc() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftFileCheckResult(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", existPath=");
        LIZ.append(this.existPath);
        LIZ.append(", originPath=");
        LIZ.append(this.originPath);
        LIZ.append(", fieldInfo=");
        return q.LIZIZ(LIZ, this.fieldInfo, ')', LIZ);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getExistPath() {
        return this.existPath;
    }

    public final String getFieldInfo() {
        return this.fieldInfo;
    }

    public final String getOriginPath() {
        return this.originPath;
    }

    public DraftFileCheckResult(int i, String str, String str2, String str3) {
        this.errorCode = i;
        this.existPath = str;
        this.originPath = str2;
        this.fieldInfo = str3;
    }

    public /* synthetic */ DraftFileCheckResult(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
