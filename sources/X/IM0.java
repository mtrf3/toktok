package X;

import com.ss.android.ugc.aweme.setting.creatorverification.CreatorVerificationStatus;

/* loaded from: classes9.dex */
public /* synthetic */ class IM0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CreatorVerificationStatus.values().length];
        try {
            iArr[CreatorVerificationStatus.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CreatorVerificationStatus.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
