package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uf8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77738Uf8 implements InterfaceC78395Upj {
    public static final C77738Uf8 LIZ = new C77738Uf8();

    @Override // X.InterfaceC78395Upj
    public final void LIZ() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LIZJ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List list) {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LIZLLL(C78368UpI c78368UpI, List list) {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJ() {
    }

    @Override // X.InterfaceC78395Upj
    public final void LJFF(C78368UpI c78368UpI, OrderInfo orderInfo) {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJI() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJII(C78368UpI c78368UpI, OrderInfo orderInfo) {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJIIIZ() {
    }

    @Override // X.InterfaceC78395Upj
    public final void LJIIIIZZ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI) {
        String str;
        HashMap hashMap = new HashMap();
        if (iapPaymentMethod != null) {
            str = iapPaymentMethod.channelName;
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (paymentMethod != nul…ethod.channelName else \"\"");
        hashMap.put("pay_method", str);
        if (c78368UpI == null) {
            C78609UtB.LJJJLL(-1, -1, "ttlive_pipo_init", "iapResult is null", hashMap);
        } else {
            if (c78368UpI.isSuccess()) {
                return;
            }
            C78609UtB.LJJJLL(c78368UpI.getCode(), c78368UpI.getDetailCode(), "ttlive_pipo_init", c78368UpI.getMessage(), hashMap);
        }
    }
}
