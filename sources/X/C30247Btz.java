package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.Btz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public /* synthetic */ class C30247Btz {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[LiveMode.values().length];
        try {
            iArr[LiveMode.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LiveMode.THIRD_PARTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LiveMode.SCREEN_RECORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LiveMode.LIVE_VOICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LiveMode.LIVE_STUDIO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC30254Bu6.values().length];
        try {
            iArr2[EnumC30254Bu6.PORTRAIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC30254Bu6.LANDSCAPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC30250Bu2.values().length];
        try {
            iArr3[EnumC30250Bu2.ANCHOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[EnumC30250Bu2.AUDIENCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        LIZJ = iArr3;
    }
}
