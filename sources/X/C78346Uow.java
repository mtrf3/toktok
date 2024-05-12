package X;

import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.service.provider.IapServiceProvider;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Uow, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78346Uow implements InterfaceC78382UpW {
    public final /* synthetic */ OrderData LIZ;
    public final /* synthetic */ C78295Uo7 LIZIZ;
    public final /* synthetic */ IapPaymentMethod LIZJ;
    public final /* synthetic */ InterfaceC78395Upj LIZLLL;
    public final /* synthetic */ IapServiceProvider LJ;

    @Override // X.InterfaceC78382UpW
    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        if (absResult != null && list != null && absResult.getCode() == 0 && !list.isEmpty()) {
            for (Object obj : list.toArray()) {
                AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
                if (TextUtils.equals(absIapChannelOrderData.getProductId(), this.LIZ.getProductId())) {
                    OrderData orderData = this.LIZ;
                    C78295Uo7 c78295Uo7 = this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PipoPayManger: executeNewPay failed because cur productId is unfinished :");
                    LIZ.append(orderData.getProductId());
                    LIZ.append(", then call back unFinish error");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C78273Unl.LJIIIZ().LJ().getClass();
                    OrderInfo buildOrderInfo = orderData.buildOrderInfo();
                    C78368UpI c78368UpI = new C78368UpI();
                    c78368UpI.LIZ = buildOrderInfo.getExtraPayload();
                    c78368UpI.LIZJ = PayType.NOMAL;
                    c78368UpI.withErrorCode(208);
                    c78368UpI.withMessage(LIZIZ);
                    c78295Uo7.LIZIZ(c78368UpI, null);
                    C78341Uor LIZIZ2 = C78342Uos.LIZLLL().LIZIZ();
                    JSONObject LIZ2 = LIZIZ2.LIZ(orderData);
                    LIZIZ2.LIZIZ(LIZ2, c78368UpI);
                    LIZIZ2.add(LIZ2, "cur_pay_state", "unknown");
                    C78273Unl.LJIIIZ().LIZIZ().onEventV3("pipo_pay_end", LIZ2);
                    ((C78392Upg) C78379UpT.LJ().LIZJ()).LJI(c78368UpI, this.LIZLLL, buildOrderInfo);
                    ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJJI(c78368UpI, buildOrderInfo);
                    this.LJ.executeUnUploadTokenOrder(this.LIZJ, absIapChannelOrderData);
                    return;
                }
            }
        }
        this.LJ.executeNewPayInternal(this.LIZ, this.LIZLLL);
    }

    public C78346Uow(IapServiceProvider iapServiceProvider, OrderData orderData, C78295Uo7 c78295Uo7, IapPaymentMethod iapPaymentMethod, InterfaceC78395Upj interfaceC78395Upj) {
        this.LJ = iapServiceProvider;
        this.LIZ = orderData;
        this.LIZIZ = c78295Uo7;
        this.LIZJ = iapPaymentMethod;
        this.LIZLLL = interfaceC78395Upj;
    }
}
