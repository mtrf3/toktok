package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;

/* loaded from: classes13.dex */
public /* synthetic */ class SAC {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[CommuteType.values().length];
        try {
            iArr[CommuteType.APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CommuteType.WAP_TO_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[PayResult.values().length];
        try {
            iArr2[PayResult.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PayResult.REDIRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PayResult.NEED_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PayResult.NEED_VERIFY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PayResult.PENDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PayResult.ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        LIZIZ = iArr2;
    }
}
