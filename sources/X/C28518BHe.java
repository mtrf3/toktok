package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.BHe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public /* synthetic */ class C28518BHe {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LiveMode.values().length];
        try {
            iArr[LiveMode.THIRD_PARTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LiveMode.SCREEN_RECORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LiveMode.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
