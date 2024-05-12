package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C48339Iy7;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PreviewDockerState implements InterfaceC61312at {
    public final ArrayList<CutSameVideoImageExtraData> cutSamExtraDataList;
    public final boolean isAutoCutSoundSyncMode;
    public final boolean isCutSame;
    public final boolean isSoundSync;
    public final boolean isUgcTemplate;
    public final int minVideoCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewDockerState() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreviewDockerState copy$default(PreviewDockerState previewDockerState, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = previewDockerState.minVideoCount;
        }
        if ((i2 & 2) != 0) {
            arrayList = previewDockerState.cutSamExtraDataList;
        }
        if ((i2 & 4) != 0) {
            z = previewDockerState.isCutSame;
        }
        if ((i2 & 8) != 0) {
            z2 = previewDockerState.isSoundSync;
        }
        if ((i2 & 16) != 0) {
            z3 = previewDockerState.isUgcTemplate;
        }
        if ((i2 & 32) != 0) {
            z4 = previewDockerState.isAutoCutSoundSyncMode;
        }
        return previewDockerState.copy(i, arrayList, z, z2, z3, z4);
    }

    public final PreviewDockerState copy(int i, ArrayList<CutSameVideoImageExtraData> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        return new PreviewDockerState(i, arrayList, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewDockerState)) {
            return false;
        }
        PreviewDockerState previewDockerState = (PreviewDockerState) obj;
        return this.minVideoCount == previewDockerState.minVideoCount && o.LJ(this.cutSamExtraDataList, previewDockerState.cutSamExtraDataList) && this.isCutSame == previewDockerState.isCutSame && this.isSoundSync == previewDockerState.isSoundSync && this.isUgcTemplate == previewDockerState.isUgcTemplate && this.isAutoCutSoundSyncMode == previewDockerState.isAutoCutSoundSyncMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.minVideoCount * 31;
        ArrayList<CutSameVideoImageExtraData> arrayList = this.cutSamExtraDataList;
        int hashCode = (i + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        boolean z = this.isCutSame;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.isSoundSync;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.isUgcTemplate;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        return ((i5 + i6) * 31) + (this.isAutoCutSoundSyncMode ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewDockerState(minVideoCount=");
        LIZ.append(this.minVideoCount);
        LIZ.append(", cutSamExtraDataList=");
        LIZ.append(this.cutSamExtraDataList);
        LIZ.append(", isCutSame=");
        LIZ.append(this.isCutSame);
        LIZ.append(", isSoundSync=");
        LIZ.append(this.isSoundSync);
        LIZ.append(", isUgcTemplate=");
        LIZ.append(this.isUgcTemplate);
        LIZ.append(", isAutoCutSoundSyncMode=");
        return C48339Iy7.LIZJ(LIZ, this.isAutoCutSoundSyncMode, ')', LIZ);
    }

    public final ArrayList<CutSameVideoImageExtraData> getCutSamExtraDataList() {
        return this.cutSamExtraDataList;
    }

    public final int getMinVideoCount() {
        return this.minVideoCount;
    }

    public final boolean isAutoCutSoundSyncMode() {
        return this.isAutoCutSoundSyncMode;
    }

    public final boolean isCutSame() {
        return this.isCutSame;
    }

    public final boolean isSoundSync() {
        return this.isSoundSync;
    }

    public final boolean isUgcTemplate() {
        return this.isUgcTemplate;
    }

    public PreviewDockerState(int i, ArrayList<CutSameVideoImageExtraData> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        this.minVideoCount = i;
        this.cutSamExtraDataList = arrayList;
        this.isCutSame = z;
        this.isSoundSync = z2;
        this.isUgcTemplate = z3;
        this.isAutoCutSoundSyncMode = z4;
    }

    public /* synthetic */ PreviewDockerState(int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : arrayList, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) == 0 ? z4 : false);
    }
}
