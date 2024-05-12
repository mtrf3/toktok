package X;

import com.ss.android.ugc.aweme.feed.model.InsightsEligibilityStatus;

/* renamed from: X.Lob, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public /* synthetic */ class C55393Lob {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InsightsEligibilityStatus.values().length];
        LIZ = iArr;
        try {
            iArr[InsightsEligibilityStatus.NOT_AVAILABLE_NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[InsightsEligibilityStatus.NOT_AVAILABLE_TTL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
