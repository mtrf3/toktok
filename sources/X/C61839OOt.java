package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;

/* renamed from: X.OOt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public /* synthetic */ class C61839OOt {
    public static final /* synthetic */ int[] LIZ;

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
        try {
            iArr[CommuteType.WAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CommuteType.WAP_FILTER_APP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CommuteType.WAP_BOLETO_PIX.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
