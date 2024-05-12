package X;

import com.ss.android.ugc.aweme.commercialize.advideo.InvitationStatus;

/* renamed from: X.GtM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C42948GtM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InvitationStatus.values().length];
        try {
            iArr[InvitationStatus.INVITATION_STATUS_ACCEPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InvitationStatus.INVITATION_STATUS_DENY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InvitationStatus.INVITATION_STATUS_PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
