package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MediaPlayerCustomSourceStreamType {
    RAW(0),
    ENCODED(1);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceStreamType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceStreamType.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType = iArr;
            try {
                iArr[MediaPlayerCustomSourceStreamType.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType[MediaPlayerCustomSourceStreamType.ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceStreamType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "ENCODED";
        }
        return "RAW";
    }

    public int value() {
        return this.value;
    }

    public static MediaPlayerCustomSourceStreamType fromId(int i) {
        for (MediaPlayerCustomSourceStreamType mediaPlayerCustomSourceStreamType : values()) {
            if (mediaPlayerCustomSourceStreamType.value() == i) {
                return mediaPlayerCustomSourceStreamType;
            }
        }
        return null;
    }

    public static MediaPlayerCustomSourceStreamType valueOf(String str) {
        return (MediaPlayerCustomSourceStreamType) V0N.LJJJ(MediaPlayerCustomSourceStreamType.class, str);
    }

    MediaPlayerCustomSourceStreamType(int i) {
        this.value = i;
    }
}
