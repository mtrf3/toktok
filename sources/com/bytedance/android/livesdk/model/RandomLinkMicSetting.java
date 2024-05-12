package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class RandomLinkMicSetting {

    @InterfaceC65349Pkn("quickly_disconnected_time")
    public int disconnectTime = 10;

    @InterfaceC65349Pkn("quickly_disconnected_judge")
    public DisconnectJudge disconnectJudge = new DisconnectJudge();

    @InterfaceC65349Pkn("quickly_disconnected_ban_time")
    public int banTime = 30;

    @InterfaceC65349Pkn("random_linkmic_bubble_strategy")
    public int bubbleStrategy = 2;

    /* loaded from: classes6.dex */
    public static class DisconnectJudge {

        @InterfaceC65349Pkn("period")
        public int period = 10;

        @InterfaceC65349Pkn("frequency")
        public int frequency = 10;
    }
}
