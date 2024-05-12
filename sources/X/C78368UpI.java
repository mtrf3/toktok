package X;

import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;

/* renamed from: X.UpI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78368UpI extends AbsResult {
    public String LIZ;
    public C77874UhK LIZIZ;
    public PayType LIZJ;

    public C78368UpI() {
        this(-1, -1, "");
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsResult
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IapResult{mCode=");
        LIZ.append(this.mCode);
        LIZ.append(", mDetailCode=");
        LIZ.append(this.mDetailCode);
        LIZ.append(", mMessage='");
        Q89.LIZIZ(LIZ, this.mMessage, '\'', ", mPayload='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", mIapPayRequest=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", payType=");
        LIZ.append(this.LIZJ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public static C78368UpI LIZ(AbsResult absResult) {
        if (absResult instanceof C78368UpI) {
            return (C78368UpI) absResult;
        }
        return new C78368UpI(absResult.getCode(), absResult.getDetailCode(), absResult.getMessage());
    }

    public C78368UpI(int i, int i2, String str) {
        this.LIZJ = PayType.UNKNOWN;
        this.mCode = i;
        this.mDetailCode = i2;
        this.mMessage = str;
    }
}
