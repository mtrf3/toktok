package com.ss.android.ugc.aweme.friends.model;

import X.C2U8;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BackFromSettingEvent implements IEvent {
    public final String enterFrom;

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

    public BackFromSettingEvent(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.enterFrom = enterFrom;
    }
}
