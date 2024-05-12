package X;

import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;

/* renamed from: X.Uoq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public /* synthetic */ class C78340Uoq {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[OrderStateEnum.values().length];
        LIZ = iArr;
        try {
            iArr[OrderStateEnum.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[OrderStateEnum.Cancelled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[OrderStateEnum.Expired.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[OrderStateEnum.Abandoned.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[OrderStateEnum.SusPended.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[OrderStateEnum.Preorder.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[OrderStateEnum.Pending.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[OrderStateEnum.Success.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZ[OrderStateEnum.Failed.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            LIZ[OrderStateEnum.Closed.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            LIZ[OrderStateEnum.Init.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            LIZ[OrderStateEnum.Processing.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
