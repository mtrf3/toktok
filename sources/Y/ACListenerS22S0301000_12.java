package Y;

import X.B1K;
import X.C27949Ay1;
import X.C61841OOv;
import X.C68322mC;
import X.C70120RfY;
import X.C70208Rgy;
import X.C70216Rh6;
import X.C70360RjQ;
import X.C70387Rjr;
import X.C70917RsP;
import X.C71772SEu;
import X.C71773SEv;
import X.C78685UuP;
import X.C78946Uyc;
import X.InterfaceC70386Rjq;
import X.InterfaceC70389Rjt;
import X.InterfaceC71003Rtn;
import X.OUR;
import X.RVL;
import X.RYM;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.payment.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.AqS0S1011000_12;
import kotlin.jvm.internal.AqS32S0301000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACListenerS22S0301000_12 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS22S0301000_12 aCListenerS22S0301000_12, View view) {
        T t;
        C68322mC c68322mC = new C68322mC();
        String str = "select";
        c68322mC.element = "select";
        BnplInfo bnplInfo = ((RVL) ((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0).getItem()).LIZ;
        if (bnplInfo == null || !o.LJ(bnplInfo.isAuth, Boolean.TRUE)) {
            ((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0).M();
        } else {
            if (((C70360RjQ) aCListenerS22S0301000_12.l1).LIZJ()) {
                ((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0).L();
                ((PdpViewModel) ((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0).LJLIL.getValue()).vx0(null);
                t = "cancel";
            } else {
                ((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0).L();
                ((C70360RjQ) aCListenerS22S0301000_12.l1).setChecked$ecommerce_transaction_release(true);
                ((PdpViewModel) ((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0).LJLIL.getValue()).vx0((InstallmentPlan) aCListenerS22S0301000_12.l2);
                t = str;
            }
            c68322mC.element = t;
        }
        View view2 = ((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0).itemView;
        C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS32S0301000_12((PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.l0, (PdpPaymentModuleViewHolder) aCListenerS22S0301000_12.i3, (int) aCListenerS22S0301000_12.l2, (InstallmentPlan) c68322mC, (C68322mC<String>) 0));
    }

    public static final void onClick$1(ACListenerS22S0301000_12 aCListenerS22S0301000_12, View view) {
        String str;
        String str2;
        String str3;
        Availability availability;
        PaymentMethod subPaymentMethod;
        if (((C71773SEv) aCListenerS22S0301000_12.l0).LIZIZ()) {
            return;
        }
        ((C71772SEu) aCListenerS22S0301000_12.l1).LIZIZ();
        ((C71773SEv) aCListenerS22S0301000_12.l0).setChecked(true);
        ((PaymentMethod) aCListenerS22S0301000_12.l2).LIZ = ((C71773SEv) aCListenerS22S0301000_12.l0).getSubPaymentMethod();
        PaymentMethod subPaymentMethod2 = ((C71773SEv) aCListenerS22S0301000_12.l0).getSubPaymentMethod();
        if (subPaymentMethod2 != null) {
            ((C71772SEu) aCListenerS22S0301000_12.l1).getOnSubPaymentCheckChanged().invoke(subPaymentMethod2);
        }
        if (((C71772SEu) aCListenerS22S0301000_12.l1).getAutoSelect() && (subPaymentMethod = ((C71773SEv) aCListenerS22S0301000_12.l0).getSubPaymentMethod()) != null) {
            C27949Ay1.LJIJI = subPaymentMethod;
        }
        if (!C61841OOv.LIZIZ(((PaymentMethod) aCListenerS22S0301000_12.l2).LIZ, B1K.LJIILIIL)) {
            C61841OOv.LIZIZ(((C71772SEu) aCListenerS22S0301000_12.l1).LJLJL, ((C71773SEv) aCListenerS22S0301000_12.l0).getSubPaymentMethod());
            B1K paymentLogger = ((C71772SEu) aCListenerS22S0301000_12.l1).getPaymentLogger();
            if (paymentLogger != null) {
                String LJIIL = ((PaymentMethod) aCListenerS22S0301000_12.l2).LJIIL();
                PaymentMethod subPaymentMethod3 = ((C71773SEv) aCListenerS22S0301000_12.l0).getSubPaymentMethod();
                if (subPaymentMethod3 != null) {
                    str = subPaymentMethod3.LJIIL();
                } else {
                    str = "";
                }
                int i = aCListenerS22S0301000_12.i3;
                PaymentMethod subPaymentMethod4 = ((C71773SEv) aCListenerS22S0301000_12.l0).getSubPaymentMethod();
                if (subPaymentMethod4 != null) {
                    str2 = subPaymentMethod4.extraInfo;
                } else {
                    str2 = null;
                }
                boolean LJJJZ = C78685UuP.LJJJZ(str2);
                PaymentMethod subPaymentMethod5 = ((C71773SEv) aCListenerS22S0301000_12.l0).getSubPaymentMethod();
                if (subPaymentMethod5 != null && (availability = subPaymentMethod5.availability) != null) {
                    str3 = availability.statusCode;
                } else {
                    str3 = null;
                }
                paymentLogger.LJIILLIIL(LJIIL, str, i, LJJJZ, str3, Boolean.valueOf(((C71772SEu) aCListenerS22S0301000_12.l1).getAutoSelect()), null, null);
            }
        }
        ((C71772SEu) aCListenerS22S0301000_12.l1).setAutoSelect(false);
        ((C71772SEu) aCListenerS22S0301000_12.l1).setDefaultChoose(false);
        B1K.LJIILIIL = null;
    }

    public static final void onClick$2(ACListenerS22S0301000_12 aCListenerS22S0301000_12, View view) {
        boolean z;
        String str;
        RYM rym = (RYM) aCListenerS22S0301000_12.l0;
        if (rym != null) {
            z = rym.LJFF;
        } else {
            z = false;
        }
        boolean z2 = !z;
        ((C70208Rgy) aCListenerS22S0301000_12.l1).LJLJJLL.LLLZL(((Feed) aCListenerS22S0301000_12.l2).product, z2);
        C70208Rgy c70208Rgy = (C70208Rgy) aCListenerS22S0301000_12.l1;
        C70120RfY c70120RfY = c70208Rgy.LJLJI;
        InterfaceC71003Rtn interfaceC71003Rtn = c70208Rgy.LJLILLLLZI;
        if (z2) {
            str = "select_product";
        } else {
            str = "cancel_product";
        }
        c70120RfY.getClass();
        C70120RfY.LIZIZ(interfaceC71003Rtn, str);
        C70208Rgy c70208Rgy2 = (C70208Rgy) aCListenerS22S0301000_12.l1;
        C70120RfY c70120RfY2 = c70208Rgy2.LJLJI;
        InterfaceC71003Rtn node = c70208Rgy2.LJLILLLLZI;
        int i = aCListenerS22S0301000_12.i3;
        c70120RfY2.getClass();
        o.LJIIIZ(node, "node");
        C78946Uyc.LJJII(node, new C70917RsP(), new AqS0S1011000_12("together_product_select", z2, i, 2));
    }

    public static final void onClick$3(ACListenerS22S0301000_12 aCListenerS22S0301000_12, View view) {
        C70216Rh6 c70216Rh6;
        if (!((C70216Rh6) aCListenerS22S0301000_12.l0).LJ) {
            ((InterfaceC70386Rjq) aCListenerS22S0301000_12.l1).LJIIIIZZ();
        }
        C70387Rjr c70387Rjr = (C70387Rjr) aCListenerS22S0301000_12.l2;
        boolean z = true;
        c70387Rjr.LJZI = true;
        if (o.LJ(c70387Rjr.LJLJLJ, (C70216Rh6) aCListenerS22S0301000_12.l0)) {
            c70216Rh6 = null;
        } else {
            c70216Rh6 = (C70216Rh6) aCListenerS22S0301000_12.l0;
        }
        c70387Rjr.LJLJLJ = c70216Rh6;
        ((C70387Rjr) aCListenerS22S0301000_12.l2).LIZJ();
        C70387Rjr c70387Rjr2 = (C70387Rjr) aCListenerS22S0301000_12.l2;
        InterfaceC70389Rjt interfaceC70389Rjt = c70387Rjr2.LJLLI;
        if (interfaceC70389Rjt != null) {
            interfaceC70389Rjt.LIZ(c70387Rjr2.LJLL, c70387Rjr2.LJLJLJ);
        }
        C70387Rjr c70387Rjr3 = (C70387Rjr) aCListenerS22S0301000_12.l2;
        InterfaceC70389Rjt interfaceC70389Rjt2 = c70387Rjr3.LJLLI;
        if (interfaceC70389Rjt2 != null) {
            int i = c70387Rjr3.LJLL;
            int i2 = aCListenerS22S0301000_12.i3;
            Image image = ((C70216Rh6) aCListenerS22S0301000_12.l0).LIZJ;
            if (c70387Rjr3.LJLJLJ == null) {
                z = false;
            }
            interfaceC70389Rjt2.LIZIZ(i, i2, image, z);
        }
    }

    public ACListenerS22S0301000_12(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
