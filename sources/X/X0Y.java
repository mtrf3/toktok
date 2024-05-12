package X;

import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* loaded from: classes15.dex */
public /* synthetic */ class X0Y {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[VEVideoEncodeSettings.COMPILE_TYPE.values().length];
        LIZIZ = iArr;
        try {
            iArr[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_GIF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_TRANSPARENT_GIF.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[VEEditor.SCALE_MODE.values().length];
        LIZ = iArr2;
        try {
            iArr2[VEEditor.SCALE_MODE.SCALE_MODE_CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_CANVAS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_FIT_START_WITH_2DENGINE.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_FIT_END_WITH_2DENGINE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
