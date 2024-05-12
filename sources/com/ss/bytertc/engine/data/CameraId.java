package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum CameraId {
    CAMERA_ID_FRONT(0),
    CAMERA_ID_BACK(1),
    CAMERA_ID_EXTERNAL(2),
    CAMERA_ID_INVALID(3);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.CameraId$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$CameraId;

        static {
            int[] iArr = new int[CameraId.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$CameraId = iArr;
            try {
                iArr[CameraId.CAMERA_ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$CameraId[CameraId.CAMERA_ID_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$CameraId[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "kCameraIDBack";
        }
        return "kCameraIDFront";
    }

    public int value() {
        return this.value;
    }

    public static CameraId fromId(int i) {
        for (CameraId cameraId : values()) {
            if (cameraId.value() == i) {
                return cameraId;
            }
        }
        return null;
    }

    public static CameraId valueOf(String str) {
        return (CameraId) V0N.LJJJ(CameraId.class, str);
    }

    CameraId(int i) {
        this.value = i;
    }
}
