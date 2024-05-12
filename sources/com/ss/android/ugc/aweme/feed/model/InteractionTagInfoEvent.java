package com.ss.android.ugc.aweme.feed.model;

import X.C2U8;
import X.F9E;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionTagInfoEvent extends F9E implements IEvent {
    public final Aweme aweme;

    public static /* synthetic */ InteractionTagInfoEvent copy$default(InteractionTagInfoEvent interactionTagInfoEvent, Aweme aweme, int i, Object obj) {
        if ((i & 1) != 0) {
            aweme = interactionTagInfoEvent.aweme;
        }
        return interactionTagInfoEvent.copy(aweme);
    }

    public final InteractionTagInfoEvent copy(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return new InteractionTagInfoEvent(aweme);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.aweme};
    }

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

    public InteractionTagInfoEvent(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.aweme = aweme;
    }
}
