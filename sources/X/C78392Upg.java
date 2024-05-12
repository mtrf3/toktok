package X;

import Y.ARunnableS16S0400000_13;
import Y.ARunnableS24S0300000_13;
import Y.ARunnableS2S0401000_8;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Upg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78392Upg implements InterfaceC78402Upq {
    public static boolean LJ() {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            return true;
        }
        return false;
    }

    public static void LIZ(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, OrderInfo orderInfo) {
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("result is:");
        LIZ.append(c78368UpI.toString());
        LIZ.append(" payInfo is:");
        LIZ.append(orderInfo);
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        int i = C78397Upl.LIZ[c78368UpI.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                if (interfaceC78395Upj != null) {
                    interfaceC78395Upj.LJFF(c78368UpI, orderInfo);
                    return;
                }
                return;
            } else {
                if (interfaceC78395Upj == null) {
                    return;
                }
                interfaceC78395Upj.LJII(c78368UpI, orderInfo);
                return;
            }
        }
        if (interfaceC78395Upj == null) {
            return;
        }
        interfaceC78395Upj.LJ();
    }

    public static void LIZLLL(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, List list) {
        JSONArray jSONArray;
        String jSONArray2;
        if (list != null) {
            jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((AbsIapProduct) it.next()).getProductId());
            }
        } else {
            jSONArray = null;
        }
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query result  is:");
        if (jSONArray == null) {
            jSONArray2 = "null";
        } else {
            jSONArray2 = jSONArray.toString();
        }
        LIZ.append(jSONArray2);
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        if (interfaceC78395Upj != null) {
            interfaceC78395Upj.LIZLLL(c78368UpI, list);
        }
    }

    public final void LJFF(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, IapChannelUserData iapChannelUserData) {
        if (LJ()) {
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LJIIIZ();
                return;
            }
            return;
        }
        ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS2S0401000_8(this, c78368UpI, iapChannelUserData, interfaceC78395Upj, 0, 1));
    }

    public final void LJI(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, OrderInfo orderInfo) {
        C78404Ups.LIZ(c78368UpI);
        if (LJ()) {
            LIZ(c78368UpI, interfaceC78395Upj, orderInfo);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS16S0400000_13(this, c78368UpI, orderInfo, interfaceC78395Upj, 13));
        }
    }

    public final void LJIIJ(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, List list) {
        if (LJ()) {
            LIZLLL(c78368UpI, interfaceC78395Upj, list);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new P3B(this, c78368UpI, list, interfaceC78395Upj, 0));
        }
    }

    public static void LIZIZ(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, IapPaymentMethod iapPaymentMethod, List list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((AbsIapProduct) it.next()).getProductId());
            }
        }
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("paymentMethod is ");
        LIZ.append(iapPaymentMethod.channelName);
        LIZ.append("query result  is:");
        LIZ.append(jSONArray.toString());
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        if (interfaceC78395Upj != null) {
            interfaceC78395Upj.LIZJ(iapPaymentMethod, c78368UpI, list);
        }
    }

    public static void LIZJ(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, List list, boolean z) {
        JSONArray jSONArray;
        if (list != null) {
            jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((AbsIapProduct) it.next()).getProductId());
            }
        } else {
            jSONArray = null;
        }
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("result is ");
        LIZ.append(c78368UpI.toString());
        LIZ.append(" query result is:");
        LIZ.append(jSONArray);
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        if (interfaceC78395Upj != null) {
            interfaceC78395Upj.LJI();
        }
    }

    public final void LJII(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, IapPaymentMethod iapPaymentMethod, List list) {
        if (LJ()) {
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LIZIZ();
                return;
            }
            return;
        }
        ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS24S0300000_13(this, iapPaymentMethod, c78368UpI, list, interfaceC78395Upj, 41));
    }

    public final void LJIIIIZZ(C78368UpI c78368UpI, InterfaceC78395Upj interfaceC78395Upj, IapPaymentMethod iapPaymentMethod, List list) {
        if (LJ()) {
            LIZIZ(c78368UpI, interfaceC78395Upj, iapPaymentMethod, list);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new RunnableC54439LYd(this, iapPaymentMethod, c78368UpI, list, interfaceC78395Upj, 0));
        }
    }

    public final void LJIIIZ(final C78368UpI c78368UpI, final InterfaceC78395Upj interfaceC78395Upj, final List list, final boolean z) {
        if (LJ()) {
            LIZJ(c78368UpI, interfaceC78395Upj, list, z);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new Runnable() { // from class: X.Upk
                @Override // java.lang.Runnable
                public final void run() {
                    C78392Upg c78392Upg = C78392Upg.this;
                    C78368UpI c78368UpI2 = c78368UpI;
                    boolean z2 = z;
                    List list2 = list;
                    InterfaceC78395Upj interfaceC78395Upj2 = interfaceC78395Upj;
                    c78392Upg.getClass();
                    C78392Upg.LIZJ(c78368UpI2, interfaceC78395Upj2, list2, z2);
                }
            });
        }
    }
}
