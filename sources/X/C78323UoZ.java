package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OneTimeOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import defpackage.i0;

/* renamed from: X.UoZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78323UoZ implements InterfaceC78387Upb {
    public final /* synthetic */ C78292Uo4 LIZ;
    public final /* synthetic */ InterfaceC78326Uoc LIZIZ;
    public final /* synthetic */ C78299UoB LIZJ;

    @Override // X.InterfaceC78387Upb
    public final void LIZ(AbsResult absResult) {
        if (absResult == null) {
            absResult = new C78368UpI();
            absResult.withErrorCode(204);
            absResult.withMessage("network error but pipoResult is null");
        } else {
            absResult.withErrorCode(204);
        }
        C78368UpI LIZ = C78368UpI.LIZ(absResult);
        this.LIZ.LIZIZ(false, LIZ);
        InterfaceC78326Uoc interfaceC78326Uoc = this.LIZIZ;
        if (interfaceC78326Uoc != null) {
            interfaceC78326Uoc.LIZ(LIZ);
        }
    }

    @Override // X.InterfaceC78387Upb
    public final void onResponse(String str) {
        String str2;
        String str3;
        try {
            OneTimeOrderStateResponseEntity oneTimeOrderStateResponseEntity = (OneTimeOrderStateResponseEntity) C67057QTl.LIZ(OneTimeOrderStateResponseEntity.class, str);
            if (oneTimeOrderStateResponseEntity != null) {
                if (oneTimeOrderStateResponseEntity.isSuccess()) {
                    this.LIZ.LIZIZ(true, null);
                    OneTimeOrderStateResponseEntity.Data data = oneTimeOrderStateResponseEntity.data;
                    if (data == null) {
                        str3 = "null";
                    } else {
                        str3 = data.status;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("OrderStateApiImpl: query order state service response success. order state:");
                    LIZ.append(str3);
                    X1D.LIZIZ(LIZ);
                    C78273Unl.LJIIIZ().LJ().getClass();
                    InterfaceC78326Uoc interfaceC78326Uoc = this.LIZIZ;
                    if (interfaceC78326Uoc != null) {
                        interfaceC78326Uoc.onSuccess(oneTimeOrderStateResponseEntity);
                        return;
                    }
                    return;
                }
                str2 = oneTimeOrderStateResponseEntity.message;
            } else {
                str2 = "";
            }
            String LJFF = i0.LJFF("OrderStateApiImpl: query order state service response failed:", str2);
            C78273Unl.LJIIIZ().LJ().getClass();
            C78368UpI c78368UpI = new C78368UpI(204, 2021, LJFF);
            this.LIZ.LIZIZ(false, c78368UpI);
            InterfaceC78326Uoc interfaceC78326Uoc2 = this.LIZIZ;
            if (interfaceC78326Uoc2 != null) {
                interfaceC78326Uoc2.LIZ(c78368UpI);
            }
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("OrderStateApiImpl: query order state service response failed:");
            LIZ2.append(th.getLocalizedMessage());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C78273Unl.LJIIIZ().LJ().getClass();
            C78368UpI c78368UpI2 = new C78368UpI(204, 2021, LIZIZ);
            this.LIZ.LIZIZ(false, c78368UpI2);
            InterfaceC78326Uoc interfaceC78326Uoc3 = this.LIZIZ;
            if (interfaceC78326Uoc3 != null) {
                interfaceC78326Uoc3.LIZ(c78368UpI2);
            }
        }
    }

    public C78323UoZ(C78299UoB c78299UoB, C78292Uo4 c78292Uo4, C78329Uof c78329Uof) {
        this.LIZJ = c78299UoB;
        this.LIZ = c78292Uo4;
        this.LIZIZ = c78329Uof;
    }
}
