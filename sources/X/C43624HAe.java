package X;

import com.ss.android.vesdk.VEMVAlgorithmConfig;

/* renamed from: X.HAe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C43624HAe {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.values().length];
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_IMAGE_AND_JSON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VEMVAlgorithmConfig.MV_REESULT_OUT_TYPE.MV_REESULT_OUT_TYPE_VIDEO_AND_JSON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
