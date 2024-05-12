package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C28272B7s;
import X.C36636EZk;
import X.C75647TmV;
import X.C75650TmY;
import X.C75852Tpo;
import X.C76151Tud;
import X.C76800UCe;
import X.C77201URp;
import X.C77208URw;
import X.C77209URx;
import X.C77453UaX;
import X.C77546Uc2;
import X.CN1;
import X.EnumC77147UPn;
import X.InterfaceC65784Pro;
import X.InterfaceC75441TjB;
import X.InterfaceC77468Uam;
import X.InterfaceC88472Yns;
import X.TWS;
import X.XJL;
import X.XKS;
import X.XKX;
import android.content.Context;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeDialogVMV2;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.sei.SeiAppData;

/* loaded from: classes14.dex */
public class AqS73S0400000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS73S0400000_13 aqS73S0400000_13) {
        return new LiveIncomeExchangeDialogVMV2((C77546Uc2) aqS73S0400000_13.l0, (Context) aqS73S0400000_13.l1, (C77453UaX) aqS73S0400000_13.l2, (InterfaceC77468Uam) aqS73S0400000_13.l3);
    }

    public static final Object invoke$1(AqS73S0400000_13 aqS73S0400000_13) {
        C77201URp c77201URp = (C77201URp) aqS73S0400000_13.l0;
        C77208URw c77208URw = (C77208URw) aqS73S0400000_13.l1;
        EnumC77147UPn enumC77147UPn = (EnumC77147UPn) aqS73S0400000_13.l2;
        XJL xjl = (XJL) aqS73S0400000_13.l3;
        c77201URp.getClass();
        XKX.LIZLLL(c77208URw.LJLIL.LIZJ, C36636EZk.LIZ, null, new C77209URx(c77208URw, enumC77147UPn, xjl, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS73S0400000_13 aqS73S0400000_13) {
        ((InterfaceC75441TjB) aqS73S0400000_13.l0).LJJIJLIJ((C28272B7s) aqS73S0400000_13.l1, (SeiAppData) aqS73S0400000_13.l2);
        InterfaceC88472Yns<? super SeiAppData, C76800UCe> interfaceC88472Yns = ((TWS) aqS73S0400000_13.l3).LJLL;
        if (interfaceC88472Yns != null) {
            SeiAppData seiData = (SeiAppData) aqS73S0400000_13.l2;
            o.LJIIIIZZ(seiData, "seiData");
            interfaceC88472Yns.invoke(seiData);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS73S0400000_13 aqS73S0400000_13) {
        ((IMultiHostService) aqS73S0400000_13.l0).LJJZZIII(false);
        C75852Tpo.LIZ("LinkDialog");
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Yd0().LIZ();
        C75650TmY.LJI(((C76151Tud) aqS73S0400000_13.l1).LIZIZ, (CohostTopic) aqS73S0400000_13.l2, (C75647TmV) aqS73S0400000_13.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS73S0400000_13 aqS73S0400000_13) {
        ((IMultiHostService) aqS73S0400000_13.l0).LJJZZIII(true);
        C75852Tpo.LIZ("LinkDialog");
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Yd0().LIZ();
        C75650TmY.LJI(((C76151Tud) aqS73S0400000_13.l1).LIZIZ, (CohostTopic) aqS73S0400000_13.l2, (C75647TmV) aqS73S0400000_13.l3);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0400000_13(InterfaceC75441TjB interfaceC75441TjB, C28272B7s c28272B7s, SeiAppData seiAppData, TWS tws, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC75441TjB;
        this.l1 = c28272B7s;
        this.l2 = seiAppData;
        this.l3 = tws;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0400000_13(C77201URp c77201URp, C77208URw c77208URw, EnumC77147UPn enumC77147UPn, XKS xks, int i) {
        super(0);
        this.$t = i;
        this.l0 = c77201URp;
        this.l1 = c77208URw;
        this.l2 = enumC77147UPn;
        this.l3 = xks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0400000_13(C77546Uc2 c77546Uc2, Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam, int i) {
        super(0);
        this.$t = i;
        this.l0 = c77546Uc2;
        this.l1 = context;
        this.l2 = c77453UaX;
        this.l3 = interfaceC77468Uam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0400000_13(IMultiHostService iMultiHostService, C76151Tud c76151Tud, CohostTopic cohostTopic, C75647TmV c75647TmV, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMultiHostService;
        this.l1 = c76151Tud;
        this.l2 = cohostTopic;
        this.l3 = c75647TmV;
    }
}
