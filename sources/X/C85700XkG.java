package X;

import com.ss.android.ugc.aweme.account.model.VerificationMethodType;

/* renamed from: X.XkG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public /* synthetic */ class C85700XkG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VerificationMethodType.values().length];
        LIZ = iArr;
        try {
            iArr[VerificationMethodType.MOBILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[VerificationMethodType.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[VerificationMethodType.PASSWORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
