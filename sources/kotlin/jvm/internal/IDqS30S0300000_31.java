package kotlin.jvm.internal;

import X.ARH;
import X.ARN;
import X.AbstractC06580Nq;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C0Z5;
import X.C16880lQ;
import X.C1IC;
import X.C44001o4;
import X.C55096Ljo;
import X.C5UN;
import X.C68322mC;
import X.C76800UCe;
import X.C78613UtF;
import X.C91706Zyw;
import X.C91718Zz8;
import X.C91720ZzA;
import X.C91942a2k;
import X.C91943a2l;
import X.C92058a4c;
import X.C92060a4e;
import X.C92074a4s;
import X.C92094a5C;
import X.C92145a61;
import X.C92220a7E;
import X.C92231a7P;
import X.C92253a7l;
import X.C92283a8F;
import X.C92288a8K;
import X.C92290a8M;
import X.C92316a8m;
import X.C92321a8r;
import X.C92357a9R;
import X.C93091aLH;
import X.EnumC91916a2K;
import X.EnumC91972a3E;
import X.EnumC91995a3b;
import X.EnumC92072a4q;
import X.EnumC92075a4t;
import X.InterfaceC70422pa;
import X.InterfaceC70769Rq1;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC91938a2g;
import X.InterfaceC91961a33;
import X.W5F;
import X.XKX;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Notice;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.RepaymentResultInfo;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.change.PinChangeViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewAssem;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinSetRouteArg;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.set.PinSetFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyViewModel;
import com.ss.android.ugc.aweme.bnpl.network.model.AlertMsg;
import com.ss.android.ugc.aweme.bnpl.network.model.DoVerifyResponse;
import com.ss.android.ugc.aweme.bnpl.network.model.StatusReason;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes20.dex */
public class IDqS30S0300000_31 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    public final Boolean invoke$0(String link) {
        o.LJIIIZ(link, "link");
        Uri parse = UriProtector.parse(link);
        String path = parse.getPath();
        if (((CheckoutViewModel) this.l0).isHttpURL(link)) {
            return Boolean.FALSE;
        }
        if (!((CheckoutViewModel) this.l0).isSchemaMatch(link)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setFlags(268435456);
                C16880lQ.LIZJ((Context) this.l1, intent);
            } catch (ActivityNotFoundException e) {
                System.out.println((Object) o.LJIILLIIL(e, "fail to open activity: "));
                try {
                    C16880lQ.LIZJ((Context) this.l1, Intent.parseUri(link, 1));
                } catch (ActivityNotFoundException e2) {
                    System.out.println((Object) o.LJIILLIIL(e2, "fail to open activity: "));
                }
            }
            return Boolean.TRUE;
        }
        if (o.LJ(path, EnumC91972a3E.CheckoutPayResult.getPath())) {
            C91706Zyw.LJIIL((C92145a61) this.l2, "pay_result", null, 6);
            ((CheckoutViewModel) this.l0).startPollingPaymentDetailAndSetResult(new IDqS418S0100000_31((C92145a61) this.l2, 70));
            return Boolean.TRUE;
        }
        if (o.LJ(path, EnumC91972a3E.CheckoutBind.getPath())) {
            C91706Zyw.LJIILL((C92145a61) this.l2, "checkout_home", false);
            ((CheckoutViewModel) this.l0).dispatch(CheckoutAction.RetryCheckout.INSTANCE);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$0(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        int i;
        int i2;
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        PinSetFragment pinSetFragment = (PinSetFragment) iDqS30S0300000_31.l0;
        EnumC92072a4q pinSetMode = ((PinSetRouteArg) iDqS30S0300000_31.l1).getPinSetMode();
        EnumC92072a4q enumC92072a4q = EnumC92072a4q.REGISTER;
        if (pinSetMode == enumC92072a4q) {
            i = R.string.jse;
        } else {
            i = R.string.jsi;
        }
        String string = pinSetFragment.getString(i);
        o.LJIIIIZZ(string, "getString(if (it.pinSetM…set_pin_retrieve_ybutton)");
        buttonGroup.LJFF(string, new IDqS174S0200000_31((PinSetFragment) iDqS30S0300000_31.l0, (PinSetFragment) iDqS30S0300000_31.l2, (C68322mC<String>) 8));
        PinSetFragment pinSetFragment2 = (PinSetFragment) iDqS30S0300000_31.l0;
        if (((PinSetRouteArg) iDqS30S0300000_31.l1).getPinSetMode() == enumC92072a4q) {
            i2 = R.string.jsd;
        } else {
            i2 = R.string.jsh;
        }
        String string2 = pinSetFragment2.getString(i2);
        o.LJIIIIZZ(string2, "getString(if (it.pinSetM…set_pin_retrieve_nbutton)");
        buttonGroup.LJII(string2, new IDqS174S0200000_31((PinSetFragment) iDqS30S0300000_31.l0, (PinSetFragment) iDqS30S0300000_31.l2, (C68322mC<String>) 9));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS30S0300000_31 iDqS30S0300000_31, Object it) {
        o.LJIIIZ(it, "it");
        C91943a2l.LIZJ((InterfaceC91961a33) iDqS30S0300000_31.l0);
        C44001o4 c44001o4 = C91943a2l.LJIIJJI;
        if (C5UN.LJJLJLI(((C91942a2k) c44001o4.getValue()).LIZIZ).isEmpty()) {
            ((InterfaceC88472Yns) iDqS30S0300000_31.l1).invoke(((C92220a7E) c44001o4.getValue()).LIZLLL());
        } else {
            ((InterfaceC88472Yns) iDqS30S0300000_31.l2).invoke("form_page");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJFF("OK", new IDqS30S0300000_31((PinForgotViewAssem) iDqS30S0300000_31.l0, (C92290a8M) iDqS30S0300000_31.l1, (UIAssem) iDqS30S0300000_31.l2, 9));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$11(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        Object invoke;
        Object invoke2;
        C1IC c1ic = (C1IC) obj;
        o.LJIIIZ(c1ic, "$this$null");
        C91720ZzA c91720ZzA = ((NavBackStackEntry) c1ic.LIZJ()).LJLILLLLZI;
        if (((Boolean) ((C92316a8m) iDqS30S0300000_31.l0).LIZJ.getValue()).booleanValue()) {
            Iterator it = C91718Zz8.LIZJ(c91720ZzA).iterator();
            while (it.hasNext()) {
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) C92094a5C.LIZJ).get(((C91720ZzA) it.next()).LJLJL);
                if (interfaceC88472Yns != null && (invoke2 = interfaceC88472Yns.invoke(c1ic)) != null) {
                    return invoke2;
                }
            }
            return ((InterfaceC88472Yns) iDqS30S0300000_31.l1).invoke(c1ic);
        }
        Iterator it2 = C91718Zz8.LIZJ(c91720ZzA).iterator();
        while (it2.hasNext()) {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) ((LinkedHashMap) C92094a5C.LIZ).get(((C91720ZzA) it2.next()).LJLJL);
            if (interfaceC88472Yns2 != null && (invoke = interfaceC88472Yns2.invoke(c1ic)) != null) {
                return invoke;
            }
        }
        return ((InterfaceC88472Yns) iDqS30S0300000_31.l2).invoke(c1ic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        Object invoke;
        Object invoke2;
        C1IC c1ic = (C1IC) obj;
        o.LJIIIZ(c1ic, "$this$null");
        C91720ZzA c91720ZzA = ((NavBackStackEntry) c1ic.LIZIZ()).LJLILLLLZI;
        if (((Boolean) ((C92316a8m) iDqS30S0300000_31.l0).LIZJ.getValue()).booleanValue()) {
            Iterator it = C91718Zz8.LIZJ(c91720ZzA).iterator();
            while (it.hasNext()) {
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) ((LinkedHashMap) C92094a5C.LIZLLL).get(((C91720ZzA) it.next()).LJLJL);
                if (interfaceC88472Yns != null && (invoke2 = interfaceC88472Yns.invoke(c1ic)) != null) {
                    return invoke2;
                }
            }
            return ((InterfaceC88472Yns) iDqS30S0300000_31.l1).invoke(c1ic);
        }
        Iterator it2 = C91718Zz8.LIZJ(c91720ZzA).iterator();
        while (it2.hasNext()) {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) ((LinkedHashMap) C92094a5C.LIZIZ).get(((C91720ZzA) it2.next()).LJLJL);
            if (interfaceC88472Yns2 != null && (invoke = interfaceC88472Yns2.invoke(c1ic)) != null) {
                return invoke;
            }
        }
        return ((InterfaceC88472Yns) iDqS30S0300000_31.l2).invoke(c1ic);
    }

    public static final Object invoke$13(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        C92321a8r setState = (C92321a8r) obj;
        o.LJIIIZ(setState, "$this$setState");
        DoVerifyResponse doVerifyResponse = (DoVerifyResponse) iDqS30S0300000_31.l0;
        StatusReason statusReason = doVerifyResponse.statusReason;
        AlertMsg alertMsg = doVerifyResponse.alertMsg;
        String str = doVerifyResponse.nextVerifyInfo;
        int i = ((PinVerifyViewModel) iDqS30S0300000_31.l1).LJLILLLLZI;
        return C92321a8r.LIZ(setState, new C92074a4s((EnumC92075a4t) iDqS30S0300000_31.l2, statusReason, alertMsg, str, String.valueOf(statusReason.reasonCode), i), EnumC91916a2K.SUCCESS, null, 12);
    }

    public static final Object invoke$2(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        Methods pi = (Methods) obj;
        o.LJIIIZ(pi, "pi");
        C92283a8F c92283a8F = (C92283a8F) iDqS30S0300000_31.l0;
        String paymentMethodType = pi.getPaymentMethodType();
        if (paymentMethodType == null) {
            paymentMethodType = "";
        }
        c92283a8F.LJI(paymentMethodType, pi.getPaymentMethodId(), null, false);
        ((C92283a8F) iDqS30S0300000_31.l0).LJIIIZ();
        ((InterfaceC88472Yns) iDqS30S0300000_31.l1).invoke(new C92231a7P(pi));
        ((InterfaceC88471Ynr) iDqS30S0300000_31.l2).invoke("checkout_home", Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS30S0300000_31 iDqS30S0300000_31, Object it) {
        o.LJIIIZ(it, "it");
        ((IDqS418S0100000_31) ((C92357a9R) ((InterfaceC91938a2g) iDqS30S0300000_31.l0)).LJJIIZ).invoke(it);
        XKX.LIZLLL((InterfaceC70422pa) iDqS30S0300000_31.l1, C78613UtF.LIZJ, null, new C93091aLH((C0Z5) iDqS30S0300000_31.l2, null), 2);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        return iDqS30S0300000_31.invoke$0((String) obj);
    }

    public static final Object invoke$5(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        Notice notice;
        String str;
        String str2;
        Boolean bool;
        C92253a7l setState = (C92253a7l) obj;
        o.LJIIIZ(setState, "$this$setState");
        RepaymentResultInfo repaymentResultInfo = (RepaymentResultInfo) iDqS30S0300000_31.l0;
        Boolean bool2 = null;
        if (repaymentResultInfo != null) {
            notice = repaymentResultInfo.notice;
            str = repaymentResultInfo.resultTitle;
            str2 = repaymentResultInfo.resultMessage;
            bool = Boolean.valueOf(repaymentResultInfo.showContinueRepayment);
        } else {
            notice = null;
            str = null;
            str2 = null;
            bool = null;
        }
        RepaymentResultInfo repaymentResultInfo2 = (RepaymentResultInfo) iDqS30S0300000_31.l0;
        if (repaymentResultInfo2 != null) {
            bool2 = Boolean.valueOf(repaymentResultInfo2.showCustomerService);
        }
        return C92253a7l.LIZ(setState, (EnumC91916a2K) iDqS30S0300000_31.l1, (EnumC91995a3b) iDqS30S0300000_31.l2, false, str, str2, notice, bool, bool2, 12);
    }

    public static final Object invoke$6(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        Context ctx = (Context) obj;
        o.LJIIIZ(ctx, "ctx");
        SmartImageView smartImageView = new SmartImageView(ctx);
        Object obj2 = iDqS30S0300000_31.l0;
        Integer num = (Integer) iDqS30S0300000_31.l1;
        InterfaceC70769Rq1 interfaceC70769Rq1 = (InterfaceC70769Rq1) iDqS30S0300000_31.l2;
        W5F LIZIZ = C92060a4e.LIZIZ(obj2);
        if (num != null) {
            LIZIZ.LJIIJJI = num.intValue();
        }
        LIZIZ.LJJIIJ = smartImageView;
        LIZIZ.LIZLLL(interfaceC70769Rq1);
        return smartImageView;
    }

    public static final Object invoke$7(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        SmartImageView view = (SmartImageView) obj;
        o.LJIIIZ(view, "view");
        W5F LIZIZ = C92060a4e.LIZIZ(iDqS30S0300000_31.l0);
        Integer num = (Integer) iDqS30S0300000_31.l1;
        if (num != null) {
            LIZIZ.LJIIJJI = num.intValue();
        }
        LIZIZ.LJJIIJ = view;
        LIZIZ.LIZLLL((InterfaceC70769Rq1) iDqS30S0300000_31.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        C92288a8K setState = (C92288a8K) obj;
        o.LJIIIZ(setState, "$this$setState");
        EnumC92075a4t enumC92075a4t = (EnumC92075a4t) iDqS30S0300000_31.l0;
        DoVerifyResponse doVerifyResponse = (DoVerifyResponse) iDqS30S0300000_31.l1;
        return C92288a8K.LIZ(setState, null, new C92074a4s(enumC92075a4t, doVerifyResponse.statusReason, doVerifyResponse.alertMsg, doVerifyResponse.nextVerifyInfo, null, ((PinChangeViewModel) iDqS30S0300000_31.l2).LJLJI), null, null, null, EnumC91916a2K.SUCCESS, null, 0L, 221);
    }

    public static final Object invoke$9(IDqS30S0300000_31 iDqS30S0300000_31, Object obj) {
        ARN args = (ARN) obj;
        o.LJIIIZ(args, "args");
        args.LIZJ = true;
        C92058a4c.LIZLLL("bnpl_pin_forgot", ((PinForgotViewAssem) iDqS30S0300000_31.l0).v3().LJLIL, "OK", ((C92290a8M) iDqS30S0300000_31.l1).LJLJI);
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((UIAssem) iDqS30S0300000_31.l2);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS30S0300000_31(InterfaceC91938a2g interfaceC91938a2g, InterfaceC91938a2g<?> interfaceC91938a2g2, InterfaceC70422pa interfaceC70422pa, C0Z5 c0z5) {
        super(1);
        this.$t = c0z5;
        this.l0 = interfaceC91938a2g;
        this.l1 = interfaceC91938a2g2;
        this.l2 = interfaceC70422pa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS30S0300000_31(InterfaceC91961a33 interfaceC91961a33, InterfaceC91961a33 interfaceC91961a332, InterfaceC88472Yns<? super PaymentMethod, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2) {
        super(1);
        this.$t = interfaceC88472Yns2;
        this.l0 = interfaceC91961a33;
        this.l1 = interfaceC91961a332;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS30S0300000_31(EnumC92075a4t enumC92075a4t, DoVerifyResponse doVerifyResponse, PinChangeViewModel pinChangeViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC92075a4t;
        this.l1 = doVerifyResponse;
        this.l2 = pinChangeViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS30S0300000_31(C92283a8F c92283a8F, C92283a8F c92283a8F2, InterfaceC88472Yns<? super InterfaceC91961a33, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        super(1);
        this.$t = interfaceC88471Ynr;
        this.l0 = c92283a8F;
        this.l1 = c92283a8F2;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS30S0300000_31(C92316a8m c92316a8m, C92316a8m c92316a8m2, InterfaceC88472Yns<? super C1IC<NavBackStackEntry>, ? extends AbstractC06580Nq> interfaceC88472Yns, InterfaceC88472Yns<? super C1IC<NavBackStackEntry>, ? extends AbstractC06580Nq> interfaceC88472Yns2) {
        super(1);
        this.$t = interfaceC88472Yns2;
        this.l0 = c92316a8m;
        this.l1 = c92316a8m2;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS30S0300000_31(CheckoutViewModel checkoutViewModel, Context context, C92145a61 c92145a61, int i) {
        super(1);
        this.$t = i;
        this.l0 = checkoutViewModel;
        this.l1 = context;
        this.l2 = c92145a61;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS30S0300000_31(RepaymentResultInfo repaymentResultInfo, EnumC91916a2K enumC91916a2K, EnumC91995a3b enumC91995a3b, int i) {
        super(1);
        this.$t = i;
        this.l0 = repaymentResultInfo;
        this.l1 = enumC91916a2K;
        this.l2 = enumC91995a3b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS30S0300000_31(PinForgotViewAssem pinForgotViewAssem, C92290a8M c92290a8M, UIAssem uIAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = pinForgotViewAssem;
        this.l1 = c92290a8M;
        this.l2 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS30S0300000_31(PinSetFragment pinSetFragment, PinSetFragment pinSetFragment2, PinSetRouteArg pinSetRouteArg, C68322mC<String> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = pinSetFragment;
        this.l1 = pinSetFragment2;
        this.l2 = pinSetRouteArg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS30S0300000_31(DoVerifyResponse doVerifyResponse, PinVerifyViewModel pinVerifyViewModel, EnumC92075a4t enumC92075a4t, int i) {
        super(1);
        this.$t = i;
        this.l0 = doVerifyResponse;
        this.l1 = pinVerifyViewModel;
        this.l2 = enumC92075a4t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS30S0300000_31(Object obj, Integer num, InterfaceC70769Rq1 interfaceC70769Rq1, int i) {
        super(1);
        this.$t = i;
        this.l0 = obj;
        this.l1 = num;
        this.l2 = interfaceC70769Rq1;
    }
}
