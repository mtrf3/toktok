package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum ZoomDirectionType {
    CAMERA_MOVE_LEFT(0),
    CAMERA_MOVE_RIGHT(1),
    CAMERA_MOVE_UP(2),
    CAMERA_MOVE_DOWN(3),
    CAMERA_ZOOM_OUT(4),
    CAMERA_ZOOM_IN(5),
    CAMERA_RESET(6);

    public int value;

    public int value() {
        return this.value;
    }

    public static ZoomDirectionType fromId(int i) {
        for (ZoomDirectionType zoomDirectionType : values()) {
            if (zoomDirectionType.value() == i) {
                return zoomDirectionType;
            }
        }
        return null;
    }

    public static ZoomDirectionType valueOf(String str) {
        return (ZoomDirectionType) V0N.LJJJ(ZoomDirectionType.class, str);
    }

    ZoomDirectionType(int i) {
        this.value = i;
    }
}
