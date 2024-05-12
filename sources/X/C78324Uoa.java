package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.SubscriptionOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import defpackage.i0;

/* renamed from: X.Uoa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78324Uoa implements InterfaceC78387Upb {
    public final /* synthetic */ C78292Uo4 LIZ;
    public final /* synthetic */ InterfaceC78326Uoc LIZIZ;
    public final /* synthetic */ C78299UoB LIZJ;

    @Override // X.InterfaceC78387Upb
    public final void LIZ(AbsResult absResult) {
        if (absResult == null) {
            absResult = new C78368UpI();
            absResult.withErrorCode(-1);
            absResult.withMessage("network error but pipoResult is null");
        } else {
            absResult.withErrorCode(-1);
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
        String LIZIZ;
        SubscriptionOrderStateResponseEntity fromJson = SubscriptionOrderStateResponseEntity.fromJson(str);
        String str2 = "";
        if (fromJson != null) {
            if (fromJson.isSuccess()) {
                this.LIZ.LIZIZ(true, null);
                if (fromJson.data == null) {
                    LIZIZ = "null";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(fromJson.data.subsInfo.status);
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("OrderStateApiImpl: query order state service response success. order state: ");
                LIZ2.append(LIZIZ);
                X1D.LIZIZ(LIZ2);
                C78273Unl.LJIIIZ().LJ().getClass();
                InterfaceC78326Uoc interfaceC78326Uoc = this.LIZIZ;
                if (interfaceC78326Uoc != null) {
                    interfaceC78326Uoc.onSuccess(fromJson);
                    return;
                }
                return;
            }
            str2 = fromJson.message;
        }
        String LJFF = i0.LJFF("OrderStateApiImpl: query order state response failed, message is: ", str2);
        C78273Unl.LJIIIZ().LJ().getClass();
        C78368UpI c78368UpI = new C78368UpI(204, 2021, LJFF);
        this.LIZ.LIZIZ(false, c78368UpI);
        InterfaceC78326Uoc interfaceC78326Uoc2 = this.LIZIZ;
        if (interfaceC78326Uoc2 == null) {
            return;
        }
        interfaceC78326Uoc2.LIZ(c78368UpI);
    }

    public C78324Uoa(C78299UoB c78299UoB, C78292Uo4 c78292Uo4, C78329Uof c78329Uof) {
        this.LIZJ = c78299UoB;
        this.LIZ = c78292Uo4;
        this.LIZIZ = c78329Uof;
    }
}
