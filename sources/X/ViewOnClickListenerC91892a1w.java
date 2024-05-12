package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeAssem;

/* renamed from: X.a1w, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class ViewOnClickListenerC91892a1w implements View.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C92209a73 LJLILLLLZI;
    public final /* synthetic */ BillHomeAssem LJLJI;

    public ViewOnClickListenerC91892a1w(Context context, C92209a73 c92209a73, BillHomeAssem billHomeAssem) {
        this.LJLIL = context;
        this.LJLILLLLZI = c92209a73;
        this.LJLJI = billHomeAssem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "//bnpl/bill/detail");
        buildRoute.withParam("bill_id", this.LJLILLLLZI.LJLJJLL);
        buildRoute.withParam("previous_page_id", "bnpl_account_home");
        buildRoute.open();
        this.LJLJI.A3().hv0(null, "statement_details");
    }
}
