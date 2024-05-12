package X;

import com.ss.android.ugc.tiktok.location_api.service.LocationLevel;

/* loaded from: classes10.dex */
public /* synthetic */ class LJ8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LocationLevel.values().length];
        try {
            iArr[LocationLevel.LEVEL_L0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LocationLevel.LEVEL_L1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LocationLevel.LEVEL_L2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
