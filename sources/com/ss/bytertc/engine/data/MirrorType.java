package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MirrorType {
    MIRROR_TYPE_NONE(0),
    MIRROR_TYPE_RENDER(1),
    MIRROR_TYPE_RENDER_AND_ENCODER(3);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == MIRROR_TYPE_NONE) {
            return "kMirrorTypeNone";
        }
        if (this == MIRROR_TYPE_RENDER) {
            return "kMirrorTypeRender";
        }
        if (this == MIRROR_TYPE_RENDER_AND_ENCODER) {
            return "kMirrorTypeRenderAndEncoder";
        }
        return "";
    }

    public int value() {
        return this.value;
    }

    public static MirrorType fromId(int i) {
        for (MirrorType mirrorType : values()) {
            if (mirrorType.value() == i) {
                return mirrorType;
            }
        }
        return null;
    }

    public static MirrorType valueOf(String str) {
        return (MirrorType) V0N.LJJJ(MirrorType.class, str);
    }

    MirrorType(int i) {
        this.value = i;
    }
}
