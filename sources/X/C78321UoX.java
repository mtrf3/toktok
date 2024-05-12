package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UoX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78321UoX implements InterfaceC78387Upb {
    public final /* synthetic */ C77874UhK LIZ;
    public final /* synthetic */ OrderData LIZIZ;
    public final /* synthetic */ C78292Uo4 LIZJ;
    public final /* synthetic */ InterfaceC78326Uoc LIZLLL;
    public final /* synthetic */ C78299UoB LJ;

    @Override // X.InterfaceC78387Upb
    public final void LIZ(AbsResult absResult) {
        if (absResult == null) {
            absResult = new C78368UpI();
            absResult.withErrorCode(202);
            absResult.withDetailCode(2011);
            absResult.withMessage("network error but pipoResult is null");
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CreateOrderApiImpl: create order service response failed, message is: ");
            LIZ.append(absResult.getMessage());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
        } else {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CreateOrderApiImpl: create order service response failed, message is: ");
            LIZ2.append(absResult.getMessage());
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
            absResult.withErrorCode(202);
        }
        C78368UpI LIZ3 = C78368UpI.LIZ(absResult);
        this.LIZJ.LIZIZ(false, LIZ3);
        InterfaceC78326Uoc interfaceC78326Uoc = this.LIZLLL;
        if (interfaceC78326Uoc != null) {
            interfaceC78326Uoc.LIZ(LIZ3);
        }
    }

    @Override // X.InterfaceC78387Upb
    public final void onResponse(String str) {
        CreateOrderResponseEntity createOrderResponseEntity = new CreateOrderResponseEntity();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("BaseResp");
            createOrderResponseEntity.errorCode = optJSONObject.optInt("StatusCode", -1);
            createOrderResponseEntity.message = optJSONObject.optString("StatusMessage");
            if (createOrderResponseEntity.errorCode == 0) {
                String optString = jSONObject.optString("money_platform_url");
                String obj = jSONObject.opt("biz_content").toString();
                ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJIIIZ = optString;
                ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LJIIIIZZ = 1;
                C77874UhK c77874UhK = this.LIZ;
                c77874UhK.LJFF = obj;
                c77874UhK.LJIIIIZZ = optString;
                this.LIZIZ.parseInfoFromBizContent();
                this.LIZIZ.setHost(optString);
                this.LIZIZ.getIapPayMonitor().LIZJ = this.LIZIZ.getOrderId();
            }
        } catch (JSONException e) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CreateOrderApiImpl: create order response data is error:");
            LIZ.append(e.getLocalizedMessage());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            createOrderResponseEntity = null;
        }
        if (createOrderResponseEntity != null) {
            if (createOrderResponseEntity.isSuccess()) {
                this.LIZJ.LIZIZ(true, null);
                C78273Unl.LJIIIZ().LJ().getClass();
                InterfaceC78326Uoc interfaceC78326Uoc = this.LIZLLL;
                if (interfaceC78326Uoc != null && createOrderResponseEntity.errorCode == 0) {
                    interfaceC78326Uoc.onSuccess(createOrderResponseEntity);
                    return;
                }
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CreateOrderApiImpl: create order service response failed because : ");
            LIZ2.append(createOrderResponseEntity.message);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C78273Unl.LJIIIZ().LJ().getClass();
            C78368UpI c78368UpI = new C78368UpI(202, createOrderResponseEntity.errorCode, LIZIZ);
            this.LIZJ.LIZIZ(false, c78368UpI);
            InterfaceC78326Uoc interfaceC78326Uoc2 = this.LIZLLL;
            if (interfaceC78326Uoc2 == null) {
                return;
            }
            interfaceC78326Uoc2.LIZ(c78368UpI);
            return;
        }
        C78273Unl.LJIIIZ().LJ().getClass();
        C78368UpI c78368UpI2 = new C78368UpI(202, 2021, "CreateOrderApiImpl: create order service response failed, message is null");
        this.LIZJ.LIZIZ(false, c78368UpI2);
        InterfaceC78326Uoc interfaceC78326Uoc3 = this.LIZLLL;
        if (interfaceC78326Uoc3 == null) {
            return;
        }
        interfaceC78326Uoc3.LIZ(c78368UpI2);
    }

    public C78321UoX(C78299UoB c78299UoB, C77874UhK c77874UhK, OrderData orderData, C78292Uo4 c78292Uo4, InterfaceC78326Uoc interfaceC78326Uoc) {
        this.LJ = c78299UoB;
        this.LIZ = c77874UhK;
        this.LIZIZ = orderData;
        this.LIZJ = c78292Uo4;
        this.LIZLLL = interfaceC78326Uoc;
    }
}
