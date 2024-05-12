package com.ss.android.ugc.aweme.commercialize.live.leadgen;

import X.C2U8;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BALeadsGenEvent implements IEvent {

    @InterfaceC65349Pkn("action_type")
    public final String actionType;

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

    public BALeadsGenEvent(String actionType) {
        o.LJIIIZ(actionType, "actionType");
        this.actionType = actionType;
    }
}
