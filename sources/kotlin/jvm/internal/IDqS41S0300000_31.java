package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.C03720Cq;
import X.C07730Sb;
import X.C09290Yb;
import X.C09330Yf;
import X.C0YW;
import X.C113554cx;
import X.C11850dJ;
import X.C1DJ;
import X.C1M1;
import X.C1P1;
import X.C21790tL;
import X.C23360vs;
import X.C24440xc;
import X.C24610xt;
import X.C24830yF;
import X.C32371Ov;
import X.C32I;
import X.C40431iJ;
import X.C46041rM;
import X.C56509MFt;
import X.C76800UCe;
import X.C78929UyL;
import X.C79057V0z;
import X.C91897a21;
import X.C92037a4H;
import X.C92145a61;
import X.C92973aJN;
import X.C93072aKy;
import X.C93162aMQ;
import X.C93163aMR;
import X.InterfaceC03730Cr;
import X.InterfaceC07760Se;
import X.InterfaceC07790Sh;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC273215k;
import X.InterfaceC273515n;
import X.InterfaceC39071g7;
import X.InterfaceC536028m;
import X.InterfaceC88471Ynr;
import com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes20.dex */
public class IDqS41S0300000_31 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS41S0300000_31 iDqS41S0300000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            CheckoutActivity checkoutActivity = (CheckoutActivity) iDqS41S0300000_31.l0;
            C92145a61 c92145a61 = (C92145a61) iDqS41S0300000_31.l1;
            CheckoutActivity checkoutActivity2 = (CheckoutActivity) iDqS41S0300000_31.l2;
            interfaceC24520xk.LJJIIJ(-483455358);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            C32371Ov c32371Ov = C0YW.LIZJ;
            InterfaceC07760Se.LJJJ.getClass();
            InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk);
            interfaceC24520xk.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
            if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
                interfaceC24520xk.LJIJI();
                if (interfaceC24520xk.LJIJJLI()) {
                    interfaceC24520xk.LJJI(c46041rM);
                } else {
                    interfaceC24520xk.LIZIZ();
                }
                interfaceC24520xk.LJJIIZI();
                C24830yF.LIZ(interfaceC24520xk, LIZ, C03720Cq.LJ);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL3, C03720Cq.LJI);
                interfaceC24520xk.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(interfaceC24520xk), interfaceC24520xk, 0);
                interfaceC24520xk.LJJIIJ(2058660585);
                interfaceC24520xk.LJJIIJ(-1163856341);
                C79057V0z.LJ(C1P1.LIZLLL(c1m1), interfaceC24520xk, 0);
                C91897a21.LIZ(c92145a61, new C93163aMR(checkoutActivity.LLFZ()), checkoutActivity.LLFZ(), checkoutActivity.LLFZ().getEventSender(), checkoutActivity.LLFZ().getUiState(), new C93162aMQ(checkoutActivity.LLFZ()), new IDqS174S0200000_31(checkoutActivity, checkoutActivity2, 11), interfaceC24520xk, 37384);
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJIJ();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS41S0300000_31 iDqS41S0300000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C24610xt.LJ(C76800UCe.LIZ, new C93072aKy((CheckoutActivity) iDqS41S0300000_31.l0, null), interfaceC24520xk);
            C21790tL.LIZ(C09290Yb.LJI(InterfaceC07790Sh.LJJJI), null, C11850dJ.LJFF, 0L, null, 0.0f, C1DJ.LJ(interfaceC24520xk, -819904355, new IDqS41S0300000_31((CheckoutActivity) iDqS41S0300000_31.l0, (C92145a61) iDqS41S0300000_31.l1, (CheckoutActivity) iDqS41S0300000_31.l2, 0)), interfaceC24520xk, 1573254, 58);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS41S0300000_31 iDqS41S0300000_31, Object obj, Object obj2) {
        InterfaceC273515n LJJLIL;
        InterfaceC536028m SubcomposeLayout = (InterfaceC536028m) obj;
        long j = ((C23360vs) obj2).LIZ;
        o.LJIIIZ(SubcomposeLayout, "$this$SubcomposeLayout");
        List<InterfaceC39071g7> LJJJJL = SubcomposeLayout.LJJJJL("headerContent", (InterfaceC88471Ynr) iDqS41S0300000_31.l0);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJJJL, 10));
        Iterator<InterfaceC39071g7> it = LJJJJL.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJJJIL(j));
        }
        List<InterfaceC39071g7> LJJJJL2 = SubcomposeLayout.LJJJJL("trailingContent", (InterfaceC88471Ynr) iDqS41S0300000_31.l1);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJJJJL2, 10));
        Iterator<InterfaceC39071g7> it2 = LJJJJL2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LJJJIL(j));
        }
        int max = Math.max((C23360vs.LJII(j) - C92037a4H.LIZJ(arrayList)) - C92037a4H.LIZJ(arrayList2), 0);
        int min = Math.min(max, 0);
        List<InterfaceC39071g7> LJJJJL3 = SubcomposeLayout.LJJJJL("restrictContent", (InterfaceC88471Ynr) iDqS41S0300000_31.l2);
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJJJJL3, 10));
        Iterator<InterfaceC39071g7> it3 = LJJJJL3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next().LJJJIL(C23360vs.LIZ(j, min, max, 0, 0, 12)));
        }
        int max2 = Math.max(C92037a4H.LIZIZ(arrayList), Math.max(C92037a4H.LIZIZ(arrayList2), C92037a4H.LIZIZ(arrayList3)));
        LJJLIL = SubcomposeLayout.LJJLIL(C23360vs.LJII(j), max2, C113554cx.LJJJLIIL(), new C92973aJN(arrayList, arrayList3, arrayList2, max2));
        return LJJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS41S0300000_31(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4) {
        super(2);
        this.$t = interfaceC88471Ynr4;
        this.l0 = interfaceC88471Ynr;
        this.l1 = interfaceC88471Ynr2;
        this.l2 = interfaceC88471Ynr3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS41S0300000_31(CheckoutActivity checkoutActivity, C92145a61 c92145a61, CheckoutActivity checkoutActivity2, int i) {
        super(2);
        this.$t = i;
        this.l0 = checkoutActivity;
        this.l1 = c92145a61;
        this.l2 = checkoutActivity2;
    }
}
