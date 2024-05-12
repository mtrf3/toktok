package com.ss.avframework.livestreamv2.core.interact.livertc;

import X.V0N;

/* loaded from: classes12.dex */
public class RTCChannelState {
    public ChannelState mChannelState = ChannelState.CHANNEL_STATE_NONE;

    public synchronized ChannelState getChannelState() {
        return this.mChannelState;
    }

    public synchronized void reset() {
        this.mChannelState = ChannelState.CHANNEL_STATE_NONE;
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.interact.livertc.RTCChannelState$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$avframework$livestreamv2$core$interact$livertc$RTCChannelState$ChannelState;

        static {
            int[] iArr = new int[ChannelState.values().length];
            $SwitchMap$com$ss$avframework$livestreamv2$core$interact$livertc$RTCChannelState$ChannelState = iArr;
            try {
                iArr[ChannelState.CHANNEL_STATE_JOIN_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$livertc$RTCChannelState$ChannelState[ChannelState.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$livertc$RTCChannelState$ChannelState[ChannelState.CHANNEL_STATE_LEAVE_CHANNEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$avframework$livestreamv2$core$interact$livertc$RTCChannelState$ChannelState[ChannelState.CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void joinChannel() {
        updateChannelState(ChannelState.CHANNEL_STATE_JOIN_CHANNEL);
    }

    public void joinChannelSuccess() {
        updateChannelState(ChannelState.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS);
    }

    public void leaveChannel() {
        updateChannelState(ChannelState.CHANNEL_STATE_LEAVE_CHANNEL);
    }

    public void leaveChannelSuccess() {
        updateChannelState(ChannelState.CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS);
    }

    /* loaded from: classes12.dex */
    public enum ChannelState {
        CHANNEL_STATE_NONE,
        CHANNEL_STATE_JOIN_CHANNEL,
        CHANNEL_STATE_JOIN_CHANNEL_SUCCESS,
        CHANNEL_STATE_LEAVE_CHANNEL,
        CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS;

        public static ChannelState valueOf(String str) {
            return (ChannelState) V0N.LJJJ(ChannelState.class, str);
        }
    }

    private synchronized void updateChannelState(ChannelState channelState) {
        ChannelState channelState2;
        int i = AnonymousClass1.$SwitchMap$com$ss$avframework$livestreamv2$core$interact$livertc$RTCChannelState$ChannelState[channelState.ordinal()];
        if (i == 1) {
            ChannelState channelState3 = this.mChannelState;
            if (channelState3 == ChannelState.CHANNEL_STATE_NONE || channelState3 == ChannelState.CHANNEL_STATE_LEAVE_CHANNEL || channelState3 == ChannelState.CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS) {
                this.mChannelState = channelState;
            }
        } else if (i != 2) {
            if ((i == 3 || i == 4) && ((channelState2 = this.mChannelState) == ChannelState.CHANNEL_STATE_JOIN_CHANNEL || channelState2 == ChannelState.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS)) {
                this.mChannelState = channelState;
            }
        } else if (this.mChannelState == ChannelState.CHANNEL_STATE_JOIN_CHANNEL) {
            this.mChannelState = channelState;
        }
    }
}
