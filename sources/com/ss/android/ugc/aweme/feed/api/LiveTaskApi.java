package com.ss.android.ugc.aweme.feed.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;

/* loaded from: classes9.dex */
public final class LiveTaskApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes9.dex */
    public interface RealApi {
        @InterfaceC195757mF
        @E4T("/webcast/live_center/task/event_report/")
        AbstractC73672Svk<TaskFinishResponse> finishTask(@InterfaceC64985Pev("video_id") String str, @InterfaceC64985Pev("event_type") int i);
    }
}
