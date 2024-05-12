package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.9Z6, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z6 extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final C238759Yp LJLIL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaAutoReplyListActivity baAutoReplyListActivity = this.LJLIL.LJLIL;
        if (baAutoReplyListActivity != null) {
            int adapterPosition = getAdapterPosition();
            SmartRoute buildRoute = SmartRouter.buildRoute(baAutoReplyListActivity, "//setting/ba/auto_reply");
            buildRoute.withParam("mid", ((C9Z3) ListProtector.get(baAutoReplyListActivity.LJLJJI, adapterPosition)).LIZ);
            buildRoute.withParam("enterFrom", "business_auto_reply");
            buildRoute.open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Z6(C238759Yp adapter, View view) {
        super(view);
        o.LJIIIZ(adapter, "adapter");
        this.LJLIL = adapter;
        C16880lQ.LJIIJ(this, view);
    }
}
