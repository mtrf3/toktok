package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MediaPlayerCustomSourceMode {
    PUSH(0),
    PULL(1);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceMode$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode = iArr;
            try {
                iArr[MediaPlayerCustomSourceMode.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode[MediaPlayerCustomSourceMode.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceMode[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "PULL";
        }
        return "PUSH";
    }

    public int value() {
        return this.value;
    }

    public static MediaPlayerCustomSourceMode fromId(int i) {
        for (MediaPlayerCustomSourceMode mediaPlayerCustomSourceMode : values()) {
            if (mediaPlayerCustomSourceMode.value() == i) {
                return mediaPlayerCustomSourceMode;
            }
        }
        return null;
    }

    public static MediaPlayerCustomSourceMode valueOf(String str) {
        return (MediaPlayerCustomSourceMode) V0N.LJJJ(MediaPlayerCustomSourceMode.class, str);
    }

    MediaPlayerCustomSourceMode(int i) {
        this.value = i;
    }
}
