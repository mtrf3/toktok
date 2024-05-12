package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bnpl.biz.bill.detail.StatementDetailCell;
import kotlin.jvm.internal.o;

/* renamed from: X.a1I, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class ViewOnClickListenerC91852a1I implements View.OnClickListener {
    public final /* synthetic */ C92364a9Y LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ StatementDetailCell LJLJI;

    public ViewOnClickListenerC91852a1I(C92364a9Y c92364a9Y, boolean z, StatementDetailCell statementDetailCell) {
        this.LJLIL = c92364a9Y;
        this.LJLILLLLZI = z;
        this.LJLJI = statementDetailCell;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C91834a10.LIZIZ("order_details", this.LJLIL.LJLJLJ);
        if (this.LJLILLLLZI) {
            str = C91891a1v.LIZJ;
        } else {
            str = C91891a1v.LIZIZ;
        }
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        buildUpon.appendQueryParameter("loan_order_id", this.LJLIL.LJLIL);
        buildUpon.appendQueryParameter("loan_sub_order_id", this.LJLIL.LJLILLLLZI);
        buildUpon.appendQueryParameter("source", "bnpl_statement_details");
        buildUpon.appendQueryParameter("previous_page_id", "bnpl_statement_details");
        buildUpon.appendQueryParameter("ip_address", C91926a2U.LIZIZ());
        buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "uri.build().toString()");
        Context context = this.LJLJI.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C91657Zy9.LIZJ(context, uri, true, false, false);
    }
}
