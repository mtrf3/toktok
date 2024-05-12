package X;

import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;

/* loaded from: classes8.dex */
public /* synthetic */ class HCY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TabType.values().length];
        try {
            iArr[TabType.PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TabType.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
