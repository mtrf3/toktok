package com.ss.android.ugc.aweme.services.dm;

import X.C2U8;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMRecordMediaPublishEvent implements IEvent {
    public final BaseShortVideoContext editModel;
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

    public final BaseShortVideoContext getEditModel() {
        return this.editModel;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public DMRecordMediaPublishEvent(String sessionId, BaseShortVideoContext editModel) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(editModel, "editModel");
        this.sessionId = sessionId;
        this.editModel = editModel;
    }
}
