package com.bytedance.android.live.broadcast.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195727mC;
import tikcast.api.eco.EventRequest;
import tikcast.api.eco.EventResponse;

/* loaded from: classes.dex */
public interface LiveEcoEventApi {
    @E8M("/webcast/eco/event/")
    AbstractC73672Svk<EventResponse> uploadEcoEvent(@InterfaceC195727mC EventRequest eventRequest);
}
