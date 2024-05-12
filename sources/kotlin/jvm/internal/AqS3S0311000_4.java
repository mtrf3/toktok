package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C249329qS;
import X.C249339qT;
import X.C26965Ai9;
import X.C2F6;
import X.C37655EqB;
import X.C37656EqC;
import X.C76800UCe;
import X.EnumC27805Avh;
import X.InterfaceC65784Pro;
import Y.ARunnableS2S0211000_4;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop.GlobalMainOrderInfoVH;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class AqS3S0311000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS3S0311000_4 aqS3S0311000_4) {
        boolean z;
        if (aqS3S0311000_4.z3 && !((GlobalMainOrderInfoVH) aqS3S0311000_4.l0).L().LLJJIII) {
            z = true;
        } else {
            z = false;
        }
        GlobalMainOrderInfoVH globalMainOrderInfoVH = (GlobalMainOrderInfoVH) aqS3S0311000_4.l0;
        C249329qS c249329qS = (C249329qS) aqS3S0311000_4.l1;
        LogisticDTO logisticDTO = (LogisticDTO) aqS3S0311000_4.l2;
        int i = aqS3S0311000_4.i4;
        globalMainOrderInfoVH.getClass();
        c249329qS.post(new ARunnableS2S0211000_4(i, c249329qS, logisticDTO, z, 0));
        if (((GlobalMainOrderInfoVH) aqS3S0311000_4.l0).L().Yw0((C26965Ai9) ((GlobalMainOrderInfoVH) aqS3S0311000_4.l0).getItem(), (LogisticDTO) aqS3S0311000_4.l2)) {
            ((GlobalMainOrderInfoVH) aqS3S0311000_4.l0).L().LLJJIII = true;
            ((GlobalMainOrderInfoVH) aqS3S0311000_4.l0).L().LLIILZL = true;
            OrderSubmitViewModel.Lw0(((GlobalMainOrderInfoVH) aqS3S0311000_4.l0).L(), false, null, false, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.LOGISTICS.getValue()), 4093);
        }
        View logistic_container = ((GlobalMainOrderInfoVH) aqS3S0311000_4.l0)._$_findCachedViewById(R.id.g_b);
        o.LJIIIIZZ(logistic_container, "logistic_container");
        Iterator<Object> it = new C37655EqB(new C2F6(logistic_container, null)).iterator();
        while (true) {
            C37656EqC c37656EqC = (C37656EqC) it;
            if (c37656EqC.hasNext()) {
                View view = (View) c37656EqC.next();
                if (view instanceof C249329qS) {
                    ((C249329qS) view).setCheck(false);
                }
            } else {
                ((C249329qS) aqS3S0311000_4.l1).setCheck(true);
                return C76800UCe.LIZ;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS3S0311000_4 aqS3S0311000_4) {
        boolean z;
        if (aqS3S0311000_4.z3 && !((MainOrderInfoVH) aqS3S0311000_4.l0).L().LLJJIII) {
            z = true;
        } else {
            z = false;
        }
        MainOrderInfoVH mainOrderInfoVH = (MainOrderInfoVH) aqS3S0311000_4.l0;
        C249339qT c249339qT = (C249339qT) aqS3S0311000_4.l1;
        LogisticDTO logisticDTO = (LogisticDTO) aqS3S0311000_4.l2;
        int i = aqS3S0311000_4.i4;
        mainOrderInfoVH.getClass();
        c249339qT.post(new ARunnableS2S0211000_4(i, c249339qT, logisticDTO, z, 1));
        if (((MainOrderInfoVH) aqS3S0311000_4.l0).L().Yw0((C26965Ai9) ((MainOrderInfoVH) aqS3S0311000_4.l0).getItem(), (LogisticDTO) aqS3S0311000_4.l2)) {
            ((MainOrderInfoVH) aqS3S0311000_4.l0).L().LLJJIII = true;
            ((MainOrderInfoVH) aqS3S0311000_4.l0).L().LLIILZL = true;
            OrderSubmitViewModel.Lw0(((MainOrderInfoVH) aqS3S0311000_4.l0).L(), false, null, false, false, null, null, false, null, null, new ChangeInfo(EnumC27805Avh.LOGISTICS.getValue()), 4093);
        }
        View findViewById = ((MainOrderInfoVH) aqS3S0311000_4.l0).LJLIL.findViewById(R.id.boo);
        o.LJIIIIZZ(findViewById, "view.commerce_v2_order_s…it_shipping_select_layout");
        Iterator<Object> it = new C37655EqB(new C2F6(findViewById, null)).iterator();
        while (true) {
            C37656EqC c37656EqC = (C37656EqC) it;
            if (c37656EqC.hasNext()) {
                View view = (View) c37656EqC.next();
                if (view instanceof C249339qT) {
                    ((C249339qT) view).setCheck(false);
                }
            } else {
                ((C249339qT) aqS3S0311000_4.l1).setCheck(true);
                return C76800UCe.LIZ;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0311000_4(boolean z, MainOrderInfoVH mainOrderInfoVH, C249339qT c249339qT, LogisticDTO logisticDTO, int i, int i2) {
        super(0);
        this.$t = i2;
        this.z3 = z;
        this.l0 = mainOrderInfoVH;
        this.l1 = c249339qT;
        this.l2 = logisticDTO;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS3S0311000_4(boolean z, GlobalMainOrderInfoVH globalMainOrderInfoVH, C249329qS c249329qS, LogisticDTO logisticDTO, int i, int i2) {
        super(0);
        this.$t = i2;
        this.z3 = z;
        this.l0 = globalMainOrderInfoVH;
        this.l1 = c249329qS;
        this.l2 = logisticDTO;
        this.i4 = i;
    }
}
