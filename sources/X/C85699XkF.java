package X;

import com.ss.android.ugc.aweme.account.model.VerificationMethodType;

/* renamed from: X.XkF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public /* synthetic */ class C85699XkF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VerificationMethodType.values().length];
        try {
            iArr[VerificationMethodType.MOBILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerificationMethodType.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VerificationMethodType.PASSWORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
