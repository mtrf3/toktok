package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;

/* loaded from: classes13.dex */
public /* synthetic */ class SAD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PayResult.values().length];
        try {
            iArr[PayResult.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayResult.REDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PayResult.NEED_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PayResult.IS_DEEPLINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PayResult.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PayResult.PENDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PayResult.NEED_VERIFY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        LIZ = iArr;
    }
}
