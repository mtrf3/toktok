package X;

import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsCellBill;

/* renamed from: X.a3j, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class ViewOnClickListenerC92003a3j implements View.OnClickListener {
    public final /* synthetic */ C92372a9g LJLIL;
    public final /* synthetic */ StatementsCellBill LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public ViewOnClickListenerC92003a3j(C92372a9g c92372a9g, StatementsCellBill statementsCellBill, String str) {
        this.LJLIL = c92372a9g;
        this.LJLILLLLZI = statementsCellBill;
        this.LJLJI = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C91834a10.LIZLLL("statement_details", this.LJLIL.LJLJJLL);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLILLLLZI.itemView.getContext(), "//bnpl/bill/detail");
        buildRoute.withParam("bill_id", this.LJLIL.LJLIL);
        buildRoute.withParam("bill_month", this.LJLJI);
        buildRoute.withParam("previous_page_id", "bnpl_all_statements");
        buildRoute.open();
    }
}
