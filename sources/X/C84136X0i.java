package X;

import com.ss.android.vesdk.VECameraSettings;

/* renamed from: X.X0i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C84136X0i {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VECameraSettings.CAMERA_FACING_ID.values().length];
        LIZ = iArr;
        try {
            iArr[VECameraSettings.CAMERA_FACING_ID.FACING_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_FRONT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_3RD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_REAR_WIDE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_REAR_TELE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
