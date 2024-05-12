package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum RemoteAudioState {
    REMOTE_AUDIO_STATE_STOPPED(0),
    REMOTE_AUDIO_STATE_STARTING(1),
    REMOTE_AUDIO_STATE_DECODING(2),
    REMOTE_AUDIO_STATE_FROZEN(3),
    REMOTE_AUDIO_STATE_FAILED(4);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.RemoteAudioState$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState;

        static {
            int[] iArr = new int[RemoteAudioState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState = iArr;
            try {
                iArr[RemoteAudioState.REMOTE_AUDIO_STATE_STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_DECODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_FROZEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[RemoteAudioState.REMOTE_AUDIO_STATE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioState[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "kRemoteAudioStateFailed";
                    }
                    return "kRemoteAudioStateFrozen";
                }
                return "kRemoteAudioStateDecoding";
            }
            return "kRemoteAudioStateStarting";
        }
        return "kRemoteAudioStateStopped";
    }

    public int value() {
        return this.value;
    }

    public static RemoteAudioState fromId(int i) {
        for (RemoteAudioState remoteAudioState : values()) {
            if (remoteAudioState.value() == i) {
                return remoteAudioState;
            }
        }
        return null;
    }

    public static RemoteAudioState valueOf(String str) {
        return (RemoteAudioState) V0N.LJJJ(RemoteAudioState.class, str);
    }

    RemoteAudioState(int i) {
        this.value = i;
    }
}
