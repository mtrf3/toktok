package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;

/* renamed from: X.E4p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C35835E4p {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IPluginService.AutoExposureConfig.ExposureType.values().length];
        try {
            iArr[IPluginService.AutoExposureConfig.ExposureType.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IPluginService.AutoExposureConfig.ExposureType.FULL_AND_PRECISE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
