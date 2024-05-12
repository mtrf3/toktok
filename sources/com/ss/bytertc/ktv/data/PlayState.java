package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum PlayState {
    PLAYING(1),
    PAUSED(2),
    STOPPED(3),
    FAILED(4),
    FINISHED(5);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.PlayState$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$PlayState;

        static {
            int[] iArr = new int[PlayState.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$PlayState = iArr;
            try {
                iArr[PlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$PlayState[PlayState.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$PlayState[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "PLAY_STATE_FINISHED";
                    }
                    return "PLAY_STATE_FAILED";
                }
                return "PLAY_STATE_STOPPED";
            }
            return "PLAY_STATE_PAUSED";
        }
        return "PLAY_STATE_PLAYING";
    }

    public int value() {
        return this.value;
    }

    public static PlayState fromId(int i) {
        for (PlayState playState : values()) {
            if (playState.value() == i) {
                return playState;
            }
        }
        return null;
    }

    public static PlayState valueOf(String str) {
        return (PlayState) V0N.LJJJ(PlayState.class, str);
    }

    PlayState(int i) {
        this.value = i;
    }
}
