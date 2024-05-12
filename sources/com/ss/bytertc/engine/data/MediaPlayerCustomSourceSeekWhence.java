package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MediaPlayerCustomSourceSeekWhence {
    Set(0),
    Cur(1),
    End(2),
    Size(3);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceSeekWhence;

        static {
            int[] iArr = new int[MediaPlayerCustomSourceSeekWhence.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceSeekWhence = iArr;
            try {
                iArr[MediaPlayerCustomSourceSeekWhence.Set.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceSeekWhence[MediaPlayerCustomSourceSeekWhence.Cur.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceSeekWhence[MediaPlayerCustomSourceSeekWhence.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceSeekWhence[MediaPlayerCustomSourceSeekWhence.Size.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$MediaPlayerCustomSourceSeekWhence[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "SIZE";
                }
                return "END";
            }
            return "CUR";
        }
        return "SET";
    }

    public int value() {
        return this.value;
    }

    public static MediaPlayerCustomSourceSeekWhence fromId(int i) {
        for (MediaPlayerCustomSourceSeekWhence mediaPlayerCustomSourceSeekWhence : values()) {
            if (mediaPlayerCustomSourceSeekWhence.value() == i) {
                return mediaPlayerCustomSourceSeekWhence;
            }
        }
        return null;
    }

    public static MediaPlayerCustomSourceSeekWhence valueOf(String str) {
        return (MediaPlayerCustomSourceSeekWhence) V0N.LJJJ(MediaPlayerCustomSourceSeekWhence.class, str);
    }

    MediaPlayerCustomSourceSeekWhence(int i) {
        this.value = i;
    }
}
