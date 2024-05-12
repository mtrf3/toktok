package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AVSyncState {
    AV_SYNC_STATE_STREAM_SYNC_BEGIN(0),
    AV_SYNC_STATE_AUDIO_STREAM_REMOVE(1),
    AV_SYNC_STATE_VIDEO_STREAM_REMOVE(2),
    AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID(3);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AVSyncState$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AVSyncState;

        static {
            int[] iArr = new int[AVSyncState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AVSyncState = iArr;
            try {
                iArr[AVSyncState.AV_SYNC_STATE_STREAM_SYNC_BEGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_AUDIO_STREAM_REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_VIDEO_STREAM_REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AVSyncState[AVSyncState.AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AVSyncState[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "AV_SYNC_STATE_SET_AV_SYNC_STRESM_ID";
                }
                return "AV_SYNC_STATE_VIDEO_STREAM_REMOVE";
            }
            return "AV_SYNC_STATE_AUDIO_STREAM_REMOVE";
        }
        return "AV_SYNC_STATE_STREAM_SYNC_BEGIN";
    }

    public int value() {
        return this.value;
    }

    public static AVSyncState fromId(int i) {
        for (AVSyncState aVSyncState : values()) {
            if (aVSyncState.value() == i) {
                return aVSyncState;
            }
        }
        return null;
    }

    public static AVSyncState valueOf(String str) {
        return (AVSyncState) V0N.LJJJ(AVSyncState.class, str);
    }

    AVSyncState(int i) {
        this.value = i;
    }
}
