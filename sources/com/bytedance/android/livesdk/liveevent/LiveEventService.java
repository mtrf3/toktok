package com.bytedance.android.livesdk.liveevent;

import com.bytedance.android.live.liveevent.ILiveEventService;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public class LiveEventService implements ILiveEventService {
    @Override // com.bytedance.android.live.liveevent.ILiveEventService
    public final Class<? extends LiveRecyclableWidget> Uh() {
        return LiveEventDescCardWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }
}
