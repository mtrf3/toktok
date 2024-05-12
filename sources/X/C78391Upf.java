package X;

import Y.ARunnableS12S0301000_12;
import Y.ARunnableS16S0400000_13;
import Y.ARunnableS24S0300000_13;
import Y.ARunnableS3S0401000_13;
import Y.ARunnableS8S0310000_13;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Upf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78391Upf implements InterfaceC78403Upr {
    public InterfaceC78395Upj LIZ;
    public java.util.Set<InterfaceC78395Upj> LIZIZ;

    public static boolean LJIIIIZZ() {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(OrderInfo orderInfo) {
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("payInfo is:");
        LIZ.append(orderInfo);
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC78395Upj> it = set.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LIZ();
            }
        }
    }

    public final void LIZ(C78368UpI c78368UpI, IapChannelUserData iapChannelUserData) {
        java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC78395Upj> it = set.iterator();
            while (it.hasNext()) {
                it.next().LJIIIZ();
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LJIIIZ();
            }
        }
    }

    public final void LIZIZ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI) {
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on init callback , init result is:");
        LIZ.append(c78368UpI.toString());
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC78395Upj> it = set.iterator();
            while (it.hasNext()) {
                it.next().LJIIIIZZ(iapPaymentMethod, c78368UpI);
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LJIIIIZZ(iapPaymentMethod, c78368UpI);
            }
        }
    }

    public final void LIZJ(C78368UpI c78368UpI, OrderInfo orderInfo) {
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("result is:");
        LIZ.append(c78368UpI.toString());
        LIZ.append(" payInfo is:");
        LIZ.append(orderInfo);
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        int i = C78398Upm.LIZ[c78368UpI.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
                if (set != null) {
                    Iterator<InterfaceC78395Upj> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().LJFF(c78368UpI, orderInfo);
                    }
                    return;
                } else {
                    InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
                    if (interfaceC78395Upj != null) {
                        interfaceC78395Upj.LJFF(c78368UpI, orderInfo);
                        return;
                    }
                    return;
                }
            }
            java.util.Set<InterfaceC78395Upj> set2 = this.LIZIZ;
            if (set2 != null) {
                Iterator<InterfaceC78395Upj> it2 = set2.iterator();
                while (it2.hasNext()) {
                    it2.next().LJII(c78368UpI, orderInfo);
                }
                return;
            } else {
                InterfaceC78395Upj interfaceC78395Upj2 = this.LIZ;
                if (interfaceC78395Upj2 != null) {
                    interfaceC78395Upj2.LJII(c78368UpI, orderInfo);
                    return;
                }
                return;
            }
        }
        java.util.Set<InterfaceC78395Upj> set3 = this.LIZIZ;
        if (set3 != null) {
            Iterator<InterfaceC78395Upj> it3 = set3.iterator();
            while (it3.hasNext()) {
                it3.next().LJ();
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj3 = this.LIZ;
            if (interfaceC78395Upj3 != null) {
                interfaceC78395Upj3.LJ();
            }
        }
    }

    public final void LJII(C78368UpI c78368UpI, List<AbsIapProduct> list) {
        JSONArray jSONArray;
        String jSONArray2;
        if (list != null) {
            jSONArray = new JSONArray();
            Iterator<AbsIapProduct> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getProductId());
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
        java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC78395Upj> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(c78368UpI, list);
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LIZLLL(c78368UpI, list);
            }
        }
    }

    public final void LJIIIZ(C78368UpI c78368UpI, IapChannelUserData iapChannelUserData) {
        if (LJIIIIZZ()) {
            LIZ(c78368UpI, iapChannelUserData);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS12S0301000_12(0, this, c78368UpI, iapChannelUserData, 3));
        }
    }

    public final void LJIIJ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI) {
        if (LJIIIIZZ()) {
            LIZIZ(iapPaymentMethod, c78368UpI);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS24S0300000_13(this, iapPaymentMethod, c78368UpI, 43));
        }
    }

    public final void LJIIJJI(C78368UpI c78368UpI, OrderInfo orderInfo) {
        C78404Ups.LIZ(c78368UpI);
        if (LJIIIIZZ()) {
            LIZJ(c78368UpI, orderInfo);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS24S0300000_13(this, c78368UpI, orderInfo, 42));
        }
    }

    public final void LJIILL(C78368UpI c78368UpI, List<AbsIapProduct> list) {
        if (LJIIIIZZ()) {
            LJII(c78368UpI, list);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new RunnableC67238QaA(0, this, c78368UpI, list));
        }
    }

    public final void LJ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<String> list) {
        java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC78395Upj> it = set.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LIZIZ();
            }
        }
    }

    public final void LJFF(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<AbsIapProduct> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<AbsIapProduct> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getProductId());
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
        java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC78395Upj> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(iapPaymentMethod, c78368UpI, list);
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LIZJ(iapPaymentMethod, c78368UpI, list);
            }
        }
    }

    public final void LJI(C78368UpI c78368UpI, boolean z, List<AbsIapProduct> list) {
        JSONArray jSONArray;
        if (list != null) {
            jSONArray = new JSONArray();
            Iterator<AbsIapProduct> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getProductId());
            }
        } else {
            jSONArray = null;
        }
        C1GE LIZIZ = C78379UpT.LJ().LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("result is ");
        LIZ.append(c78368UpI.toString());
        LIZ.append(" query result is:");
        LIZ.append(jSONArray.toString());
        X1D.LIZIZ(LIZ);
        LIZIZ.getClass();
        java.util.Set<InterfaceC78395Upj> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC78395Upj> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LJI();
            }
        } else {
            InterfaceC78395Upj interfaceC78395Upj = this.LIZ;
            if (interfaceC78395Upj != null) {
                interfaceC78395Upj.LJI();
            }
        }
    }

    public final void LJIIL(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<String> list) {
        if (LJIIIIZZ()) {
            LJ(iapPaymentMethod, c78368UpI, list);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS16S0400000_13(this, iapPaymentMethod, c78368UpI, list, 14));
        }
    }

    public final void LJIILIIL(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<AbsIapProduct> list) {
        if (LJIIIIZZ()) {
            LJFF(iapPaymentMethod, c78368UpI, list);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS3S0401000_13(this, 1, iapPaymentMethod, c78368UpI, list, 1));
        }
    }

    public final void LJIILJJIL(C78368UpI c78368UpI, boolean z, List<AbsIapProduct> list) {
        if (LJIIIIZZ()) {
            LJI(c78368UpI, z, list);
        } else {
            ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZIZ.execute(new ARunnableS8S0310000_13(this, c78368UpI, z, list, 2));
        }
    }
}
