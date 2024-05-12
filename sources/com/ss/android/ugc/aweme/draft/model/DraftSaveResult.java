package com.ss.android.ugc.aweme.draft.model;

import X.C00F;
import X.C43588H8u;
import X.C79062V1e;
import X.C79146V4k;
import X.HH1;
import X.JBR;
import X.UPJ;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftSaveResult {
    public final DraftCheckResult checkResult;
    public final Throwable codeException;
    public final String creationId;
    public final int draftAwemeType;
    public final int draftFrom;
    public final String draftScene;
    public final int draftType;
    public final int draftVersion;
    public final String fileTreeInfo;
    public final boolean isPublishedDraft;
    public final DraftSavePreProcessResults preProcessResults;
    public final DraftDBSaveResult saveDBResult;
    public final long saveDraftAppVersion;
    public final String saveDraftTime;
    public final DraftFileSaveResults saveFileResults;
    public final int useCreativeFileStandard;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftSaveResult(String creationId, int i, int i2, String saveDraftTime, long j, int i3, String fileTreeInfo, DraftSavePreProcessResults preProcessResults, DraftCheckResult checkResult, DraftFileSaveResults saveFileResults, DraftDBSaveResult saveDBResult, boolean z, String draftScene, int i4) {
        this(creationId, i, i2, saveDraftTime, j, i3, fileTreeInfo, preProcessResults, checkResult, saveFileResults, saveDBResult, z, null, draftScene, i4, 0, 36864, 0 == true ? 1 : 0);
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(preProcessResults, "preProcessResults");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(saveFileResults, "saveFileResults");
        o.LJIIIZ(saveDBResult, "saveDBResult");
        o.LJIIIZ(draftScene, "draftScene");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraftSaveResult(String creationId, int i, int i2, String saveDraftTime, long j, int i3, String fileTreeInfo, DraftSavePreProcessResults preProcessResults, DraftCheckResult checkResult, DraftFileSaveResults saveFileResults, DraftDBSaveResult saveDBResult, boolean z, Throwable th, String draftScene, int i4) {
        this(creationId, i, i2, saveDraftTime, j, i3, fileTreeInfo, preProcessResults, checkResult, saveFileResults, saveDBResult, z, th, draftScene, i4, 0, 32768, null);
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(preProcessResults, "preProcessResults");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(saveFileResults, "saveFileResults");
        o.LJIIIZ(saveDBResult, "saveDBResult");
        o.LJIIIZ(draftScene, "draftScene");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftSaveResult(String creationId, int i, int i2, String saveDraftTime, long j, int i3, String fileTreeInfo, DraftSavePreProcessResults preProcessResults, DraftCheckResult checkResult, DraftFileSaveResults saveFileResults, boolean z, String draftScene, int i4) {
        this(creationId, i, i2, saveDraftTime, j, i3, fileTreeInfo, preProcessResults, checkResult, saveFileResults, null, z, 0 == true ? 1 : 0, draftScene, i4, 0, 37888, 0 == true ? 1 : 0);
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(preProcessResults, "preProcessResults");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(saveFileResults, "saveFileResults");
        o.LJIIIZ(draftScene, "draftScene");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftSaveResult(String creationId, int i, int i2, String saveDraftTime, long j, int i3, String fileTreeInfo, DraftSavePreProcessResults preProcessResults, DraftCheckResult checkResult, boolean z, String draftScene, int i4) {
        this(creationId, i, i2, saveDraftTime, j, i3, fileTreeInfo, preProcessResults, checkResult, null, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, draftScene, i4, 0, 38400, 0 == true ? 1 : 0);
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(preProcessResults, "preProcessResults");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(draftScene, "draftScene");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftSaveResult(String creationId, int i, int i2, String saveDraftTime, long j, int i3, String fileTreeInfo, DraftSavePreProcessResults preProcessResults, boolean z, String draftScene, int i4) {
        this(creationId, i, i2, saveDraftTime, j, i3, fileTreeInfo, preProcessResults, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, draftScene, i4, 0, 38656, 0 == true ? 1 : 0);
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(preProcessResults, "preProcessResults");
        o.LJIIIZ(draftScene, "draftScene");
    }

    public static /* synthetic */ DraftSaveResult copy$default(DraftSaveResult draftSaveResult, String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, int i6, Object obj) {
        String str5 = str;
        int i7 = i;
        long j2 = j;
        int i8 = i2;
        String str6 = str2;
        DraftCheckResult draftCheckResult2 = draftCheckResult;
        DraftSavePreProcessResults draftSavePreProcessResults2 = draftSavePreProcessResults;
        int i9 = i3;
        String str7 = str3;
        boolean z2 = z;
        Throwable th2 = th;
        DraftFileSaveResults draftFileSaveResults2 = draftFileSaveResults;
        DraftDBSaveResult draftDBSaveResult2 = draftDBSaveResult;
        int i10 = i5;
        String str8 = str4;
        int i11 = i4;
        if ((i6 & 1) != 0) {
            str5 = draftSaveResult.creationId;
        }
        if ((i6 & 2) != 0) {
            i7 = draftSaveResult.draftType;
        }
        if ((i6 & 4) != 0) {
            i8 = draftSaveResult.draftFrom;
        }
        if ((i6 & 8) != 0) {
            str6 = draftSaveResult.saveDraftTime;
        }
        if ((i6 & 16) != 0) {
            j2 = draftSaveResult.saveDraftAppVersion;
        }
        if ((i6 & 32) != 0) {
            i9 = draftSaveResult.useCreativeFileStandard;
        }
        if ((i6 & 64) != 0) {
            str7 = draftSaveResult.fileTreeInfo;
        }
        if ((i6 & 128) != 0) {
            draftSavePreProcessResults2 = draftSaveResult.preProcessResults;
        }
        if ((i6 & 256) != 0) {
            draftCheckResult2 = draftSaveResult.checkResult;
        }
        if ((i6 & 512) != 0) {
            draftFileSaveResults2 = draftSaveResult.saveFileResults;
        }
        if ((i6 & 1024) != 0) {
            draftDBSaveResult2 = draftSaveResult.saveDBResult;
        }
        if ((i6 & 2048) != 0) {
            z2 = draftSaveResult.isPublishedDraft;
        }
        if ((i6 & 4096) != 0) {
            th2 = draftSaveResult.codeException;
        }
        if ((i6 & FileUtils.BUFFER_SIZE) != 0) {
            str8 = draftSaveResult.draftScene;
        }
        if ((i6 & 16384) != 0) {
            i11 = draftSaveResult.draftAwemeType;
        }
        if ((i6 & 32768) != 0) {
            i10 = draftSaveResult.draftVersion;
        }
        int i12 = i9;
        return draftSaveResult.copy(str5, i7, i8, str6, j2, i12, str7, draftSavePreProcessResults2, draftCheckResult2, draftFileSaveResults2, draftDBSaveResult2, z2, th2, str8, i11, i10);
    }

    public final DraftSaveResult copy(String creationId, int i, int i2, String saveDraftTime, long j, int i3, String fileTreeInfo, DraftSavePreProcessResults preProcessResults, DraftCheckResult checkResult, DraftFileSaveResults saveFileResults, DraftDBSaveResult saveDBResult, boolean z, Throwable th, String draftScene, int i4, int i5) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(preProcessResults, "preProcessResults");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(saveFileResults, "saveFileResults");
        o.LJIIIZ(saveDBResult, "saveDBResult");
        o.LJIIIZ(draftScene, "draftScene");
        return new DraftSaveResult(creationId, i, i2, saveDraftTime, j, i3, fileTreeInfo, preProcessResults, checkResult, saveFileResults, saveDBResult, z, th, draftScene, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftSaveResult)) {
            return false;
        }
        DraftSaveResult draftSaveResult = (DraftSaveResult) obj;
        return o.LJ(this.creationId, draftSaveResult.creationId) && this.draftType == draftSaveResult.draftType && this.draftFrom == draftSaveResult.draftFrom && o.LJ(this.saveDraftTime, draftSaveResult.saveDraftTime) && this.saveDraftAppVersion == draftSaveResult.saveDraftAppVersion && this.useCreativeFileStandard == draftSaveResult.useCreativeFileStandard && o.LJ(this.fileTreeInfo, draftSaveResult.fileTreeInfo) && o.LJ(this.preProcessResults, draftSaveResult.preProcessResults) && o.LJ(this.checkResult, draftSaveResult.checkResult) && o.LJ(this.saveFileResults, draftSaveResult.saveFileResults) && o.LJ(this.saveDBResult, draftSaveResult.saveDBResult) && this.isPublishedDraft == draftSaveResult.isPublishedDraft && o.LJ(this.codeException, draftSaveResult.codeException) && o.LJ(this.draftScene, draftSaveResult.draftScene) && this.draftAwemeType == draftSaveResult.draftAwemeType && this.draftVersion == draftSaveResult.draftVersion;
    }

    public final long getDuration() {
        return this.saveDBResult.getDbSaveDuration() + this.saveFileResults.getFileSaveDuration() + this.checkResult.getCheckDuration() + this.preProcessResults.getPreProcessDuration();
    }

    public final int getErrorCode() {
        if (this.preProcessResults.isSuc() && this.checkResult.isSuc() && this.saveFileResults.isSuc() && this.saveDBResult.isSuc() && this.codeException == null) {
            return 0;
        }
        if (!this.preProcessResults.isSuc()) {
            return this.preProcessResults.getErrorCode();
        }
        if (!this.checkResult.isSuc()) {
            return this.checkResult.getErrorCode();
        }
        if (!this.saveFileResults.isSuc()) {
            return this.saveFileResults.getErrorCode();
        }
        if (!this.saveDBResult.isSuc()) {
            return this.saveDBResult.getSaveException().getErrorCode();
        }
        if (this.codeException != null) {
            return -2000;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.saveDBResult.hashCode() + ((this.saveFileResults.hashCode() + ((this.checkResult.hashCode() + ((this.preProcessResults.hashCode() + C79062V1e.LJ(this.fileTreeInfo, (JBR.LIZJ(this.saveDraftAppVersion, C79062V1e.LJ(this.saveDraftTime, ((((this.creationId.hashCode() * 31) + this.draftType) * 31) + this.draftFrom) * 31, 31), 31) + this.useCreativeFileStandard) * 31, 31)) * 31)) * 31)) * 31)) * 31;
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
        return ((C79062V1e.LJ(this.draftScene, (i2 + hashCode) * 31, 31) + this.draftAwemeType) * 31) + this.draftVersion;
    }

    public final boolean isSuc() {
        if ((C00F.LIZ(31744, 0, "studio_fake_draft_operation_response", true) == 1 && C79146V4k.LJJJJIZL()) || getErrorCode() != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DraftSaveResult(creationId=");
        sb.append(this.creationId);
        sb.append(", draftType=");
        sb.append(this.draftType);
        sb.append(", draftFrom=");
        sb.append(this.draftFrom);
        sb.append(", saveDraftTime=");
        sb.append(this.saveDraftTime);
        sb.append(", saveDraftAppVersion=");
        sb.append(this.saveDraftAppVersion);
        sb.append(", useCreativeFileStandard=");
        sb.append(this.useCreativeFileStandard);
        sb.append(", fileTreeInfo=");
        sb.append(this.fileTreeInfo);
        sb.append(", preProcessResults=");
        sb.append(this.preProcessResults);
        sb.append(", checkResult=");
        sb.append(this.checkResult);
        sb.append(", saveFileResults=");
        sb.append(this.saveFileResults);
        sb.append(", saveDBResult=");
        sb.append(this.saveDBResult);
        sb.append(", isPublishedDraft=");
        sb.append(this.isPublishedDraft);
        sb.append(", codeException=");
        sb.append(this.codeException);
        sb.append(", draftScene=");
        sb.append(this.draftScene);
        sb.append(", draftAwemeType=");
        sb.append(this.draftAwemeType);
        sb.append(", draftVersion=");
        return UPJ.LIZLLL(sb, this.draftVersion, ')');
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

    public final int getDraftFrom() {
        return this.draftFrom;
    }

    public final String getDraftScene() {
        return this.draftScene;
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

    public final DraftSavePreProcessResults getPreProcessResults() {
        return this.preProcessResults;
    }

    public final DraftDBSaveResult getSaveDBResult() {
        return this.saveDBResult;
    }

    public final long getSaveDraftAppVersion() {
        return this.saveDraftAppVersion;
    }

    public final String getSaveDraftTime() {
        return this.saveDraftTime;
    }

    public final DraftFileSaveResults getSaveFileResults() {
        return this.saveFileResults;
    }

    public final int getUseCreativeFileStandard() {
        return this.useCreativeFileStandard;
    }

    public final boolean isPublishedDraft() {
        return this.isPublishedDraft;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DraftSaveResult(java.lang.String r21, int r22, int r23, java.lang.String r24, long r25, boolean r27, java.lang.String r28, int r29) {
        /*
            r20 = this;
            java.lang.String r3 = "creationId"
            java.lang.String r5 = "saveDraftTime"
            java.lang.String r7 = "draftScene"
            r4 = r24
            r15 = r28
            r1 = r21
            r2 = r1
            r4 = r4
            r6 = r15
            X.HH1.LIZ(r2, r3, r4, r5, r6, r7)
            r7 = 0
            r8 = 0
            r18 = 38880(0x97e0, float:5.4482E-41)
            r5 = r25
            r3 = r23
            r16 = r29
            r2 = r22
            r13 = r27
            r0 = r20
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r7
            r19 = r8
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.model.DraftSaveResult.<init>(java.lang.String, int, int, java.lang.String, long, boolean, java.lang.String, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, boolean z, String str3, int i4) {
        this(str, i, i2, str2, j, i3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, str3, i4, 0, 38848, 0 == true ? 1 : 0);
        HH1.LIZ(str, "creationId", str2, "saveDraftTime", str3, "draftScene");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, boolean z, String str4, int i4) {
        this(str, i, i2, str2, j, i3, str3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, str4, i4, 0, 38784, 0 == true ? 1 : 0);
        C43588H8u.LIZLLL(str, "creationId", str2, "saveDraftTime", str3, "fileTreeInfo", str4, "draftScene");
    }

    public DraftSaveResult(String creationId, int i, int i2, String saveDraftTime, long j, int i3, String fileTreeInfo, DraftSavePreProcessResults preProcessResults, DraftCheckResult checkResult, DraftFileSaveResults saveFileResults, DraftDBSaveResult saveDBResult, boolean z, Throwable th, String draftScene, int i4, int i5) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(saveDraftTime, "saveDraftTime");
        o.LJIIIZ(fileTreeInfo, "fileTreeInfo");
        o.LJIIIZ(preProcessResults, "preProcessResults");
        o.LJIIIZ(checkResult, "checkResult");
        o.LJIIIZ(saveFileResults, "saveFileResults");
        o.LJIIIZ(saveDBResult, "saveDBResult");
        o.LJIIIZ(draftScene, "draftScene");
        this.creationId = creationId;
        this.draftType = i;
        this.draftFrom = i2;
        this.saveDraftTime = saveDraftTime;
        this.saveDraftAppVersion = j;
        this.useCreativeFileStandard = i3;
        this.fileTreeInfo = fileTreeInfo;
        this.preProcessResults = preProcessResults;
        this.checkResult = checkResult;
        this.saveFileResults = saveFileResults;
        this.saveDBResult = saveDBResult;
        this.isPublishedDraft = z;
        this.codeException = th;
        this.draftScene = draftScene;
        this.draftAwemeType = i4;
        this.draftVersion = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DraftSaveResult(String str, int i, int i2, String str2, long j, int i3, String str3, DraftSavePreProcessResults draftSavePreProcessResults, DraftCheckResult draftCheckResult, DraftFileSaveResults draftFileSaveResults, DraftDBSaveResult draftDBSaveResult, boolean z, Throwable th, String str4, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, j, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? "" : str3, (i6 & 128) != 0 ? new DraftSavePreProcessResults(0L, null, null, 7, null) : draftSavePreProcessResults, (i6 & 256) != 0 ? new DraftCheckResult(0L, null, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0) : draftCheckResult, (i6 & 512) != 0 ? new DraftFileSaveResults(0L, null, null, 7, null) : draftFileSaveResults, (i6 & 1024) != 0 ? new DraftDBSaveResult(0L, null, 3, 0 == true ? 1 : 0) : draftDBSaveResult, z, (i6 & 4096) != 0 ? null : th, str4, i4, (i6 & 32768) != 0 ? -1 : i5);
    }
}
