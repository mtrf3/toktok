package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.B83;
import X.C07720Sa;
import X.C10370av;
import X.C10430b1;
import X.C111074Xn;
import X.C1M1;
import X.C1OH;
import X.C23490w5;
import X.C24490xh;
import X.C24500xi;
import X.C29374Bfu;
import X.C31556Ca0;
import X.C42191l9;
import X.C76800UCe;
import X.C77413UZt;
import X.C77612Ud6;
import X.C77766Ufa;
import X.C78847Ux1;
import X.C78923UyF;
import X.C78966Uyw;
import X.InterfaceC07790Sh;
import X.InterfaceC23370vt;
import X.InterfaceC24520xk;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC77737Uf7;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.V55;
import X.V6D;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.wallet.Diamond;

/* loaded from: classes14.dex */
public class IDqS187S0200000_13 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS187S0200000_13(V6D v6d, V6D v6d2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(3);
        this.$t = interfaceC65784Pro;
        this.l0 = v6d;
        this.l1 = v6d2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS187S0200000_13(Diamond diamond, C77766Ufa c77766Ufa, int i) {
        super(3);
        this.$t = i;
        this.l0 = diamond;
        this.l1 = c77766Ufa;
    }

    public static final Object invoke$0(IDqS187S0200000_13 iDqS187S0200000_13, Object obj, Object iapRequest, Object obj2) {
        DiamondBuyResult responseData = (DiamondBuyResult) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(responseData, "responseData");
        o.LJIIIZ(iapRequest, "iapRequest");
        if (booleanValue) {
            C31556Ca0 c31556Ca0 = new C31556Ca0(2, null, new C77612Ud6(((Diamond) iDqS187S0200000_13.l0).iapId, responseData.orderId, 1, String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())), null, null, null, null, null, LiveCoverMinSizeSetting.DEFAULT);
            InterfaceC77737Uf7 interfaceC77737Uf7 = (InterfaceC77737Uf7) iDqS187S0200000_13.l1;
            if (interfaceC77737Uf7 != null) {
                interfaceC77737Uf7.LJIIJJI(c31556Ca0);
            }
        }
        return Boolean.valueOf(booleanValue);
    }

    public static final Object invoke$1(IDqS187S0200000_13 iDqS187S0200000_13, Object obj, Object obj2, Object obj3) {
        long LIZ;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        C111074Xn.LIZIZ((Number) obj3, (InterfaceC07790Sh) obj, "$this$composed", interfaceC24520xk, 1164942333);
        InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJIILL == c24490xh) {
            LJIILL = C78966Uyw.LJJJIL(new C23490w5(0L));
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
        V6D v6d = (V6D) iDqS187S0200000_13.l0;
        interfaceC24520xk.LJJIIJ(1157296644);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(v6d);
        Object LJIILL2 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL2 == c24490xh) {
            LJIILL2 = new V55(interfaceC23370vt.LJJJJIZL(v6d.LIZIZ), interfaceC23370vt.LJJJJIZL(v6d.LIZLLL), 5);
            interfaceC24520xk.LJJIII(LJIILL2);
        }
        interfaceC24520xk.LJJIJIIJIL();
        V55 updatedRect = (V55) LJIILL2;
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL3 = interfaceC24520xk.LJIILL();
        if (LJIILL3 == c24490xh) {
            LJIILL3 = new C42191l9();
            interfaceC24520xk.LJJIII(LJIILL3);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C1OH c1oh = (C1OH) LJIILL3;
        C23490w5 c23490w5 = new C23490w5(((C23490w5) interfaceC35811ar.getValue()).LIZ);
        interfaceC24520xk.LJJIIJ(511388516);
        boolean LJIJJ2 = interfaceC24520xk.LJIJJ(c23490w5) | interfaceC24520xk.LJIJJ(updatedRect);
        Object LJIILL4 = interfaceC24520xk.LJIILL();
        if (LJIJJ2 || LJIILL4 == c24490xh) {
            long j = ((C23490w5) interfaceC35811ar.getValue()).LIZ;
            o.LJIIIZ(updatedRect, "updatedRect");
            int i = (int) (j >> 32);
            if (i == 0 || C23490w5.LIZIZ(j) == 0) {
                LIZ = C78923UyF.LIZ(1.0f, 1.0f);
            } else {
                int LIZIZ = C23490w5.LIZIZ(j);
                float f = i;
                float f2 = ((updatedRect.LJLIL + updatedRect.LJLJI) + f) / f;
                float f3 = 0.0f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f4 = LIZIZ;
                float f5 = ((updatedRect.LJLILLLLZI + updatedRect.LJLJJI) + f4) / f4;
                if (f5 >= 0.0f) {
                    f3 = f5;
                }
                LIZ = C78923UyF.LIZ(f2, f3);
            }
            LJIILL4 = new C10370av(LIZ);
            interfaceC24520xk.LJJIII(LJIILL4);
        }
        interfaceC24520xk.LJJIJIIJIL();
        long j2 = ((C10370av) LJIILL4).LIZ;
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        C10370av c10370av = new C10370av(j2);
        interfaceC24520xk.LJJIIJ(511388516);
        boolean LJIJJ3 = interfaceC24520xk.LJIJJ(c10370av) | interfaceC24520xk.LJIJJ(updatedRect);
        Object LJIILL5 = interfaceC24520xk.LJIILL();
        if (LJIJJ3 || LJIILL5 == c24490xh) {
            LJIILL5 = new AqS34S0100100_13(j2, updatedRect, 1);
            interfaceC24520xk.LJJIII(LJIILL5);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC07790Sh LIZIZ2 = C07720Sa.LIZIZ(C78847Ux1.LJJIIZ(c1m1, (InterfaceC88472Yns) LJIILL5), c1oh, null, true, null, null, (InterfaceC65784Pro) iDqS187S0200000_13.l1);
        C10370av c10370av2 = new C10370av(j2);
        interfaceC24520xk.LJJIIJ(511388516);
        boolean LJIJJ4 = interfaceC24520xk.LJIJJ(c10370av2) | interfaceC24520xk.LJIJJ(updatedRect);
        Object LJIILL6 = interfaceC24520xk.LJIILL();
        if (LJIJJ4 || LJIILL6 == c24490xh) {
            LJIILL6 = new AqS34S0100100_13(j2, updatedRect, 2);
            interfaceC24520xk.LJJIII(LJIILL6);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC07790Sh LJJIIZ = C78847Ux1.LJJIIZ(LIZIZ2, (InterfaceC88472Yns) LJIILL6);
        interfaceC24520xk.LJJIIJ(1157296644);
        boolean LJIJJ5 = interfaceC24520xk.LJIJJ(interfaceC35811ar);
        Object LJIILL7 = interfaceC24520xk.LJIILL();
        if (LJIJJ5 || LJIILL7 == c24490xh) {
            LJIILL7 = new AqS179S0100000_13(interfaceC35811ar, (InterfaceC35811ar<C10430b1>) 375);
            interfaceC24520xk.LJJIII(LJIILL7);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC07790Sh LJJI = C77413UZt.LJJI(LJJIIZ, (InterfaceC88472Yns) LJIILL7);
        interfaceC24520xk.LJJIJIIJIL();
        return LJJI;
    }
}
