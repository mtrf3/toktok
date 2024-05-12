package com.bytedance.realx.video;

import X.V0N;

/* loaded from: classes33.dex */
public enum RXVideoMemoryType {
    kBYTE_MEMORY(0),
    kOPENGL_TEXTURE(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static RXVideoMemoryType fromId(int i) {
        for (RXVideoMemoryType rXVideoMemoryType : values()) {
            if (rXVideoMemoryType.value() == i) {
                return rXVideoMemoryType;
            }
        }
        return null;
    }

    public static RXVideoMemoryType valueOf(String str) {
        return (RXVideoMemoryType) V0N.LJJJ(RXVideoMemoryType.class, str);
    }

    RXVideoMemoryType(int i) {
        this.value = i;
    }
}
