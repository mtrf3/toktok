package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.BzS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public /* synthetic */ class C30586BzS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LiveMode.values().length];
        try {
            iArr[LiveMode.SCREEN_RECORD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LiveMode.THIRD_PARTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LiveMode.LIVE_STUDIO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LiveMode.LIVE_VOICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LiveMode.VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}