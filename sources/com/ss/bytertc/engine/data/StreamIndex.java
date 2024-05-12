package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum StreamIndex {
    STREAM_INDEX_MAIN(0),
    STREAM_INDEX_SCREEN(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == STREAM_INDEX_MAIN) {
            return "kStreamIndexMain";
        }
        return "kStreamIndexScreen";
    }

    public int value() {
        return this.value;
    }

    public static StreamIndex fromId(int i) {
        for (StreamIndex streamIndex : values()) {
            if (streamIndex.value() == i) {
                return streamIndex;
            }
        }
        return null;
    }

    public static StreamIndex valueOf(String str) {
        return (StreamIndex) V0N.LJJJ(StreamIndex.class, str);
    }

    StreamIndex(int i) {
        this.value = i;
    }
}
