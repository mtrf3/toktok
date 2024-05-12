package X;

import com.ss.android.ugc.aweme.model.VoucherUseStatus;

/* loaded from: classes5.dex */
public /* synthetic */ class A3S {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VoucherUseStatus.values().length];
        try {
            iArr[VoucherUseStatus.NO_VOUCHER_USED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VoucherUseStatus.VOUCHER_UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VoucherUseStatus.VOUCHER_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
