package X;

import com.ss.android.ugc.aweme.feed.model.InsightsEligibilityStatus;

/* renamed from: X.Loc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public /* synthetic */ class C55394Loc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InsightsEligibilityStatus.values().length];
        try {
            iArr[InsightsEligibilityStatus.NOT_AVAILABLE_NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InsightsEligibilityStatus.NOT_AVAILABLE_TTL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
