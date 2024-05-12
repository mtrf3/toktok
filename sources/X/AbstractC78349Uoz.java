package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import org.json.JSONObject;

/* renamed from: X.Uoz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78349Uoz {
    public OrderData LIZ;
    public final InterfaceC78388Upc LIZIZ;
    public InterfaceC78395Upj LIZJ;

    public abstract EnumC78373UpN LIZJ();

    public AbstractC78349Uoz(InterfaceC78388Upc interfaceC78388Upc) {
        C16880lQ.LJLLJ(AbstractC78349Uoz.class);
        this.LIZIZ = interfaceC78388Upc;
    }

    public void LIZ(OrderData orderData) {
        this.LIZ = orderData;
    }

    public final void LIZIZ(C78368UpI c78368UpI) {
        String str;
        this.LIZ.finish();
        if (c78368UpI.LIZJ == PayType.UNKNOWN) {
            c78368UpI.LIZJ = this.LIZ.getPayType();
        }
        this.LIZ.getIapPayMonitor().LIZIZ(c78368UpI, LIZJ());
        C78379UpT LJ = C78379UpT.LJ();
        if (C78379UpT.LJ == null) {
            synchronized (LJ) {
                if (C78379UpT.LJ == null) {
                    C78379UpT.LJ = new C78389Upd();
                }
            }
        } else {
            LJ.getClass();
        }
        C78389Upd c78389Upd = C78379UpT.LJ;
        OrderData orderData = this.LIZ;
        EnumC78373UpN LIZJ = LIZJ();
        JSONObject LIZ = c78389Upd.LIZ(orderData);
        c78389Upd.LIZIZ(LIZ, c78368UpI);
        if (LIZJ != null) {
            c78389Upd.add(LIZ, "cur_pay_state", LIZJ.name());
        } else {
            c78389Upd.add(LIZ, "cur_pay_state", "unknown");
        }
        C78273Unl.LJIIIZ().LIZIZ().onEventV3("pipo_pay_end", LIZ);
        OrderInfo buildOrderInfo = this.LIZ.buildOrderInfo();
        C78273Unl.LJIIIZ().LJ().getClass();
        C16880lQ.LLLZ("notifyPayCallback. %s, %s", new Object[]{c78368UpI, buildOrderInfo});
        if (this.LIZ.getIapPayRequest() == null) {
            str = "";
        } else {
            str = this.LIZ.getIapPayRequest().LJIIJ;
        }
        c78368UpI.LIZ = str;
        c78368UpI.LIZIZ = this.LIZ.getIapPayRequest();
        c78368UpI.LIZJ = this.LIZ.getPayType();
        if (this.LIZ.getPayType() == PayType.PRE && c78368UpI.getCode() == 0) {
            this.LIZIZ.removeAcquireRewards(this.LIZ.getProductId());
        }
        ((C78392Upg) C78379UpT.LJ().LIZJ()).LJI(c78368UpI, this.LIZJ, buildOrderInfo);
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIJJI(c78368UpI, buildOrderInfo);
        this.LIZIZ.onIapOrderFinished(this.LIZ);
    }
}
