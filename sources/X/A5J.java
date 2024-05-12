package X;

import com.ss.android.ugc.aweme.model.PaidContentCreatorStatus;

/* loaded from: classes5.dex */
public /* synthetic */ class A5J {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PaidContentCreatorStatus.values().length];
        try {
            iArr[PaidContentCreatorStatus.ELIGIBLE_WITH_NO_PUBLISHED_SERIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaidContentCreatorStatus.ELIGIBLE_WITH_PUBLISHED_SERIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaidContentCreatorStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaidContentCreatorStatus.NOT_ELIGIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
