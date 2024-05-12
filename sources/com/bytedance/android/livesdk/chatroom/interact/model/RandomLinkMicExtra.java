package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class RandomLinkMicExtra extends F9E {

    @InterfaceC65349Pkn("bubble_text_connecting")
    public String bubbleTextConnecting;

    @InterfaceC65349Pkn("bubble_text_first_round")
    public String bubbleTextFirstRound;

    @InterfaceC65349Pkn("bubble_text_second_round")
    public String bubbleTextSecondRound;

    @InterfaceC65349Pkn("except_match_time")
    public int expectMatchTime;

    @InterfaceC65349Pkn("round_time")
    public int roundTime;

    @InterfaceC65349Pkn("timeout_time")
    public int timeoutTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.expectMatchTime), Integer.valueOf(this.timeoutTime), Integer.valueOf(this.roundTime), this.bubbleTextFirstRound, this.bubbleTextSecondRound, this.bubbleTextConnecting};
    }
}
