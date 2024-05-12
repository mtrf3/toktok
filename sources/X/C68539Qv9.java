package X;

import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;

/* renamed from: X.Qv9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C68539Qv9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[LoginMethodName.values().length];
        try {
            iArr[LoginMethodName.EMAIL_PASS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoginMethodName.USER_NAME_PASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoginMethodName.PHONE_SMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LoginMethodName.PHONE_NUMBER_PASS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LoginMethodName.THIRD_PARTY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
