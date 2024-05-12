package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum FirstFrameSendState {
    FIRST_FRAME_SEND_STATE_SENDING(0),
    FIRST_FRAME_SEND_STATE_SENT(1),
    FIRST_FRAME_SEND_STAT_END(2);

    public int state;

    public int value() {
        return this.state;
    }

    public static FirstFrameSendState fromId(int i) {
        for (FirstFrameSendState firstFrameSendState : values()) {
            if (firstFrameSendState.value() == i) {
                return firstFrameSendState;
            }
        }
        return FIRST_FRAME_SEND_STATE_SENDING;
    }

    public static FirstFrameSendState valueOf(String str) {
        return (FirstFrameSendState) V0N.LJJJ(FirstFrameSendState.class, str);
    }

    FirstFrameSendState(int i) {
        this.state = i;
    }
}
