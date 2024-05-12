package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.TimerConfig;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;

/* loaded from: classes17.dex */
public final class UpdateTimerResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("timer_config")
        public TimerConfig timerConfig;

        @InterfaceC65349Pkn("timer_detail")
        public TimerDetail timerDetail;
    }
}
