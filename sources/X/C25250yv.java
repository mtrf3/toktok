package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.0yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public /* synthetic */ class C25250yv {
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
        LIZ = iArr;
    }
}
