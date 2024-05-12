package X;

import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.model.OrderStateInfo;
import defpackage.b1;
import org.json.JSONObject;

/* renamed from: X.Uog, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78330Uog {
    public InterfaceC78326Uoc<OrderStateInfo> LIZIZ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIL;
    public final IapPaymentMethod LJIILIIL;
    public final String LIZ = C16880lQ.LJLLJ(C78330Uog.class);
    public int LIZJ = 0;
    public final C78329Uof LJIILJJIL = new C78329Uof(this);
    public final HandlerC46526INu LJIIJJI = new HandlerC46526INu(this);

    public final void LIZLLL() {
        if (this.LIZJ >= this.LIZLLL) {
            b1.LIZLLL();
            InterfaceC78326Uoc<OrderStateInfo> interfaceC78326Uoc = this.LIZIZ;
            if (interfaceC78326Uoc != null) {
                interfaceC78326Uoc.LIZ(new C78368UpI(204, 2041, "channel pay success, but query order state timeout because query order state retry count is to maxRetryCount."));
                return;
            }
            return;
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderStateManager: query order state, retry count:");
        LIZ.append(this.LIZJ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        this.LJIIJJI.removeMessages(1);
        C78342Uos.LIZLLL().LIZJ().LIZLLL(this.LJFF, this.LJII, this.LJI, this.LJ, this.LJIIIIZZ, this.LJIIL, this.LJIILJJIL, this.LJIIJ);
        LIZIZ("livesdk_iap_check_order_receipt", null);
    }

    public final long LIZ(int i) {
        if (this.LJIILIIL == IapPaymentMethod.AMAZON) {
            Math.min(Math.max(i * 2, 2), 32);
        }
        long min = Math.min(Math.max(i, 1), 5) * 1000;
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (C73994T2g.LJIL()) {
            return min / 2;
        }
        return min;
    }

    public final void LIZJ(C78334Uok c78334Uok) {
        this.LIZIZ = c78334Uok;
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (C73994T2g.LJIL()) {
            HandlerC46526INu handlerC46526INu = this.LJIIJJI;
            C78273Unl.LJIIIZ().LIZLLL().getClass();
            handlerC46526INu.sendEmptyMessageDelayed(1, C73994T2g.LJIILLIIL("iap_exp_2_optimize_query_order_delay_time", 0));
            return;
        }
        LIZLLL();
    }

    public final void LIZIZ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_id", this.LJFF);
            jSONObject.put("merchant_id", this.LJII);
            jSONObject.put("product_id", this.LJ);
            jSONObject.put("is_subscription", this.LJIIIIZZ);
            jSONObject.put("pay_type", this.LJIIIZ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("retry_count", this.LIZJ);
            IapPaymentMethod iapPaymentMethod = this.LJIILIIL;
            if (iapPaymentMethod != null) {
                jSONObject2.put("payment_method", iapPaymentMethod.channelName);
            }
            if (str2 != null) {
                jSONObject2.put("result_message", str2);
            }
            InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
            EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
            C78263Unb c78263Unb = (C78263Unb) LJFF;
            c78263Unb.getClass();
            c78263Unb.LIZ(enumC77751UfL, str, jSONObject2, null, jSONObject);
        } catch (Exception unused) {
        }
    }

    public C78330Uog(IapPaymentMethod iapPaymentMethod, String str, String str2, String str3, int i, String str4, boolean z, PayType payType, String str5, int i2, boolean z2) {
        this.LIZLLL = 0;
        this.LJ = str;
        this.LJFF = str2;
        this.LJII = str3;
        this.LIZLLL = i;
        this.LJI = str4;
        this.LJIIIIZZ = z;
        this.LJIIIZ = payType.ordinal();
        this.LJIIJ = z2;
        this.LJIIL = str5;
        this.LJIILIIL = iapPaymentMethod;
    }
}
