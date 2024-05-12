package com.ss.android.ugc.aweme.draft.model;

import X.C79062V1e;
import X.JBR;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftDeleteResult {
    public final Throwable codeException;
    public final String creationId;
    public final DraftDBDeleteResult deleteDBResult;
    public final long deleteDuration;
    public final DraftFileDeleteResult deleteFileResult;
    public final String deleteScene;
    public final int draftAwemeType;
    public final int draftType;
    public final long saveDraftAppVersion;
    public final String saveDraftTime;

    public static /* synthetic */ DraftDeleteResult copy$default(DraftDeleteResult draftDeleteResult, String str, int i, String str2, long j, long j2, String str3, DraftFileDeleteResult draftFileDeleteResult, DraftDBDeleteResult draftDBDeleteResult, Throwable th, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = draftDeleteResult.creationId;
        }
        if ((i3 & 2) != 0) {
            i = draftDeleteResult.draftType;
        }
        if ((i3 & 4) != 0) {
            str2 = draftDeleteResult.saveDraftTime;
        }
        if ((i3 & 8) != 0) {
            j = draftDeleteResult.saveDraftAppVersion;
        }
        if ((i3 & 16) != 0) {
            j2 = draftDeleteResult.deleteDuration;
        }
        if ((i3 & 32) != 0) {
            str3 = draftDeleteResult.deleteScene;
        }
        if ((i3 & 64) != 0) {
            draftFileDeleteResult = draftDeleteResult.deleteFileResult;
        }
        if ((i3 & 128) != 0) {
            draftDBDeleteResult = draftDeleteResult.deleteDBResult;
        }
        if ((i3 & 256) != 0) {
            th = draftDeleteResult.codeException;
        }
        if ((i3 & 512) != 0) {
            i2 = draftDeleteResult.draftAwemeType;
        }
        return draftDeleteResult.copy(str, i, str2, j, j2, str3, draftFileDeleteResult, draftDBDeleteResult, th, i2);
    }

    public final DraftDeleteResult copy(String creationId, int i, String saveDraftTime, long j, long j2, String deleteScene, DraftFileDeleteResult deleteFileResult, DraftDBDeleteResult deleteDBResult, Throwable th, int i2) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(deleteScene, "deleteScene");
        o.LJIIIZ(deleteFileResult, "deleteFileResult");
        o.LJIIIZ(deleteDBResult, "deleteDBResult");
        return new DraftDeleteResult(creationId, i, saveDraftTime, j, j2, deleteScene, deleteFileResult, deleteDBResult, th, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftDeleteResult)) {
            return false;
        }
        DraftDeleteResult draftDeleteResult = (DraftDeleteResult) obj;
        return o.LJ(this.creationId, draftDeleteResult.creationId) && this.draftType == draftDeleteResult.draftType && o.LJ(this.saveDraftTime, draftDeleteResult.saveDraftTime) && this.saveDraftAppVersion == draftDeleteResult.saveDraftAppVersion && this.deleteDuration == draftDeleteResult.deleteDuration && o.LJ(this.deleteScene, draftDeleteResult.deleteScene) && o.LJ(this.deleteFileResult, draftDeleteResult.deleteFileResult) && o.LJ(this.deleteDBResult, draftDeleteResult.deleteDBResult) && o.LJ(this.codeException, draftDeleteResult.codeException) && this.draftAwemeType == draftDeleteResult.draftAwemeType;
    }

    public final int getErrorCode() {
        if (this.deleteFileResult.isSuc() && this.deleteDBResult.isSuc() && this.codeException == null) {
            return 0;
        }
        if (!this.deleteFileResult.isSuc()) {
            return this.deleteFileResult.getDeleteException().getErrorCode();
        }
        if (!this.deleteDBResult.isSuc()) {
            return this.deleteDBResult.getDeleteException().getErrorCode();
        }
        if (this.codeException != null) {
            return -6000;
        }
        return -1;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.deleteDBResult.hashCode() + ((this.deleteFileResult.hashCode() + C79062V1e.LJ(this.deleteScene, JBR.LIZJ(this.deleteDuration, JBR.LIZJ(this.saveDraftAppVersion, C79062V1e.LJ(this.saveDraftTime, ((this.creationId.hashCode() * 31) + this.draftType) * 31, 31), 31), 31), 31)) * 31)) * 31;
        Throwable th = this.codeException;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.draftAwemeType;
    }

    public final boolean isSuc() {
        if (getErrorCode() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftDeleteResult(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", draftType=");
        LIZ.append(this.draftType);
        LIZ.append(", saveDraftTime=");
        LIZ.append(this.saveDraftTime);
        LIZ.append(", saveDraftAppVersion=");
        LIZ.append(this.saveDraftAppVersion);
        LIZ.append(", deleteDuration=");
        LIZ.append(this.deleteDuration);
        LIZ.append(", deleteScene=");
        LIZ.append(this.deleteScene);
        LIZ.append(", deleteFileResult=");
        LIZ.append(this.deleteFileResult);
        LIZ.append(", deleteDBResult=");
        LIZ.append(this.deleteDBResult);
        LIZ.append(", codeException=");
        LIZ.append(this.codeException);
        LIZ.append(", draftAwemeType=");
        return b0.LIZJ(LIZ, this.draftAwemeType, ')', LIZ);
    }

    public final Throwable getCodeException() {
        return this.codeException;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final DraftDBDeleteResult getDeleteDBResult() {
        return this.deleteDBResult;
    }

    public final long getDeleteDuration() {
        return this.deleteDuration;
    }

    public final DraftFileDeleteResult getDeleteFileResult() {
        return this.deleteFileResult;
    }

    public final String getDeleteScene() {
        return this.deleteScene;
    }

    public final int getDraftAwemeType() {
        return this.draftAwemeType;
    }

    public final int getDraftType() {
        return this.draftType;
    }

    public final long getSaveDraftAppVersion() {
        return this.saveDraftAppVersion;
    }

    public final String getSaveDraftTime() {
        return this.saveDraftTime;
    }

    public DraftDeleteResult(String creationId, int i, String saveDraftTime, long j, long j2, String deleteScene, DraftFileDeleteResult deleteFileResult, DraftDBDeleteResult deleteDBResult, Throwable th, int i2) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(deleteScene, "deleteScene");
        o.LJIIIZ(deleteFileResult, "deleteFileResult");
        o.LJIIIZ(deleteDBResult, "deleteDBResult");
        this.creationId = creationId;
        this.draftType = i;
        this.saveDraftTime = saveDraftTime;
        this.saveDraftAppVersion = j;
        this.deleteDuration = j2;
        this.deleteScene = deleteScene;
        this.deleteFileResult = deleteFileResult;
        this.deleteDBResult = deleteDBResult;
        this.codeException = th;
        this.draftAwemeType = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DraftDeleteResult(String str, int i, String str2, long j, long j2, String str3, DraftFileDeleteResult draftFileDeleteResult, DraftDBDeleteResult draftDBDeleteResult, Throwable th, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, j, (i3 & 16) != 0 ? 0L : j2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? new DraftFileDeleteResult(0L, null, 3, 0 == true ? 1 : 0) : draftFileDeleteResult, (i3 & 128) != 0 ? new DraftDBDeleteResult(0L, null, 3, 0 == true ? 1 : 0) : draftDBDeleteResult, (i3 & 256) != 0 ? null : th, (i3 & 512) != 0 ? -1 : i2);
    }
}
