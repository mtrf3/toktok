package com.ss.android.ugc.aweme.draft.model;

import X.C41652GWi;
import X.C79062V1e;
import X.JBR;
import X.UPJ;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftRestoreResult {
    public final DraftCheckResult checkResult;
    public final Throwable codeException;
    public final String creationId;
    public final int draftAwemeType;
    public final int draftType;
    public final int draftVersion;
    public final String fileTreeInfo;
    public final boolean isPublishedDraft;
    public final DraftFileRestoreResults restoreFileResults;
    public final long saveDraftAppVersion;
    public final String saveDraftTime;
    public final int useCreativeFileStandard;

    public static /* synthetic */ DraftRestoreResult copy$default(DraftRestoreResult draftRestoreResult, String str, int i, String str2, long j, int i2, String str3, DraftCheckResult draftCheckResult, DraftFileRestoreResults draftFileRestoreResults, boolean z, Throwable th, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = draftRestoreResult.creationId;
        }
        if ((i5 & 2) != 0) {
            i = draftRestoreResult.draftType;
        }
        if ((i5 & 4) != 0) {
            str2 = draftRestoreResult.saveDraftTime;
        }
        if ((i5 & 8) != 0) {
            j = draftRestoreResult.saveDraftAppVersion;
        }
        if ((i5 & 16) != 0) {
            i2 = draftRestoreResult.useCreativeFileStandard;
        }
        if ((i5 & 32) != 0) {
            str3 = draftRestoreResult.fileTreeInfo;
        }
        if ((i5 & 64) != 0) {
            draftCheckResult = draftRestoreResult.checkResult;
        }
        if ((i5 & 128) != 0) {
            draftFileRestoreResults = draftRestoreResult.restoreFileResults;
        }
        if ((i5 & 256) != 0) {
            z = draftRestoreResult.isPublishedDraft;
        }
        if ((i5 & 512) != 0) {
            th = draftRestoreResult.codeException;
        }
        if ((i5 & 1024) != 0) {
            i3 = draftRestoreResult.draftAwemeType;
        }
        if ((i5 & 2048) != 0) {
            i4 = draftRestoreResult.draftVersion;
        }
        return draftRestoreResult.copy(str, i, str2, j, i2, str3, draftCheckResult, draftFileRestoreResults, z, th, i3, i4);
    }

    public final DraftRestoreResult copy(String creationId, int i, String saveDraftTime, long j, int i2, String fileTreeInfo, DraftCheckResult checkResult, DraftFileRestoreResults restoreFileResults, boolean z, Throwable th, int i3, int i4) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(restoreFileResults, "restoreFileResults");
        return new DraftRestoreResult(creationId, i, saveDraftTime, j, i2, fileTreeInfo, checkResult, restoreFileResults, z, th, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftRestoreResult)) {
            return false;
        }
        DraftRestoreResult draftRestoreResult = (DraftRestoreResult) obj;
        return o.LJ(this.creationId, draftRestoreResult.creationId) && this.draftType == draftRestoreResult.draftType && o.LJ(this.saveDraftTime, draftRestoreResult.saveDraftTime) && this.saveDraftAppVersion == draftRestoreResult.saveDraftAppVersion && this.useCreativeFileStandard == draftRestoreResult.useCreativeFileStandard && o.LJ(this.fileTreeInfo, draftRestoreResult.fileTreeInfo) && o.LJ(this.checkResult, draftRestoreResult.checkResult) && o.LJ(this.restoreFileResults, draftRestoreResult.restoreFileResults) && this.isPublishedDraft == draftRestoreResult.isPublishedDraft && o.LJ(this.codeException, draftRestoreResult.codeException) && this.draftAwemeType == draftRestoreResult.draftAwemeType && this.draftVersion == draftRestoreResult.draftVersion;
    }

    public final long getDuration() {
        return this.restoreFileResults.getFileRestoreDuration() + this.checkResult.getCheckDuration();
    }

    public final int getErrorCode() {
        if (this.checkResult.isSuc() && this.restoreFileResults.isSuc() && this.codeException == null) {
            return 0;
        }
        if (!this.checkResult.isSuc()) {
            return this.checkResult.getErrorCode();
        }
        if (!this.restoreFileResults.isSuc()) {
            return this.restoreFileResults.getErrorCode();
        }
        if (this.codeException != null) {
            return -4000;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.restoreFileResults.hashCode() + ((this.checkResult.hashCode() + C79062V1e.LJ(this.fileTreeInfo, (JBR.LIZJ(this.saveDraftAppVersion, C79062V1e.LJ(this.saveDraftTime, ((this.creationId.hashCode() * 31) + this.draftType) * 31, 31), 31) + this.useCreativeFileStandard) * 31, 31)) * 31)) * 31;
        boolean z = this.isPublishedDraft;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Throwable th = this.codeException;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return ((((i2 + hashCode) * 31) + this.draftAwemeType) * 31) + this.draftVersion;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DraftRestoreResult(creationId=");
        sb.append(this.creationId);
        sb.append(", draftType=");
        sb.append(this.draftType);
        sb.append(", saveDraftTime=");
        sb.append(this.saveDraftTime);
        sb.append(", saveDraftAppVersion=");
        sb.append(this.saveDraftAppVersion);
        sb.append(", useCreativeFileStandard=");
        sb.append(this.useCreativeFileStandard);
        sb.append(", fileTreeInfo=");
        sb.append(this.fileTreeInfo);
        sb.append(", checkResult=");
        sb.append(this.checkResult);
        sb.append(", restoreFileResults=");
        sb.append(this.restoreFileResults);
        sb.append(", isPublishedDraft=");
        sb.append(this.isPublishedDraft);
        sb.append(", codeException=");
        sb.append(this.codeException);
        sb.append(", draftAwemeType=");
        sb.append(this.draftAwemeType);
        sb.append(", draftVersion=");
        return UPJ.LIZLLL(sb, this.draftVersion, ')');
    }

    public final boolean isSuc() {
        if (C41652GWi.LIZ() || getErrorCode() != 0) {
            return false;
        }
        return true;
    }

    public final DraftCheckResult getCheckResult() {
        return this.checkResult;
    }

    public final Throwable getCodeException() {
        return this.codeException;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftAwemeType() {
        return this.draftAwemeType;
    }

    public final int getDraftType() {
        return this.draftType;
    }

    public final int getDraftVersion() {
        return this.draftVersion;
    }

    public final String getFileTreeInfo() {
        return this.fileTreeInfo;
    }

    public final DraftFileRestoreResults getRestoreFileResults() {
        return this.restoreFileResults;
    }

    public final long getSaveDraftAppVersion() {
        return this.saveDraftAppVersion;
    }

    public final String getSaveDraftTime() {
        return this.saveDraftTime;
    }

    public final int getUseCreativeFileStandard() {
        return this.useCreativeFileStandard;
    }

    public final boolean isPublishedDraft() {
        return this.isPublishedDraft;
    }

    public DraftRestoreResult(String creationId, int i, String saveDraftTime, long j, int i2, String fileTreeInfo, DraftCheckResult checkResult, DraftFileRestoreResults restoreFileResults, boolean z, Throwable th, int i3, int i4) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(restoreFileResults, "restoreFileResults");
        this.creationId = creationId;
        this.draftType = i;
        this.saveDraftTime = saveDraftTime;
        this.saveDraftAppVersion = j;
        this.useCreativeFileStandard = i2;
        this.fileTreeInfo = fileTreeInfo;
        this.checkResult = checkResult;
        this.restoreFileResults = restoreFileResults;
        this.isPublishedDraft = z;
        this.codeException = th;
        this.draftAwemeType = i3;
        this.draftVersion = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DraftRestoreResult(String str, int i, String str2, long j, int i2, String str3, DraftCheckResult draftCheckResult, DraftFileRestoreResults draftFileRestoreResults, boolean z, Throwable th, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, j, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? new DraftCheckResult(0L, null, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0) : draftCheckResult, (i5 & 128) != 0 ? new DraftFileRestoreResults(0L, null, null, 7, null) : draftFileRestoreResults, (i5 & 256) != 0 ? false : z, (i5 & 512) != 0 ? null : th, i3, i4);
    }
}
