package com.ss.android.ugc.aweme.services.now.model;

import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeNowDraft {
    public final String creationId;
    public final BaseShortVideoContext editModel;
    public final NowsShootModel nowsShootData;
    public final long savedTime;
    public final AwemeDraft sourceDraftData;

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeNowDraft() {
        this(null, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CreativeNowDraft copy$default(CreativeNowDraft creativeNowDraft, String str, long j, BaseShortVideoContext baseShortVideoContext, NowsShootModel nowsShootModel, AwemeDraft awemeDraft, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creativeNowDraft.creationId;
        }
        if ((i & 2) != 0) {
            j = creativeNowDraft.savedTime;
        }
        if ((i & 4) != 0) {
            baseShortVideoContext = creativeNowDraft.editModel;
        }
        if ((i & 8) != 0) {
            nowsShootModel = creativeNowDraft.nowsShootData;
        }
        if ((i & 16) != 0) {
            awemeDraft = creativeNowDraft.sourceDraftData;
        }
        return creativeNowDraft.copy(str, j, baseShortVideoContext, nowsShootModel, awemeDraft);
    }

    public final CreativeNowDraft copy(String creationId, long j, BaseShortVideoContext baseShortVideoContext, NowsShootModel nowsShootModel, AwemeDraft awemeDraft) {
        o.LJIIIZ(creationId, "creationId");
        return new CreativeNowDraft(creationId, j, baseShortVideoContext, nowsShootModel, awemeDraft);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreativeNowDraft)) {
            return false;
        }
        CreativeNowDraft creativeNowDraft = (CreativeNowDraft) obj;
        return o.LJ(this.creationId, creativeNowDraft.creationId) && this.savedTime == creativeNowDraft.savedTime && o.LJ(this.editModel, creativeNowDraft.editModel) && o.LJ(this.nowsShootData, creativeNowDraft.nowsShootData) && o.LJ(this.sourceDraftData, creativeNowDraft.sourceDraftData);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeNowDraft(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", savedTime=");
        LIZ.append(this.savedTime);
        LIZ.append(", editModel=");
        LIZ.append(this.editModel);
        LIZ.append(", nowsShootData=");
        LIZ.append(this.nowsShootData);
        LIZ.append(", sourceDraftData=");
        LIZ.append(this.sourceDraftData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.savedTime, this.creationId.hashCode() * 31, 31);
        BaseShortVideoContext baseShortVideoContext = this.editModel;
        int i = 0;
        if (baseShortVideoContext == null) {
            hashCode = 0;
        } else {
            hashCode = baseShortVideoContext.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        NowsShootModel nowsShootModel = this.nowsShootData;
        if (nowsShootModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = nowsShootModel.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        AwemeDraft awemeDraft = this.sourceDraftData;
        if (awemeDraft != null) {
            i = awemeDraft.hashCode();
        }
        return i3 + i;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final BaseShortVideoContext getEditModel() {
        return this.editModel;
    }

    public final NowsShootModel getNowsShootData() {
        return this.nowsShootData;
    }

    public final long getSavedTime() {
        return this.savedTime;
    }

    public final AwemeDraft getSourceDraftData() {
        return this.sourceDraftData;
    }

    public CreativeNowDraft(String creationId, long j, BaseShortVideoContext baseShortVideoContext, NowsShootModel nowsShootModel, AwemeDraft awemeDraft) {
        o.LJIIIZ(creationId, "creationId");
        this.creationId = creationId;
        this.savedTime = j;
        this.editModel = baseShortVideoContext;
        this.nowsShootData = nowsShootModel;
        this.sourceDraftData = awemeDraft;
    }

    public /* synthetic */ CreativeNowDraft(String str, long j, BaseShortVideoContext baseShortVideoContext, NowsShootModel nowsShootModel, AwemeDraft awemeDraft, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : baseShortVideoContext, (i & 8) != 0 ? null : nowsShootModel, (i & 16) == 0 ? awemeDraft : null);
    }
}
