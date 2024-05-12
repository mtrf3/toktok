package X;

import android.app.Activity;
import android.os.Message;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;

/* renamed from: X.UoR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78315UoR implements InterfaceC78435UqN {
    public final C78306UoI LIZ;
    public C0HB LIZIZ;
    public final C78314UoQ LIZJ = new C78314UoQ(this);
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final OrderData LJI;
    public final OrderInfo LJII;
    public Message LJIIIIZZ;
    public final /* synthetic */ C78312UoO LJIIIZ;

    @Override // X.InterfaceC78435UqN
    public final void LIZ() {
        Activity activity = this.LJIIIZ.LJ;
        if (activity == null || this.LJFF) {
            return;
        }
        this.LJFF = true;
        activity.getApplication().registerActivityLifecycleCallbacks(this.LIZJ);
    }

    @Override // X.InterfaceC78435UqN
    public final void LJI() {
        this.LIZLLL++;
    }

    @Override // X.InterfaceC78435UqN
    public final Activity LJIIIIZZ() {
        return this.LJIIIZ.LJ;
    }

    public final void LJIIJJI() {
        Activity activity = this.LJIIIZ.LJ;
        if (activity == null) {
            return;
        }
        if (this.LJFF) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this.LIZJ);
            this.LJFF = false;
        }
        this.LJIIIZ.LJ = null;
    }

    @Override // X.InterfaceC78435UqN
    public final int LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC78435UqN
    public final boolean LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC78435UqN
    public final C0HB LJII() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC78435UqN
    public final void LIZJ(C0HB c0hb) {
        this.LIZIZ = c0hb;
        this.LIZLLL = -1;
        this.LJ = false;
    }

    @Override // X.InterfaceC78435UqN
    public final void LJFF(C78365UpF c78365UpF) {
        C78368UpI c78368UpI = new C78368UpI(209, 2091, "pay failed because signature is invalid");
        c78368UpI.LIZJ = this.LJI.getPayType();
        this.LIZ.LIZ(c78365UpF.getOrderState(), c78365UpF.getSelfOrderId(), c78368UpI);
        this.LJIIIZ.LIZIZ(c78368UpI);
    }

    public C78315UoR(C78312UoO c78312UoO, C78306UoI c78306UoI, OrderData orderData) {
        this.LJIIIZ = c78312UoO;
        this.LIZ = c78306UoI;
        this.LJI = orderData;
        this.LJII = new OrderInfo(c78312UoO.LIZ);
    }

    @Override // X.InterfaceC78435UqN
    public final void LIZLLL(C78368UpI c78368UpI, C78365UpF c78365UpF, C78438UqQ c78438UqQ) {
        C78368UpI c78368UpI2;
        C78368UpI c78368UpI3;
        int code = c78368UpI.getCode();
        if (c78365UpF != null) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GooglePayState: onPurchasesUpdated originalJson of purchase is ");
            LIZ.append(c78365UpF.toString());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
        }
        String str = "";
        int i = -1;
        if (code == 0) {
            if (c78365UpF != null) {
                if (c78365UpF.isOrderStateSuccess() && LJIIJ(c78368UpI, c78365UpF, c78438UqQ)) {
                    this.LJIIIZ.LJFF.removeMessages(1435, this.LJIIIIZZ);
                    this.LIZ.LIZ(c78365UpF.getOrderState(), c78365UpF.getSelfOrderId(), null);
                    this.LJIIIZ.LIZLLL(c78365UpF, c78438UqQ);
                    C78316UoS.LIZ.LIZ(c78365UpF);
                    return;
                }
                if (!c78365UpF.isOrderStateSuccess()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("pay successful in GooglePayPurchasesUpdatedListener but isOrderStateSuccess() is false,resultMessage is ");
                    LIZ2.append(c78368UpI.getMessage());
                    c78368UpI3 = new C78368UpI(-202, code, X1D.LIZIZ(LIZ2));
                } else {
                    if (c78438UqQ != null) {
                        return;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is ");
                    LIZ3.append(c78368UpI.getMessage());
                    c78368UpI3 = new C78368UpI(-200, code, X1D.LIZIZ(LIZ3));
                }
                i = c78365UpF.getOrderState();
                str = c78365UpF.getSelfOrderId();
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("pay successful in GooglePayPurchasesUpdatedListener but googleIapOrderData is null,resultMessage is ");
                LIZ4.append(c78368UpI.getMessage());
                c78368UpI3 = new C78368UpI(-203, code, X1D.LIZIZ(LIZ4));
            }
            this.LIZ.LIZ(i, str, c78368UpI3);
            if (i == 0) {
                return;
            }
            this.LJIIIZ.LIZIZ(c78368UpI3);
            return;
        }
        if (code == 1) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("pay failed in GooglePayPurchasesUpdatedListener because user canceled,resultMessage is ");
            LIZ5.append(c78368UpI.getMessage());
            c78368UpI2 = new C78368UpI(206, code, X1D.LIZIZ(LIZ5));
            C78316UoS.LIZ.LIZJ(this.LJI);
        } else {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("pay failed in GooglePayPurchasesUpdatedListener,resultMessage is ");
            LIZ6.append(c78368UpI.getMessage());
            c78368UpI2 = new C78368UpI(203, code, X1D.LIZIZ(LIZ6));
        }
        C78306UoI c78306UoI = this.LIZ;
        if (c78365UpF != null) {
            i = c78365UpF.getOrderState();
            str = c78365UpF.getSelfOrderId();
        }
        c78306UoI.LIZ(i, str, c78368UpI2);
        C77875UhL.LIZLLL(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, this.LJI.getOrderId());
        this.LJIIIZ.LIZIZ(c78368UpI2);
    }

    @Override // X.InterfaceC78435UqN
    public final void LJIIIZ(C78368UpI c78368UpI, C78365UpF c78365UpF, C78439UqR c78439UqR) {
        C78368UpI c78368UpI2;
        C78368UpI c78368UpI3;
        this.LJIIIZ.LJ = null;
        LJIIJJI();
        int code = c78368UpI.getCode();
        if (c78365UpF != null) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GooglePayState: onPurchasesUpdated originalJson of purchase is ");
            LIZ.append(c78365UpF.toString());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
        }
        String str = "";
        int i = -1;
        if (code == 0) {
            if (c78365UpF != null) {
                if (c78365UpF.isOrderStateSuccess() && LJIIJ(c78368UpI, c78365UpF, c78439UqR)) {
                    this.LJIIIZ.LJFF.removeMessages(1435, this.LJIIIIZZ);
                    this.LIZ.LIZ(c78365UpF.getOrderState(), c78365UpF.getSelfOrderId(), null);
                    this.LJIIIZ.LIZLLL(c78365UpF, c78439UqR);
                    C78316UoS.LIZ.LIZ(c78365UpF);
                    return;
                }
                if (!c78365UpF.isOrderStateSuccess()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("pay successful in GooglePayPurchasesUpdatedListener but isOrderStateSuccess() is false,resultMessage is ");
                    LIZ2.append(c78368UpI.getMessage());
                    c78368UpI3 = new C78368UpI(-202, code, X1D.LIZIZ(LIZ2));
                } else {
                    if (c78439UqR != null) {
                        return;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is ");
                    LIZ3.append(c78368UpI.getMessage());
                    c78368UpI3 = new C78368UpI(-200, code, X1D.LIZIZ(LIZ3));
                }
                i = c78365UpF.getOrderState();
                str = c78365UpF.getSelfOrderId();
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("pay successful in GooglePayPurchasesUpdatedListener but googleIapOrderData is null,resultMessage is ");
                LIZ4.append(c78368UpI.getMessage());
                c78368UpI3 = new C78368UpI(-203, code, X1D.LIZIZ(LIZ4));
            }
            this.LIZ.LIZ(i, str, c78368UpI3);
            if (i == 0) {
                return;
            }
            this.LJIIIZ.LIZIZ(c78368UpI3);
            return;
        }
        if (code == 1) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("pay failed in GooglePayPurchasesUpdatedListener because user canceled,resultMessage is ");
            LIZ5.append(c78368UpI.getMessage());
            c78368UpI2 = new C78368UpI(206, code, X1D.LIZIZ(LIZ5));
            C78316UoS.LIZ.LIZJ(this.LJI);
        } else {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("pay failed in GooglePayPurchasesUpdatedListener,resultMessage is ");
            LIZ6.append(c78368UpI.getMessage());
            c78368UpI2 = new C78368UpI(203, code, X1D.LIZIZ(LIZ6));
        }
        C78306UoI c78306UoI = this.LIZ;
        if (c78365UpF != null) {
            i = c78365UpF.getOrderState();
            str = c78365UpF.getSelfOrderId();
        }
        c78306UoI.LIZ(i, str, c78368UpI2);
        C77875UhL.LIZLLL(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, this.LJI.getOrderId());
        this.LJIIIZ.LIZIZ(c78368UpI2);
    }

    public final boolean LJIIJ(C78368UpI c78368UpI, C78365UpF c78365UpF, AbsIapProduct absIapProduct) {
        int i;
        String str;
        if (absIapProduct != null) {
            return true;
        }
        boolean z = C78316UoS.LIZ.LJLJI;
        if (z) {
            int code = c78368UpI.getCode();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is ");
            LIZ.append(c78368UpI.getMessage());
            C78368UpI c78368UpI2 = new C78368UpI(-201, code, X1D.LIZIZ(LIZ));
            C78306UoI c78306UoI = this.LIZ;
            if (c78365UpF != null) {
                i = c78365UpF.getOrderState();
                str = c78365UpF.getSelfOrderId();
            } else {
                i = -1;
                str = "";
            }
            c78306UoI.LIZ(i, str, c78368UpI2);
        }
        return z;
    }
}
