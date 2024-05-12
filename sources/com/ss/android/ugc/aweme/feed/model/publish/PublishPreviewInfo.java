package com.ss.android.ugc.aweme.feed.model.publish;

import X.F9E;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PublishPreviewInfo extends F9E implements Serializable {
    public String contentSource;
    public String creationId;
    public boolean inPublishing;
    public int progress;
    public PublishStatus publishStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public PublishPreviewInfo() {
        this(false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PublishPreviewInfo copy$default(PublishPreviewInfo publishPreviewInfo, boolean z, int i, PublishStatus publishStatus, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = publishPreviewInfo.inPublishing;
        }
        if ((i2 & 2) != 0) {
            i = publishPreviewInfo.progress;
        }
        if ((i2 & 4) != 0) {
            publishStatus = publishPreviewInfo.publishStatus;
        }
        if ((i2 & 8) != 0) {
            str = publishPreviewInfo.creationId;
        }
        if ((i2 & 16) != 0) {
            str2 = publishPreviewInfo.contentSource;
        }
        return publishPreviewInfo.copy(z, i, publishStatus, str, str2);
    }

    public final PublishPreviewInfo copy(boolean z, int i, PublishStatus publishStatus, String creationId, String contentSource) {
        o.LJIIIZ(publishStatus, "publishStatus");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(contentSource, "contentSource");
        return new PublishPreviewInfo(z, i, publishStatus, creationId, contentSource);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.inPublishing), Integer.valueOf(this.progress), this.publishStatus, this.creationId, this.contentSource};
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final boolean getInPublishing() {
        return this.inPublishing;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final PublishStatus getPublishStatus() {
        return this.publishStatus;
    }

    public final void setContentSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.contentSource = str;
    }

    public final void setCreationId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.creationId = str;
    }

    public final void setInPublishing(boolean z) {
        this.inPublishing = z;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setPublishStatus(PublishStatus publishStatus) {
        o.LJIIIZ(publishStatus, "<set-?>");
        this.publishStatus = publishStatus;
    }

    public PublishPreviewInfo(boolean z, int i, PublishStatus publishStatus, String creationId, String contentSource) {
        o.LJIIIZ(publishStatus, "publishStatus");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(contentSource, "contentSource");
        this.inPublishing = z;
        this.progress = i;
        this.publishStatus = publishStatus;
        this.creationId = creationId;
        this.contentSource = contentSource;
    }

    public /* synthetic */ PublishPreviewInfo(boolean z, int i, PublishStatus publishStatus, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? i : 0, (i2 & 4) != 0 ? PublishStatus.DEFAULT : publishStatus, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "");
    }
}
