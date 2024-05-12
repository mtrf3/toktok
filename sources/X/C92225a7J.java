package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.a7J, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92225a7J implements InterfaceC91829a0v {
    public final /* synthetic */ C29S LIZ;
    public final /* synthetic */ RepaymentViewModel LIZIZ;

    public C92225a7J(C29S c29s, RepaymentViewModel repaymentViewModel) {
        this.LIZ = c29s;
        this.LIZIZ = repaymentViewModel;
    }

    @Override // X.InterfaceC91829a0v
    public final void onResult(int i) {
        if (i == EnumC92109a5R.SUCCESS.getValue() || i == EnumC92109a5R.FAILED.getValue() || i == EnumC92109a5R.CLOSE_IN_PAY.getValue() || i == EnumC92109a5R.PENDING.getValue()) {
            C29S c29s = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("//bnpl/bill/result?repayment_id_key=");
            LIZ.append(this.LIZIZ.LJLJJLL);
            SmartRoute buildRoute = SmartRouter.buildRoute(c29s, X1D.LIZIZ(LIZ));
            buildRoute.withParam("previous_page_id", "bnpl_start_repayment");
            buildRoute.open();
            this.LIZ.finish();
            return;
        }
        if (i != EnumC92109a5R.CLOSE_IN_STORE.getValue()) {
            return;
        }
        android.net.Uri parse = UriProtector.parse(this.LIZIZ.getState().LJLLJ);
        boolean LJ = o.LJ(UriProtector.getQueryParameter(parse, "hide_nav_bar"), "1");
        String queryParameter = UriProtector.getQueryParameter(parse, "url");
        if (queryParameter != null) {
            C91657Zy9.LIZJ(this.LIZ, queryParameter, LJ, false, false);
        }
        this.LIZ.finish();
    }
}
