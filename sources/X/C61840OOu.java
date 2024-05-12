package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;

/* renamed from: X.OOu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public /* synthetic */ class C61840OOu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CommuteType.values().length];
        try {
            iArr[CommuteType.APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CommuteType.WAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CommuteType.SDK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CommuteType.SECRET_FREE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CommuteType.WAP_TO_APP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CommuteType.WAP_FILTER_APP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CommuteType.SECRET_FREE_APP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CommuteType.WAP_BOLETO_PIX.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        LIZ = iArr;
    }
}
