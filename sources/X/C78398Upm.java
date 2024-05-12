package X;

import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;

/* renamed from: X.Upm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public /* synthetic */ class C78398Upm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PayType.values().length];
        LIZ = iArr;
        try {
            iArr[PayType.PRE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[PayType.EXTRA_QUERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[PayType.EXTRA_TOKEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[PayType.CAIJING_TOKEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[PayType.CAIJING_CALLBACK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
