package com.ss.android.ugc.aweme.services.dm;

import X.C2U8;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMAlbumMediaPublishEvent implements IEvent {
    public final List<MediaModel> mediaModelList;
    public final String sessionId;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final List<MediaModel> getMediaModelList() {
        return this.mediaModelList;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMAlbumMediaPublishEvent(String sessionId, List<? extends MediaModel> mediaModelList) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        this.sessionId = sessionId;
        this.mediaModelList = mediaModelList;
    }
}
