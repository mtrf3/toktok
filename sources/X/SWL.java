package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* loaded from: classes13.dex */
public /* synthetic */ class SWL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DspPlatform.values().length];
        try {
            iArr[DspPlatform.APPLE_MUSIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DspPlatform.AMAZON_MUSIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DspPlatform.SPOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
