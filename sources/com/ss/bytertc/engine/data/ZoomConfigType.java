package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum ZoomConfigType {
    ZOOM_FOCUS_OFFSET(0),
    ZOOM_MOVE_OFFSET(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static ZoomConfigType fromId(int i) {
        for (ZoomConfigType zoomConfigType : values()) {
            if (zoomConfigType.value() == i) {
                return zoomConfigType;
            }
        }
        return null;
    }

    public static ZoomConfigType valueOf(String str) {
        return (ZoomConfigType) V0N.LJJJ(ZoomConfigType.class, str);
    }

    ZoomConfigType(int i) {
        this.value = i;
    }
}
