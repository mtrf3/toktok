package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import defpackage.i0;
import org.json.JSONObject;

/* renamed from: X.UoY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78322UoY implements InterfaceC78387Upb {
    public final /* synthetic */ C78292Uo4 LIZ;
    public final /* synthetic */ InterfaceC78326Uoc LIZIZ;
    public final /* synthetic */ C78299UoB LIZJ;

    @Override // X.InterfaceC78387Upb
    public final void LIZ(AbsResult absResult) {
        if (absResult == null) {
            absResult = new C78368UpI();
            absResult.withErrorCode(205);
            absResult.withMessage("network error but pipoResult is null");
        } else {
            absResult.withErrorCode(205);
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
        try {
            ResponseEntity responseEntity = (ResponseEntity) C67057QTl.LIZ(ResponseEntity.class, str);
            if (responseEntity != null) {
                if (responseEntity.isSuccess()) {
                    C78273Unl.LJIIIZ().LJ().getClass();
                    this.LIZ.LIZIZ(true, null);
                    if (this.LIZIZ != null) {
                        JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
                        if (optJSONObject != null) {
                            responseEntity.setOrderId(optJSONObject.optString("orderId"));
                        }
                        this.LIZIZ.onSuccess(responseEntity);
                        return;
                    }
                    return;
                }
                str2 = responseEntity.message;
            } else {
                str2 = "";
            }
            String LJFF = i0.LJFF("UploadTokenApiImpl: upload token service response failed, message is: ", str2);
            C78273Unl.LJIIIZ().LJ().getClass();
            C78368UpI c78368UpI = new C78368UpI(205, 2021, LJFF);
            this.LIZ.LIZIZ(false, c78368UpI);
            InterfaceC78326Uoc interfaceC78326Uoc = this.LIZIZ;
            if (interfaceC78326Uoc != null) {
                interfaceC78326Uoc.LIZ(c78368UpI);
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UploadTokenApiImpl: upload token service response failed, message is: ");
            LIZ.append(th.getLocalizedMessage());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C78273Unl.LJIIIZ().LJ().getClass();
            C78368UpI c78368UpI2 = new C78368UpI(205, 2021, LIZIZ);
            this.LIZ.LIZIZ(false, c78368UpI2);
            InterfaceC78326Uoc interfaceC78326Uoc2 = this.LIZIZ;
            if (interfaceC78326Uoc2 != null) {
                interfaceC78326Uoc2.LIZ(c78368UpI2);
            }
        }
    }

    public C78322UoY(C78299UoB c78299UoB, C78292Uo4 c78292Uo4, C78358Up8 c78358Up8) {
        this.LIZJ = c78299UoB;
        this.LIZ = c78292Uo4;
        this.LIZIZ = c78358Up8;
    }
}
