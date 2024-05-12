package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum PlayerState {
    IDLE(0),
    PRELOADED(1),
    OPENED(2),
    PLAYING(3),
    PAUSED(4),
    STOPPED(5),
    FAILED(6);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.PlayerState$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$PlayerState;

        static {
            int[] iArr = new int[PlayerState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$PlayerState = iArr;
            try {
                iArr[PlayerState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerState[PlayerState.PRELOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerState[PlayerState.OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerState[PlayerState.PLAYING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerState[PlayerState.PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerState[PlayerState.STOPPED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$PlayerState[PlayerState.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$PlayerState[ordinal()]) {
            case 1:
                return "IDLE";
            case 2:
                return "PRELOADED";
            case 3:
                return "OPENED";
            case 4:
                return "PLAYING";
            case 5:
                return "PAUSED";
            case 6:
                return "STOPPED";
            case 7:
                return "FAILED";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static PlayerState fromId(int i) {
        for (PlayerState playerState : values()) {
            if (playerState.value() == i) {
                return playerState;
            }
        }
        return null;
    }

    public static PlayerState valueOf(String str) {
        return (PlayerState) V0N.LJJJ(PlayerState.class, str);
    }

    PlayerState(int i) {
        this.value = i;
    }
}
