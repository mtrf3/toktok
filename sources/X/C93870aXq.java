package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aXq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public /* synthetic */ class C93870aXq {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C9A8.values().length];
        try {
            iArr[C9A8.ENTER_FROM_SELECT_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C9A8.ENTER_FROM_LINKED_PLATFORM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C9A8.ENTER_FROM_SETTINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[DspPlatform.values().length];
        try {
            iArr2[DspPlatform.APPLE_MUSIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DspPlatform.AMAZON_MUSIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DspPlatform.SPOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DspPlatform.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
    }
}
