package com.ss.android.ugc.aweme.draft.model;

import X.C16880lQ;
import X.ORZ;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftCheckResult {
    public final transient long checkDuration;
    public final int checkStage;
    public final DraftFileCheckResults fileCheckResults;
    public final List<DraftVECheckResult> invalidVEFileList;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftCheckResult() {
        this(0L, null, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraftCheckResult(long j) {
        this(j, null, 0 == true ? 1 : 0, 0, 14, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftCheckResult(long j, DraftFileCheckResults fileCheckResults) {
        this(j, fileCheckResults, null, 0, 12, 0 == true ? 1 : 0);
        o.LJIIIZ(fileCheckResults, "fileCheckResults");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraftCheckResult(long j, DraftFileCheckResults fileCheckResults, List<DraftVECheckResult> list) {
        this(j, fileCheckResults, list, 0, 8, null);
        o.LJIIIZ(fileCheckResults, "fileCheckResults");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftCheckResult copy$default(DraftCheckResult draftCheckResult, long j, DraftFileCheckResults draftFileCheckResults, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = draftCheckResult.checkDuration;
        }
        if ((i2 & 2) != 0) {
            draftFileCheckResults = draftCheckResult.fileCheckResults;
        }
        if ((i2 & 4) != 0) {
            list = draftCheckResult.invalidVEFileList;
        }
        if ((i2 & 8) != 0) {
            i = draftCheckResult.checkStage;
        }
        return draftCheckResult.copy(j, draftFileCheckResults, list, i);
    }

    public final DraftCheckResult copy(long j, DraftFileCheckResults fileCheckResults, List<DraftVECheckResult> list, int i) {
        o.LJIIIZ(fileCheckResults, "fileCheckResults");
        return new DraftCheckResult(j, fileCheckResults, list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftCheckResult)) {
            return false;
        }
        DraftCheckResult draftCheckResult = (DraftCheckResult) obj;
        return this.checkDuration == draftCheckResult.checkDuration && o.LJ(this.fileCheckResults, draftCheckResult.fileCheckResults) && o.LJ(this.invalidVEFileList, draftCheckResult.invalidVEFileList) && this.checkStage == draftCheckResult.checkStage;
    }

    public int hashCode() {
        int hashCode = (this.fileCheckResults.hashCode() + (C16880lQ.LLJIJIL(this.checkDuration) * 31)) * 31;
        List<DraftVECheckResult> list = this.invalidVEFileList;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.checkStage;
    }

    public final boolean isSuc() {
        if (!this.fileCheckResults.isSuc()) {
            return false;
        }
        List<DraftVECheckResult> list = this.invalidVEFileList;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        if (!this.fileCheckResults.isSuc()) {
            return this.fileCheckResults.getErrorCode();
        }
        List<DraftVECheckResult> list = this.invalidVEFileList;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return ((DraftVECheckResult) ORZ.LJLLJ(this.invalidVEFileList)).getErrorCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftCheckResult(checkDuration=");
        LIZ.append(this.checkDuration);
        LIZ.append(", fileCheckResults=");
        LIZ.append(this.fileCheckResults);
        LIZ.append(", invalidVEFileList=");
        LIZ.append(this.invalidVEFileList);
        LIZ.append(", checkStage=");
        return b0.LIZJ(LIZ, this.checkStage, ')', LIZ);
    }

    public final long getCheckDuration() {
        return this.checkDuration;
    }

    public final int getCheckStage() {
        return this.checkStage;
    }

    public final DraftFileCheckResults getFileCheckResults() {
        return this.fileCheckResults;
    }

    public final List<DraftVECheckResult> getInvalidVEFileList() {
        return this.invalidVEFileList;
    }

    public DraftCheckResult(long j, DraftFileCheckResults fileCheckResults, List<DraftVECheckResult> list, int i) {
        o.LJIIIZ(fileCheckResults, "fileCheckResults");
        this.checkDuration = j;
        this.fileCheckResults = fileCheckResults;
        this.invalidVEFileList = list;
        this.checkStage = i;
    }

    public /* synthetic */ DraftCheckResult(long j, DraftFileCheckResults draftFileCheckResults, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? new DraftFileCheckResults(null, null, 3, null) : draftFileCheckResults, (i2 & 4) == 0 ? list : null, (i2 & 8) != 0 ? 0 : i);
    }
}
