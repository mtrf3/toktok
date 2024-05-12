package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aZE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final /* synthetic */ class C93956aZE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DspPlatform.values().length];
        try {
            iArr[DspPlatform.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DspPlatform.APPLE_MUSIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DspPlatform.AMAZON_MUSIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DspPlatform.SPOTIFY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
