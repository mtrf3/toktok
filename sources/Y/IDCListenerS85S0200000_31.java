package Y;

import X.ActivityC45651qj;
import X.C55096Ljo;
import X.C76800UCe;
import X.C78685UuP;
import X.C91657Zy9;
import X.C91834a10;
import X.C91891a1v;
import X.C91926a2U;
import X.C92058a4c;
import X.C92209a73;
import X.C92375a9j;
import X.EnumC92072a4q;
import X.InterfaceC88471Ynr;
import X.SY4;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentRetAssem;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsCellBillPaid;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.forgot.PinForgotViewAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS16S1100000_31;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS190S0200000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public class IDCListenerS85S0200000_31 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        C91834a10.LIZJ(null, "done", ((RepaymentRetAssem) iDCListenerS85S0200000_31.l0).v3().LJLILLLLZI);
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((UIAssem) iDCListenerS85S0200000_31.l1);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.onBackPressed();
        }
    }

    public static final void onClick$1(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        Context context = ((UIAssem) iDCListenerS85S0200000_31.l0).getContext();
        if (context != null) {
            C91834a10.LIZJ(null, "contact_customer_service", ((RepaymentRetAssem) iDCListenerS85S0200000_31.l1).v3().LJLILLLLZI);
            String str = C91891a1v.LIZ;
            if (str != null) {
                C91657Zy9.LIZJ(context, str, true, false, false);
            }
        }
    }

    public static final void onClick$2(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        RepaymentViewModel repaymentViewModel = (RepaymentViewModel) ((RepaymentRetAssem) iDCListenerS85S0200000_31.l0).LJLJJL.getValue();
        repaymentViewModel.withState(new IDqS174S0200000_31(repaymentViewModel, (RepaymentViewModel) new IDqS190S0200000_31((UIAssem) iDCListenerS85S0200000_31.l1, (RepaymentRetAssem) iDCListenerS85S0200000_31.l0, 0), (InterfaceC88471Ynr<? super BillRepaymentPrepareInfo, ? super String, C76800UCe>) 20));
    }

    public static final void onClick$3(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        Uri.Builder buildUpon = UriProtector.parse(((C92209a73) iDCListenerS85S0200000_31.l0).LJLLJ).buildUpon();
        buildUpon.appendQueryParameter("source", "bnpl_account_home");
        buildUpon.appendQueryParameter("previous_page_id", "bnpl_account_home");
        buildUpon.appendQueryParameter("ip_address", C91926a2U.LIZIZ());
        buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
        BillHomeAssem billHomeAssem = (BillHomeAssem) iDCListenerS85S0200000_31.l1;
        billHomeAssem.withState(billHomeAssem.A3(), new IDqS16S1100000_31(buildUpon.build().toString(), billHomeAssem, 8));
        ((BillHomeAssem) iDCListenerS85S0200000_31.l1).A3().hv0(null, "setting");
    }

    public static final void onClick$4(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        if (((SY4) ((BillHomeAssem) iDCListenerS85S0200000_31.l0)._$_findCachedViewById(R.id.cp)).LLI) {
            return;
        }
        ((BillHomeAssem) iDCListenerS85S0200000_31.l0).A3().hv0(null, "all_statements");
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) iDCListenerS85S0200000_31.l1, "//bnpl/bill/list");
        buildRoute.withParam("previous_page_id", "bnpl_account_home");
        buildRoute.open();
    }

    public static final void onClick$5(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        if (((SY4) ((BillHomeAssem) iDCListenerS85S0200000_31.l0)._$_findCachedViewById(R.id.cp)).LLI) {
            return;
        }
        ((BillHomeAssem) iDCListenerS85S0200000_31.l0).A3().hv0(null, "repayment_record");
        Uri.Builder buildUpon = UriProtector.parse(((C92209a73) iDCListenerS85S0200000_31.l1).LJLLLL).buildUpon();
        buildUpon.appendQueryParameter("source", "bnpl_account_home");
        buildUpon.appendQueryParameter("previous_page_id", "bnpl_account_home");
        buildUpon.appendQueryParameter("ip_address", C91926a2U.LIZIZ());
        buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
        BillHomeAssem billHomeAssem = (BillHomeAssem) iDCListenerS85S0200000_31.l0;
        billHomeAssem.withState(billHomeAssem.A3(), new IDqS16S1100000_31(buildUpon.build().toString(), billHomeAssem, 8));
    }

    public static final void onClick$6(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        if (((SY4) ((BillHomeAssem) iDCListenerS85S0200000_31.l0)._$_findCachedViewById(R.id.cp)).LLI) {
            return;
        }
        ((BillHomeAssem) iDCListenerS85S0200000_31.l0).A3().hv0(null, "refund_record");
        Uri.Builder buildUpon = UriProtector.parse(((C92209a73) iDCListenerS85S0200000_31.l1).LJLLLLLL).buildUpon();
        buildUpon.appendQueryParameter("source", "bnpl_account_home");
        buildUpon.appendQueryParameter("previous_page_id", "bnpl_account_home");
        buildUpon.appendQueryParameter("ip_address", C91926a2U.LIZIZ());
        buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
        BillHomeAssem billHomeAssem = (BillHomeAssem) iDCListenerS85S0200000_31.l0;
        billHomeAssem.withState(billHomeAssem.A3(), new IDqS16S1100000_31(buildUpon.build().toString(), billHomeAssem, 8));
    }

    public static final void onClick$7(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute(((StatementsCellBillPaid) iDCListenerS85S0200000_31.l0).itemView.getContext(), "//bnpl/bill/detail");
        buildRoute.withParam("bill_id", ((C92375a9j) iDCListenerS85S0200000_31.l1).LJLIL);
        buildRoute.withParam("bill_month", ((C92375a9j) iDCListenerS85S0200000_31.l1).LJLILLLLZI);
        buildRoute.withParam("previous_page_id", "bnpl_all_statements");
        buildRoute.open();
    }

    public static final void onClick$8(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinForgotViewAssem) iDCListenerS85S0200000_31.l0).LJLJJI, "bnpl_pin_forgot", ((PinForgotViewAssem) iDCListenerS85S0200000_31.l0).v3().LJLIL, "call_help_center");
        if (C78685UuP.LJJJZ(((PinForgotViewAssem) iDCListenerS85S0200000_31.l0).LJLJI)) {
            Uri.Builder buildUpon = UriProtector.parse(((PinForgotViewAssem) iDCListenerS85S0200000_31.l0).LJLJI).buildUpon();
            buildUpon.appendQueryParameter("entrance", "bnpl_bill");
            buildUpon.appendQueryParameter("source", "bnpl_pin_forgot");
            buildUpon.appendQueryParameter("previous_page_id", "bnpl_pin_forgot");
            Context context = (Context) iDCListenerS85S0200000_31.l1;
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "uri.build().toString()");
            C91657Zy9.LIZJ(context, uri, true, false, false);
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinForgotViewAssem) iDCListenerS85S0200000_31.l0);
            if (LJIIIIZZ != null) {
                LJIIIIZZ.finish();
            }
        }
    }

    public static final void onClick$9(IDCListenerS85S0200000_31 iDCListenerS85S0200000_31, View view) {
        C92058a4c.LIZ(System.currentTimeMillis() - ((PinForgotViewAssem) iDCListenerS85S0200000_31.l0).LJLJJI, "bnpl_pin_forgot", ((PinForgotViewAssem) iDCListenerS85S0200000_31.l0).v3().LJLIL, "go_change_pin");
        Context context = (Context) iDCListenerS85S0200000_31.l1;
        EnumC92072a4q pinSetMode = EnumC92072a4q.CHANGE;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(pinSetMode, "pinSetMode");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//verify_center/change_pin");
        buildRoute.withParam("KEY_SET_MODE", pinSetMode);
        buildRoute.withParam("previous_page_id", "bnpl_pin_forgot");
        buildRoute.open();
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((PinForgotViewAssem) iDCListenerS85S0200000_31.l0);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.finish();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDCListenerS85S0200000_31(com.bytedance.assem.arch.core.UIAssem r2, com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentRetAssem r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                case 1: goto L5;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS85S0200000_31.<init>(com.bytedance.assem.arch.core.UIAssem, com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentRetAssem, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDCListenerS85S0200000_31(com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem r2, X.C92209a73 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS85S0200000_31.<init>(com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem, X.a73, int):void");
    }

    public IDCListenerS85S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
