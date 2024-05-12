package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.BGi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public /* synthetic */ class C28496BGi {
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
        LIZ = iArr;
    }
}
