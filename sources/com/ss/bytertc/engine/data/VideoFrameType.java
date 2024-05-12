package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoFrameType {
    RAW_MEMORY(0),
    GL_TEXTURE(2);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == RAW_MEMORY) {
            return "kVideoFrameTypeRawMemory";
        }
        return "kVideoFrameTypeGLTexture";
    }

    public int value() {
        return this.value;
    }

    public static VideoFrameType fromId(int i) {
        for (VideoFrameType videoFrameType : values()) {
            if (videoFrameType.value() == i) {
                return videoFrameType;
            }
        }
        return null;
    }

    public static VideoFrameType valueOf(String str) {
        return (VideoFrameType) V0N.LJJJ(VideoFrameType.class, str);
    }

    VideoFrameType(int i) {
        this.value = i;
    }
}
