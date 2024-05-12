package X;

import com.ss.android.medialib.util.VEPlatformUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* loaded from: classes12.dex */
public /* synthetic */ class P78 {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[VEPlatformUtils.VEPlatform.values().length];
        LIZIZ = iArr;
        try {
            iArr[VEPlatformUtils.VEPlatform.PLATFORM_QCOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[VEPlatformUtils.VEPlatform.PLATFORM_MTK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[VEPlatformUtils.VEPlatform.PLATFORM_HISI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZIZ[VEPlatformUtils.VEPlatform.PLATFORM_EXYNOS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values().length];
        LIZ = iArr2;
        try {
            iArr2[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
